import java.util.*;

public class MakeCopy {
	ArrayList<String> listOfItems = new ArrayList<>();
	public MakeCopy(ArrayList<String> A)
	{
	for(int i=0; i <A.length ; i++)
	{
	listOfItems[i] = A[i];	
	}
	}
	
	public String[] testCopy()
	{
		return listOfItems;
	}
	

}
