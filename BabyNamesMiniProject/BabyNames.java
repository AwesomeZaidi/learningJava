
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
    public void totalBirths(FileResource fr) {
        int totalBirths = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirths += numBorn;
        }
        System.out.println("Total Births = " + totalBirths);
    }
    
    public void testTotalBirths() {
        FileResource fr = new FileResource("data/example-small.csv");
        totalBirths(fr);
    }
}
