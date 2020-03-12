package ex1.io;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반 수 : "); int a=scan.nextInt();
		int [][]x=new int[a][];
		int count=0; //학생 수
		for(int i=0;i<a;i++)
		{
			System.out.print((i+1)+"반의 인원 : ");
			int b=scan.nextInt();
			x[i]=new int[b];
			for(int j=0;j<b;j++)
			{
				System.out.print((i+1)+"반의"+(j+1)+"번의 점수: "); int num=scan.nextInt();
				x[i][j]=num;
				count+=1;
			}

		}
		System.out.println("반  합계  평균");
		double sum=0;
		double ave=0;
		double sum2=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				sum+=x[i][j];
				sum2+=x[i][j];
			}
			ave=sum/x[i].length;
			System.out.printf("%d 반 ㅣ %.0f %.1f",i+1,sum,ave);
			System.out.println();
			sum=0;
			ave=0;
		}
		double ave2=sum2/count;
		System.out.println("================");
		System.out.printf("계     ㅣ %.0f %.1f",sum2,ave2);
		
	}

}

