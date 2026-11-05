public class Thermostat {
    private double temperature;
    private double minLimit;
    private double maxLimit;

    public Thermostat(double initialTemp, double minLimit, double maxLimit) {
        if (minLimit >= maxLimit) {
            throw new IllegalArgumentException("Minimum limit must be less than maximum limit.");
        }
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
        setTemperature(initialTemp);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature < minLimit || temperature > maxLimit) {
            throw new IllegalArgumentException(
                    String.format("Temperature %.1f is outside the safe range (%.1f to %.1f).",
                            temperature, minLimit, maxLimit)
            );
        }
        this.temperature = temperature;
    }

    public void increase(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Increase amount must be positive.");
        }
        double newTemp = this.temperature + amount;
        if (newTemp > maxLimit) {
            System.out.println("Warning: Cannot increase beyond maximum limit. Capped at " + maxLimit);
            this.temperature = maxLimit;
        } else {
            this.temperature = newTemp;
        }
    }

    public void decrease(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Decrease amount must be positive.");
        }
        double newTemp = this.temperature - amount;
        if (newTemp < minLimit) {
            System.out.println("Warning: Cannot decrease below minimum limit. Capped at " + minLimit);
            this.temperature = minLimit;
        } else {
            this.temperature = newTemp;
        }
    }

    @Override
    public String toString() {
        return String.format("Thermostat [Current Temp: %.1f°C, Safe Range: %.1f°C - %.1f°C]",
                temperature, minLimit, maxLimit);
    }
}
