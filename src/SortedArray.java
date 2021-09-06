import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Enter " + number + " integer this \r");
        for(int i = 0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0;i < array.length;i++) {
            System.out.println("Element "+ i + " contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortArrays = new int[array.length];
        for(int i = 0;i<array.length;i++) {
            sortArrays[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0 ;i< sortArrays.length-1;i++) {
                if(sortArrays[i] < sortArrays[i + 1]) {
                    temp = sortArrays[i];
                    sortArrays[i] = sortArrays[i + 1];
                    sortArrays[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortArrays;

//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j = i - 1;
//            while(j >= 0 && current > array[j]) {
//                array[j+1] = array[j];
//                j--;
//            }
//            array[j+1] = current;
//        }
//
//        return array;

    }
}
