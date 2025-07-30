
public class SpringSeason {

    public static boolean isSpring(int month, int day) {
        
        if (month < 3 || month > 6) {
            return false;
        }
        if (month == 3) {
            return day >= 20 && day <= 31;
        }
        if (month == 6) {
            return day >= 1 && day <= 20;
        }
        
        return (month == 4 || month == 5) && (day >= 1 && day <= 31);
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean spring = isSpring(month, day);
        if (spring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
