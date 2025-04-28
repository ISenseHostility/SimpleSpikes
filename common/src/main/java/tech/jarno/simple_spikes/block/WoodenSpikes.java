package tech.jarno.simple_spikes.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class WoodenSpikes extends AbstractSpike {

    public WoodenSpikes(ResourceKey<Block> id) {
        super(Properties.ofFullCopy(Blocks.OAK_PLANKS)
                .setId(id)
        );
    }

    @Override
    public Type getType() {
        return Type.WOODEN;
    }
}