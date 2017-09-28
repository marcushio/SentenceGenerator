import java.util.ArrayList; 
import java.util.Random; 
/**
 * Description of class Nouns here.
 *
 * @author Marcus Trujillo
 * @version 
 */
public class Nouns implements FragmentGenerator
{
    Random randomGenerator; 
    ArrayList<String> nounLib; 
    public Nouns(){
        nounLib = new ArrayList(); 
        randomGenerator = new Random(); 
        buildLibrary(); 
    }
    public void buildLibrary(){
        nounLib.add("squirrel "); 
        nounLib.add("robot "); 
        nounLib.add("shitzu "); 
        nounLib.add("hominid "); 
    }
    public String select(){
        String noun = nounLib.get(randomGenerator.nextInt(nounLib.size())); 
        return noun; 
    }
}
