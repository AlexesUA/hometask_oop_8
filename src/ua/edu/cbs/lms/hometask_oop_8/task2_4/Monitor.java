package ua.edu.cbs.lms.hometask_oop_8.task2_4;

import java.util.Objects;

public class Monitor extends Device{

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, String serialNumber, int resolutionX, int resolutionY, float price){
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }


    @Override
    public String toString() {
        return super.toString() + ",\n resolutionX= " + resolutionX +", resolutionY= " + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }
}
