import java.util.ArrayList; 
import java.util.Random; 
/**
 * Description of class Adjectives here.
 *
 * @author Marcus Trujillo
 * @version 9.27.17
 */
public class Adjectives implements FragmentGenerator
{
    ArrayList<String> adjectiveLib; 
    Random randomGenerator; 
    
    public Adjectives(){
        adjectiveLib = new ArrayList(); 
        randomGenerator = new Random(); 
        buildLibrary(); 
    }
    public void buildLibrary(){
        adjectiveLib.add("grotesque "); 
        adjectiveLib.add("bulbous "); 
        adjectiveLib.add("delicious "); 
        adjectiveLib.add("hedonistic "); 
        
    }
    public String select(){
        String adjective = adjectiveLib.get(randomGenerator.nextInt(adjectiveLib.size())); 
        return adjective; 
    }
}
