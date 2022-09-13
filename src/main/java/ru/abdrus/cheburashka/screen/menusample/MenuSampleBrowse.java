package ru.abdrus.cheburashka.screen.menusample;

import java.util.Set;
import java.util.stream.Collectors;

import io.jmix.ui.component.Component;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.Dish;
import ru.abdrus.cheburashka.entity.MenuSample;

@UiController("cbr_MenuSample.browse")
@UiDescriptor("menu-sample-browse.xml")
@LookupComponent("menuSamplesTable")
public class MenuSampleBrowse extends StandardLookup<MenuSample> {
    @Install(to = "menuSamplesTable.breakfast", subject = "columnGenerator")
    private Component menuSamplesTableBreakfastColumnGenerator(MenuSample menuSample) {
        return getDishCompositionCell(menuSample.getBreakfast());
    }

    @Install(to = "menuSamplesTable.lunch", subject = "columnGenerator")
    private Component menuSamplesTableLunchColumnGenerator(MenuSample menuSample) {
        return getDishCompositionCell(menuSample.getLunch());
    }

    @Install(to = "menuSamplesTable.snack", subject = "columnGenerator")
    private Component menuSamplesTableSnackColumnGenerator(MenuSample menuSample) {
        return getDishCompositionCell(menuSample.getSnack());
    }

    private Table.PlainTextCell getDishCompositionCell(Set<Dish> menuSample) {
        String breakfastDishes = menuSample.stream()
                .map(Dish::getName)
                .collect(Collectors.joining(", "));
        return new Table.PlainTextCell(breakfastDishes);
    }
}