package task;

public class Task_C {

    public int[] deleteSeriesOfSameElem(int[] arr) {
        int elemCnt = 0;
        int[] notSerialElem = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1) && arr[i] == arr[i + 1]) {
                boolean isSameSerias = false;

                if(contain(notSerialElem, arr[i])){
                    isSameSerias = true;
                }

                for(int j = i; j < arr.length; j++){
                    if(arr[j] != arr[i]){
                        i = j - 1;
                        break;
                    }
                }

                if (isSameSerias) {
                    continue;
                }
            }
            notSerialElem[elemCnt++] = arr[i];
        }

        arr = new int[elemCnt];
        System.arraycopy(notSerialElem, 0, arr, 0, elemCnt);

        return arr;
    }

    protected boolean contain(int[] arr, int number) {
        for (int i : arr) {
            if (i == number)
                return true;
        }

        return false;
    }
}