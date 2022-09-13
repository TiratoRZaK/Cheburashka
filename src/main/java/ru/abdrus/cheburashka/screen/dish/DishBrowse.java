package ru.abdrus.cheburashka.screen.dish;

import java.util.stream.Collectors;

import io.jmix.ui.component.Component;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.Dish;
import ru.abdrus.cheburashka.entity.Product;
import ru.abdrus.cheburashka.entity.ProductItem;

@UiController("cbr_Dish.browse")
@UiDescriptor("dish-browse.xml")
@LookupComponent("dishesTable")
public class DishBrowse extends StandardLookup<Dish> {
    @Install(to = "dishesTable.productList", subject = "columnGenerator")
    private Component dishesTableProductListColumnGenerator(Dish dish) {
        String productList = dish.getProductItems().stream()
                .map(productItem ->
                        productItem.getProduct().getName() + " - " + productItem.getNorm().toString())
                .collect(Collectors.joining(", "));
        return new Table.PlainTextCell(productList);
    }
}