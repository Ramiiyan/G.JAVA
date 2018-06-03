import java.util.Scanner;
public class Game18v3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Creating a Scanner
        System.out.print("Enter the Level:"); //Prompt the user to input  for Level
        int level=sc.nextInt();
        String[] listName={"Str:","Dex:","Con:","Int:","Wis:","Cha:"};
        int [] listValue=new int[6];
        int[] bonus = new int[6];
        char yes_No = 'n';
        int score=0;

        /*Re roll process while user enter N or n*/
        while (yes_No=='N' || yes_No=='n'){

            for(int count=0; count<listValue.length; count++){
                listValue[count] =process(score);// return the LastTotal to score by calling the process method.
            }

            System.out.println(listName[0]+listValue[0]+"\n"+listName[1]+listValue[1]+"\n"+listName[2]+listValue[2]+
                    "\n"+listName[3]+listValue[3]+"\n"+listName[4]+listValue[4]+"\n"+listName[5]+listValue[5]);
            System.out.print("Do You Accept This Roll ?(Y/N)");//asking user to re-roll or not
            yes_No=sc.next().charAt(0);

        }

        System.out.println("Level:" + level);
        for (int counter=0; counter< listValue.length; counter++){ // To find the bonus..

            if (listValue[counter] < 10)  {
                bonus[counter]=((listValue[counter]-11)/2);
                System.out.println(listName[counter]+"  ["+ listValue[counter] + " ] ["+ bonus[counter] +"]");
            }
            else if (listValue[counter] > 11){
                bonus[counter]=((listValue[counter]-10)/2);
                System.out.println(listName[counter]+"  ["+ listValue[counter] + "] [+"+ bonus[counter] +"]");
            }
            else{
                System.out.println(listName[counter]+"  ["+ listValue[counter] + "] [ 0]");
            }

        }

        double hp= (((Math.random()*1000 %6+1) + bonus[2])/level);
        System.out.println("HP :  " + hp);

    }
    private static int process(int total){ //method to find final total..(after dropdown the minimum dice value..)
        int minValue=6; //6 is the maximum value in 6 face dice..

        int [] diceValues=new int[4];
        for (int i=0; i<diceValues.length ; i++){
            diceValues[i]=(int)(Math.random()*1000 %6+1);
            //System.out.println(diceValues[i]);		can check here via this statement... whether dice getting different values are not...
            total +=diceValues[i];			//adding dice values to total
            if(diceValues[i]< minValue){	//finding for minimum value in dice roll
                minValue=diceValues[i];		//assign lowest diceValue to minValue.
            }
        }
        total=total-minValue; //the last TOTAL.. after dropped lowest dice....
        return total;		  //finally total will return to lastTotal..that's the final output of process() method...

    }

}
