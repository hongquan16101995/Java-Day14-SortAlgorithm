package BigAssignmentOfSort;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int[] arr = {42, 23, 74, 11, 65, 58, 94, 36, 99, 87};

//sắp xếp cuổi từ cuối lên đầu; tăng dần
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int X;
                    X = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = X;
                }
            }
            System.out.println("arr after " + i);
            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h] + "\t");
            }
            System.out.println();
        }
        System.out.println(".....................");
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + "\t");
        }

//sắp xếp kiểu từ đầu đến cuối mảng; giảm dần
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int X;
//                    X = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = X;
//                }
//            }
//            System.out.println("arr after " + i);
//            for (int h = 0; h < arr.length; h++) {
//                System.out.print(arr[h] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println(".....................");
//        for (int h = 0; h < arr.length; h++) {
//            System.out.print(arr[h] + "\t");
//        }
    }
}
