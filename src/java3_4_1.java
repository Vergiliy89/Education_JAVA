public class java3_4_1 {
    public static void main (String args[]) {
        int sum = 0;
        for (int i = 13; i < 21; i+=2) {
            if (i > 13) {
                if (i % 2 == 0)
                    continue;
                sum = sum + i;
            }
        }
        System.out.println(sum);


    }
}


