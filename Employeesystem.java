import java.util.ArrayList;
import java.util.Scanner;

public class Employeesystem {

	static int Id;
	static String userName;
	static long salar;
	static ArrayList<File> empdata = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static File file;

	static void showUser() {
		System.out.println("enter your id here");
		Id = sc.nextInt();
		System.out.println("Your Name here");
		userName = sc.next();
		System.out.println("Your salar here");
		salar = sc.nextLong();
		empdata.add(new File(Id, userName, salar));

		file = empdata.get(0);
		System.out.println(file.Id + " " + file.userName + " " + file.salar);
	}

}
