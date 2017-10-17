package company.consumer;

/**
 * Created by genchew on 16.10.17.
 */
public class Ventilation extends ElectricConsumer {

//    TODO

    private String unit;
    private float consumption;

    public Ventilation(String unit, float consumption) {
        super(unit, consumption);
        this.unit = unit;
        this.consumption = consumption;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    public float getConsumption() {
        return consumption;
    }
}
