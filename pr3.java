package ex1.io;
import java.util.Random;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int a;
		while(true) {
			System.out.print("요소 수 : "); a=scan.nextInt();
			if(a>10)
			{
				System.out.println("다시 요소 수를 입력해주세요 ");
			}
			else
				break;
		}
		int[]b=new int[a];
		for(int i=0;i<b.length;i++)
		{
			b[i]=(rand.nextInt(10)+1);
			System.out.println(b[i]);
			if(i>=1)
			{
				for(int j=0;j<i;j++)
				{
					if(b[i]==b[j])
					{
						System.out.println("중복 값 발견"+b[j]);
						b[i]=(rand.nextInt(10)+1);
						j=0; //만약 새로운 수를 다시 만들 때 루프를 처음부터 돌림
					}
				}
			}
			
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]+" ");
		}
		
	}

}

