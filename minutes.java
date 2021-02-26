public class minutes {
    public static void main(String[] args) {
int minhour = 60;
int hourday = 24;
int dayweek = 7;
int weekyear = 52;

int minday = minhour * hourday;
int minweek = minday * dayweek;
int minyear = minweek * weekyear;

System.out.println("There are " + minday + " minutes in a day.");
System.out.println("There are " + minweek + " minutes in a week.");
System.out.println("There are " + minyear + " minutes in a year.");
    }
}
