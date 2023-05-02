package StaticConcepts;

public class OuterClass {

    private String name = "Akshay";
    private int num = 11;

    private static int staticNum = 11;

    public int val = 11;

    public boolean flag = true;


     class Inner{
        private int innerNum = 11;
        private String innerName = "Akshay";

        public int innerVal = 11;

        public boolean innerFlag = true;

        public static void staticInnerDisplay(){
            System.out.println("staticNum: "+staticNum);
        }

         public void innerDisplay(){
             System.out.println("num: "+num);
             System.out.println("innerNum: "+innerNum);
             System.out.println("staticNum: "+staticNum);
             System.out.println("name: "+name);
             System.out.println("innerName: "+innerName);
             System.out.println("flag: "+flag);
             System.out.println("innerFlag: "+innerFlag);
         }
    }

    static class StaticInner{
        private int innerNum = 11;
        private String innerName = "Akshay";

        public int innerVal = 11;

        public boolean innerFlag = true;

        public void innerDisplay(){
            System.out.println("innerNum: "+innerNum);
            System.out.println("staticNum: "+staticNum);
            System.out.println("innerName: "+innerName);
            System.out.println("innerFlag: "+innerFlag);
        }

        public static void staticInnerDisplay(){
            System.out.println("staticNum: "+staticNum);
        }
    }

    public void display(){
        System.out.println("num: "+num);
        System.out.println("staticNum: "+staticNum);
        System.out.println("name: "+name);
        System.out.println("flag: "+flag);
    }

    public static void staticDisplay(){
        System.out.println("staticNum: "+staticNum);
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        System.out.println("Outer class display:- ");
        outerClass.display();

        System.out.println("Outer class static display:- ");
        OuterClass.staticDisplay();

        System.out.println("Inner class static display:- ");
        OuterClass.Inner.staticInnerDisplay();

        System.out.println("Static Inner class static display:- ");
        OuterClass.StaticInner.staticInnerDisplay();

        OuterClass.Inner inner = new OuterClass().new Inner();

        System.out.println("Inner class display:- ");
        inner.innerDisplay();

    }
}
