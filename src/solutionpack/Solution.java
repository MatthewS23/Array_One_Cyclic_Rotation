package solutionpack;

public class Solution {

    private int[] classArray;


    public static void solution(int[] A, int K) {
        //Arrays to create in order to separate values:
        int lastValue = 0;
        int[] remainingElements = new int[A.length];

        //Array to create for adding those above
        int[] addedArray = new int[A.length];

        //find the last element in the received array
        int lastIndex = A.length - 1;
        lastValue = A[lastIndex];

        System.out.println("The Last Value is : " + lastValue);
        //Append array lastElement with the last value of Array A

        //Append array remainingElements with all values excluding the last
        for(int i = 0; i < A.length -1; i++){
            remainingElements[i] = A[i];
            System.out.println("The remaining element i : " + A[i]);
        }
        //Add previous arrays together to make another array
        addedArray[0] = lastValue;
        System.out.println("Added Element Value: " + addedArray[0] + " At Element : " + 0);
        for(int y = 1; y < A.length; y++){
            addedArray[y] = remainingElements[y-1];
            System.out.println("Adding Element value : " + addedArray[y] + " At Element : " + y );
        }

        //One Successful rotation

    }


}





















//    public static void solution(int[] A, int K){
//        analyzeArray(A);
//
//    }
//
////    public static void setclassArray(){
////
////    }
//
//    public int[] getClassArray(){
//        int[] localArray = this.classArray;
//        System.out.println("The Array : " + localArray);
//        return localArray;
//    }
//
//    public static int analyzeArray(int[] analyze){
//        int counter = 0;
//        System.out.println("The length of the array received is: " + analyze.length);
//        return counter;
//    }
//
////    public static tooString(){
////        analyzeArray()
////        System.out.println();
////    }
//
//}
