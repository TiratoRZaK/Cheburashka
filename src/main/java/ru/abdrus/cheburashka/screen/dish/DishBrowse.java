package ru.abdrus.cheburashka.screen.dish;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.Dish;

@UiController("cbr_Dish.browse")
@UiDescriptor("dish-browse.xml")
@LookupComponent("dishesTable")
public class DishBrowse extends StandardLookup<Dish> {
}