package zheleznyak;

public class Array {
    private int[] arr = {};
    void sortViborom() {
        System.out.println("Масив перед сортуваннням");
        for (int c : arr) {
            System.out.println(c);
        }
        System.out.println("Масив після сортування");
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.println(arr[i]);
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
