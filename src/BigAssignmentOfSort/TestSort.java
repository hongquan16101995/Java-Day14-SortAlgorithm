package BigAssignmentOfSort;

public class TestSort {
    public static void main(String[] args) {
        int[] array = {42, 23, 74, 11, 65, 58, 94, 36, 99, 87};
        System.out.println("Array sort by Insert: ");
        Sort.Insert(array);
        System.out.println();
        System.out.println();
        System.out.println("Array sort by Bubble: ");
        Sort.Bubble(array);
        System.out.println();
        System.out.println();
        System.out.println("Array sort by Choice: ");
        Sort.Choice(array);
    }
}
