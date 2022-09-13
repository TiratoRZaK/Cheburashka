package ru.abdrus.cheburashka.screen.menusample;

import io.jmix.core.Messages;
import io.jmix.ui.component.ValidationErrors;
import io.jmix.ui.model.CollectionPropertyContainer;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;
import ru.abdrus.cheburashka.entity.Dish;
import ru.abdrus.cheburashka.entity.MenuSample;

@UiController("cbr_MenuSample.edit")
@UiDescriptor("menu-sample-edit.xml")
@EditedEntityContainer("menuSampleDc")
public class MenuSampleEdit extends StandardEditor<MenuSample> {
    @Autowired
    private CollectionPropertyContainer<Dish> breakfastDc;
    @Autowired
    private CollectionPropertyContainer<Dish> lunchDc;
    @Autowired
    private CollectionPropertyContainer<Dish> snackDc;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onValidation(ValidationEvent event) {
        if (breakfastDc.getItems().isEmpty() || lunchDc.getItems().isEmpty() || snackDc.getItems().isEmpty()) {
            String errorMessage = messages.getMessage(
                    "ru.abdrus.cheburashka.entity/MenuSample.breakfast.validation.Size");
            event.addErrors(ValidationErrors.of(errorMessage));
        }
    }
}