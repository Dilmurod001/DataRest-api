package uz.pdp.task1.entity;

import lombok.EqualsAndHashCode;
import uz.pdp.task1.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Currency extends AbsNameEntity {

}
