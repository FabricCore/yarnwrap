package yarnwrap.world.gen;
public class WorldPresets { public net.minecraft.world.gen.WorldPresets wrapperContained; public WorldPresets(net.minecraft.world.gen.WorldPresets wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT); }
public yarnwrap.registry.RegistryKey FLAT() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLAT); }
public yarnwrap.registry.RegistryKey SINGLE_BIOME_SURFACE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SINGLE_BIOME_SURFACE); }
public yarnwrap.registry.RegistryKey DEBUG_ALL_BLOCK_STATES() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEBUG_ALL_BLOCK_STATES); }
public yarnwrap.registry.RegistryKey LARGE_BIOMES() { return new yarnwrap.registry.RegistryKey(wrapperContained.LARGE_BIOMES); }
public yarnwrap.registry.RegistryKey AMPLIFIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.AMPLIFIED); }
public void bootstrap(yarnwrap.registry.Registerable presetRegisterable) { wrapperContained.bootstrap(presetRegisterable.wrapperContained); }
public java.util.Optional getWorldPreset(yarnwrap.world.dimension.DimensionOptionsRegistryHolder registry) { return wrapperContained.getWorldPreset(registry.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDemoOptions(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.createDemoOptions(dynamicRegistryManager.wrapperContained)); }
public yarnwrap.world.dimension.DimensionOptions getDefaultOverworldOptions(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager) { return new yarnwrap.world.dimension.DimensionOptions(wrapperContained.getDefaultOverworldOptions(dynamicRegistryManager.wrapperContained)); }

}