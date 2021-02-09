package testgit;
import java.util.Scanner;
public class helloo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Noms = " ";
		if(Noms!= " ") {
	System.out.println("hello world");
	System.out.println(Noms);
		}else {
			System.out.println(" veuillez saisir les noms des participants");
			String str = sc.nextLine();
			System.out.println(" voici le nom des participants :"+str);
		}
	}

}
