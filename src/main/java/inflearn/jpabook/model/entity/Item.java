package inflearn.jpabook.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name; // 이름
    private int price; // 가격
    private int stockQuantity; // 재고 수량

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<Category>();
}
