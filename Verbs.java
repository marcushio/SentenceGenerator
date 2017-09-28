import java.util.ArrayList; 
import java.util.Random; 
/**
 * Description of class Verbs here.
 *
 * @author Marcus Trujillo
 * @version 9.26.17 1:14pm
 */
public class Verbs implements FragmentGenerator
{
    ArrayList<String> verbLib; 
    Random randomNumberMaker; 
    
    public Verbs(){
        verbLib = new ArrayList(); 
        buildLibrary();
        randomNumberMaker = new Random(); 
    }
    public void buildLibrary(){
        verbLib.add("licks "); 
        verbLib.add("punches ");
        verbLib.add("eats ");
        verbLib.add("salutes ");
        verbLib.add("remembers ");
    }
    public String select(){
        String verb = verbLib.get(randomNumberMaker.nextInt(verbLib.size())); 
        return verb; 
    }
}
