import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MainClass {

	public static void main(String[] args) throws IOException {

		Employeesystem.showUser();

		Path path = Paths.get("C:\\Users\\shobh\\eclipse-workspace\\Day27JavaIO\\src\\filedemo.txt");
		Path dirpath = Paths.get("C:\\Users\\shobh\\eclipse-workspace\\Day27JavaIO\\src");
		List<String> list = Files.readAllLines(path);
		System.out.println(list);

		Files.deleteIfExists(path);
		Files.createFile(path);
		Files.createDirectories(dirpath);
		Files.createFile(dirpath);

		System.out.println(Files.exists(path));

		Files.walk(path).filter(Files::isRegularFile).forEach(System.out::println);
	}

}
