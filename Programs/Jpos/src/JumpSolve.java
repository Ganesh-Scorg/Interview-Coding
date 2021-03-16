import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpSolve {
	
	static float jumpingOnClouds(int n, int[]c)
	{
		return 1.4f;
		
	}

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int n, int[] c) {
        
        int jump1=1, jump2=1;
        for(int i=0;i<n-1;i++)
        {
            if(c[i+1]==1)
            {
              jump1++;  
              i+=2;
            }else if (c[i+1]==0)
            {
                 jump1++;  
                 i++;
            }
        }
        
        for(int i=0;i<n-2;i++)
        {
            if(c[i+1]==1)
            {
              jump2++;  
              i+=2;
            }else if (c[i+1]==0 && c[i+2]==0)
            {
                 jump2++;  
                 i+=2;
            }
            else if (c[i+1]==0)
            {
                 jump2++;  
                 i++;
            }
        }
        
        if(jump1<jump2)
        return jump1;
        else
        return jump2;
        //return jump1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] c = new int[n];
//
//        String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }

    	int[] c = {0,0,1,0,0,1,0};
    	int n =7;
        int result = jumpingOnClouds(n,c);
System.out.println("result"+result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
