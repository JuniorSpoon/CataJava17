package common.test.tool.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Item {

    private String name;
    private Integer price;
}
