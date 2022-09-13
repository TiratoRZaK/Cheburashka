package ru.abdrus.cheburashka.screen.producttype;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.ProductType;

@UiController("cbr_ProductType.browse")
@UiDescriptor("product-type-browse.xml")
@LookupComponent("productTypesTable")
public class ProductTypeBrowse extends StandardLookup<ProductType> {
}