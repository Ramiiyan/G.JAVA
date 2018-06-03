import java.util.Scanner;

class Character{

    private static int hitDice;


    private static String[] abilityName = {"Str:", "Dex:", "Con:", "Int:", "Wis:", "Cha:"};
    public  static void charactLevel(){
    }
    private static void scores(int hitDice) {
        int[] listValue = new int[6];
        int[] bonus = new int[6];
        char yes_No = 'n';
        int finalValue = 0;
        int hitPoints;

        Scanner sc = new Scanner(System.in);
        /*Re roll process while user enter N or n*/

        while (yes_No == 'N' || yes_No == 'n') {
            for (int count = 0; count < listValue.length; count++) {
                listValue[count] = process( finalValue);// return the LastTotal to score by calling the process method.
            }
            System.out.println(abilityName[0] + listValue[0] + "\n" + abilityName[1] + listValue[1] + "\n" +
                    abilityName[2] + listValue[2] + "\n" + abilityName[3] + listValue[3] + "\n" +
                    abilityName[4] + listValue[4] + "\n" + abilityName[5] + listValue[5]);
            System.out.print("Do You Accept This Roll ?(Y/N)");//asking user to re-roll or not
            yes_No = sc.next().charAt(0);
        }

        /*Calculating Bonus */

        for(int count=0;count<listValue.length;count++){
            bonus[count]=listValue[count]/2 -5;
            if(listValue[count]>11)
                System.out.println(abilityName[count]+"  ["+ listValue[count] +"] [+"+ bonus[count] +"]");
            else
                System.out.println(abilityName[count]+"  ["+ listValue[count] +"]  ["+ bonus[count] +"]");
        }
        System.out.println("HIT DICE  : "+hitDice);
        hitPoints=hitDice + bonus[2];
        System.out.println("HIT POINTS: "+hitPoints);
    }

    /*method to find final total..(after dropdown the minimum dice value..) */

    private static int process(int total) {
        int minValue = 6; //6 is the maximum value in 6 face dice..
        int[] diceValues = new int[4];
        for (int i = 0; i < diceValues.length; i++) {
            diceValues[i] = (int) (Math.random() * 1000 % 6 + 1);

                /*System.out.println(diceValues[i]);
                 can check here via above statement... whether dice getting different values are not...*/

            total += diceValues[i];            //adding dice values to total
            if (diceValues[i] < minValue) {    //finding for minimum value in dice roll
                minValue = diceValues[i];      //assign lowest diceValue to minValue.
            }
        }
        total = total - minValue; //the last TOTAL.. after dropped lowest dice....
        return total; //finally total will return to lastTotal..that's the final output of process() method...
    }
    public static void checkDice(String className) {
        if (className.equalsIgnoreCase("Barbarian")) {
            hitDice = (int) (Math.random() * 1000 % 12 + 1);
        } else if (className.equalsIgnoreCase("Bard") || className.equalsIgnoreCase("Cleric") ||
                className.equalsIgnoreCase("Druid") || className.equalsIgnoreCase("Monk") ||
                className.equalsIgnoreCase("Rogue") || className.equalsIgnoreCase("Warlock")) {
            hitDice = (int) (Math.random() * 1000 % 8 + 1);
        } else if (className.equalsIgnoreCase("Fighter") || className.equalsIgnoreCase("Paladin") ||
                className.equalsIgnoreCase("Ranger")) {
            hitDice = (int) (Math.random() * 1000 % 10 + 1);
        } else if (className.equalsIgnoreCase("Sorcerer") || className.equalsIgnoreCase("Wizard")) {
            hitDice = (int) (Math.random() * 1000 % 6 + 1);
        } else {
            System.out.println("choose Character correctly");
        }
        Character.scores(hitDice);
    }
}


