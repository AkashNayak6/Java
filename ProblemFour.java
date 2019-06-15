import java.util.Scanner;
import java.util.Arrays;

public class main
public static void ProblemFourA(){
    {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String word = read.nextLine();
        String reverse = "";
        
        
        for(int i = word.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("Reversed string is:");
        
    }
}
	public static void ProblemFourB() {
		int sum(int[][] a) {
			   int total = 0;
			   for (int i : a)
			      total += i;
			   return total;
			}
	}

	
	
		public static void ProblemFourC(){
			public int partition(Integer [] arr, int l, 
                    int r)
			{int x = arr[r], i = l;
			for (int j = l; j <= r - 1; j++)
			{if (arr[j] <= x)
			{int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			}
			}
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
			
			return i;
			}
			}

			
			public static int nthSmallest(Integer[] arr, int i, 
			        int j, int n)  // 9i*15j*7k
			{ if (n > 0 && n <= j - i + 1)
			{ int pos = partition (arr, i, j);
			
			if (pos-i == n-1)
			return arr[pos];
			
			if (pos-i > n-1) 
			return nthSmallest(arr, i, pos-1, n);
			return nthSmallest(arr, pos+1, j, n-pos+i-1);
			}
			}
}
			
			//possibilities for 9^i • 15^j • 7^k --> N=0 (smallest possible number) & N=0 (2nd smallest number)
			// N=0: return 1 (i,j,k=0)
			// N=1: return 7 (i,j=0; k=1)
			// N=2: return 9 (i=1;j,k=0)
			// N=3: return 15 (i,k=0;j=1)
			// N=4: return 49 (i,j=0;k=2)
			// N=5: return 63 (i,k=1;j=0)
			// N=6: return 81 (i=2;j,k=0)
			