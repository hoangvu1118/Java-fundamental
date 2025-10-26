import java.io.FileWriter;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.BufferedReader;

public class main{
    public static void main(String[] args){

        String filePath = "/home/minhhoang/Documents/University/CS-FraUas/Java/Java-fundamental/testLocation/test.txt";
        String textContent = """
                Roses are red,
                Me are yellow,
                Often get cold,
                Dont know how to solve,
                A single problem in the world!
                """;
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written\n");
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot find the FILE to be written\n");
        }
        catch(Exception e){
            System.out.println("Cannot write file\n");
        }

        finally {
            System.out.println("Finish Writing");
        }


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}