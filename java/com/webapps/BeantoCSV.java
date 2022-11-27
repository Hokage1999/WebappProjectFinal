package com.webapps;

import java.io.FileWriter;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.webapps.Cred;
  
public class BeantoCSV {
    
  public static void CSV()
  {
        // name of generated csv
        final String CSV_LOCATION = "/home/sysadmin/Documents/Demo.csv";
        try {
  
            // Creating writer class to generate
            // csv file
            FileWriter writer = new 
                       FileWriter(CSV_LOCATION);
  
            ColumnPositionMappingStrategy mappingStrategy=
                        new ColumnPositionMappingStrategy();
            mappingStrategy.setType(Cred.class);
  
            // Arrange column name as provided in below array.
            String[] columns = new String[] 
                    { "uname", "pass", "mobileNo","courses" };
            mappingStrategy.setColumnMapping(columns);
  
            // Creating StatefulBeanToCsv object
            StatefulBeanToCsvBuilder<Cred> builder=
                        new StatefulBeanToCsvBuilder(writer);
            StatefulBeanToCsv beanWriter =  builder.withMappingStrategy(mappingStrategy).build();
  
            // Write list to StatefulBeanToCsv object
            beanWriter.write(Cred.getList());
  
            // closing the writer object
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}