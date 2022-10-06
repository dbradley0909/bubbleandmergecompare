import sort.Sort;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.*;



public class App {
    public static void printArray(int[] array){
        for(int a: array){
            System.out.println(a + " ");
        }
        System.out.println();
    }
    public static boolean isSorted(int[] array){
        for(int i = 0; i < array.length-1; i++)
        if(array[i] > array[i+1]){
        return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception { 
    //    printArray(sortedArray);
    // System.out.printf("the array is sorted"+ isSorted(sortedArray));
    //    Sort.bubbleSort(array);
    //    printArray(array);
    int arrayLength = 0;
    System.out.println("Please enter the size of input array:");
    Scanner sc = new Scanner(System.in);
    arrayLength = sc.nextInt();

    do
    {
        long startTime = System.currentTimeMillis();
        int array[] = Sort.createRandomArray(arrayLength);
        System.out.print("\nUnsorted Numbers:  \n" + Arrays.toString(array));
        startTime = System.currentTimeMillis();
        int sortedArray[] = Sort.mergeSort(array);
        double mergeTime = Double.valueOf((double)(System.currentTimeMillis() - startTime) / 1000D);
       
        System.out.print("\nMergeSort Numbers: \n" + Arrays.toString(sortedArray));
        System.out.println((new StringBuilder("The sorted array is in correct order: ")).append(isSorted(sortedArray)).toString());
        startTime = System.currentTimeMillis();
        Sort.bubbleSort(array);
        double bubbleTime = Double.valueOf((double)(System.currentTimeMillis() - startTime) / 1000D);
       
        System.out.print("\nBubbleSort Numbers:\n" + Arrays.toString(array));
        System.out.print("\n");

        System.out.println((new StringBuilder("\nIf sorted:  ")).append(isSorted(sortedArray)).toString());
       
        System.out.println((new StringBuilder("Same order: ")).append(Arrays.equals(sortedArray, array)).toString());
       
        System.out.printf("\nThe time of MergeSort  for size %d is %.6fs\n", new Object[] {
            Integer.valueOf(arrayLength), mergeTime});
        System.out.printf("The time of BubbleSort for size %d is %.6fs\n", new Object[] {
            Integer.valueOf(arrayLength), bubbleTime});
        System.out.println((new StringBuilder("\nBubbleSort is ")).append(String.valueOf(bubbleTime/mergeTime)).append(" times faster than MergeSort."));
       
        System.out.println("\nPlease enter the size of input array, or 0(exit):");
       
        arrayLength = sc.nextInt();
        // String filename;
        //  int[] array;
        // System.out.println("Please enter the filename to save:");
        //     filename = scanner.next();
        //     if (filename == "") {
        //         filename = "integers.txt";
        //         try{
        //                 FileInputStream fiStream = new FileInputStream(filename);
        //                 Scanner fileScan = new Scanner(fiStream);
        //                 while (fileScan.hasNextLine()){
        //                     System.out.printf("\t" + fileScan.hasNextLine());
                            
        //                     fiStream.close();
        //                     fileScan.close();
        //                 }
        //                  } catch (FileNotFoundException e){
        //                     System.out.printf("system error");
                         
        //                 } catch (Exception e) {
        //                  e.printStackTrace();
        //         }
        //     }
        //     writeArrayToFile(array, filename);
        //     bubbleSort(array);
    } while(!(arrayLength==0));
    sc.close();

}
}

