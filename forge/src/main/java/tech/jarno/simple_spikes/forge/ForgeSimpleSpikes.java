package tech.jarno.simple_spikes.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.forge.ForgeLoadContext;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import tech.jarno.simple_spikes.SimpleSpikes;
import tech.jarno.simple_spikes.forge.client.ForgeSimpleSpikesClient;

@Mod(SimpleSpikes.MOD_ID)
public class ForgeSimpleSpikes {

    public ForgeSimpleSpikes(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModEventBus());

        Balm.initializeMod(SimpleSpikes.MOD_ID, loadContext, new SimpleSpikes());

        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(SimpleSpikes.MOD_ID, loadContext, ForgeSimpleSpikesClient::initialize);
        }
    }

}
