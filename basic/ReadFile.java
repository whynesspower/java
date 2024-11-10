import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try{     
            File obj = new File("./file.txt");
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
            obj.delete();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
