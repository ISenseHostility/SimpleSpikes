package tech.jarno.simple_spikes.neoforge.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import tech.jarno.simple_spikes.SimpleSpikes;
import tech.jarno.simple_spikes.client.SimpleSpikesClient;

@Mod(value = SimpleSpikes.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeSimpleSpikesClient {

    public NeoForgeSimpleSpikesClient(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);

        BalmClient.initializeMod(SimpleSpikes.MOD_ID, context, new SimpleSpikesClient());
    }
}
