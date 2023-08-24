package ringularity.infinite;

import ringularity.infinite.registry.InfiniteBlocks;
import ringularity.infinite.registry.InfiniteGroups;
import ringularity.infinite.registry.InfiniteItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Infinite implements ModInitializer {
	public static final String MOD_ID = "infinite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		InfiniteGroups.registerGroups();
		InfiniteItems.registerItems();
		InfiniteBlocks.registerBlocks();
	}
}