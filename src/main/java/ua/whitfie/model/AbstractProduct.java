package ua.whitfie.model;

public abstract class AbstractProduct {

    private String namePhone;
    private String nameModel;
    private String serialNumber;

    public AbstractProduct(String namePhone, String nameModel, String serialNumber) {
        this.namePhone = namePhone;
        this.nameModel = nameModel;
        this.serialNumber = serialNumber;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public String getNameModel() {
        return nameModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return namePhone + " " + nameModel + " " + serialNumber;
    }
}
