import java.util.Random;

public class java3_3_1 {
    public static void main (String args[]) {
        int min = 1;
        int max = 6;
        int kybik = (int)(Math.random()*(max-min+1)+min);
        String sportsman;
        switch (kybik) {
            case 1:
                sportsman = "Gorbenko";
                break;
            case 2:
                sportsman = "Puhov";
                break;
            case 3:
                sportsman = "Kostenko";
                break;
            case 4:
                sportsman = "Petrenko";
                break;
            case 5:
                sportsman = "Zotov";
                break;
            case 6:
                sportsman = "Ivanchenko";
                break;
            default:
                sportsman = "Lost the kybik";
        }
        System.out.println("Competition begins " + sportsman);

    }
}

class java3_3_2 {
    public static void main (String args[]) {
        int enterNumber = 5; // << Enter here your number
        switch (enterNumber) {
            case 1:
                System.out.println("Lesson History");
                break;
            case 2:
                System.out.println("Lesson Math");
                break;
            case 3:
                System.out.println("Lesson Geography");
                break;
            case 4:
                System.out.println("Lesson Computer Science");
                break;
            case 5:
                System.out.println("Lesson Physical training");
                break;
        }
    }
}

class java3_3_3 {
    public static void main (String args[]) {
        int Population = 2;
        String City;
        switch (Population) {
            case 1:
                City = "Kyiv = 2.7 and Kharkiv = 1.4";
                break;
            case 2:
                City = "Dnipro = 1.03 and Odessa = 1";
                break;
            case 3:
                City = "Zaporizhia = 0.79 and Lviv = 0.7";
                break;
            default:
                City = "Who knows";
        }
        System.out.println("Second and third city by population " + City);

    }
}

