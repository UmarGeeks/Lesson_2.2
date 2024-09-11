import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(temperaturaForWalk(70, 24));
        System.out.println(temperaturaForWalk(3, -2));
        System.out.println(temperaturaForWalk(23, 23.3));
        System.out.println(temperaturaForWalk(34, -10));
        System.out.println(temperaturaForWalk(aenerateRandomAge(), 39.9));

    }

    public static String temperaturaForWalk(int age, double temperature) {
        if ((age >= 20 && age <= 30 && temperature >= -20 && temperature <= 30)
                || (age < 20 && temperature <= 0 && temperature <= 28)
                || (age > 45 && temperature >= -10 && temperature <= 25)) {
                return "Можно идти гулять";
        } else {
            return "Остовайтес дома";
        }
    }
        public static int aenerateRandomAge () {
            Random random = new Random();
            return random.nextInt(70);//Средная продолжительность жизни в Кыргызстане

        }
    }
}



