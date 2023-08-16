package vitaliy.grab.iterator.bistroandpancake.customiterator;

import org.junit.jupiter.api.Test;
import vitaliy.grab.iterator.bistroandpancake.customiterator.DinerMenu;
import vitaliy.grab.iterator.bistroandpancake.customiterator.PancakeHouseMenu;
import vitaliy.grab.iterator.bistroandpancake.customiterator.Waitress;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class WaitressTest {

    @Test
    public void whenShowMenuThenTrue() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
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
                  """;
        assertThat(actual).isEqualToNormalizingNewlines(expected);
    }

}
