package com.indy905.java.problems.solving;

import com.sun.javafx.image.impl.ByteIndexed.ToIntArgbAnyConverter;

public class AccessModifierTest {
	//private String aa = new String("hello");
	//private static String bString = "";
	//private CodeBlocks teste = new CodeBlocks();
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//aa = "";
    	//aa = "hello";
    	//teste = new CodeBlocks();
    	
    	//Hello1 test3 = new Hello1();
    	//CodeBlocks teste = new CodeBlocks();
    	//Hello test2 = new Hello();
    	//bString = "hello";
    	String aaa;
    	System.out.println(toInt(aaa));
	}
    
    public static int toInt(String aaa){
    	if (aaa == null || aaa.length() == 0)
    	{
    		throw new IllegalArgumentException();
    	}
    	return 1;
    }

//    public void testMehd(){
//    	hello aa = new hello();
//    }
    
    public class Hello {
    	public Hello(){}
    }
    
//    private static class Hello1 {
//    	private Hello1(){}
//    }
}
