package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypeProduct;
import ua.whitfie.model.AbstractProduct;

import java.util.HashMap;

public class FactoryProduct {

    private static HashMap<String, ProductCountryFactory> factoryHashMap = new HashMap<>();

    static {
        factoryHashMap.put("", new NoNameFactory());
        factoryHashMap.put("sn", new ChinaFactory());
        factoryHashMap.put("mt", new GermanyFactory());
        factoryHashMap.put("sm", new SouthKoreaFactory());
        factoryHashMap.put("ur", new UnitedStatesFactory());
    }

    public static AbstractProduct createProduct(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypeProduct {
        ProductCountryFactory<AbstractProduct> factory = factoryHashMap.get(serialNumber.replaceAll("\\d", "").toLowerCase());
        if (factory == null) {
            throw new NotFoundTypeProduct("serial number: " + serialNumber);
        }
        return factory.create(nameCompany, nameModel, serialNumber);
    }
}
