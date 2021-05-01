package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.NoNameProduct;

public class NoNameFactory implements ProductBrandFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameModel, String serialNumber) {
        return new NoNameProduct(nameModel, serialNumber);
    }
}
