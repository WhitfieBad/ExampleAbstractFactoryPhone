package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.AppleProduct;

public class AppleFactory implements ProductBrandFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameModel) {
        return new AppleProduct(nameModel);
    }
}
