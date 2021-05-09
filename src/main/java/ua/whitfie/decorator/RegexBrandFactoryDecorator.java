package ua.whitfie.decorator;

import ua.whitfie.abstractfactory.ProductBrandFactory;
import ua.whitfie.model.AbstractProduct;

public class RegexBrandFactoryDecorator extends ProductBrandFactoryDecorator {

    private String regex;

    public RegexBrandFactoryDecorator(ProductBrandFactory decorated, String regex) {
        super(decorated);
        this.regex = regex;
    }

    @Override
    public AbstractProduct create(String str) {
        String[] argumets = str.split(regex, 3);
        AbstractProduct  product = decorated.create(argumets[1]);
        product.setSerialNumber(argumets[2]);
        return product;
    }
}
