package org.santosh.scribble.test;

abstract class Program {
    private void disp1() {
        System.out.println("Hi Abstract");
    }
    abstract public void disp2();
    abstract void disp3();
    protected abstract void disp4();
}

public class AbstractClassTest extends Program{

    public void disp2() {
        System.out.println("2");
    }
    void disp3() {
        System.out.println("3");
    }
    protected void disp4() {
        System.out.println("4");
    }

    public String getMarks(String name) {
        return "Hello";
    }

  /*  public int getMarks(String name {
        return 0;
    }*/



    public static void main(String[] args) {
        Program abstractClassTest = new AbstractClassTest();
        //abstractClassTest.disp1();
        abstractClassTest.disp2();
    }

}

