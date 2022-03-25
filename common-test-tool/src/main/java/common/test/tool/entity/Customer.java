package common.test.tool.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Customer {

    private String name;
    private Integer age;
    private Integer budget;
    private List<Item> wantToBuy;
}
