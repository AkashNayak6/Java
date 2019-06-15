public class Problem1 {
	
	int Problem1Sort(int a[], int arraySize) {
		int max=0;
		for (int i=0; i<a.length; i++) {			// array length 
			if(a[i]>max) {
				max = a[i];
				
			}
		}
		
		for(int i=1; max/i>0; i *= 10) {		// array max and mult.
			int out[] = new int[arraySize];
			int arr[] = new int[10];
			for(int x=0; x<arr.length;x++) {
				arr[x]=0;
			}
			for (int j=0; j<arraySize ; j++) {
				arr[(a[j]/i)%10]++;
			}
			for(int k=1; k<10; k++) {
				arr[k] += arr[k-1];
			}
			for(int l=arraySize-1; l>= 0; l--) {
				out[arr[(a[1]/i)%10]-1]=a[1];
				arr[(a[l]/i)%10]--;
			}
			for (int m=0; m<arraySize; m++) {
				a[m] = out[m];
			}
		}
		for (int i=0; i<arraySize; i++) {			// print array 
			System.out.print(a[i] + " ");
		}
		return 0;
	}

}
