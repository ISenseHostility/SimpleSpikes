package tech.jarno.simple_spikes.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class StoneSpikes extends AbstractSpike {

    public StoneSpikes(ResourceKey<Block> id) {
        super(Properties.ofFullCopy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .setId(id)
        );
    }

    @Override
    public Type getType() {
        return Type.STONE;
    }
}