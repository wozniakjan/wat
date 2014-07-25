import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Console;

public class MainClass {
    public static void class_vs_primitive(){
        Console console = System.console();
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
        System.out.print("a == b;");
        console.readLine();
        System.out.print(a == b);
        console.readLine();

        Integer a1 = 100, b1 = 100;
        System.out.println("\nInteger a = 100, b = 100;");
        System.out.print("a == b;");
        console.readLine();
        System.out.print(a1 == b1);
        console.readLine();
        
        int a2 = 1000, b2 = 1000;
        System.out.println("\nint a = 1000, b = 1000;");
        System.out.print("a == b;");
        console.readLine();
        System.out.print(a2 == b2);
        console.readLine();
        
        Integer a3 = 1000, b3 = 1000;
        System.out.println("\nInteger a = 1000, b = 1000;");
        System.out.print("a == b;");
        console.readLine();
        System.out.print(a3 == b3);
        console.readLine();

        System.out.println("\nWAT?");
        console.readLine();

        /**
         * \brief.
         * Overloading methods with int and Integer can be equally dangerous,
         * for example if you try to remove an object from List, it is better
         * to be extremely cautious
         *
         * \explanation
         * - remove(Integer) removes object Integer
         * - remove(int) removes object on the position int
         **/
        List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3));
        int i = 1;
        System.out.print("list: ");
        System.out.println(l);
        System.out.print("int i = 1;\nl.remove(i);");
        l.remove(i);
        console.readLine();
        System.out.print("result: ");
        System.out.print(l);
        console.readLine();

        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Integer i1 = 1;
        System.out.print("\n\nlist: ");
        System.out.println(l);
        System.out.print("Integer i = 1;\nl.remove(i);");
        l1.remove(i1);
        console.readLine();
        System.out.print("result: ");
        System.out.print(l1);
        console.readLine();
        
        System.out.println("\nWAT?");
        console.readLine();
    }
    public static void main(String[] args) {
        class_vs_primitive();
    }
}
