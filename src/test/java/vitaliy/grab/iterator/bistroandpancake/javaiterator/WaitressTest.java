package vitaliy.grab.iterator.bistroandpancake.javaiterator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Oywayten 16.08.2023.
 */

public class WaitressTest {

    @Test
    public void whenDinerAndPancakeHouseAndCafeMenusShowMenuThenTrue() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        String actual = waitress.menuToString();
        String expected = """
                 MENU
                 ----
                 BREAKFAST
                 K&B’s Pancake Breakfast, 2.99 -- Pancakes with scrambled eggs, and toast
                 Regular Pancake Breakfast, 2.99 -- Pancakes with fried eggs, sausage
                 Blueberry Pancakes, 3.49 -- Pancakes made with fresh blueberries
                 Waffles, 3.59 -- Waffles, with your choice of blueberries or strawberries

                 LUNCH
                 Vegetarian BLT, 2.99 -- (Fakin’) Bacon with lettuce & tomato on whole wheat
                 BLT, 2.99 -- Bacon with lettuce & tomato on whole wheat
                 Soup of the day, 3.29 -- Soup of the day, with a side of potato salad
                 Hotdog, 3.05 -- A hot dog, with saurkraut, relish, onions, topped with cheese
                                   
                 DINNER
                 Soup of the day, 3.69 -- A cup of the soup of the day, with a side salad
                 Veggie Burger and Air Fries, 3.99 -- Veggie burger on a whole wheat bun, lettuce, tomato, and fries
                 Burrito, 4.29 -- A large burrito, with whole pinto beans, salsa, guacamole
                  """;
        assertThat(actual).isEqualToNormalizingNewlines(expected);
    }
}
