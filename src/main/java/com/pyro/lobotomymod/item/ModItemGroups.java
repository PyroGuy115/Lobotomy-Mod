package com.pyro.lobotomymod.item;

import com.pyro.lobotomymod.LobotomyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DILDO_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LobotomyMod.MOD_ID, "dildo_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DILDO))
                    .displayName(Text.translatable("itemgroup.lobomotmymod.dildo_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DILDO);
                        entries.add(ModItems.WHITE_DILDO);
                        entries.add(ModItems.LIGHT_GRAY_DILDO);
                        entries.add(ModItems.GRAY_DILDO);
                        entries.add(ModItems.BLACK_DILDO);
                        entries.add(ModItems.BROWN_DILDO);
                        entries.add(ModItems.RED_DILDO);
                        entries.add(ModItems.ORANGE_DILDO);
                        entries.add(ModItems.YELLOW_DILDO);
                        entries.add(ModItems.LIME_DILDO);
                        entries.add(ModItems.GREEN_DILDO);
                        entries.add(ModItems.CYAN_DILDO);
                        entries.add(ModItems.LIGHT_BLUE_DILDO);
                        entries.add(ModItems.BLUE_DILDO);
                        entries.add(ModItems.PURPLE_DILDO);
                        entries.add(ModItems.MAGENTA_DILDO);
                        entries.add(ModItems.PINK_DILDO);
                        entries.add(ModItems.RUBBER);
                    }).build());

    public static void registerItemGroups() {
        LobotomyMod.LOGGER.info("Registering your shity groups for " + LobotomyMod.MOD_ID);
    }
}
