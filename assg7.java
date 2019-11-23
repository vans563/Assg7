import java.util.*;
public class countFreq
{
	int []a;
	int[]b;
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int si=sc.nextInt();
		a=new int[si];
		b=new int[si];
		for(int i=0;i<si;i++)
		{
			a[i]=sc.nextInt();
			b[i]=-1;
		}
		int c=0;
		for(int i=0;i<si;i++)
		{
			if(b[i]==0)
				count;
			c=1;
			for(int j=i+1;j<si;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=0;
					c++;
				}
			}
			System.out.println("Count of "+a[i]+" is "+c);
		}
	}
	public static void main(String args[])
	{
		countFreq x=new countFreq();
		x.display();
	}

}