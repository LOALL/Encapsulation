import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Задание №2
       Dimensions dimensions = new Dimensions(4,5,6);


        Information information = new Information(dimensions, 3.32, "Нагорный проезд, 12к2с2",
                true,"134mcvqogn43423mm2p23mc23",false);
        System.out.println(information);
        System.out.println();

        Information copy = new Information(
                information.getDimensions(),
                information.getWeight(),
                information.getAddress(),
                information.getFlip(),
                information.getRegistratioNumber(),
                information.getFragile()
        );
        System.out.println(copy);

        //Задание №1
        Elevator elevator = new Elevator(-3,26);
        while(true) {
            System.out.println("Ведите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }

    }
}
