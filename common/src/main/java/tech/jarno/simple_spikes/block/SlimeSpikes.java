package tech.jarno.simple_spikes.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import tech.jarno.simple_spikes.util.SpikeUtil;

public class SlimeSpikes extends SlimeBlock implements Spike {

    public SlimeSpikes(ResourceKey<Block> id) {
        super(Properties.ofFullCopy(Blocks.SLIME_BLOCK)
                .setId(id)
        );
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof LivingEntity stepper && !level.isClientSide()) {
            Holder<DamageType> spikeDamageType = SpikeUtil.getDamageTypeForSpike(level, this);

            stepper.hurtServer((ServerLevel) level, new DamageSource(spikeDamageType), getType().getDamage());
        }

        super.stepOn(level, pos, state, entity);
    }

    @Override
    public Type getType() {
        return Type.SLIME;
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }
}