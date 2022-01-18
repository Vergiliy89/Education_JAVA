public class java3_1tasks {
    public static void main(String args[]) {
        int a1 = 140, a2 = 44, a3 = 85, s1;
        int b1 = 87, b2 = 69, b3 = 74, b4 = 47, s2;
        int v1 = 48, v2 = 50;
        float t1, t2;
        byte z;
        s1 = a1 + a2 + a3;
        s2 = b1 + b2 + b3 + b4;
        t1 = (float) s1 / v1;
        t2 = (float) s2 / v2;
        if (t1 > t2) z = 2;
        else z = 1;
        System.out.println(" N" + z);
    }
}

class java3_1_1 {
    public static void main(String args[]) {
        int p = 180;
        int k = 179;
        if (k < p) {
            System.out.println("Не зараховано");
        } else { System.out.println("Зараховано");

        }
    }
}

class java3_1_2 {
    public static void main(String args[]) {
        int n = 11;
        if (n <= 50) {System.out.println(n - 10);
        } else {System.out.println(n + 10);
        }
    }
}

class java3_1_3 {
    public static void main(String args[]) {
        int a = 11, b = 33;
        if (a<=b) a = 0;
        System.out.println(a);
    }
}

class java3_1_4 {
    public static void main(String args[]) {
        int s = 899;
        boolean y = true;
        if (y == true) {System.out.println("AVG monthly payment " + ((s * 2) + (s * 12))/12);
        } else {System.out.println("Year without profit " + s);}

    }
}

class java3_1_5 {
    public static void main(String args[]) {
        int a = 3;
        int b = -4;
       if (a>0 && b<0){
           a = 1;
           b = 0;
       }
        System.out.println(a);
        System.out.println(b);


    }
}

class java3_1_6 {
    public static void main(String args[]) {
        int a = 7;
        int Ts = (a * 3);
        int r = 3;
        if (Ts >= r*2) {System.out.println("We can put circle in the triangle");
        } else {System.out.println("We can't put circle into triangle");}
    }
}

