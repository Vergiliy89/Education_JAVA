public class java2_5tasks {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c1 = (a & b) & (a ^ b);
        boolean c2 = !(a ^ !b);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}

class two_five_one {
    public static void main(String args[]) {
        short a = 9;
        short b = 10;
        boolean c = (a=b) > 21;
        System.out.println("c = " + c);

    }
}

class two_five_two {
    public static void main(String args[]) {
        short a = 9;
        short b = 10;
        boolean c = (a-b) <= 5;
        System.out.println("c = " + c);

    }
}

class two_five_three {
    public static void main(String args[]) {
        float a = 1/5F;
        float b = 13.5F;
        short c = 20;
        boolean d = (a + b) == (c - b);
        System.out.println("d = " + d);

    }
}

class two_five_four {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c = (a|b)&(!a&b);
        System.out.println("c = " + c);

    }
}

class two_five_five {
    public static void main(String args[]) {
        float a = 21.5F;
        float b = 5.8F;
        float c = 12.6F;
        boolean x=(a>b)&(b>c);
        boolean y=(a==c)|(b>a);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}

class two_five_six {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c = !(a|!b)&(a&b);
        System.out.println("c = " + c);

    }
}
