package business;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Herschbach.Stefan on 28.11.2016.
 */
@ApplicationScoped
public class DHTService {

    private double temperatureValue;
    private double humidityValue;

    public double getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    public double getHumidityValue() {
        return humidityValue;
    }

    public void setHumidityValue(double humidityValue) {
        this.humidityValue = humidityValue;
    }
}
