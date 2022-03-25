package common.test.tool.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Shop {

    private String name;
    private List<Item> itemList;
}
