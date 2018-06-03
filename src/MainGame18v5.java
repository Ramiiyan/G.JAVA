import java.util.Scanner;

public class MainGame18v5 {
    public static int level;
    private static String [] classNames = new String[]{"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
            "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
    public static void main(String[] args) throws Exception {
        char ask;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Level:");
        level= sc.nextInt();
        do{
            for (String className1 : classNames)
                System.out.print(className1+",");
            System.out.println();
            System.out.println("Enter the Character Name:");
            String className = sc.next();
            if (className.equalsIgnoreCase("Barbarian")) {
                Character.checkDice(className);
                Skills.selectSkill("Barbarian");
            }
            else if(className.equalsIgnoreCase("Bard")){
                Character.checkDice(className);
                Skills.selectSkill("Bard");
            }
            else if(className.equalsIgnoreCase("Cleric")){
                Character.checkDice(className);
                Skills.selectSkill("Cleric");
            }
            else if(className.equalsIgnoreCase("Druid")){
                Character.checkDice(className);
                Skills.selectSkill("Druid");
            }
            else if(className.equalsIgnoreCase("Fighter")){
                Character.checkDice(className);
                Skills.selectSkill("Fighter");
            }
            else if(className.equalsIgnoreCase("Monk")){
                Character.checkDice(className);
                Skills.selectSkill("Monk");
            }
            else if(className.equalsIgnoreCase("Paladin")){
                Character.checkDice(className);
                Skills.selectSkill("Paladin");
            }
            else if(className.equalsIgnoreCase("Ranger")){
                Character.checkDice(className);
                Skills.selectSkill("Ranger");
            }
            else if(className.equalsIgnoreCase("Rogue")){
                Character.checkDice(className);
                Skills.selectSkill("Rogue");
            }
            else if(className.equalsIgnoreCase("Sorcerer")){
                Character.checkDice(className);
                Skills.selectSkill("Sorcerer");
            }
            else if(className.equalsIgnoreCase("Warlock")){
                Character.checkDice(className);
                Skills.selectSkill("Warlock");
            }
            else if(className.equalsIgnoreCase("Wizard")){
                Character.checkDice(className);
                Skills.selectSkill("Wizard");
            }
            else{
                System.out.println("Choose Your Character Type correctly!!!");
            }
            System.out.print("Do you Want to Choose Character Again?(Y/N)");
            ask =sc.next().toUpperCase().charAt(0);
        }while(ask=='Y');
        Character.charactLevel();
    }


}

