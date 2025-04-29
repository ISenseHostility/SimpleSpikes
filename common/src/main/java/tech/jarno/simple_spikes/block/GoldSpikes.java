package tech.jarno.simple_spikes.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class GoldSpikes extends AbstractSpike {

    public GoldSpikes(ResourceKey<Block> id) {
        super(Properties.ofFullCopy(Blocks.GOLD_BLOCK)
                .requiresCorrectToolForDrops()
                .setId(id)
        );
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof LivingEntity stepper && !level.isClientSide()) {
            Holder<DamageType> spikeDamageType = level.registryAccess()
                    .lookupOrThrow(Registries.DAMAGE_TYPE)
                    .getOrThrow(getType().getDamageType());

            stepper.hurtServer((ServerLevel) level, new DamageSource(spikeDamageType), Mth.clamp(getType().getDamage(), 0, stepper.getHealth() - 1));
        }
    }

    @Override
    public Type getType() {
        return Type.GOLD;
    }
}