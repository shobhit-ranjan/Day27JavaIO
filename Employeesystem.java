import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Employeesystem {

	static int Id;
	static String userName;
	static long salar;
	static ArrayList<File> empdata = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static File file;

	static void showUser() throws IOException {
		System.out.println("enter your id here");
		Id = sc.nextInt();
		System.out.println("Your Name here");
		userName = sc.next();
		System.out.println("Your salar here");
		salar = sc.nextLong();
		empdata.add(new File(Id, userName, salar));

		file = empdata.get(1);
		System.out.println(file.Id + " " + file.userName + " " + file.salar);

		if (Files.exists(Paths.get("src\\default package\\filedemo.txt")))
			;
		{
			Files.write(Paths.get("src\\default package\\\\filedemo.txt"), empdata.toString().getBytes());

		}
		{
			System.out.println("file not there");
		}
		int count = 0;
		for (int i = 0; i < empdata.lastIndexOf(empdata); i++) {
			count = count + 1;
			System.out.println(empdata);
			System.out.println("you have " + count + " employee entery ");
		}

	}
}
