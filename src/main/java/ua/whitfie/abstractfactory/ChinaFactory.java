package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.ChinaProduct;

public class ChinaFactory implements ProductBrandFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameModel, String serialNumber) {
        return new ChinaProduct(nameModel, serialNumber);
    }
}
