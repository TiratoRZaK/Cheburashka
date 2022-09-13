package ru.abdrus.cheburashka.screen.producttype;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.ProductType;

@UiController("cbr_ProductType.edit")
@UiDescriptor("product-type-edit.xml")
@EditedEntityContainer("productTypeDc")
public class ProductTypeEdit extends StandardEditor<ProductType> {
}