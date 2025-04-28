package tech.jarno.simple_spikes.item;

import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import tech.jarno.simple_spikes.block.ModBlocks;

import static tech.jarno.simple_spikes.SimpleSpikes.id;

public class ModItems {
    public static Item copperSpikesItem;
    public static Item diamondSpikesItem;
    public static Item goldSpikesItem;
    public static Item ironSpikesItem;
    public static Item netheriteSpikesItem;
    public static Item slimeSpikesItem;
    public static Item stoneSpikesItem;
    public static Item oakSpikesItem;
    public static Item darkOakSpikesItem;
    public static Item birchSpikesItem;
    public static Item jungleSpikesItem;
    public static Item acaciaSpikesItem;
    public static Item spruceSpikesItem;
    public static Item warpedSpikesItem;
    public static Item crimsonSpikesItem;
    public static Item mangroveSpikesItem;
    public static Item cherrySpikesItem;
    public static Item paleOakSpikesItem;

    public static void initialize(BalmItems items) {
        items.registerItem((location) -> ModItems.copperSpikesItem = new BlockItem(ModBlocks.copperSpikes, createDefaultItemProperties(location)), id("copper_spikes"));
        items.registerItem((location) -> ModItems.diamondSpikesItem = new BlockItem(ModBlocks.diamondSpikes, createDefaultItemProperties(location)), id("diamond_spikes"));
        items.registerItem((location) -> ModItems.goldSpikesItem = new BlockItem(ModBlocks.goldSpikes, createDefaultItemProperties(location)), id("gold_spikes"));
        items.registerItem((location) -> ModItems.ironSpikesItem = new BlockItem(ModBlocks.ironSpikes, createDefaultItemProperties(location)), id("iron_spikes"));
        items.registerItem((location) -> ModItems.netheriteSpikesItem = new BlockItem(ModBlocks.netheriteSpikes, createDefaultItemProperties(location)), id("netherite_spikes"));
        items.registerItem((location) -> ModItems.slimeSpikesItem = new BlockItem(ModBlocks.slimeSpikes, createDefaultItemProperties(location)), id("slime_spikes"));
        items.registerItem((location) -> ModItems.stoneSpikesItem = new BlockItem(ModBlocks.stoneSpikes, createDefaultItemProperties(location)), id("stone_spikes"));
        items.registerItem((location) -> ModItems.oakSpikesItem = new BlockItem(ModBlocks.oakSpikes, createDefaultItemProperties(location)), id("oak_spikes"));
        items.registerItem((location) -> ModItems.darkOakSpikesItem = new BlockItem(ModBlocks.darkOakSpikes, createDefaultItemProperties(location)), id("dark_oak_spikes"));
        items.registerItem((location) -> ModItems.birchSpikesItem = new BlockItem(ModBlocks.birchSpikes, createDefaultItemProperties(location)), id("birch_spikes"));
        items.registerItem((location) -> ModItems.spruceSpikesItem = new BlockItem(ModBlocks.spruceSpikes, createDefaultItemProperties(location)), id("spruce_spikes"));
        items.registerItem((location) -> ModItems.cherrySpikesItem = new BlockItem(ModBlocks.cherrySpikes, createDefaultItemProperties(location)), id("cherry_spikes"));
        items.registerItem((location) -> ModItems.crimsonSpikesItem = new BlockItem(ModBlocks.crimsonSpikes, createDefaultItemProperties(location)), id("crimson_spikes"));
        items.registerItem((location) -> ModItems.acaciaSpikesItem = new BlockItem(ModBlocks.acaciaSpikes, createDefaultItemProperties(location)), id("acacia_spikes"));
        items.registerItem((location) -> ModItems.mangroveSpikesItem = new BlockItem(ModBlocks.mangroveSpikes, createDefaultItemProperties(location)), id("mangrove_spikes"));
        items.registerItem((location) -> ModItems.jungleSpikesItem = new BlockItem(ModBlocks.jungleSpikes, createDefaultItemProperties(location)), id("jungle_spikes"));
        items.registerItem((location) -> ModItems.paleOakSpikesItem = new BlockItem(ModBlocks.paleOakSpikes, createDefaultItemProperties(location)), id("pale_oak_spikes"));
        items.registerItem((location) -> ModItems.warpedSpikesItem = new BlockItem(ModBlocks.warpedSpikes, createDefaultItemProperties(location)), id("warped_spikes"));

        Item[] ALL_SPIKES = {
                copperSpikesItem,
                diamondSpikesItem,
                goldSpikesItem,
                ironSpikesItem,
                netheriteSpikesItem,
                slimeSpikesItem,
                stoneSpikesItem,
                oakSpikesItem,
                darkOakSpikesItem,
                birchSpikesItem,
                jungleSpikesItem,
                acaciaSpikesItem,
                spruceSpikesItem,
                warpedSpikesItem,
                crimsonSpikesItem,
                mangroveSpikesItem,
                cherrySpikesItem,
                paleOakSpikesItem
        };

        items.addToCreativeModeTab(ResourceLocation.fromNamespaceAndPath("minecraft", "functional_blocks"), () -> ALL_SPIKES);
    }

    private static ResourceKey<Item> createItemKey(ResourceLocation location) {
        return ResourceKey.create(Registries.ITEM, location);
    }
    private static Item.Properties createDefaultItemProperties(ResourceLocation location) {
        return new Item.Properties().setId(createItemKey(location));
    }
}
