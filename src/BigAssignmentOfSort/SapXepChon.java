package BigAssignmentOfSort;

public class SapXepChon {
    public static void main(String[] args) {
        int[] arr = {42, 23, 74, 11, 65, 58, 94, 36, 99, 87};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int indexmin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexmin = j;
                }
            }
            if (indexmin != i) {
                arr[indexmin] = arr[i];
                arr[i] = min;
            }
            System.out.println("arr after " + i);
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }
        System.out.println("..................");
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + "\t");
        }
    }
}
