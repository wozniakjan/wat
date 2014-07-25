public class MainClass {
    public static void class_vs_primitive(){
        /**
         * \brief. 
         * Difference between int and Integer is huge even though
         * it may not seem like it on the first glance. The following wat
         * demonstrates improper usage of operator == instead of method
         * equal.
         *
         * \explanation.
         * - int is a primitive, you can use operator == when you need comparison
         * - Integer is a class, operator == means identity, not value comparison
         * - for performace reasons, first 127 Integers are also cached as int,
         *   calling method equal can be costly
         * - why there are Integers then you ask? you are not allowed to use
         *   int in containers (java generics) so there you go
         **/
        System.out.println("\nInteger and int, funky comparison");
        System.out.println("=================================");
        int a = 100, b = 100;
        System.out.println("int a = 100, b = 100;");
        System.out.print(String.format("a == b; //%b", a==b)); 
        
        Integer a1 = 100, b1 = 100;
        System.out.println("\n\nInteger a = 100, b = 100;");
        System.out.print(String.format("a == b; //%b", a1==b1)); 
        
        int a2 = 1000, b2 = 1000;
        System.out.println("\n\nint a = 1000, b = 1000;");
        System.out.print(String.format("a == b; //%b", a2==b2)); 
        
        Integer a3 = 1000, b3 = 1000;
        System.out.println("\n\nInteger a = 1000, b = 1000;");
        System.out.print(String.format("a == b; //%b", a3==b3)); 

        System.out.println("\n\nWAT??");
    }
    public static void main(String[] args) {
        class_vs_primitive();
    }
}
