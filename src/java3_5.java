public class java3_5 {
    public static void main(String args[]) {
        int s = 0;
        for (int i = 1; i < 30; i++) {
            if (i == 11) break;
            s = s+i;
        }
        System.out.println("s = " + s);
    }
}

class Break2 {
    public static void main (String args[]) {
        int i = 1, s = 0;
        while (i<30) {
            if(i==11)break;
            s = s + i;
            i ++;
        }
        System.out.println("S = " + s);
    }
}

class Break2a {
    public static void main (String args[]) {
        int s;
        for (int n = 4; n < 7; n++) {
            System.out.print("For n = " + n + ":");
            for (int m = 20; m < 33; m = m + 3) {
                if (m == 40) break;
                s = n + m;
                System.out.print(s + ",");
            }
            System.out.println();
        }
        System.out.println("End");
    }
}

//if (x) break mk2;
//p1 = m * k;
//s2 = n * k;
class Break2b {
    public static void main(String args []) {
        int n = 3, m = 4, k = 5, p1 = 1, s1 = 0, s2 = 0;
        boolean x = true;
        mk1:
        s1 = n + m;
        mk2:
        {
            if (x) break mk2;
            p1 = m * k;
            s2 = n * k;
        }
        s1 = s1 + n;
        s2 = s2 + m;
        System.out.println("p1 = " + p1);
        System.out.println("s1 = " + s1 + ";" + "s2 = " + s2);
    }
}

