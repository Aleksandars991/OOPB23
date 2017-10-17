package company.consumer;

/**
 * Created by genchew on 16.10.17.
 */
public abstract class ElectricConsumer extends Consumer {

    private String unit;

    public ElectricConsumer(String unit, float consumption) {
        super(unit, consumption);
        this.unit = "watt";
    }

    public String getUnit() {
        return unit;
    }
}
