package ua.whitfie.abstractfactory;

public class BrandFactoryProvider {

    public static ProductBrandFactory getFactoryOfBrandName(String nameBrand) {
        switch (nameBrand.toLowerCase()) {
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
