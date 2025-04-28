package tech.jarno.simple_spikes;

import net.blay09.mods.balm.api.config.reflection.Comment;
import net.blay09.mods.balm.api.config.reflection.Config;

@Config(SimpleSpikes.MOD_ID)
public class SimpleSpikesConfig {

    @Comment("Determines the maximum allowed light level the bed must be in (inclusive).")
    public int maxLightLevel = 7;
}
