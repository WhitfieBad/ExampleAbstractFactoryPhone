package ua.whitfie.exeptions;

public class NotFoundTypePhone extends Exception {

    public NotFoundTypePhone() {
    }

    public NotFoundTypePhone(String message) {
        super(message);
    }
}
