package tech.jarno.simple_spikes.fabric.client;

import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;
import tech.jarno.simple_spikes.SimpleSpikes;
import tech.jarno.simple_spikes.client.SimpleSpikesClient;

public class FabricSimpleSpikesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(SimpleSpikes.MOD_ID, EmptyLoadContext.INSTANCE, new SimpleSpikesClient());
    }
}
