package by.khilko.bean;

public class Car {
    private String model;
    private String colorModel;
    private int year;

    public Car() {
    }

    public Car(String model, String colorModel, int year) {
        this.model = model;
        this.colorModel = colorModel;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColorModel() {
        return colorModel;
    }

    public void setColorModel(String colorModel) {
        this.colorModel = colorModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colorModel='" + colorModel + '\'' +
                ", year=" + year +
                '}';
    }
}
