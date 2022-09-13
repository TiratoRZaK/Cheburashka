package ru.abdrus.cheburashka.screen.measurementunit;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.MeasurementUnit;

@UiController("cbr_MeasurementUnit.edit")
@UiDescriptor("measurement-unit-edit.xml")
@EditedEntityContainer("measurementUnitDc")
public class MeasurementUnitEdit extends StandardEditor<MeasurementUnit> {
}