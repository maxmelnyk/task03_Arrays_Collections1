package task;

public class Task_B {

    public int[] deleteDoubleElems(int[] arr) {
        int elemCnt = 0;
        boolean containZero = false;
        int[] differElems = new int[arr.length];

        for (int elem : arr) {
            if (!contain(differElems, elem)) {
                differElems[elemCnt++] = elem;
            }
            if (elem == 0 && !containZero) {
                elemCnt++;
                containZero = true;
            }
        }

        arr = new int[elemCnt];
        System.arraycopy(differElems, 0, arr, 0, elemCnt);

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
