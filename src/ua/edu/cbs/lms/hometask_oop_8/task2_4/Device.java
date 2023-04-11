package ua.edu.cbs.lms.hometask_oop_8.task2_4;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private String serialNumber;
    private float price;

    private Device(){}

    public Device(String manufacturer, String serialNumber, float price){
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }
    public String toString() {
        return "Device: manufacturer = " + manufacturer + ", serialNumber = " + serialNumber +
                ", price= " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device device)) return false;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufacturer, device.manufacturer)
                && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price);
    }

}
