package tech.jarno.simple_spikes.damagesource;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;

import static tech.jarno.simple_spikes.SimpleSpikes.id;

public class ModDamageTypes {
    public static final ResourceKey<DamageType> SPIKE = ResourceKey.create(Registries.DAMAGE_TYPE, id("simple_spike"));
    public static final ResourceKey<DamageType> SPIKE_IGNORE_ARMOR = ResourceKey.create(Registries.DAMAGE_TYPE, id("simple_spike_ignore_armor"));
    public static final ResourceKey<DamageType> SPIKE_SLIME = ResourceKey.create(Registries.DAMAGE_TYPE, id("simple_spike_slime"));
}