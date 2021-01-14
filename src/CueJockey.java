import java.util.Scanner;

public class CueJockey {

	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.playTest(1);
		Scanner scan = new Scanner(System.in);
		System.out.println("Delay");
		String useless = scan.nextLine();
		System.out.println("Exit");
	}
}
