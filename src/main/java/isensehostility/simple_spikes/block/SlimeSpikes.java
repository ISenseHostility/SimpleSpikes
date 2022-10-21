package isensehostility.simple_spikes.block;

import isensehostility.simple_spikes.SimpleSpikes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SlimeSpikes extends SlimeBlock implements Spike {
    public SlimeSpikes() {
        super(Properties.copy(Blocks.SLIME_BLOCK).strength(5.0F).requiresCorrectToolForDrops());
    }

    @Override
    public SimpleSpikes.SpikeTypes getType() {
        return SimpleSpikes.SpikeTypes.SLIME;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof LivingEntity stepper) {
            stepper.hurt(getType().getSource(), getType().getDamage());
        }

        super.stepOn(level, pos, state, entity);
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }


}
