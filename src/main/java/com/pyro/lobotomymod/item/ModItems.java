package com.pyro.lobotomymod.item;

import com.pyro.lobotomymod.LobotomyMod;
import com.pyro.lobotomymod.item.custom.CumItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Dildo Group
    public static final Item DILDO = registerItem("dildo", new Item(new Item.Settings()));
    public static final Item BLACK_DILDO = registerItem("black_dildo", new Item(new Item.Settings()));
    public static final Item BLUE_DILDO = registerItem("blue_dildo", new Item(new Item.Settings()));
    public static final Item BROWN_DILDO = registerItem("brown_dildo", new Item(new Item.Settings()));
    public static final Item CYAN_DILDO = registerItem("cyan_dildo", new Item(new Item.Settings()));
    public static final Item GRAY_DILDO = registerItem("gray_dildo", new Item(new Item.Settings()));
    public static final Item GREEN_DILDO = registerItem("green_dildo", new Item(new Item.Settings()));
    public static final Item LIGHT_BLUE_DILDO = registerItem("light_blue_dildo", new Item(new Item.Settings()));
    public static final Item LIGHT_GRAY_DILDO = registerItem("light_gray_dildo", new Item(new Item.Settings()));
    public static final Item LIME_DILDO = registerItem("lime_dildo", new Item(new Item.Settings()));
    public static final Item MAGENTA_DILDO = registerItem("magenta_dildo", new Item(new Item.Settings()));
    public static final Item ORANGE_DILDO = registerItem("orange_dildo", new Item(new Item.Settings()));
    public static final Item PINK_DILDO = registerItem("pink_dildo", new Item(new Item.Settings()));
    public static final Item PURPLE_DILDO = registerItem("purple_dildo", new Item(new Item.Settings()));
    public static final Item RED_DILDO = registerItem("red_dildo", new Item(new Item.Settings()));
    public static final Item WHITE_DILDO = registerItem("white_dildo", new Item(new Item.Settings()));
    public static final Item YELLOW_DILDO = registerItem("yellow_dildo", new Item(new Item.Settings()));
    public static final Item RUBBER = registerItem("rubber", new Item(new Item.Settings()));

    // Custom Dildo Items
    public static final Item CUM_ITEM = registerItem("cum_item", new CumItem(new Item.Settings().maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LobotomyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LobotomyMod.LOGGER.info("Registering your shity items for " + LobotomyMod.MOD_ID);
    }
}
