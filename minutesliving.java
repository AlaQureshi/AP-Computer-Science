public class minutesliving {
    public static void main(String[] args) {
        int minhour = 60;
        int hourday = 24;
        int dayweek = 7;
        int weekyear = 52;

        int minday = minhour * hourday;
        int minweek = minday * dayweek;
        int minyear = minweek * weekyear;

        int age = 30;
        int minutesLiving = age * minyear;

        System.out.println("If you are " + age);
        System.out.println("you have been living " + minutesLiving + " minutes.");

    }
}
