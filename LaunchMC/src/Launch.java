import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Launch {
    
     public static void main(String[] args) {
    	try {
   
    		 Path filePath = new File(System.getenv("APPDATA") + "\\.minecraft\\TagCraftMC Files\\Arguments\\Arguments_launch.txt").toPath();
    		 Charset charset = Charset.defaultCharset();        
    		 List<String> stringList = Files.readAllLines(filePath, charset);
    		 String[] stringArray = stringList.toArray(new String[]{});
    		 Process p = new ProcessBuilder(stringArray).start();
     		 p.toString();
     		
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
