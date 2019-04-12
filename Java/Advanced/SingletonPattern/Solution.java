package Advanced.SingletonPattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
	private Singleton(){};
	public static String str;
	private static Singleton instance = null;
	public static Singleton getSingleInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	
	
}
	
