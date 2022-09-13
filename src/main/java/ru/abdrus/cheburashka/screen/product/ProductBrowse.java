package ru.abdrus.cheburashka.screen.product;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.Product;

@UiController("cbr_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
public class ProductBrowse extends StandardLookup<Product> {
}