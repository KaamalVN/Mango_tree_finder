package Mango_tree_finder;
import java.util.Scanner;
public class Mangotree_finder {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int rows=scanner.nextInt();
		int columns=scanner.nextInt();
		int tree_number=scanner.nextInt();
		
		if(tree_number<=rows) {
			System.out.print(true);
		}
		else if((tree_number-1)%rows==0) {
			System.out.print(true);
		}
		else if(tree_number%rows==0) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
	}

}
