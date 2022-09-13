package ru.abdrus.cheburashka.screen.productitem;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.ProductItem;

@UiController("cbr_ProductItem.edit")
@UiDescriptor("product-item-edit.xml")
@EditedEntityContainer("productItemDc")
public class ProductItemEdit extends StandardEditor<ProductItem> {
}