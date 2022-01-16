public class java2_6tasks {
    public static void main (String args[]) {
            /*StringBuilder = (
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                    "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        );*/
            int a = 7;
            int b = 9;
            int c1 = a & b; int c2 = a ^ b; int c3 = ~a & b;
            System.out.println("c1 = " + c1); //uBedHA
            System.out.println("c2 = " + c2); //notimoeux
            System.out.println("c3 = " + c3);//pamie
    }
}

class jave2_6_1 {
    public static void main (String args[]) {
        byte a = 7;
        byte b = 13;
        int c = a|b;
        int d = a^b;
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("d = " + Integer.toBinaryString(d));


    }
}

class jave2_6_2 {
    public static void main (String args[]) {
        int a = 21, b = 33;
        int c = a|b;
        int d = a^b;
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("d = " + Integer.toBinaryString(d));


    }
}

/*class jave2_6_3 {
    public static void main (String args[]) {
        int a = 45, b = 29, c, d;
        c = a << ;
        d = b >> ;
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("d = " + Integer.toBinaryString(d));


    }
}*/

/*class jave2_6_4 {
    public static void main (String args[]) {
        int a = 45, b = 29, c, d;
        a = a<<;
        d = b >>;
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("d = " + Integer.toBinaryString(d));


    }
}*/