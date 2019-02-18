package task;

import java.util.Arrays;
import java.util.Random;

public class Task_D {
    private final int doorCnt = 10;
    private static int heroPower = 25;
    private int[] doorSurprise = new int[doorCnt];

    public Task_D() {
        System.out.println("The game were hero must choose correct truth door in order to stay live");
    }

    public void setDoorSurprise() {

        Random r = new Random();

        //set arr with 0 or 1 (0 - magic artifact, 1 - monster)
        for (int door = 0; door < doorCnt; door++) {
            this.doorSurprise[door] = r.nextInt(2);
        }

        int maxBonusPower = 80;
        int minBonusPower = 10;
        int differBonusPower = maxBonusPower - minBonusPower;
        int maxMonsterPower = 100;
        int minMonsterPower = 5;
        int differMonsterPower = maxMonsterPower - minMonsterPower;

        for (int door = 0; door < doorCnt; door++) {
            if (this.doorSurprise[door] == 0) {
                this.doorSurprise[door] = r.nextInt(differBonusPower + 1);
                this.doorSurprise[door] += minBonusPower;
            } else {
                this.doorSurprise[door] = r.nextInt(differMonsterPower);
                this.doorSurprise[door] = (this.doorSurprise[door] + minMonsterPower) * (-1);
            }
        }
//        this.doorSurprise = doorSurprise;
    }

    public void printDoorInfo() {
        String bonusPower;
        String monsterPower;

        System.out.println("\tDoor\tBonusPower\tMonsterPower");

        for (int door = 0; door < doorCnt; door++) {
            if (this.doorSurprise[door] < 0) {
                bonusPower = " - ";
                monsterPower = (this.doorSurprise[door] * (-1)) + "";
            } else {
                bonusPower = this.doorSurprise[door] + "";
                monsterPower = " - ";
            }

            System.out.println("\t" + (door + 1) + "\t\t\t" + bonusPower + "\t\t\t" + monsterPower);
        }
    }

    public int heroDiesCnt(int doorNum, int diesCnt) {
        if(doorNum == doorCnt)
            return diesCnt;

        if (doorSurprise[doorNum] * (-1) > heroPower) {
            diesCnt++;
        }

        return heroDiesCnt(doorNum += 1, diesCnt);
    }

    public void wayToStayLive() {
        int[] sequenceOfDoor = new int[doorCnt];
        int maxMonsterPower = 0;

        for (int door = 0, firstDoor = 0, lastDoor = doorCnt - 1; door < doorCnt; door++) {
            if (doorSurprise[door] > 0) {
                sequenceOfDoor[firstDoor++] = door + 1;
                heroPower += doorSurprise[door];
            } else if (doorSurprise[door] < 0) {
                sequenceOfDoor[lastDoor--] = door + 1;
                if (maxMonsterPower < doorSurprise[door] * (-1)) {
                    maxMonsterPower = doorSurprise[door] * (-1);
                }
            }
        }

        System.out.println("\nHero will have max power '" + heroPower + "' and the monster - '" + maxMonsterPower + "'");
        if (heroPower > maxMonsterPower) {

            System.out.println("Way to win: " + Arrays.toString(sequenceOfDoor));
        } else {
            System.out.println("The hero will die in any variant :_( Sorry!!...x_X");
        }
    }
}