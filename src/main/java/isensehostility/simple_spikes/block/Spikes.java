package isensehostility.simple_spikes.block;

import isensehostility.simple_spikes.SimpleSpikes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Spikes {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleSpikes.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleSpikes.MODID);

    public static void initialize() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> COPPER_SPIKES = BLOCKS.register("copper_spikes", CopperSpikes::new);
    public static final RegistryObject<Block> IRON_SPIKES = BLOCKS.register("iron_spikes", IronSpikes::new);
    public static final RegistryObject<Block> GOLD_SPIKES = BLOCKS.register("gold_spikes", GoldSpikes::new);
    public static final RegistryObject<Block> DIAMOND_SPIKES = BLOCKS.register("diamond_spikes", DiamondSpikes::new);
    public static final RegistryObject<Block> NETHERITE_SPIKES = BLOCKS.register("netherite_spikes", NetheriteSpikes::new);

    public static final RegistryObject<Item> COPPER_SPIKES_ITEM = ITEMS.register("copper_spikes", () -> new BlockItem(Spikes.COPPER_SPIKES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> IRON_SPIKES_ITEM = ITEMS.register("iron_spikes", () -> new BlockItem(Spikes.IRON_SPIKES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GOLD_SPIKES_ITEM = ITEMS.register("gold_spikes", () -> new BlockItem(Spikes.GOLD_SPIKES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> DIAMOND_SPIKES_ITEM = ITEMS.register("diamond_spikes", () -> new BlockItem(Spikes.DIAMOND_SPIKES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> NETHERITE_SPIKES_ITEM = ITEMS.register("netherite_spikes", () -> new BlockItem(Spikes.NETHERITE_SPIKES.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
}
