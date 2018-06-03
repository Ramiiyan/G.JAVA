import java.util.Scanner;

public class Game18v4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] classNames = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
                "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
        System.out.print("Enter the Level:");
        int level = sc.nextInt();
        char ask;
        do {
            System.out.println("your Level is "+level);
            for (String className1 : classNames)
                System.out.print(className1 + ",");

            System.out.println();
            System.out.print("Enter the class Name:");
            String className = sc.next();
            Characters.checkDice(className);
            System.out.print("Do you Want to Choose Character Again?(Y/N)");
            ask =sc.next().toUpperCase().charAt(0);
        }while(ask=='Y');
    }


}





