/*
 * Arielle
 * Thurs. Jan. 12, 2017.
 * Version 1.0
 * Sorting animals into catagories. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u7.testCode;

import ca.hdsb.gwss.ainabe.ics3u.u7.CourseCode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;

/**
 *
 * @author 1ainabeari
 */
public class SearchAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Get XML and convert to Java
        File file = new File("animals.xml");
        Document doc;
        Element animals = null;
        if (file.exists()) {
            Builder builder = new Builder();
            try {
                doc = builder.build(file);
                animals = doc.getRootElement();
            } catch (ParsingException ex) {
                Logger.getLogger(CourseCode.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CourseCode.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            animals = new Element("animals");
            doc = new Document(animals);
        }

        //Search for Carnivores
        File file2 = new File("carnivores.xml");
        PrintWriter output = new PrintWriter(file2);

        Elements animal = animals.getChildElements();
        Element animal1;
        
        String diet;
        for (int i = 0; i < animal.size(); i++) {
            animal1 = animal.get(i);
            diet = animal1.getFirstChildElement("diet").getValue() + "";
            if (diet.equalsIgnoreCase("Carnivore")) {
                output.println(animals.toXML());
            }
        }
        
        output.close();
        
        //Searching for flying animals
        File file3 = new File ("flyinganimals.xml");
        output = new PrintWriter (file3);
        
        String flying;
        for (int i = 0; i < animal.size(); i++) {
            animal1 = animal.get(i);
            flying = animal1.getFirstChildElement("flying").getValue() + "";
            if (flying.equalsIgnoreCase("Yes")) {
                output.println(animal1.getFirstChildElement("animalName").toXML());
            }
        }

        output.close();
        
        //Searching for flying animals
        File file4 = new File ("northAmericanAnimals.xml");
        output = new PrintWriter (file4);
        
        String habitat;
        for (int i = 0; i < animal.size(); i++) {
            animal1 = animal.get(i);
            habitat = animal1.getFirstChildElement("habitat").getValue() + "";
            if (habitat.equalsIgnoreCase("Yes")) {
                output.println(animal1.toXML());
            }
        }

        output.close();
        
        //Searching for herbivores. 
        File file5 = new File ("herbivore.xml");
        output = new PrintWriter (file5);
        
        for (int i = 0; i < animal.size(); i++) {
            animal1 = animal.get(i);
            diet = animal1.getFirstChildElement("diet").getValue() + "";
            if (diet.equalsIgnoreCase("Herbivore")) {
                output.println(animal1.toXML());
            }
        }

        output.close();
        
        //Searching for South America animals
        File file6 = new File ("southamericaanimals.xml");
        output = new PrintWriter (file6);
        
        for (int i = 0; i < animal.size(); i++) {
            animal1 = animal.get(i);
            habitat = animal1.getFirstChildElement("habitat").getValue() + "";
            if (habitat.equalsIgnoreCase("South America")) {
                output.println(animal1.getFirstChildElement("animalName").getValue());
            }
        }

        output.close();
        
        //Searching for South America animals
        File file7 = new File ("southamericaanimals.xml");
        output = new PrintWriter (file7);
        
        
        String animalClass;
        
        for (int i = 0; i < animal.size(); i++) {
            animal1 = animal.get(i);
            animalClass = animal1.getFirstChildElement("animalClass").getValue() + "";
            if (animalClass.equalsIgnoreCase("Mammalia")) {
                output.println(animal1.getFirstChildElement("animalName").toXML());
            }
        }

        output.close();
        
        //Searching for South America animals
        animals = new Element("animals");
        Document doc2 = new Document (animals);
        File file8 = new File ("omnivores.xml");
        output = new PrintWriter (file8);

        for (int i = 0; i < animal.size(); i++) {
            animal1 = animal.get(i);
            diet = animal1.getFirstChildElement("diet").getValue() + "";
            if (diet.equalsIgnoreCase("omnivore")) {
                Element animal2 = new Element ("animals");
                
                Element omniName = new Element( "animalName" );
                omniName.appendChild(animal1.getFirstChildElement("animalName").getValue());
                Element omniClass = new Element ("animalClass");
                omniClass.appendChild(animal1.getFirstChildElement("animalClass").getValue());
                Element omniHabitat = new Element ("habitat");
                omniHabitat.appendChild(animal1.getFirstChildElement("habitat").getValue());
                Element omniDiet = new Element ("diet");
                omniDiet.appendChild(animal1.getFirstChildElement("diet").getValue());
                Element omniFlying = new Element ("flying");
                omniFlying.appendChild(animal1.getFirstChildElement("flying").getValue());
                
                animals.appendChild(animal2);
                animal2.appendChild(omniName);
                animal2.appendChild(omniClass);
                animal2.appendChild(omniHabitat);
                animal2.appendChild(omniDiet);
                animal2.appendChild(omniFlying);
            }
        }
        output.println(doc2.toXML());

        output.close();
    }
    }
    
    
    
    

