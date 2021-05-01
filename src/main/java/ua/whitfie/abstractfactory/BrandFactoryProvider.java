package ua.whitfie.abstractfactory;

public class BrandFactoryProvider {

    public static ProductBrandFactory getFactoryOfBrandName(String nameBrand) {
        switch (nameBrand.toLowerCase()) {
            case "bmw" : return new BmwFactory();
            case "china" : return new ChinaFactory();
            case "apple" : return new AppleFactory();
            case "samsung" : return new SamsungFactory();
            default: return new NoNameFactory();
        }
    }
}
