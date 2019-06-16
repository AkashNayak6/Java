// tried to implement generic, NO scanner used  
	

	import java.util.Arrays;
	

	class ProblemFourA<string>		// generic
	public static void ProblemFourA(){			// to reverse a string
	    {
	        System.out.println("Enter string to reverse: ");
	        String word = read.nextLine();
	        String reverse = "";
	        
	        
	        for(int i = word.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + word.charAt(i);
	        }
	        System.out.println(reverse);
	        System.out.println("Reversed string is: ");
	        
	    }
	}
		class ProblemFourB<int>		// generic
		public static void ProblemFourB() {	// takes an int[][] array of arbitrary size and fins all integers summing to an arbitrary value 
			int sum(int[][] a) {
				   int total = 0;
				   for (int i : a)
				      total += i;
				   return total;
				}
		}
	

		
			class ProblemFourC<int>		// generic
			public static void ProblemFourC(){				// setting up algorithm using ArbitraryQueue Dynamic Capacity Array to find Nth smallest number that takes the form 9^i•15j•7^k 
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
	

				
				public static int nthSmallest(Integer[] arr, int i, 		// Nth smallest function to find the form (9^i•15j•7^k) from the implemented algorithm 
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
				
