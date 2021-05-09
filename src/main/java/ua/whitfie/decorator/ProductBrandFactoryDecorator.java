package ua.whitfie.decorator;

import ua.whitfie.abstractfactory.ProductBrandFactory;
import ua.whitfie.model.AbstractProduct;

public abstract class ProductBrandFactoryDecorator implements ProductBrandFactory {

    protected ProductBrandFactory<AbstractProduct> decorated;

    public ProductBrandFactoryDecorator(ProductBrandFactory decorated) {
        this.decorated = decorated;
    }
}
