package ringularity.infinite.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ringularity.infinite.Infinite;

public class InfiniteItems {

    public static final Item TEST = registerItem("test", new Item(new FabricItemSettings()));

    private static void addItemsToTab(FabricItemGroupEntries entries) {
        entries.add(TEST);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Infinite.MOD_ID, name), item);
    }
    public static void registerItems() {
        Infinite.LOGGER.info("Registering Items for " + Infinite.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(InfiniteItems::addItemsToTab);
    }
}
