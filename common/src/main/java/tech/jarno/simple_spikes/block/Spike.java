package tech.jarno.simple_spikes.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;
import tech.jarno.simple_spikes.damagesource.ModDamageTypes;

public interface Spike {
    VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 5.0D, 15.0D);

    Type getType();

    enum Type {
        WOODEN(1, ModDamageTypes.SPIKE),
        STONE(2, ModDamageTypes.SPIKE),
        COPPER(3, ModDamageTypes.SPIKE),
        IRON(3, ModDamageTypes.SPIKE),
        GOLD(3, ModDamageTypes.SPIKE),
        DIAMOND(6, ModDamageTypes.SPIKE),
        NETHERITE(10, ModDamageTypes.SPIKE_IGNORE_ARMOR),
        SLIME(3, ModDamageTypes.SPIKE_SLIME);

        private final int damage;
        private final ResourceKey<DamageType> damageType;

        Type(int damage, ResourceKey<DamageType> type) {
            this.damage = damage;
            this.damageType = type;
        }

        public int getDamage() {
            return damage;
        }

        public ResourceKey<DamageType> getDamageType() {
            return damageType;
        }
    }
}
