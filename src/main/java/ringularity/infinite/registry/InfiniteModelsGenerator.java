package ringularity.infinite.registry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class InfiniteModelsGenerator extends FabricModelProvider {
    public InfiniteModelsGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(InfiniteBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(InfiniteBlocks.RAW_RUBY_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(InfiniteItems.TEST, Models.GENERATED);
    }
}
