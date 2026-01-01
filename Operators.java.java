public class OperatorDemo {
    public static void main(String[] args) {
        int a = 5; 
        int b =3;
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b));
        
        System.out.println("\nRelational Operators");
        System.out.println("a == b: " + (a == b)); 
        System.out.println("a != b: " + (a != b)); 
        System.out.println("a > b: " + (a > b)); 
        System.out.println("a < b: " + (a < b)); 
        System.out.println("a >= b: " + (a >= b)); 
        System.out.println("a <= b: " + (a <= b));
        
        System.out.println("\nLogical Operators");
        System.out.println("(a > b) && (b > 0): " + ((a > b) && (b > 0))); 
        System.out.println("(a > b) || (b < 0): " + ((a > b) || (b < 0))); 
        System.out.println("!(a > b): " + (!(a > b))); 
        
        System.out.println("\nBitwise Operators");
        System.out.println("a & b = " + (a & b)); 
        System.out.println("a | b = " + (a | b)); 
        System.out.println("a ^ b = " + (a ^ b)); 
        System.out.println("~a = " + (~a));       

        System.out.println("\n**Shift Operators**");
        System.out.println("a << 1 = " + (a << 1));   
        System.out.println("a >> 1 = " + (a >> 1));   
        System.out.println("a >>> 1 = " + (a >>> 1)); 

        System.out.println("\nAssignment Operators");
        int c = a;
        c += b; System.out.println("c += b -> " + c);
        c -= b; System.out.println("c -= b -> " + c); 
        c *= b; System.out.println("c *= b -> " + c); 
        c /= b; System.out.println("c /= b -> " + c); 
        c %= b; System.out.println("c %= b -> " + c); 

        System.out.println("\n**Ternary Operator**");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max); 

    }
}