package com.pyro.lobotomymod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.pyro.lobotomymod.LobotomyMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBBERWOOD_LOG = registerBlock("rubberwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block RUBBERWOOD_WOOD = registerBlock("rubberwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_RUBBERWOOD_LOG = registerBlock("stripped_rubberwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_RUBBERWOOD_WOOD = registerBlock("stripped_rubberwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block RUBBERWOOD_PLANKS = registerBlock("rubberwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block RUBBERWOOD_LEAVES = registerBlock("rubberwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block RUBBERWOOD_SAPLING = registerBlock("rubberwood_sapling",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LobotomyMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LobotomyMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LobotomyMod.LOGGER.info("Registering Mod Blocks for " + LobotomyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RUBBERWOOD_LEAVES);
        });
    }
}