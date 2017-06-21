public class CanBalance
{
	//Given a non-empty array, return true if there is a place to split the array 
	//so that the sum of the numbers on one side is equal to the sum of the numbers
	//on the other side.

	//canBalance([1, 1, 1, 2, 1]) → true
	//canBalance([2, 1, 1, 2, 1]) → false
	//canBalance([10, 10]) → true

	public boolean canBalance(int[] nums) {
  
 	int i = 0;
  	int leftSum = 0;
  	int rightSum = 0;
  	int total = 0; //total sum of all of the elements in the array
  
  	//By calculating the total, we save some time by only using 1 loop for each
  	//iteration rather than looping for leftSum and rightSum
  	for(int k = 0; k < nums.length; k++)
  	{
  	  total = total + nums[k];
  	}
  
  
 	 while(i < nums.length)
 	 {
  	  for(int j = 0; j <= i; j++)
  	  {
    	  leftSum = leftSum + nums[j];
    	}
    	rightSum = total - leftSum;
    
 	   if(leftSum == rightSum)
  	    return true;
  	  else if(leftSum > rightSum)
  	    return false;
  	  
  	  leftSum = 0;
  	  i++;
	  }
  
 	 return false;
  
 	//Another mistake I had in this one is that I forgot to reset the leftSum
  	//to 0 after finishing one iteration. Always remember at the end of loops
  	//to reset certain variables befor doing i++
  	//A more efficient way I could have done this is to not calculate the
 	//leftSum each side, but rather store the leftSum in between iterations and 
  	//just add the next element. This likely makes the efficiency go from O(n^2) to 
  	//just O(n) because it is linear
  
	}

	public static void main(String[] args)
	{
		CanBalance tester = new CanBalance();
		int[] test1 = {1, 1, 1, 2, 1};
		int[] test2 = {2,1,1,2,1};
		int[] test3 = {10,10};
		int[] test = test1;
		int answer = 0;
	
		//Expected output: 4
		answer = tester.maxSpan(test);
		System.out.println(answer);
		
		//Expected output: 6
		test = test2;
		answer = tester.maxSpan(test);
		System.out.println(answer);
	
		//Expected output: 6
		test = test3;
		answer = tester.maxSpan(test);
		System.out.println(answer);
		
		

	}


}