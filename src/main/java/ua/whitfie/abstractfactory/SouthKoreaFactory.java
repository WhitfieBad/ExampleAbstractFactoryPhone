package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypeProduct;
import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.SamsungProduct;

public class SouthKoreaFactory implements ProductCountryFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypeProduct {
        switch (nameCompany.toLowerCase()) {
            case "samsung" : return new SamsungProduct(nameModel, serialNumber);
        }
        throw new NotFoundTypeProduct();
    }
}
