package uz.pdp.task1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.task1.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class OutputProduct extends AbsEntity {

    @OneToOne
    private Product product;
    private double amount;
    private double price;
    @ManyToOne
    private Output output;
}
