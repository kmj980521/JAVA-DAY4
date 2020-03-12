package ex1.io;
public class Program {

	public static void main(String[] args) {
		int[]a=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=a.length-i;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}

	}

}

