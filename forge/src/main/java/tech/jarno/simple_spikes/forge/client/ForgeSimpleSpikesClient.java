package tech.jarno.simple_spikes.forge.client;

import net.blay09.mods.balm.api.client.BalmClient;
import tech.jarno.simple_spikes.client.SimpleSpikesClient;

public class ForgeSimpleSpikesClient {

    public static void initialize() {
        BalmClient.registerModule(new SimpleSpikesClient());
    }

}
