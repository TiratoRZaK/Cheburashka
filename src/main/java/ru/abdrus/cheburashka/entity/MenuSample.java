package ru.abdrus.cheburashka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@JmixEntity
@Table(name = "CBR_MENU_SAMPLE")
@Entity(name = "cbr_MenuSample")
public class MenuSample {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.CASCADE)
    @JoinTable(name = "CBR_MENU_SAMPLE_DISH_BREAKFAST_LINK",
            joinColumns = @JoinColumn(name = "MENU_SAMPLE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "DISH_ID", referencedColumnName = "ID"))
    @ManyToMany
    private Set<Dish> breakfast;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.CASCADE)
    @JoinTable(name = "CBR_MENU_SAMPLE_DISH_LUNCH_LINK",
            joinColumns = @JoinColumn(name = "MENU_SAMPLE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "DISH_ID", referencedColumnName = "ID"))
    @ManyToMany
    private Set<Dish> lunch;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.CASCADE)
    @JoinTable(name = "CBR_MENU_SAMPLE_DISH_SNACK_LINK",
            joinColumns = @JoinColumn(name = "MENU_SAMPLE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "DISH_ID", referencedColumnName = "ID"))
    @ManyToMany
    private Set<Dish> snack;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    public Set<Dish> getSnack() {
        return snack;
    }

    public void setSnack(Set<Dish> snack) {
        this.snack = snack;
    }

    public Set<Dish> getLunch() {
        return lunch;
    }

    public void setLunch(Set<Dish> lunch) {
        this.lunch = lunch;
    }

    public Set<Dish> getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Set<Dish> breakfast) {
        this.breakfast = breakfast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}