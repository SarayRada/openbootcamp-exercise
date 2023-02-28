public class Car {
    private int doors = 0;

    public void addDoors(int number) {
        doors = doors + number;
    }

    public void seeDoors(){
        System.out.println(doors);
    }

}