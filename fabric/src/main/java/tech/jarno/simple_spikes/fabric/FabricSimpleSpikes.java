package tech.jarno.simple_spikes.fabric;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;
import tech.jarno.simple_spikes.SimpleSpikes;

public class FabricSimpleSpikes implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(SimpleSpikes.MOD_ID, EmptyLoadContext.INSTANCE, new SimpleSpikes());
    }
}
