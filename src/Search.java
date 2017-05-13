/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import static java.lang.System.in;
import java.util.HashMap;
import java.util.Map;
import org.lightcouch.CouchDbClient;

/**
 * @author umair
 */
public class Search {

    private static DaOcity cityDAO = new DaOcity();

    private static void popDataBase() {
            
            CouchDbClient dbClient2 = new CouchDbClient("db-name", true, "http", "127.0.0.1", 5984, "root", "root");
        

            String csvFile = "src/GeoLiteCity-Location.csv";
            String line = "";
            String cvsSplitBy = ",";
            
            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                
                                
                Map<String, Object> map = new HashMap<>();
                map.put("_id", "152");
                map.put("country", "country[1]");
                map.put("region", "country[2]");
                map.put("city", "country[3]");
                map.put("postalcode", "country[4]");
                map.put("latitude", "country[5]");
                map.put("longitude", "country[6]");
                map.put("metroCode", "country[7]");
                map.put("areaCode", "country[8]");
                dbClient2.save(map);
                System.out.println(line);
                    
            
               
            }

            
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
           
    }

    public static void main(String[] args) {
            popDataBase();
    }

}
