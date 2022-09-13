package ru.abdrus.cheburashka.screen.dish;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.Dish;

@UiController("cbr_Dish.edit")
@UiDescriptor("dish-edit.xml")
@EditedEntityContainer("dishDc")
public class DishEdit extends StandardEditor<Dish> {
}