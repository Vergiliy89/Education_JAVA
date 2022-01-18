public class java3_2_1 {
    public static void main(String args[]) {
        int a = 0;
        int b = 6;
        int c = 7;
        if (a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = a - 1;
            b = b - 1;
            c = c - 1;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }


}

class java3_2_2 {
    public static void main(String args[]) {
        int a = 5;
        int b = 5;
        int c = 5;
        if (a == b && b == c)
            System.out.println("Triangle with equal sides");
        else {
            System.out.println("Triangle with not equal sides");
        }

    }
}

class java3_2_3 {
    public static void main(String args[]) {
        short p1, p2, p3, s;
        p1 = 5;
        p2 = 5;
        p3 = 5;
        s = 15;
        if ((p1 == 5) & (p2 == 5) & (p3 == 5))
            System.out.println("Command join the final championship");
        else {
            System.out.println("Command will not going to championship");
        }
    }
}

class java3_2_4 {
    public static void main(String args[]) {
        short PB = 111;
        short a = 111;
        short b = 111;
        if ((a >= 111) & (b >= 111))
            System.out.println("Students are pass the exam");
        else {
            System.out.println("Students fail the exam");
        }
    }
}

class java3_2_5 {
    public static void main(String args[]) {
        short a = 10;
        short b = 5;
        short c = 5;
        if ((b+c)==a)
            System.out.println("Triangle is with the straight angles");
        else {
            System.out.println("Some kind of triangle");
        }
    }
}