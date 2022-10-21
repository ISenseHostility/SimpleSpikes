package isensehostility.simple_spikes;

import isensehostility.simple_spikes.block.Spikes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraftforge.fml.common.Mod;

@Mod("simple_spikes")
public class SimpleSpikes {

    public static final String MODID = "simple_spikes";

    public SimpleSpikes() {
        Spikes.initialize();
    }

    public static class SpikeSources {
        public static final DamageSource SPIKE = new DamageSource("spike");
        public static final DamageSource SPIKE_IGNORE_ARMOR = new DamageSource("spikeIgnoreArmor").bypassArmor();
        public static final DamageSource SLIME_SPIKE = new DamageSource("slimeSpike");
    }

    public enum SpikeTypes {
        COPPER(1, SpikeSources.SPIKE),
        IRON(2, SpikeSources.SPIKE),
        GOLD(2, SpikeSources.SPIKE),
        DIAMOND(4, SpikeSources.SPIKE),
        NETHERITE(8, SpikeSources.SPIKE_IGNORE_ARMOR),
        SLIME(3, SpikeSources.SLIME_SPIKE);

        private final int damage;
        private final DamageSource source;

        SpikeTypes(int damage, DamageSource source) {
            this.damage = damage;
            this.source = source;
        }

        public int getDamage() {
            return damage;
        }

        public DamageSource getSource() {
            return source;
        }
    }
}
