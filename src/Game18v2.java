import java.util.Scanner; // Scanner is being imported from java.util package
public class Game18v2{
    /*Main method*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creating a Scanner

        System.out.print("Enter the Level:"); //Prompt the user to input  for Level
        int level=sc.nextInt();

        String[] listName={"Str:","Dex:","Con:","Int:","Wis:","Cha:"};
        int [] listValue=new int[6];//arraylist for sum of dice values for str,dex,con,int,wis,cha
        int[] bonus = new int[6];	//arraylist for bonus
        char yes_No = 'n';

        /*Re roll process while user enter N or n*/
        while (yes_No=='N' || yes_No=='n'){  
				/*This would help you to roll the six faced dice three times.
				this FOR LOOP help to create 6 variables...*/
            for(int count =0; count<listValue.length ; count++){
                listValue[count] =(int)(Math.random()*1000 %6+1)
                        +(int)(Math.random()*1000 %6+1)+(int)(Math.random()*1000 %6+1);// Sum of 3 dices..
            }
            /*this will show the re roll output */
            System.out.println(listName[0]+listValue[0]+"\n"+listName[1]+listValue[1]+"\n"+
                    listName[2]+listValue[2]+"\n"+listName[3]+listValue[3]+"\n"
                    +listName[4]+listValue[4]+"\n"+listName[5]+listValue[5]);
            /*asking user to accept this roll....*/
            System.out.print("Do You Accept This Roll ?(Y/N)");
            yes_No=sc.next().charAt(0);
        }

        System.out.println("Level:" + level);
        for (int counter=0; counter< listValue.length; counter++){ // To find the bonus..

            if (listValue[counter] < 10){
                bonus[counter]=((listValue[counter]-11)/2);
                System.out.println(listName[counter]+"  ["+listValue[counter]+ " ] ["+bonus[counter]+"]");
            }

            else if (listValue[counter] > 11){
                bonus[counter]=((listValue[counter]-10)/2);
                System.out.println(listName[counter]+"  ["+listValue[counter]+ "] [+"+bonus[counter]+"]");
            }

            else{

                System.out.println(listName[counter]+"  ["+ listValue[counter] + "] [ 0]");
            }

        }
		/*	System.out.println("con_bonus  :" + bonus[2]); to check Con's bonus is right or wrong...
														remove the comment...
														because we have to find hp using con-bonus... */
        double hp= (((Math.random()*1000 %6+1) + bonus[2])/level);
        System.out.println("HP :  " + hp);
    }
}