package ua.whitfie.model;

public abstract class AbstractPhone {

    private String namePhone;
    private String nameModel;
    private String serialNumber;

    public AbstractPhone(String namePhone, String nameModel, String serialNumber) {
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
        String namePhone = this.namePhone.isEmpty() ? "NoName" : this.namePhone;
        String nameModel = this.nameModel.isEmpty() ? "NoNameModel" : this.nameModel;
        String serialNumber = this.serialNumber.isEmpty() ? "NoSerialnumber" : this.serialNumber;
        return namePhone + " " + nameModel + " " + serialNumber;
    }
}
