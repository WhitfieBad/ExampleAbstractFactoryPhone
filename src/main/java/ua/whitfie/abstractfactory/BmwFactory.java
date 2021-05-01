package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.BmwProduct;

public class BmwFactory implements ProductBrandFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameModel, String serialNumber) {
        return new BmwProduct(nameModel, serialNumber);
    }
}
