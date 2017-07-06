
/**
 * Write a description of ParsingExportData here.
 * 
 * @author Asim Zaidi 
 */
import edu.duke.*;
import org.apache.commons.csv.*;
public class ParsingExportData
{
//    Write a method named countryInfo that has two parameters, parser is a CSVParser and
//    country is a String. This method returns a string of information about the country or returns “NOT
//    FOUND” if there is no information about the country. The format of the string returned is the country,
//    followed by “: “, followed by a list of the countries’ exports, followed by “: “, followed by the countries
//    export value. For example, using the file exportdatasmall.csv and the country Germany, the
//    program returns the string:
//        Germany: motor vehicles, machinery, chemicals: $1,547,000,000,000    
    public void countryInfo(CSVParser parser, String country){
        for(CSVRecord record : parser){
            String countryInfo = record.get("Country");
            if(countryInfo.contains(country)){ 
                System.out.println(record.get("Country") + ":");
                System.out.println(record.get("Exports") + ":");
                System.out.println(record.get("Value (dollars)"));
            }
            else{
                System.out.println("NOT FOUND");
            }
            return;

        }
    
    }    
//    Write a description of ParsingExportData here.
//    Write a method named tester that will create your CSVParser and call each of the methods
//    below. You would start your code with:
//        FileResource fr = new FileResource();
//        CSVParser parser = fr.getCSVParser();
//    Each time you want to use the parser with another method, you will need to reset the parser with this
//    statement before calling that method.
//        parser = fr.getCSVParser();
    public void tester(){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        countryInfo(parser, "Angola");
    }
    
}
