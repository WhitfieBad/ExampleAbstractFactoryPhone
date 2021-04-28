package ua.whitfie.exeptions;

public class NotFoundTypeProduct extends Exception {

    public NotFoundTypeProduct() {
    }

    public NotFoundTypeProduct(String message) {
        super(message);
    }
}
