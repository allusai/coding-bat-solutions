{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf820
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 This is my solution to the CodingBat Array 3 (Hard array questions) challenge CanBalance where the objective is to determine whether for a given array if there is a place to split the array such that the sum of the elements on the left equals the sum of the elements on the right. The algorithm I wrote had a few features included and a few that could be implemented to make this solution become O(n). For example, instead of calculating the left sum and the right sum with two loops each time, I simply calculated the total sum once at the beginning and after calculating the left sum, I just subtracted it from the total sum to get the right sum. Another feature that would improve performance which I did not include is instead of calculating the left sum for each iteration of increasing the position at which we split at, I could just store the left sum in memory and then add the element at that position to the stored left sum and then subtract that element from the right sum.\
\
Pseudocode/Walkthrough:\
\
canBalance( [1,1,1,2,1] )\
\
We start our cursor \'93i\'94 at position 0. From here, the sum on the left is 1 (we include the element for the left sum) and the sum on the right is 5. Next, we move to position 1 and have a left sum of 2 and a right sum of 4. Then, to position 2 where both the left and right sum are 3. \
\
The additional steps that improve performance are to initially calculate the total to be 6 and then when we determine the left sum, to subtract it from the total to get the right sum. Also, we can just store the left sum at position 0 and then when we move to position 1, just to add the element at that index to the left sum and subtract it from the right sum. On small levels it only slightly improves speed, but when we scale and have arrays with a size of 100 or 100,000, this little trick will make the algorithm perform at O(n) time complexity.}