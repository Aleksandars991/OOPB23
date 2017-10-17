package company.source;

/**
 * Created by Aleksandar-Sasa on 16.10.2017.
 */

/**
 * A simple class which acts as a source, to produce things.
 */
public class Source {

    private int maximum;
    private int produced;

    /**
     * Constructor for the class Source
     * @param _maximum, the maximum of the things to be produced.
     * @param _produced, must not be > _maximum, the number of produced things.
     */
    public Source (int _maximum, int _produced) throws Exception {
        this.maximum = _maximum;
        if (_produced > this.maximum) {
            throw new Exception("The parameter _produced is greater than the allowed maximum.");
        } else {
            this.produced = _produced;
        }
    }

    /**
     * A method which produces things based on the inputed time of the day.
     * In the evening, nothing is produced. In the other 3 parts of the day,
     * the production will be evenly divided, 33% in each time of the day.
     * If there is nothing produced, and it is already evening, it will produce
     * 100% of the maximum allowed.
     * @param _dayTime, must not be null, must be a valid String.
     */
    public void produce(String _dayTime) throws Exception {
        int percentage = (33 / maximum) * 100;
        if (_dayTime != null) {
            if (_dayTime.equals("night")) {
                this.produced += 0;
            } else if (this.produced == 0 && _dayTime.equals("morning")) {
                this.produced += percentage;
            } else if (this.produced <= (33 / maximum) * 100 && _dayTime.equals("afternoon")) {
                this.produced += percentage;
            } else if (this.produced <= ((33 / maximum) * 100) * 2 && _dayTime.equals("evening")) {
                this.produced += percentage;
            } else if (this.produced == 0 && _dayTime.equals("evening")) {
                this.produced += this.maximum;
            }
        } else {
            throw new Exception("The _dayTime parameter is null.");
        }
    }
}
