package ru.abdrus.cheburashka.screen.product;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.Product;

@UiController("cbr_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
public class ProductEdit extends StandardEditor<Product> {
}