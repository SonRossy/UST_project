package groupchoice;
import java.util.*;

/**
 *
 * @author tristesse08
 */
public class GroupChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Choose();
        //add(2,3);
        //GroupChoice c=new GroupChoice();
        //c.add(1, 2);
       
    }
    
    
    //our fuction to choose a group
    public static void Choose()
    {
        //create a random object 
        Random rand =new Random();
        
        //getting our random number from 1 to 3
        int groupNumber= rand.nextInt(3) + 1;
        
        //check our number
        switch(groupNumber){
            case 1:
                System.out.println("Group one was chosen");
                break;
            case 2:
                System.out.println("Group Two was chosen");
                break;
             case 3:
                System.out.println("Group Three was chosen");
                break;  
             default:
                 System.out.println("Group could not be chosen");
        }
        /*if(groupNumber==1)
        {
            System.out.println("Group one was chosen");
        }
        else if(groupNumber==2)
        {
            System.out.println("Group two was chosen");
        }
        else if(groupNumber==3)
        {
            System.out.println("Group three was chosen");
        }*/
    }
    /**
     * this function adds two numbers
     * @param numberOne
     * @param numberTwo 
     */
    public  void add(int numberOne, int numberTwo)
    {
        int total=numberOne+numberTwo;
        System.out.println("the total of the numbers is: "+ total);
    }
}
