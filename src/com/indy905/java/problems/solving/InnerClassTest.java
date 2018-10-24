package com.indy905.java.problems.solving;

public class InnerClassTest {
    static class InnerClass {
        int innerVal = 0;
        public void plusVal(){
            innerVal++;
        }
    }

    public static void main(String[] args) {
        InnerClassTest.InnerClass innerInstance = new InnerClassTest.InnerClass();
        innerInstance.plusVal();
        System.out.println(innerInstance.innerVal);
    }
}
