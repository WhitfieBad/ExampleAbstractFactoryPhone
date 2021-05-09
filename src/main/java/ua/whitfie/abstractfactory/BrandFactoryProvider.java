package ua.whitfie.abstractfactory;

public class BrandFactoryProvider implements FactoryProvider<ProductBrandFactory> {

    @Override
    public ProductBrandFactory getFactory(String arg) {
        switch (arg.toLowerCase()) {
            case "china":
                return new ChinaFactory();
            case "apple":
                return new AppleFactory();
            case "samsung":
                return new SamsungFactory();
        }
        return new NoNameFactory();
    }
}
