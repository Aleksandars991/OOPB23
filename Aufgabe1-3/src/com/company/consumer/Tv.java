package company.consumer;

import company.controller.CapacitorConsumerController;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by genchew on 16.10.17.
 */
public class Tv extends ElectricConsumer {

    private String unit;
    private float consumption;
    private float max_consumption;
    private CapacitorConsumerController capacitorConsumerController;

    public Tv(String unit, float consumption, CapacitorConsumerController capacitorConsumerController) {
        super(unit, consumption);
        this.unit = unit;
        this.consumption = 100;
        this.max_consumption = this.consumption;
        this.capacitorConsumerController = capacitorConsumerController;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    public float getConsumption() {
        return consumption;
    }

    public void changeConsumption() {
        int capacity = this.capacitorConsumerController.getCurrentCapacitor().getCapacity();

        if (capacity >= (70 / max_consumption) * capacity) {
            this.consumption = 100;
        } else if ((capacity < (70 / 100) * max_consumption) && (capacity > (30 / max_consumption) * capacity)) {
            this.consumption = 70;
        } else {
            this.consumption = 30;
        }
    }

    public void drain(float watts, int durationMillis) {
        long start = System.currentTimeMillis();
        long end = start + durationMillis;

        while(start < end) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    capacitorConsumerController.getCurrentCapacitor().drain(consumption);
                    changeConsumption();
                }
            }, 0, 3000);
        }
    }
}
