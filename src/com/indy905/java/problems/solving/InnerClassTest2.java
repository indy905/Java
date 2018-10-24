package com.indy905.java.problems.solving;

public class InnerClassTest2 {
    public void someMethod(){
        class InnerClass{
            int innerVal = 0;
            public void plusVal(){
                innerVal++;
            }
        }
        InnerClass innerInstance = new InnerClass();
        innerInstance.plusVal();
        System.out.println(innerInstance.innerVal);
    }
    public static void main(String[] args) {
        InnerClassTest2 instance = new InnerClassTest2();
        instance.someMethod();
    }
}
