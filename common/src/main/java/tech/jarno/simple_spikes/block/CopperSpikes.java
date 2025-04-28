package tech.jarno.simple_spikes.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CopperSpikes extends AbstractSpike {

    public CopperSpikes(ResourceKey<Block> id) {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK)
                .requiresCorrectToolForDrops()
                .setId(id)
        );
    }

    @Override
    public Type getType() {
        return Type.COPPER;
    }
}