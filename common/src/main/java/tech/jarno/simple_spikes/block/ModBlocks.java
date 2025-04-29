package tech.jarno.simple_spikes.block;

import net.blay09.mods.balm.api.block.BalmBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static tech.jarno.simple_spikes.SimpleSpikes.id;

public class ModBlocks {
    public static Block copperSpikes;
    public static Block diamondSpikes;
    public static Block goldSpikes;
    public static Block ironSpikes;
    public static Block netheriteSpikes;
    public static Block slimeSpikes;
    public static Block stoneSpikes;
    public static Block cobblestoneSpikes;
    public static Block oakSpikes;
    public static Block darkOakSpikes;
    public static Block birchSpikes;
    public static Block jungleSpikes;
    public static Block acaciaSpikes;
    public static Block spruceSpikes;
    public static Block warpedSpikes;
    public static Block crimsonSpikes;
    public static Block mangroveSpikes;
    public static Block cherrySpikes;
    public static Block paleOakSpikes;

    private record SpikeEntry(
            String name,
            Function<ResourceKey<Block>, Block> factory,
            Consumer<Block> setter
    ) {}

    private static final List<SpikeEntry> SPIKES = List.of(
            new SpikeEntry("copper_spikes", CopperSpikes::new, b -> copperSpikes = b),
            new SpikeEntry("diamond_spikes", DiamondSpikes::new, b -> diamondSpikes = b),
            new SpikeEntry("gold_spikes", GoldSpikes::new, b -> goldSpikes = b),
            new SpikeEntry("iron_spikes", IronSpikes::new, b -> ironSpikes = b),
            new SpikeEntry("netherite_spikes", NetheriteSpikes::new, b -> netheriteSpikes = b),
            new SpikeEntry("slime_spikes", SlimeSpikes::new, b -> slimeSpikes = b),

            // stone variants
            new SpikeEntry("stone_spikes", StoneSpikes::new, b -> stoneSpikes = b),
            new SpikeEntry("cobblestone_spikes", StoneSpikes::new, b -> cobblestoneSpikes = b),

            // wooden variants
            new SpikeEntry("oak_spikes", WoodenSpikes::new, b -> oakSpikes = b),
            new SpikeEntry("dark_oak_spikes", WoodenSpikes::new, b -> darkOakSpikes = b),
            new SpikeEntry("birch_spikes", WoodenSpikes::new, b -> birchSpikes = b),
            new SpikeEntry("jungle_spikes", WoodenSpikes::new, b -> jungleSpikes = b),
            new SpikeEntry("acacia_spikes", WoodenSpikes::new, b -> acaciaSpikes = b),
            new SpikeEntry("spruce_spikes", WoodenSpikes::new, b -> spruceSpikes = b),
            new SpikeEntry("warped_spikes", WoodenSpikes::new, b -> warpedSpikes = b),
            new SpikeEntry("crimson_spikes", WoodenSpikes::new, b -> crimsonSpikes = b),
            new SpikeEntry("cherry_spikes", WoodenSpikes::new, b -> cherrySpikes = b),
            new SpikeEntry("mangrove_spikes", WoodenSpikes::new, b -> mangroveSpikes = b),
            new SpikeEntry("pale_oak_spikes", WoodenSpikes::new, b -> paleOakSpikes = b)
    );

    public static void initialize(BalmBlocks blocks) {
        for (SpikeEntry entry : SPIKES) {
            blocks.registerBlock(
                    location -> {
                        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, location);
                        Block b = entry.factory.apply(key);
                        entry.setter.accept(b);
                        return b;
                    },
                    id(entry.name)
            );
        }
    }
}
