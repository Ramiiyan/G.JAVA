import java.util.Scanner; // Scanner is being imported from java.util package
public class Game18{
    /*Main method*/
    public static void main(String[] args) {
        //Creating a Scanner method to input variables from user.
        Scanner sc = new Scanner(System.in); 
		
		/*Prompt the user to input seven variables respectively
		for Level, str,dex,con,int,wis and cha*/
        System.out.print("Enter the Level:");
        int level=sc.nextInt();
        System.out.print("Enter the Strength:");
        int str = sc.nextInt();
        System.out.print("Enter the Dexterity:");
        int dex = sc.nextInt();
        System.out.print("Enter the Constitution:");
        int con = sc.nextInt();
        System.out.print("Enter the Intelligence:");
        int lnt = sc.nextInt();
        System.out.print("Enter the Wisdom:");
        int wis = sc.nextInt();
        System.out.print("Enter the Charisma:");
        int cha = sc.nextInt();

        double hp= (level * (Math.random()*1000 %6+1)); //Calculation of Hit points
        // arrays list and list items
        String[] listName={"str","dex","con","int","wis","cha"};//array list(String) for output name..
        int[] listValue = {str,dex,con,lnt,wis,cha};// array list (integer) for output values..

        System.out.println("Level:" + level);
        //using FOR loop to check every values in Array list.
        for (int count=0; count < listValue.length; count++){
            //Checking whether the console input Equals to ten, then print its points and bonus as 0.
            if(listValue[count]== 10) {
                System.out.println(listName[count]+":  ["+listValue[count] + "]  [0]");
            }
            //Checking whether the console input greater than ten, then print its points and bonus.
            else if(listValue[count] > 11)  {
                System.out.println(listName[count]+":  [" +listValue[count]+"] [+" +((listValue[count]-10)/2)+"]");
            }
            //Checking whether the console input less than ten, then print its points and bonus.
            else{
                System.out.println(listName[count]+":  [" +listValue[count]+" ] [" +((listValue[count]-11)/2)+"]");
            }
        }
        System.out.println("HP :  "+hp);

    }
}