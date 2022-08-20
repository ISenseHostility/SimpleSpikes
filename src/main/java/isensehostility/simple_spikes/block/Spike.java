package isensehostility.simple_spikes.block;

import isensehostility.simple_spikes.SimpleSpikes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public interface Spike {
     VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 5.0D, 15.0D);

    SimpleSpikes.SpikeTypes getType();
}
