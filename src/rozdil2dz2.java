public class rozdil2dz2 {
    public static void main(String args[]) {
        long n1 = 34552;
        boolean isActive = true;
        boolean isAlive = false;
        System.out.println(n1);
        System.out.println(isActive);
        System.out.println(isAlive);

    }
}

class Ris7a {
    public static void main(String args[]) {
        System.out.println("Цілочислові значення");
        int a = 2 + 3;
        int b = 4 * a;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("Дійсні значення");
        double c = 3 + 4;
        double d = c * 2;
        System.out.println("c= " + c);
        System.out.println("d= " + d);
    }
}

class Inkrement {
    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        int c,d;
        c = ++a;
        d = --b;
        c = c + d;
        d++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
    }
}

class Kod_3 {
    public static void main(String args[]) {
        double s = 30.5;
        double v1 = 12;
        double v2 = 2.4;
        double t,t1,t2;
        t1 = s/(v1+v2);
        t2 = s/(v1-v2);
        t = t1 = t2 +0.5;
        System.out.println("Час руху співпадає");
        System.out.println(t);
    }
}

class dva_tri {
    public static void main(String args[]) {
        double a = 1.8;
        double b = 2;
        double c = -3.5;
        double q,w,e;
        q = a + b;
        w = b + c;
        e = q * w;
        System.out.println(e);
    }
}

class incr_decr {
    public static void main(String args[]) {
        double a = 5.5;
        double b = 7.7;
        double e,q,w;
        e = (a++) * (b--);
        /*q = a ++;
        w = b --;
        e = q * w;*/
        System.out.println(e);
    }
}

class zal_prisvoennia {
    public static void main(String args[]) {
        double a = 49;
        double b = 5;
        double e;
        e = a% b;
        System.out.println(e);
    }
}

class chetverta_dva_tri {
    public static void main(String args[]) {
        double a = 49;
        double b = 5;
        double c = 13;
        double q,w,e,z;
        q = c--;
        w = b--;
        e = q / w;
        z = q * e;
        System.out.println(e);
    }
}

class piata_dva_tri {
    public static void main(String args[]) {
        double a,b;
        a = 3;
        a+= 8;
        b = a - (2*a);
        System.out.println(a);
        System.out.println(b);
    }
}

class shosta_dva_tri {
    public static void main(String args[]) {
        double a = 7;
        double b = 13;
        a ++;
        b --;
        System.out.println(a);
        System.out.println(b);
    }
}

class sioma_dva_tri {
    public static void main(String args[]) {
        double s = 334;
        double v = 70;
        double t,t1,t2;
        t1 = 8.00;
        t = s/v;
        t2 = t1 + t;
        System.out.println(t2);
    }
}

