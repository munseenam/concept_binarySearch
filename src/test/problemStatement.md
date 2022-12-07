Given a sorted array arr[] of n elements, write a function to search a given element x in arr[] and return the index of x in the array.

                 Consider array is 0 base index.

Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 

We basically ignore half of the elements just after one comparison.

Compare x with the middle element.
If x matches with the middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
Else (x is smaller) recur for the left half.

here are the test case to search the location of the array,return unsucessfull if array is not found,to searcha key to the right,left mid etc
