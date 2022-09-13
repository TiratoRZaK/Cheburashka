package ru.abdrus.cheburashka.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity(name = "cbr_FoodDetails")
@Embeddable
public class FoodDetails {
    @Column(name = "PROTEINS")
    private Integer proteins;

    @Column(name = "FATS")
    private Integer fats;

    @Column(name = "CARBOHYDRATES")
    private Integer carbohydrates;

    @Column(name = "VITAMIN_C")
    private Integer vitaminC;

    public Integer getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(Integer vitaminC) {
        this.vitaminC = vitaminC;
    }

    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Integer getFats() {
        return fats;
    }

    public void setFats(Integer fats) {
        this.fats = fats;
    }

    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        this.proteins = proteins;
    }
}