package solutionpack;

//testing git reset hard

//testing git reset 2
public class Main {

    public static void main(String[] args) {
    int[] mainClassTestArray = new int[4];
    for (int i = 0; i < 4; i++){
        mainClassTestArray[i] = i;
        System.out.println("The Main class test array values: " + mainClassTestArray[i]);

    }
    System.out.println("The mainClassTestArray : " + mainClassTestArray.toString());
    Solution.solution(mainClassTestArray, 2);
    }
}
