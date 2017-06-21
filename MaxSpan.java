//CodingBat- Array 3 (Hard array problems), maxSpan

//Consider the leftmost and righmost appearances of some value in an array. 
//We'll say that the "span" is the number of elements between the two inclusive. 
//A single value has a span of 1. Returns the largest span found in the given array.

//Test Cases:
//maxSpan([1, 2, 1, 1, 3]) → 4
//maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
//maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

public class MaxSpan
{

public int maxSpan(int[] nums) {
  
  if(nums.length == 0)
    return 0;
  
  int maxLength = 1;
  int i = 0;
  int j = nums.length - 1;
  
  //While you can actually find a longer maxLength, auto keeps i < nums.length
  while(j-i+1 > maxLength)
  {
    
    int k = j; //*This is the right variable to manipulate, helps with boundary conditions
    
    //Scan the array from the right to find a match, maxLength needs to be possible
    while((i < k) && (k-i+1 > maxLength))
    {
      if(nums[i] == nums[k])
        maxLength = k-i+1;
      k--;
    }

    i++; 
  }
  
  return maxLength;
  
  //The "bug" in this code was that j was being manipulated originally
  //and so the outer loop was constantly being checked and eventually broke
  //The technique to fix it was to have two boundary variables and then one
  //variable on the inside of the first loop which started at the same value
  //as j but could be manipulated without affecting the boundary conditions
  //"a looping variable"
  //The edge cases and determining bounds made this question challenging,
  //starting maxSpan at 1 didn't work for an empty array because the code
  //didn't like to measure spans of 1 which seems obvious
  //Going forward, add a special case for an empty array to save some time
  //and be more efficient. Remember that for nested loops, you should always
  //use an int k = j type variable*
  
}

public static void main(String[] args)
{
	MaxSpan object = new MaxSpan();

	int[] test1 = {1,2,1,1,3};
	int[] test2 = {1,4,2,1,4,1,4};
	int[] test3 = {1,4,2,1,4,4,4};
	int[] test = test1;
	int answer = 0;
	
	//Expected output: 4
	answer = object.maxSpan(test);
	System.out.println(answer);
	
	//Expected output: 6
	test = test2;
	answer = object.maxSpan(test);
	System.out.println(answer);
	
	//Expected output: 6
	test = test3;
	answer = object.maxSpan(test);
	System.out.println(answer);
	
	
	
}


}