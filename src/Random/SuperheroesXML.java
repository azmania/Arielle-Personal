/*
 * Arielle
 * Mon. Dec. 19, 2016
 * Version 1.0
 * Marvel and DC database. 
 */
package Random;

import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;


/**
 *
 * @author 1ainabeari
 */
public class SuperheroesXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Element superheroes = new Element("superheroes");
        Document Superheroes = new Document(superheroes);
        
        Element superhero = new Element("superhero");
        superheroes.appendChild(superhero);
        superhero.appendChild("Storm");
        Element abilities = new Element("abilities");
        superhero.appendChild(abilities);
        abilities.appendChild("Weather");
        Element team = new Element ("team");
        superhero.appendChild(team);
        team.appendChild("X-men, Avengers");
        
        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(Superheroes);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
}
