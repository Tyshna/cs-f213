package week7;

import java.util.*;

public class DuplicateElements
{
    public static List<String> findDuplicates(int[] arr)
    {
        List<String> duplicates = new ArrayList<>();
        int maxVal = Arrays.stream(arr).max().getAsInt();
        int[] counts = new int[maxVal + 1];
        for (int i = 0; i < arr.length; i++) counts[arr[i]]++;

        for (int i = 0; i < counts.length; i++) 
        {
            if (counts[i] >= 2)
                duplicates.add(i + ": " + counts[i]);
        }//for
        return duplicates;
    }//findDuplicates

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
        	numbers[i] = sc.nextInt();
        }//for
        
        List<String> duplicateElements = findDuplicates(numbers);
        if (duplicateElements.isEmpty())
            System.out.println("No duplicate elements found.");
        else 
        {
            System.out.println("Duplicate elements and their counts:");
            for (String element : duplicateElements) System.out.println(element);
        }//else
        sc.close();
    }//main
}//class