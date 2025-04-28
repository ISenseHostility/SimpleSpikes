package tech.jarno.simple_spikes.block;

import net.blay09.mods.balm.api.block.BalmBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static tech.jarno.simple_spikes.SimpleSpikes.id;

public class ModBlocks {
    public static Block copperSpikes;
    public static Block diamondSpikes;
    public static Block goldSpikes;
    public static Block ironSpikes;
    public static Block netheriteSpikes;
    public static Block slimeSpikes;
    public static Block stoneSpikes;
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

    public static void initialize(BalmBlocks blocks) {
        blocks.registerBlock((location) -> ModBlocks.copperSpikes = new CopperSpikes(createBlockKey(location)), id("copper_spikes"));
        blocks.registerBlock((location) -> ModBlocks.diamondSpikes = new DiamondSpikes(createBlockKey(location)), id("diamond_spikes"));
        blocks.registerBlock((location) -> ModBlocks.goldSpikes = new GoldSpikes(createBlockKey(location)), id("gold_spikes"));
        blocks.registerBlock((location) -> ModBlocks.ironSpikes = new IronSpikes(createBlockKey(location)), id("iron_spikes"));
        blocks.registerBlock((location) -> ModBlocks.netheriteSpikes = new NetheriteSpikes(createBlockKey(location)), id("netherite_spikes"));
        blocks.registerBlock((location) -> ModBlocks.slimeSpikes = new SlimeSpikes(createBlockKey(location)), id("slime_spikes"));
        blocks.registerBlock((location) -> ModBlocks.stoneSpikes = new StoneSpikes(createBlockKey(location)), id("stone_spikes"));
        blocks.registerBlock((location) -> ModBlocks.oakSpikes = new WoodenSpikes(createBlockKey(location)), id("oak_spikes"));
        blocks.registerBlock((location) -> ModBlocks.darkOakSpikes = new WoodenSpikes(createBlockKey(location)), id("dark_oak_spikes"));
        blocks.registerBlock((location) -> ModBlocks.jungleSpikes = new WoodenSpikes(createBlockKey(location)), id("jungle_spikes"));
        blocks.registerBlock((location) -> ModBlocks.birchSpikes = new WoodenSpikes(createBlockKey(location)), id("birch_spikes"));
        blocks.registerBlock((location) -> ModBlocks.acaciaSpikes = new WoodenSpikes(createBlockKey(location)), id("acacia_spikes"));
        blocks.registerBlock((location) -> ModBlocks.spruceSpikes = new WoodenSpikes(createBlockKey(location)), id("spruce_spikes"));
        blocks.registerBlock((location) -> ModBlocks.warpedSpikes = new WoodenSpikes(createBlockKey(location)), id("warped_spikes"));
        blocks.registerBlock((location) -> ModBlocks.crimsonSpikes = new WoodenSpikes(createBlockKey(location)), id("crimson_spikes"));
        blocks.registerBlock((location) -> ModBlocks.cherrySpikes = new WoodenSpikes(createBlockKey(location)), id("cherry_spikes"));
        blocks.registerBlock((location) -> ModBlocks.mangroveSpikes = new WoodenSpikes(createBlockKey(location)), id("mangrove_spikes"));
        blocks.registerBlock((location) -> ModBlocks.paleOakSpikes = new WoodenSpikes(createBlockKey(location)), id("pale_oak_spikes"));
    }

    private static ResourceKey<Block> createBlockKey(ResourceLocation location) {
        return ResourceKey.create(Registries.BLOCK, location);
    }
}
