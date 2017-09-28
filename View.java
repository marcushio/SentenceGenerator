import java.util.Scanner; 
/**
 * Description of class View here.
 *
 * @author Marcus Trujillo
 * @version 
 */
public class View
{
    
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Concatenator concatenator = new Concatenator(); 
        boolean running = true; 
        System.out.println("Leave the terminal empty and hit enter to make a sentence \n Enter any character to quit"); 
        do{
            if(input.nextLine().isEmpty()){
                System.out.println(concatenator.concatenate()); 
            } else{
                running = false; 
            }
        }while(running); 
        System.exit(0); 
    }
}
