package tech.jarno.simple_spikes.neoforge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import tech.jarno.simple_spikes.SimpleSpikes;

@Mod(SimpleSpikes.MOD_ID)
public class NeoForgeSimpleSpikes {

    public NeoForgeSimpleSpikes(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);

        Balm.initializeMod(SimpleSpikes.MOD_ID, context, new SimpleSpikes());

        NeoForge.EVENT_BUS.register(this);
    }

}
