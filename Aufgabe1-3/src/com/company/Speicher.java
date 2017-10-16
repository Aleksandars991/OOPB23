package com.company;



public class Speicher {

    private int kapazitaet;
    private int max;

    public Speicher(int kapazitaet, int max, int menge ){

        this.kapazitaet=kapazitaet;
        this.max=max;
    }

    private int zustand(){
        return this.kapazitaet;
    }

    private void speichern( int menge ){
        if(this.kapazitaet==this.max){

            //protokoll ueberschuss
            /*der speicher ist voll und kann nichts mehr einnehmen*/

        }
        else if((this.kapazitaet+menge)>this.max) {
            this.kapazitaet=this.max;
            //teil ist ueberflussig
            /*der speicher ist voll und kann nichts mehr einnehmen*/

        } else {
            this.kapazitaet+=this.kapazitaet+menge;
        }
    }

    private void zapfen(int quantity){
        if(this.kapazitaet<quantity){
            //wird teil hier genommen oder in generell nur fehlermeldung?

        }
        else{
            this.kapazitaet-=quantity;

        }
    }

}
