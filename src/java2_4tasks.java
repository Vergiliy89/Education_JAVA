public class java2_4tasks {
    public static void main (String args[]) {
        short v = 15; //Швидкість руху велосипедиста з Києва
        float x = (float) (141.5F * v) / (2 * v + 5); // Обчислення відстані зустрічі
        System.out.println("Відстань від Києва = ");
        System.out.println(x);
    }
}

class java2_4tasks_odin {
    public static void main (String args[]) {
        byte a = 4;
        short b = 2;
        int c = (int) 2 * a + b;
        System.out.println(c);
    }
}

class java2_4tasks_dwa {
    public static void main (String args[]) {
        int a = 3;
        short b = 2;
        long c = 4;
        long result = (long) a + b * c;
        System.out.println(result);

    }
}

class java2_4tasks_tri {
    public static void main (String args[]) {
        short a = 12;
        long b = 5;
        float c = 8;
        float result = (float) a * (b-c);
        System.out.println(result);

    }
}

class java2_4tasks_chetyri {
    public static void main (String args[]) {
        int a = 7;
        float b = 5.4F;
        double c = 6;
        double result = (double) (a + b)/c;
        System.out.println(result);

    }
}

class java2_4tasks_piaty {
    public static void main (String args[]) {
        int t = 300; //Total apples
        int y = 10; //containers of apple
        int p = y * (t/100); //percent of containers in kg
        int w = t - p; //apples without containers
        int a = 15; //price of apple
        int v = 80; // prodaly yabluk
        int v1 = v * (w/100);
        int m = v * v1;
        System.out.println(p);
        System.out.println(w);
        System.out.println(v1);
        System.out.println("Виручили яблук " + m + "грн.");

    }
}

class java2_4tasks_shest {
    public static void main (String args[]) {
        double a = 4;
        double b = 2.5;
        double c = 6;
        double y = 3.2*(2*a - 3.1/b+4*c);
        System.out.println(y);

    }
}


