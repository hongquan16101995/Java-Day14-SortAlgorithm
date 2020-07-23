package BigAssignmentOfSort;

public class Sort {
    public static void Choice(int arr[]){
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
            System.out.println("Array after sort " + i);
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }
        System.out.println("Array after finished: ");
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + "\t");
        }
    }

    public static void Insert(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int X = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > X; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = X;
            System.out.println("Array after sort " + i);
            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h] + "\t");
            }
            System.out.println();
        }
        System.out.println("Array after finished: ");
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + "\t");
        }
    }

    public static void Bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int X;
                    X = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = X;
                }
            }
            System.out.println("Array after sort " + i);
            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h] + "\t");
            }
            System.out.println();
        }
        System.out.println("Array after finished: ");
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + "\t");
        }
    }
}
