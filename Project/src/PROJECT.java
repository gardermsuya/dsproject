import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PROJECT {
    
    String filename = "C:\\Users\\HILDAGARD MSUYA\\Desktop\\swim.csv";
    
    File file= new File(filename);
    
    List < List <String >> lines = new ArrayList <> ();
    
    Scanner inputStream;

    public PROJECT() throws FileNotFoundException {
        this.inputStream = new Scanner(file);
    }
    
    public void welcome(){
        
        System.out.println("**Setting up...");
        
    }
    
    public void importData(){
        
        while(inputStream.hasNext()){
            String line = inputStream.next();
            String[] values = line.split(",");
            // this adds the currently parsed line to the 2-dimensional string array
            lines.add(Arrays.asList(values));
        }
        inputStream.close();
        
    }
    
    public void sortData(){
        
        //todo
        
    }
    
    public void printData(){

        for(List<String> line: lines) {
            int columnNo = 1;
            for (String value: line) {
                if (columnNo == 6){
                    System.out.println("\n");
                } else{
                    System.out.print(line.get(0) + "      ");
                    System.out.print(line.get(1) + "      ");
                    System.out.print(line.get(2) + "      ");
                    System.out.print(line.get(3) + "      ");
                    System.out.print(line.get(4) + "      ");
                    System.out.print(line.get(5) + "      ");
                    columnNo++;
                }
            }
        }
        
    }

    public static void main(String args[]) throws FileNotFoundException {
        
        PROJECT project = new PROJECT();
        project.welcome();
        project.importData();
        project.printData();
        
    }
}

