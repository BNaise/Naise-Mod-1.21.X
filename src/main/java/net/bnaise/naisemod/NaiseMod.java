package net.bnaise.naisemod;

import net.bnaise.naisemod.block.ModBlocks;
import net.bnaise.naisemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaiseMod implements ModInitializer {

	public static final String MOD_ID = "naise-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

	}
}