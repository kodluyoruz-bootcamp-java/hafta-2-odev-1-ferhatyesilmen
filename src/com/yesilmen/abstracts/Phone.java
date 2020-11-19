package com.yesilmen.abstracts;

public abstract class Phone {

    private String model;
    private String imeiNumber;
    private String versionNumber;
    private int memory;
    private double screenSize;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }


    public void call(String number) {
        System.out.printf("%s numarası arandı.\n", number);
    }

    public void sendSms(String number, String message) {
        System.out.printf("%s numarasına sms (%s) gönderildi.\n", number, message);
    }

    @Override
    public String toString() {
        return "--------\n" +
                "Phone{" +
                "model='" + model + '\'' +
                ", imeiNumber='" + imeiNumber + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                '}';
    }
}
