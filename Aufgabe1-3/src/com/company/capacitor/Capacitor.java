package company.capacitor;


import company.controller.CapacitorConsumerController;

public class Capacitor {

    private int capacity;
    private int max;
    private CapacitorConsumerController capacitorConsumerController;

    public Capacitor(int capacity, int max, int menge, CapacitorConsumerController capacitorConsumerController){
        this.capacity = capacity;
        this.max = max;
        this.capacitorConsumerController = capacitorConsumerController;
    }

    private int state(){
        return this.capacity;
    }

    private void save(int menge){
        if(this.capacity == this.max){

            //protokoll ueberschuss
            /*der speicher ist voll und kann nichts mehr einnehmen*/

        }
        else if((this.capacity + menge) > this.max) {
            this.capacity = this.max;
            //teil ist ueberflussig
            /*der speicher ist voll und kann nichts mehr einnehmen*/

        } else {
            this.capacity += this.capacity + menge;
        }
    }

    public void drain(float watts){
        if(this.capacity < watts){
            //wird teil hier genommen oder in generell nur fehlermeldung?
            // TODO this.capacitorConsumerController.setCurrentCapacitor(String name);
        }
        else{
            this.capacity -= watts;

        }
    }

    public int getCapacity() {
        return capacity;
    }
}
