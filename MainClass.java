import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class MainClass {

	public static void main(String[] args) throws IOException {

		//Employeesystem.showUser();
		
		Path path = Paths.get("C:\\Users\\shobh\\eclipse-workspace\\Day27JavaIO\\src\\filedemo.txt");
        List<String> list = Files.readAllLines(path);
        System.out.println(list);
        
		Files.deleteIfExists(path);
		Files.createFile(path );
        System.out.println(Files.exists(path));
	}

}
