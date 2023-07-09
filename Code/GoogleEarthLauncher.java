package kibet;

import java.io.FileWriter;

import java.io.IOException;

public class GoogleEarthLauncher {

    public static void main(String[] args) throws IOException  {

    // difficult task for creating an automated kml that includes several coordinates
           
    // create KML components 

       String kmlBeginning = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+

        "<kml xmlns=\"http://www.opengis.net/kml/2.2\">\r\n"+
        "<Document>\r\n";
        
       String kmlEnd = "</Document> </kml>";
         
       String kmlCombined = kmlBeginning + addPlacemark() + kmlEnd;

      //write KML string to file

      FileWriter fileWriter = new FileWriter("C:\\Users\\ADMIN\\Downloads\\unit4.kml");

      fileWriter.write(kmlCombined);

      fileWriter.close();

      // insert the filepaths for launching google earth

      String googleEarthFilePaths = "C:\\Program Files\\Google\\Google Earth Pro\\client\\googleearth.exe";

      String tweetsFile = "C:\\Users\\ADMIN\\Downloads\\tweets.kml";

      // launch google earth
      
      System.out.println("Launching Google Earth...");
       try {Runtime.getRuntime().exec(googleEarthFilePaths + " " + tweetsFile);
             }
       catch (IOException ex) {
    	   ex.printStackTrace(); 
    	   }                       

  }//main

    //create for loop containing the coordinates as a string

    public static String addPlacemark() {
                String placemark = "";
                
            String[] coordinates = {"13.03978, 47.82281", "13.06024, 47.78861", "13.03364, 47.80569", "13.05354, 47.80628", "13.04747, 47.81912"};
        
            for(int i = 0; i < coordinates.length; i++) {

            placemark += "<Placemark>\r\n <name> point X </name>\r\n <description> My first self-created KML. </description>\r\n"
            + "<Point>\r\n <coordinates>" + coordinates[i] + "</coordinates>\r\n"
            + "</Point>\r\n </Placemark>\r\n";
         }
            	return placemark;
     }

    public static void openKML(String twitterKML) {
    }

 
} //class

 