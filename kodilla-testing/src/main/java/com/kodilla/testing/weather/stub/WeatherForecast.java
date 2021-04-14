package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0;
        double size = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
            size++;
        }

        if (size == 0) {
            return 0;
        }
        else {
            return sum / size;
        }
    }

    public Map<String, Double> median() {
        Map<String, Double> medianMap = new HashMap<>();
        Map<String, Double> resultMedianMap = new HashMap<>();
        double storedValue = 0;
        String storedKey = "";

        for (int i = 0; i < temperatures.getTemperatures().size(); i++) {
            for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
                if (i == 0) {
                    storedValue = temperature.getValue();
                    storedKey = temperature.getKey();
                } else {
                    if (storedValue > temperature.getValue()) {
                        storedValue = temperature.getValue();
                        storedKey = temperature.getKey();
                    }
                }
            }
            medianMap.put(storedKey, storedValue);
            temperatures.getTemperatures().remove(storedKey);
        }

        if ((temperatures.getTemperatures().size() % 2) == 0){

            int j = 1;
            for(Map.Entry<String, Double>temperature : resultMedianMap.entrySet()) {
                if (j == (medianMap.size() / 2)) {
                    resultMedianMap.put(temperature.getKey(), temperature.getValue());
                }
                else if (j == ((medianMap.size() / 2) + 1)) {
                    resultMedianMap.put(temperature.getKey(), temperature.getValue());
                }
                j++;
            }
        }
        return resultMedianMap;
    }
}