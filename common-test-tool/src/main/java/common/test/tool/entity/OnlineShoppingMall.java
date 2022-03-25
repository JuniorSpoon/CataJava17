package common.test.tool.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingMall {

    @Getter
    @Setter
    private List<Shop> shopList;
    @Getter
    @Setter
    private List<Customer> customerList;

    public OnlineShoppingMall() {
        shopList = new ArrayList<Shop>() {{
            add(Shop.builder().name("White Furniture").itemList(new ArrayList<Item>() {{
                add(Item.builder().name("chair").price(2000).build());
                add(Item.builder().name("table").price(5500).build());
                add(Item.builder().name("small chair").price(1800).build());
                add(Item.builder().name("small table").price(2800).build());
            }}).build());

            add(Shop.builder().name("Dish Devices").itemList(new ArrayList<Item>() {{
                add(Item.builder().name("cup").price(380).build());
                add(Item.builder().name("plate").price(680).build());
                add(Item.builder().name("fork").price(210).build());
                add(Item.builder().name("spoon").price(210).build());
                add(Item.builder().name("chopsticks").price(180).build());
            }}).build());

            add(Shop.builder().name("The Do It Ourselves").itemList(new ArrayList<Item>() {{
                add(Item.builder().name("rope").price(800).build());
                add(Item.builder().name("saw").price(1400).build());
                add(Item.builder().name("bond").price(480).build());
                add(Item.builder().name("plane").price(2200).build());
                add(Item.builder().name("screwdriver").price(600).build());
            }}).build());

            add(Shop.builder().name("Electrics").itemList(new ArrayList<Item>() {{
                add(Item.builder().name("chair").price(600).build());
                add(Item.builder().name("desk").price(1800).build());
                add(Item.builder().name("cable").price(230).build());
                add(Item.builder().name("speaker").price(19000).build());
                add(Item.builder().name("headphone").price(8800).build());
                add(Item.builder().name("earphone").price(7800).build());
            }}).build());


            add(Shop.builder().name("Amazing Apothecary").itemList(new ArrayList<Item>() {{
                add(Item.builder().name("cold medicine").price(800).build());
                add(Item.builder().name("ointment").price(500).build());
                add(Item.builder().name("eye-drops").price(600).build());
                add(Item.builder().name("poultice").price(900).build());
            }}).build());

            add(Shop.builder().name("The Rapid Supermarket").itemList(new ArrayList<Item>() {{
                add(Item.builder().name("spinach").price(100).build());
                add(Item.builder().name("ginseng").price(120).build());
                add(Item.builder().name("onion").price(160).build());
                add(Item.builder().name("ice cream").price(200).build());
                add(Item.builder().name("crisps").price(80).build());
            }}).build());

            add(null);

            add(Shop.builder().name(null).itemList(new ArrayList<Item>() {{
                add(null);
                add(Item.builder().name(null).price(null).build());
            }}).build());

        }};
        customerList = new ArrayList<Customer>() {{
            add(Customer.builder().name("Joe").age(22).budget(8000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("small table").build());
                add(Item.builder().name("plate").build());
                add(Item.builder().name("fork").build());
            }}).build());

            add(Customer.builder().name("Steven").age(27).budget(2000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("ice cream").build());
                add(Item.builder().name("screwdriver").build());
                add(Item.builder().name("cable").build());
                add(Item.builder().name("earphone").build());
            }}).build());

            add(Customer.builder().name("Patrick").age(28).budget(4000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("onion").build());
                add(Item.builder().name("ice cream").build());
                add(Item.builder().name("crisps").build());
                add(Item.builder().name("chopsticks").build());
            }}).build());

            add(Customer.builder().name("Diana").age(38).budget(12000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("cable").build());
                add(Item.builder().name("speaker").build());
                add(Item.builder().name("headphone").build());
            }}).build());

            add(Customer.builder().name("Chris").age(26).budget(9000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("saw").build());
                add(Item.builder().name("bond").build());
                add(Item.builder().name("plane").build());
                add(Item.builder().name("bag").build());
            }}).build());

            add(Customer.builder().name("Kathy").age(22).budget(6000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("cold medicine").build());
            }}).build());

            add(Customer.builder().name("Alice").age(32).budget(2500).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("chair").build());
                add(Item.builder().name("desk").build());
            }}).build());

            add(Customer.builder().name("Andrew").age(35).budget(11000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("pants").build());
                add(Item.builder().name("coat").build());
            }}).build());

            add(Customer.builder().name("Martin").age(21).budget(1000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("cup").build());
                add(Item.builder().name("plate").build());
                add(Item.builder().name("fork").build());
                add(Item.builder().name("spoon").build());
            }}).build());

            add(Customer.builder().name("Amy").age(36).budget(2000).wantToBuy(new ArrayList<Item>() {{
                add(Item.builder().name("ointment").build());
                add(Item.builder().name("poultice").build());
                add(Item.builder().name("spinach").build());
                add(Item.builder().name("ginseng").build());
                add(Item.builder().name("onion").build());
            }}).build());

            add(null);

            add(Customer.builder().name(null).age(null).budget(null).wantToBuy(new ArrayList<Item>() {{
                add(null);
                add(Item.builder().name(null).price(null).build());
            }}).build());


        }};


    }


}
