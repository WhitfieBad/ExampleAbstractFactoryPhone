package ua.whitfie.abstractfactory;

public interface ProductBrandFactory<T> {
    T create(String nameModel, String serialNumber);
}
