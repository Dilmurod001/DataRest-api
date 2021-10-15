package uz.pdp.task1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.task1.entity.template.AbsNameEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Category extends AbsNameEntity {

    @ManyToOne
    private Category parentCategory;

}
