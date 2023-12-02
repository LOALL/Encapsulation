public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public void move(int floor) {
        while (currentFloor != floor) {
            if (floor > maxFloor || floor < minFloor) {
                System.out.println("Ошибка ввода");
                break;
            }
            if (currentFloor < floor) {
                moveUp();
                System.out.println("Движение вверх: " + currentFloor);
            } else if (currentFloor > floor) {
                moveDown();
                System.out.println("Движение вниз: " + currentFloor);
            }

        }
    }
    public void moveDown() {
        currentFloor = currentFloor >= minFloor ? currentFloor - 1 : currentFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor <= maxFloor ? currentFloor + 1 : currentFloor;
    }


    public int getCurrentFloor() {
        return currentFloor;
    }
}
