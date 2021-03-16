import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPattern
{
	
	public static void main(String[] args) throws IOException
	{
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Eneter hight of a pattern");
//		
//		int height = Integer.parseInt(br.readLine());
		
		int height = 6;
		
		for(int i=1;i<=height;i++)
		{
			for(int j=1;j<=height;j++)
			{
				if(j<=height-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.println("");
		}
		
		for(int i=1;i< height;i++)
		{
			for(int j=1;j<=height;j++)
			{
				if(j<=i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
}

