package org.santosh.scribble.test;

public abstract class AbstractTest {
    public int getNum(){
        return 45;
    }
    public abstract class Bar{
        int i;
        public int getNum(){
            return 45;
        }
    }

    public static void main (String[] args){
       /* AbstractTest t = new AbstractTest()
        {
            public int getNum()
            {
                return 22;
            }
        };
        AbstractTest.Bar f = t.new Bar()
        {
            public int getNum()
            {
                return 57;
            }
        };
*/
       AbstractTest t = new AbstractTest() {
           @Override
           public int getNum() {
               return 22;
           }
       };

       AbstractTest.Bar f = t.new Bar() {
           @Override
           public int getNum() {
               i = 1;
               System.out.println("i="+i);
               return 57;
           }
       };

        System.out.println(f.getNum() + " " + t.getNum());
    }
}
