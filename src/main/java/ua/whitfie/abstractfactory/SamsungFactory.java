package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.SamsungProduct;

public class SamsungFactory implements ProductBrandFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameModel, String serialNumber) {
        return new SamsungProduct(nameModel, serialNumber);
    }
}
