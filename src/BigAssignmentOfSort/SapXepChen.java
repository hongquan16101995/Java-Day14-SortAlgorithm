package BigAssignmentOfSort;

public class SapXepChen {
    public static void main(String[] args) {
        int[] arr = {42, 23, 74, 11, 65, 58, 94, 36, 99, 87};
        for (int i = 0; i < arr.length; i++) {
            int X = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > X; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = X;
            System.out.println("arr after: " + i);
            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h] + "\t");
            }
            System.out.println();
        }
        System.out.println("................");
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + "\t");
        }
    }
}
