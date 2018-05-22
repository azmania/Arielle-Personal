/*
 * Arielle
 * Mon. Dec. 19, 2016
 * Version 1.0
 * Turning FirstASssignment into java. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u7.testCode;

import static ca.hdsb.gwss.ainabe.ics3u.u6.Method.sopl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.annotation.processing.Filer;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author 1ainabeari
 */
public class FirstXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Objects
        Element avengelis = new Element("Avengelis");
        Document documentName = new Document(avengelis);
        Scanner input = new Scanner(System.in);
        //Elements
        //Tanya
        Element character = new Element("Character");

        Element name = new Element("Name");

        Element side = new Element("Side");

        Element serarity = new Element("Serarity");

        //Input 
        //variables
        String name2, serarity2, side2;
        sopl("Choose character name");
        name2 = input.nextLine();
        sopl("Choose character side");
        side2 = input.nextLine();
        sopl("Choose character serarity(if any)");
        serarity2 = input.nextLine();
        avengelis.appendChild(character);
        character.appendChild(name);
        name.appendChild(name2);
        character.appendChild(side);
        side.appendChild(side2);

        side.appendChild(serarity);
        serarity.appendChild(serarity2);

        //Serialiser
        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(documentName);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        
        try {
            File  file = new File ("what.xml");
            PrintWriter pw = new PrintWriter ( file);
            BufferedWriter output = new BufferedWriter (pw);
            
            output.write(avengelis.toXML());
        }
        
        catch (IOException e){
            
        }
        
        

    }

}
