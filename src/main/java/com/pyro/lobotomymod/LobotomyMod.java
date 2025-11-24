package com.pyro.lobotomymod;

import com.pyro.lobotomymod.block.ModBlocks;
import com.pyro.lobotomymod.item.ModItemGroups;
import com.pyro.lobotomymod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LobotomyMod implements ModInitializer {
	public static final String MOD_ID = "lobotomymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}