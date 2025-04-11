package yarnwrap.client.gui.screen.world;
public class LevelScreenProvider { public net.minecraft.client.gui.screen.world.LevelScreenProvider wrapperContained; public LevelScreenProvider(net.minecraft.client.gui.screen.world.LevelScreenProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map WORLD_PRESET_TO_SCREEN_PROVIDER() { return wrapperContained.WORLD_PRESET_TO_SCREEN_PROVIDER; }
// public void WORLD_PRESET_TO_SCREEN_PROVIDER(java.util.Map value) { wrapperContained.WORLD_PRESET_TO_SCREEN_PROVIDER = value; }
public yarnwrap.client.gui.screen.Screen createEditScreen(yarnwrap.client.gui.screen.world.CreateWorldScreen parent,yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createEditScreen(parent.wrapperContained,generatorOptionsHolder.wrapperContained)); }
// public Object createModifier(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.createModifier(config.wrapperContained); }
// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder method_41857(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig dynamicRegistryManager,Object dimensionsRegistryHolder) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.method_41857(dynamicRegistryManager.wrapperContained,dimensionsRegistryHolder)); }
// public void method_41858(yarnwrap.client.gui.screen.world.CreateWorldScreen config) { wrapperContained.method_41858(config.wrapperContained); }
// public yarnwrap.client.gui.screen.Screen method_41859(yarnwrap.client.gui.screen.world.CreateWorldScreen parent,yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.method_41859(parent.wrapperContained,generatorOptionsHolder.wrapperContained)); }
// public void method_41860(yarnwrap.client.gui.screen.world.CreateWorldScreen biomeEntry) { wrapperContained.method_41860(biomeEntry.wrapperContained); }
// public Object createModifier(yarnwrap.registry.entry.RegistryEntry biomeEntry) { return wrapperContained.createModifier(biomeEntry.wrapperContained); }
// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder method_41862(yarnwrap.registry.entry.RegistryEntry dynamicRegistryManager,Object dimensionsRegistryHolder) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.method_41862(dynamicRegistryManager.wrapperContained,dimensionsRegistryHolder)); }
// public yarnwrap.client.gui.screen.Screen method_41863(yarnwrap.client.gui.screen.world.CreateWorldScreen parent,yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.method_41863(parent.wrapperContained,generatorOptionsHolder.wrapperContained)); }

}