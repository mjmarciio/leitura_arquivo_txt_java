import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException{

       Path path = Path.of("C://testetxt//contato.txt");


     //  if(Files.notExists(path)) {
      //     Files.createFile(path);
      // }


        String nome = "Fulano, 913532465, fulano@email.com";


        Files.writeString(path, nome);



       List<String> string = Files.readAllLines(path);

       for(String texto: string){
           System.out.println(texto);
       }

    }
}