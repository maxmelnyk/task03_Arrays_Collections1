import task.Task_A;
import task.Task_B;
import task.Task_C;
import task.Task_D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 7, 7, 12, 0, 6, 6, 6, 25, 6, 6, 6, 3};
        int arr2[] = {0, 2, 9, 7, 13, 25, 6, 77};
        Task_A task1 = new Task_A();
        System.out.println("Task A(a): " + Arrays.toString(task1.getSameElements(arr1, arr2)));
        System.out.println("Task A(b): " + Arrays.toString(task1.getDifferElements(arr1, arr2)));

        Task_B task2 = new Task_B();
        System.out.println("Task B: " + Arrays.toString(task2.deleteDoubleElems(arr1)));

        Task_C task3 = new Task_C();
        System.out.println("Task C: " + Arrays.toString(task3.deleteSeriesOfSameElem(arr1)));

        Task_D task4 = new Task_D();
        task4.setDoorSurprise();
        task4.printDoorInfo();
        System.out.println("\nCount of door, where hero will die: " + task4.heroDiesCnt(0, 0));
        task4.wayToStayLive();
    }
}