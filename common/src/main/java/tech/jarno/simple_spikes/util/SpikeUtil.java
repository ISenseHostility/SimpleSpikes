package tech.jarno.simple_spikes.util;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.level.Level;
import tech.jarno.simple_spikes.block.Spike;

public class SpikeUtil {

    public static Holder<DamageType> getDamageTypeForSpike(Level level, Spike spike) {
        return level.registryAccess()
                .lookupOrThrow(Registries.DAMAGE_TYPE)
                .getOptional(spike.getType().getDamageType())
                .stream()
                .map(Holder::direct)
                .findFirst()
                .orElseGet(() -> Holder.direct(level
                        .damageSources()
                        .generic()
                        .type())
                );
    }
}
