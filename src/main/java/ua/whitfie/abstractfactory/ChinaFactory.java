package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypeProduct;
import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.ChinaProduct;

public class ChinaFactory implements ProductCountryFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypeProduct {
        switch (nameCompany.toLowerCase()) {
            case "china" : return new ChinaProduct(nameModel, serialNumber);
        }
        throw new NotFoundTypeProduct();
    }
}
