package vitaliy.grab.composite;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Oywayten 18.08.2023.
 */

class WaitressTest {

    @Test
    public void whenAddCompositeMenuThenTrue() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        Waitress waitress = new Waitress(allMenus);
        String actual = waitress.menuToString();
        String expected = """
                                
                ALL MENUS, All menus combined
                ---------------------
                                
                PANCAKE HOUSE MENU, Breakfast
                ---------------------
                                
                DINER MENU, Lunch
                ---------------------
                 Pasta(v), 3.89
                 -- Spaghetti with Marinara Sauce, and a slice of sourdough bread
                                
                DESSERT MENU, Dessert of course!
                ---------------------
                 Apple Pie(v), 1.59
                 -- Apple pie with a flakey crust, topped with vanilla icecream
                                
                CAFE MENU, Dinner
                ---------------------
                """;
        assertThat(actual).isEqualToNormalizingNewlines(expected);
    }

}