public class Bycycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void setSpeed(int increaseSpeed){
        speed += increaseSpeed;
    }

    void applyBreaks (int decreaseSpeed){
        speed = speed - decreaseSpeed;
    }

    void printStates(){
        System.out.println("Cadence: "+cadence+" Speed: "+speed+" Gear: "+gear);
    }

}
