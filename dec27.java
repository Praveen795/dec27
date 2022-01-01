package dec27;
import java.util.Scanner;
public class dec27 {
	public static void main(String[] args) {
		
//_________________[1st problem]________________________________________________***
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		
		int size=sc.nextInt();
		
		System.out.println("enter the element");
		int[][] arr=new int[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
				
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		
//__________________________________________________________________________________***
		
	}

}
