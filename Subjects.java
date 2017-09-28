import java.util.ArrayList; 
import java.util.Random; 
/**
 * Description of class Subjects here.
 *
 * @author Marcus Trujillo
 * @version 
 */
public class Subjects implements FragmentGenerator
{
    ArrayList<String> subjectLib; 
    Random randomNumberMaker; 
    
    public Subjects(){
        subjectLib = new ArrayList(); 
        randomNumberMaker = new Random(); 
        buildLibrary(); 
    }
    public void buildLibrary(){
        subjectLib.add("Marcus "); 
        subjectLib.add("Colton "); 
        subjectLib.add("The dog "); 
        subjectLib.add("Franklin the turtle "); 
    }
    public String select(){
        String subject = subjectLib.get(randomNumberMaker.nextInt(subjectLib.size())); 
        return subject; 
    }
}
