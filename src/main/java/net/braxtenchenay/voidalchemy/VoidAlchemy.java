package net.braxtenchenay.voidalchemy;

import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.braxtenchenay.voidalchemy.item.ModItems;
import net.braxtenchenay.voidalchemy.world.feature.ModConfiguredFeatures;
import net.braxtenchenay.voidalchemy.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VoidAlchemy implements ModInitializer {
	public static final String MOD_ID = "voidalchemy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();



	}
}
