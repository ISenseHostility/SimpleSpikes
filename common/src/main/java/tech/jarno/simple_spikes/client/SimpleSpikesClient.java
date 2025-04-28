package tech.jarno.simple_spikes.client;

import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.minecraft.resources.ResourceLocation;

import static tech.jarno.simple_spikes.SimpleSpikes.id;

public class SimpleSpikesClient implements BalmClientModule {
    @Override
    public ResourceLocation getId() {
        return id("client");
    }
}
