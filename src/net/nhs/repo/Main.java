package net.nhs.repo;

public class Main {

    public static final int FLOORS = 5;
    private static final String LIFT = "0";
    private static final String SHAFT = "|";

    public static void main(String[] args) throws InterruptedException {

        for (int floorIndex = 0; floorIndex < FLOORS; floorIndex++) {
            printWorld(floorIndex);
            Thread.sleep(1000);
        }
    }

    private static void printWorld(int floorIndex) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Our world:");
        for (int i = FLOORS - 1; i >= 0; i--) {
            System.out.println(i == floorIndex ? LIFT : SHAFT);
        }
    }
}
