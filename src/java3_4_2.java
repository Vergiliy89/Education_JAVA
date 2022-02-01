public class java3_4_2 {
    public static void main (String args[]) {
      double S = 7890;
      int y = 0;
      do {
          S = S + 0.15 * S;
          y ++;
      }
      while (S <= 15000);
            System.out.println("Years = " + y + " and " + "sum = " + S);
        }

    }

