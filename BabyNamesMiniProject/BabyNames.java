
/**
 * Write a description of BabyNames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;
public class BabyNames {
    public void printNames() {
        FileResource fr = new FileResource();
        //the false here means that there are no data record headers, the file just has data in it.
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            if (numBorn <= 100) {
                System.out.println("Name " + rec.get(0) +
                                   " Gender " + rec.get(1) +
                                   " Num Born " + rec.get(2));
            }
        }
    }
    public void totalBirthsAndNames(FileResource fr) {
        int totalBirths = 0;
        int totalBoys = 0;
        int totalGirls = 0;
        int totalBoysNames = 0;
        int totalGirlsNames = 0;
        int totalNames = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirths += numBorn;
            if (rec.get(1).equals("M")) {
                totalBoys += numBorn;
                totalBoysNames += 1;
            }
            else {
                totalGirls += numBorn;
                totalGirlsNames += 1;
            }
        }
        totalNames = totalGirlsNames + totalBoysNames;
        System.out.println("Total Births = " + totalBirths);
        System.out.println("Total Girls = " + totalGirls);
        System.out.println("Total Boys = " + totalBoys);
        System.out.println("Total Girls Names = " + totalGirlsNames);
        System.out.println("Total Boys Names = " + totalBoysNames);
        System.out.println("Total Names = " + totalNames);
        
    }
    
    public void testTotalBirthsAndNames() {
        //FileResource fr = new FileResource("data/us_babynames_by_year/yob2014.csv");
        FileResource fr = new FileResource("data/example-small.csv");
        totalBirthsAndNames(fr);
    }
}
