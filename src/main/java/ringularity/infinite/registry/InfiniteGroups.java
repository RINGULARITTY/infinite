package ringularity.infinite.registry;

import ringularity.infinite.Infinite;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class InfiniteGroups {
    public static final ItemGroup INFINITE_GROUP = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(Infinite.MOD_ID, "infinite"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.infinite")).icon(
                () -> new ItemStack(InfiniteItems.TEST)
        ).entries((displayContext, entries) -> {
            entries.add(InfiniteItems.TEST);
        }).build()
    );

    public static void registerGroups() {
        Infinite.LOGGER.info("Registering Groups for " + Infinite.MOD_ID);
    }
}
