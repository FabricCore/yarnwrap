package yarnwrap.client.gui.screen.world;
public class LevelScreenProvider { public net.minecraft.client.gui.screen.world.LevelScreenProvider wrapperContained; public LevelScreenProvider(net.minecraft.client.gui.screen.world.LevelScreenProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map WORLD_PRESET_TO_SCREEN_PROVIDER() { return wrapperContained.WORLD_PRESET_TO_SCREEN_PROVIDER; }
// public Object createModifier(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.createModifier(config.wrapperContained); }
// public Object createModifier(yarnwrap.registry.entry.RegistryEntry biomeEntry) { return wrapperContained.createModifier(biomeEntry.wrapperContained); }

}