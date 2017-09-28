
/**
 * Description of class Concatenate here.
 *
 * @author Marcus Trujillo
 * @version 9.27.17
 */
public class Concatenator
{   
    Adjectives adjectives; 
    Nouns nouns; 
    Subjects subjects; 
    Verbs verbs; 
    public Concatenator(){
        adjectives = new Adjectives(); 
        nouns = new Nouns(); 
        subjects = new Subjects(); 
        verbs = new Verbs(); 
    }
    String concatenate(){
        String subject = subjects.select(); 
        String verb = verbs.select(); 
        String adjective = adjectives.select(); 
        String noun = nouns.select(); 
        String sentence = subject + verb + "the " + adjective + noun; 
        return sentence; 
    }
}
