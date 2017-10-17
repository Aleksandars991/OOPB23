package company.consumer;

/**
 * Created by genchew on 16.10.17.
 */
public abstract class WaterConsumer extends Consumer {

    private String unit;

    public WaterConsumer(String unit, float consumption) {
        super(unit, consumption);
        this.unit = "liter";
    }

    public String getUnit() {
        return unit;
    }
}
