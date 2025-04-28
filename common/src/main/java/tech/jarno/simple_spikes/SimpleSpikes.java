package tech.jarno.simple_spikes;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.config.BalmConfig;
import net.blay09.mods.balm.api.item.BalmItems;
import net.blay09.mods.balm.api.module.BalmModule;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.jarno.simple_spikes.block.ModBlocks;
import tech.jarno.simple_spikes.item.ModItems;

public class SimpleSpikes implements BalmModule {

    public static final Logger logger = LoggerFactory.getLogger(SimpleSpikes.class);

    public static final String MOD_ID = "simple_spikes";

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static SimpleSpikesConfig config() {
        return Balm.getConfig().getActiveConfig(SimpleSpikesConfig.class);
    }

    @Override
    public void registerConfig(BalmConfig config) {
        config.registerConfig(SimpleSpikesConfig.class);
    }

    @Override
    public void registerItems(BalmItems items) {
        ModItems.initialize(items);
    }

    @Override
    public void registerBlocks(BalmBlocks blocks) {
        ModBlocks.initialize(blocks);
    }

    @Override
    public ResourceLocation getId() {
        return id("common");
    }
}
