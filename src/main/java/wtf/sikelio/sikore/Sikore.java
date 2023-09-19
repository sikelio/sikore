package wtf.sikelio.sikore;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wtf.sikelio.sikore.block.ModBlocks;
import wtf.sikelio.sikore.item.ModItems;
import wtf.sikelio.sikore.item.ModItemsGroups;

public class Sikore implements ModInitializer {
	public static final String MOD_ID = "sikore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
