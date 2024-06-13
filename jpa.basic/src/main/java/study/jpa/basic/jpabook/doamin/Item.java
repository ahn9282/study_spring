package study.jpa.basic.jpabook.doamin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Item {

    @Id
    @GeneratedValue
    @Column(name="ITEM_ID")
    private Long id;
    private String name;

    private int price;
    private int stockQuantity;
}
