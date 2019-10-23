public class Vehicle {

    private String model;
    private String type;
    private int tankSize;
    private double time;

    public Vehicle(String model, String type, int tankSize, double time) {
        this.model = model;
        this.type = type;
        this.tankSize = tankSize;
        this.time = time;
    }

    public double MPG() {
        return (60 * this.time) / (this.tankSize / 3.785);
    }

    public boolean govtStandards() {
        if (this.type.equals("Sedan") && MPG() >= 50.0) {
            return true;
        }
        else if (this.type.equals("SUV") && MPG() >= 40.0) {
            return true;
        }
        else if (this.type.equals("Truck") && MPG() >= 30.0) {
            return true;
        }
        else {
            return false;
        }
    }

    public String govtStatement() {
        if (govtStandards()) {
            return "Meets government standards";
        }
        else {
            return "Does not meet government standards";
        }
    }
}