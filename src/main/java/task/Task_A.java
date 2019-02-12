package task;

public class Task_A {

    public int[] getSameElements(int[] arr1, int[] arr2) {
        int elemCnt = 0;
        boolean containZero = false;
        int[] sameElems = new int[arr1.length];

        for (int elem : arr1) {
            if (contain(arr2, elem) && !contain(sameElems, elem)) {
                sameElems[elemCnt++] = elem;
            }
            if (elem == 0 && !containZero) {
                elemCnt++;
                containZero = true;
            }
        }

        arr1 = sameElems;
        sameElems = new int[elemCnt];

        System.arraycopy(arr1, 0, sameElems, 0, elemCnt);

        return sameElems;
    }

    public int[] getDifferElements(int[] arr1, int[] arr2) {
        int elemCnt = 0;
        boolean containZero = false;
        int[] differElems = new int[arr1.length + arr2.length];

        for (int elem : arr1) {
            if (!contain(arr2, elem) && !contain(differElems, elem)) {
                differElems[elemCnt++] = elem;
            }
            if (elem == 0 && !containZero) {
                containZero = true;
            }
        }

        for (int elem : arr2) {
            if (!contain(arr1, elem) && !contain(differElems, elem)) {
                differElems[elemCnt++] = elem;
            }
            if (elem == 0 && !containZero) {
                elemCnt++;
                containZero = false;
            }
        }

        arr1 = differElems;
        differElems = new int[elemCnt];
        System.arraycopy(arr1, 0, differElems, 0, elemCnt);

        return differElems;
    }

    protected boolean contain(int[] arr, int number) {
        for (int i : arr) {
            if (i == number)
                return true;
        }

        return false;
    }
}