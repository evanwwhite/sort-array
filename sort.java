import java.util.Arrays;

class ArraySorter {
    public static void main(String[] args) {
        int[] integers = new int[]{73, 56, 55, 74, 7, 62, 36, 99, 88, 48};
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
    }
}
