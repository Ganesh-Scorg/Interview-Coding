
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MobileNumberExtraction {

	int i;
	String b;
	public static void main(String s[]){
		MobileNumberExtraction m = new MobileNumberExtraction();
		int[] T = {1,45,335,64,75,26,37,58};

		m.solution(T);
	}
    public String solution(int[] T) {
        int length = T.length;
    	int count = 0;
    	int daysInEachSeason = length/4;
    	List<Integer> sortedlist = chunkArray(T , daysInEachSeason);
    	
    	int value=Collections.max(sortedlist);
    	
    	
    	return "";
    }

     public static List<Integer> chunkArray(int[] array, int chunkSize) {
        int numOfChunks = (int)Math.ceil((double)array.length / chunkSize);
        int[][] output = new int[numOfChunks][];
        List list = new ArrayList<Integer>();
        for(int i = 0; i < numOfChunks; ++i) {
            int start = i * chunkSize;
            int length = Math.min(array.length - start, chunkSize);
            int[] temp = new int[length];
            System.arraycopy(array, start, temp, 0, length);
            int number = findDifference(temp);
            list.add(number);
            output[i] = temp;
        }

        return list;
    }

    static int findDifference(int[] numbers){
         int smallest = numbers[0];
            int biggest = numbers[0];

            for(int i=1; i< numbers.length; i++)
            {
                    if(numbers[i] > biggest)
                            biggest = numbers[i];
                    else if (numbers[i] < smallest)
                            smallest = numbers[i];

            }
            return biggest - smallest;
    }
}