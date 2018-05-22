/*
 * Arielle
 * Fri. Jan. 13, 2017.
 * Version 1.0
 * Sorting American League standings and creating new file with East Standings only. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u7.testCode;

import static ca.hdsb.gwss.ainabe.ics3u.u6.Method.sopl;
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
public class SortingALStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Read File
        File file = new File ("AL.STANDINGS(5).xml");
        Document doc;
        Element americanLeagueTeams = null;
        if (file.exists()) {
            Builder builder = new Builder();
            try {
                doc = builder.build(file);
                americanLeagueTeams = doc.getRootElement();
            } catch (ParsingException ex) {
                Logger.getLogger(CourseCode.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CourseCode.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            americanLeagueTeams = new Element("animals");
            doc = new Document(americanLeagueTeams);
        }
        
        //Sorting for American League East
        //Declaring Variables needed
        Elements al = americanLeagueTeams.getChildElements();
        String division;
        Element team;
        String teamName;
        String record;
        
        //Setting up table
        sopl("American League East");
        sopl("_______________________");
        System.out.format("%10s   %10s \n", "Teams:", "Record:");
        //Searching for loop
        for (int i = 0; i < al.size(); i++){
            team = al.get(i);
            division = team.getFirstChildElement("division").getValue() + "";
            //Checking for East
            if (division.equalsIgnoreCase("East")){
                teamName = team.getFirstChildElement("name").getValue() + "";
                record = team.getFirstChildElement("record").getValue() + "";
                System.out.format("%10s   %10s \n", teamName , record);
            }
        }
        
        //Sorting for American League Central
        //Setting up table
        sopl("\nAmerican League Central");
        sopl("___________________________");
        System.out.format("%11s   %11s \n", "Teams:", "Record:");
        //Searching for loop
        for (int i = 0; i < al.size(); i++){
            team = al.get(i);
            division = team.getFirstChildElement("division").getValue() + "";
            //Checking for Central
            if (division.equalsIgnoreCase("Central")){
                teamName = team.getFirstChildElement("name").getValue() + "";
                record = team.getFirstChildElement("record").getValue() + "";
                System.out.format("%11s   %11s \n", teamName , record);
            }
        }
        
        //Sorting for American League Central
        //Setting up table
        sopl("\nAmerican League West");
        sopl("___________________________");
        System.out.format("%11s   %11s \n", "Teams:", "Record:");
        //Searching for loop
        for (int i = 0; i < al.size(); i++){
            team = al.get(i);
            division = team.getFirstChildElement("division").getValue() + "";
            //Checking for West
            if (division.equalsIgnoreCase("West")){
                teamName = team.getFirstChildElement("name").getValue() + "";
                record = team.getFirstChildElement("record").getValue() + "";
                System.out.format("%11s   %11s \n", teamName , record);
            }
        }
        
        //New File for East Standings
        Element americanLeagueEastTeams = new Element("americanLeagueEastTeams"); 
        Document doc2 = new Document (americanLeagueEastTeams);
        File fileEast = new File ("AL.EAST.STANDINGS.xml");
        PrintWriter output = new PrintWriter (fileEast);
        
        //Searching for East teams for loop
        for (int i = 0; i < al.size(); i++){
            team = al.get(i);
            division = team.getFirstChildElement("division").getValue() + "";
            //Checking for East
            if (division.equalsIgnoreCase("East")){
                Element teamEast = new Element ("team");
                
                Element nameEast = new Element ("name");
                nameEast.appendChild(team.getFirstChildElement("name").getValue() + "");
                Element divisionEast = new Element ("division");
                divisionEast.appendChild(team.getFirstChildElement("division").getValue() + "");
                Element recordEast = new Element ("record");
                recordEast.appendChild(team.getFirstChildElement("record").getValue() + "");
                
                teamEast.appendChild(nameEast);
                teamEast.appendChild(divisionEast);
                teamEast.appendChild(recordEast);
                
                americanLeagueEastTeams.appendChild(teamEast);
                
                
            }
        }
        
        //Putting document in new File
        output.println(doc2.toXML());
        output.close();
        
        
    }
    
}
