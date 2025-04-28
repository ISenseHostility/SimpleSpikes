package tech.jarno.simple_spikes.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class NetheriteSpikes extends AbstractSpike {

    public NetheriteSpikes(ResourceKey<Block> id) {
        super(Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
                .requiresCorrectToolForDrops()
                .setId(id)
        );
    }

    @Override
    public Type getType() {
        return Type.NETHERITE;
    }
}