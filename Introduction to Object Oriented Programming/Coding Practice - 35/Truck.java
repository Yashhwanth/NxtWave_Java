import java.util.Scanner;

/**
* Truck class should have the following attributes & methods
*
* Old Attributes:
*   color, maxSpeed, acceleration, tyreFriction, isEngineStarted, currentSpeed
* New Attributes:
*   maxCargoWeight, load
*
* Old Methods:
*   startEngine, stopEngine, accelerate, applyBrakes, soundHorn
* 
* Override Methods:
*   soundHorn:
*       - Print "Honk Honk" if truck engine is on
*       - Print "Truck has not started yet" if truck engine is off
*
* New Methods:
*   loadCargo:
*       - This method will have an argument cargoWeight, denoting the weight to be loaded in the truck.
*       - Truck can load some cargo within maxCargoWeight (Provided in the input)
*       - When this method is called when the car engine is off, the current load of the truck
*         should increase according to the cargoWeight passed as an argument to this method.
*       - When this method is called when the car engine is on, print the message  "Cannot load cargo during motion"
*       - When the cargoWeight is more than maxCargoWeight,
*           print the message  "Cannot load cargo more than max limit: {maxCargoWeight}"
*   unloadCargo:
*       - This method will have an argument cargoWeight, denoting the weight to be unloaded from the truck.
*       - Truck can unload amount of cargoWeight passed as an argument, only when the truck engine is off.
*       - If the truck engine is on, print the message "Cannot unload cargo during motion"
*       - Truck load can never go behind 0
*
* When a new Truck is created, the engine should be off by default and currentSpeed, load should be 0
*
* Implement the Car and Truck class appropriately
* Inherit the Car class into Truck class and override the methods which have extra features
*/



class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    int currentSpeed;
    boolean isEngineStarted;
    
    Car(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction) {
        this.color = carColor;
        this.maxSpeed = carMaxSpeed;
        this.acceleration = carAcceleration;
        this.tyreFriction = carTyreFriction;
        this.currentSpeed = 0;
        this.isEngineStarted = false;
    }
    
    void startEngine() {
        isEngineStarted = true;
    }
    
    void stopEngine() {
        isEngineStarted = false;
    }
    
    void accelerate() {
        if(isEngineStarted && currentSpeed + acceleration <= maxSpeed) currentSpeed = currentSpeed + acceleration;
    }
    
    void soundHorn() {
        System.out.println(isEngineStarted ? "Honk Honk" : "Truck has not started yet");
    }
    
    void applyBrakes() {
        if(isEngineStarted && currentSpeed - tyreFriction >= 0) currentSpeed = currentSpeed - tyreFriction;
    }
}

class Truck extends Car{
    int maxCargoWeight;
    int load;
    Truck(String truckColor, int truckMaxSpeed, int truckAcceleration, int truckTyreFriction, int truckMaxCargoWeight) {
        super(truckColor, truckMaxSpeed, truckAcceleration, truckTyreFriction);
        this.maxCargoWeight = truckMaxCargoWeight;
        load = 0;
    }
    
    void loadCargo(int add_load) {
        if(isEngineStarted) System.out.println("Cannot load cargo during motion");
        else{
            if(load + add_load <= maxCargoWeight) load = load + add_load;
            else System.out.println("Cannot load cargo more than max limit: " + maxCargoWeight);
        }
    }
    
    void unloadCargo(int remove_load) {
        if(isEngineStarted) System.out.println("Cannot unload cargo during motion");
        else{
            if(load - remove_load >= 0) load = load - remove_load;
            else load = 0;
        }
    }
    
    void soundHorn() {
        System.out.println(isEngineStarted ? "Honk Honk" : "Truck has not started yet");
    }
}

/**
 * You need not change any code below.
 */

class Base {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Truck truck =  new Truck(input.next(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(truck.isEngineStarted);
        truck.loadCargo(50); // Loading cargoWeight 50 to the truck
        System.out.println(truck.load); // 0 + 50 => 50
        truck.unloadCargo(25); // Unloading cargoWeight 25 from the truck
        System.out.println(truck.load); // 50 - 25 => 25
        truck.unloadCargo(70); // Unloading cargoWeight 70 (more than load in the truck)
        System.out.println(truck.load); // 25 - 75 => 0 as load never be negative
        truck.loadCargo(120); // Prints "Cannot load cargo more than max limit: 100"
        truck.loadCargo(20); // Loading cargoWeight 20 to the truck
        truck.startEngine();
        System.out.println(truck.isEngineStarted); // True
        truck.loadCargo(40); // Prints "Cannot load cargo during motion"
        truck.unloadCargo(10); // Prints "Cannot unload cargo during motion"
        truck.soundHorn(); // Prints "Honk Honk"
        truck.stopEngine();
        truck.soundHorn(); // Prints "Truck has not started yet"
    }
}
