package ru.abdrus.cheburashka.screen.measurementunit;

import io.jmix.ui.screen.*;
import ru.abdrus.cheburashka.entity.MeasurementUnit;

@UiController("cbr_MeasurementUnit.browse")
@UiDescriptor("measurement-unit-browse.xml")
@LookupComponent("measurementUnitsTable")
public class MeasurementUnitBrowse extends StandardLookup<MeasurementUnit> {
}