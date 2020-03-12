package ex1.io;
import java.util.Random;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수 : "); int a=scan.nextInt();
		int[]b=new int[a];
		int max=10;
		for(int i=0;i<b.length;i++)
		{
			b[i]=(rand.nextInt(10)+1); //1~10 난수 입력
		}
		for(int i=0;i<b.length;i++)
		{	
			System.out.print(b[i]);
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[j]>=max)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			max--;
			System.out.println();
		}
		System.out.println("===============================");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(i%10);
		}
	}

}

