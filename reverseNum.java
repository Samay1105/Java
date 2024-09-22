import java.util.Scanner;

public class reverseNum {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n, j, i;

    int[] arr = new int[5];
    int[] revArr = new int[5];

    System.out.println("Enter array elements:");
    for (i = 0; i < 5; i++)
    {
      System.out.printf("Enter element %d: ", i + 1);
      arr[i] = s.nextInt();
    }

    for (i = (5 - 1), j = 0; 0 <= i; i--, j++)
    {
      revArr[j] = arr[i];
    }

    System.out.printf("\nArray elements after reverse:\n");
    for (i = 0; i < 5; i++)
    {
      System.out.printf("%d\n", revArr[i]);
    }
  }
}