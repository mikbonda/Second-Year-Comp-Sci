
public class BinarySearch {

	
	public static void main(String[] args) {
		int[]A = new int[10];
		for(int i=0; i<A.length; ++i)
		{
			A[i] = (i+1)*(i+1);
			}
		System.out.println("A = "  Arrays.toString(A));
		}
	
	
	static public  int BinarySearch(int v, int[] A , int low, int high) {
			while(low<high){
				int mid = (low+high)/2;
				if(v <= A[mid]){
				high=mid;
				}else{
				low = mid+1;
				}
			}
			if(v == A[high]) return high;
			else return -1;
		}

	}


