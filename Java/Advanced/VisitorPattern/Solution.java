package Advanced.VisitorPattern;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color{
	RED,GREEN;
}

abstract class Tree{
	private int value;
	private Color color;
	private int depth;
	
	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}
	public int getValue() {
		return value;
	}
	public Color getColor() {
		return color;
	}
	public int getDepth() {
		return depth;
	}
	public abstract void accept(Trevis visitor);
	
}

class TreeNode extends Tree{
	private ArrayList<Tree> children = new ArrayList<>();
	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}
	public void accept(Trevis visitor) {
		visitor.VisitNode(this);
		for(Tree child : children) {
			child.accept(visitor);
		}
	}
	public void addChild(Tree child) {
		children.add(child);
	}
	
}

class TreeLeaf extends Tree{
	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}
	public void accept(Trevis visitor) {
		visitor.VisitLeaf(this);
	}
}

abstract class Trevis{
	public abstract int getResult();
	public abstract void VisitNode(TreeNode node);
	public abstract void VisitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends Trevis {
    private int result = 0;
    public int getResult() {
        return result;
    }

	public void VisitNode(TreeNode node) {
	}

	public void VisitLeaf(TreeLeaf leaf) {
		result += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends Trevis{
	private long result = 1;
	private final int M = 1000000007;
	public int getResult() {
		return (int)result;
	}
	public void VisitNode(TreeNode node) {
		if(node.getColor() == Color.RED) {
			result = (result * node.getValue()) % M;
		}
	}
	public void VisitLeaf(TreeLeaf leaf) {
		if(leaf.getColor() == Color.RED) {
			result = (result * leaf.getValue()) % M;
		}
		
	}
}

class FancyVisitor extends Trevis{
	private int nonLeafEvenDepthSum = 0;
	private int greenLeavesSum = 0;
	public int getResult() {
		return Math.abs(nonLeafEvenDepthSum - greenLeavesSum);
	}
	public void VisitNode(TreeNode node) {
		if(node.getDepth()%2 == 0) {
			nonLeafEvenDepthSum += node.getValue();
		}
	}
	public void VisitLeaf(TreeLeaf leaf) {
		if(leaf.getColor() == Color.GREEN) {
			greenLeavesSum += leaf.getValue();
		}
	}
}


public class Solution {
	private static int[] values;
	private static Color[] colors;
	private static HashMap<Integer, HashSet<Integer>> map;
	
	public static Tree solve() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		values = new int[N];
		colors = new Color[N];
		map = new HashMap<>(N);
		
		for(int i=0; i<N; i++) {
			values[i] = scanner.nextInt();
		}
		for(int i=0; i<N; i++) {
			colors[i] = scanner.nextInt()==0 ? Color.RED : Color.GREEN;
		}
		
		for(int i=0; i<N-1; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			
			HashSet<Integer> uNeighbors = map.get(u);
			if(uNeighbors == null) {
				uNeighbors = new HashSet<>();
				map.put(u, uNeighbors);
			}
			uNeighbors.add(v);
			HashSet<Integer> vNeighbors = map.get(v);
			if(vNeighbors == null) {
				vNeighbors = new HashSet<>();
				map.put(v, vNeighbors);
			}
			vNeighbors.add(u);

		}
		
		if(N == 1) {
			return new TreeLeaf(values[0], colors[0], 0);
		}
		
		TreeNode root = new TreeNode(values[0], colors[0], 0);
		addChildren(root, 1);
		
		return root;
		 
	}
	
	public static void addChildren(TreeNode parent, Integer parentNum) {
		for(Integer treeNum : map.get(parentNum)) {
			map.get(treeNum).remove(parentNum);
			HashSet<Integer> grandChildren = map.get(treeNum);
			boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
			Tree tree;
			if(childHasChild) {
				tree = new TreeNode(values[treeNum-1], colors[treeNum-1], parent.getDepth()+1);
			}
			else{
				tree = new TreeLeaf(values[treeNum-1], colors[treeNum-1], parent.getDepth()+1);
			}
			
			parent.addChild(tree);
			if(tree instanceof TreeNode) {
				addChildren((TreeNode) tree, treeNum);
			}
			
		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree root = solve();
		
		 SumInLeavesVisitor vis1       = new SumInLeavesVisitor();
	     ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
	     FancyVisitor vis3             = new FancyVisitor();
	     
	     root.accept(vis1);
	     root.accept(vis2);
	     root.accept(vis3);
	     
	     int res1 = vis1.getResult();
	     int res2 = vis2.getResult();
	     int res3 = vis3.getResult();

	     System.out.println(res1);
	     System.out.println(res2);
	     System.out.println(res3);

	}

}
