package tech.jarno.simple_spikes.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class IronSpikes extends AbstractSpike {

    public IronSpikes(ResourceKey<Block> id) {
        super(Properties.ofFullCopy(Blocks.IRON_BLOCK)
                .requiresCorrectToolForDrops()
                .setId(id)
        );
    }

    @Override
    public Type getType() {
        return Type.IRON;
    }
}