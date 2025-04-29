package yarnwrap.world.gen;
public class WorldPresets { public net.minecraft.world.gen.WorldPresets wrapperContained; public WorldPresets(net.minecraft.world.gen.WorldPresets wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.registry.RegistryKey value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.WorldPresets.DEFAULT); }
// public static void DEFAULT(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.gen.WorldPresets.DEFAULT = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey FLAT() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLAT); }
// public void FLAT(yarnwrap.registry.RegistryKey value) { wrapperContained.FLAT = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey FLAT() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.WorldPresets.FLAT); }
// public static void FLAT(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.gen.WorldPresets.FLAT = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey SINGLE_BIOME_SURFACE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SINGLE_BIOME_SURFACE); }
// public void SINGLE_BIOME_SURFACE(yarnwrap.registry.RegistryKey value) { wrapperContained.SINGLE_BIOME_SURFACE = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey SINGLE_BIOME_SURFACE() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.WorldPresets.SINGLE_BIOME_SURFACE); }
// public static void SINGLE_BIOME_SURFACE(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.gen.WorldPresets.SINGLE_BIOME_SURFACE = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey DEBUG_ALL_BLOCK_STATES() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEBUG_ALL_BLOCK_STATES); }
// public void DEBUG_ALL_BLOCK_STATES(yarnwrap.registry.RegistryKey value) { wrapperContained.DEBUG_ALL_BLOCK_STATES = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey DEBUG_ALL_BLOCK_STATES() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.WorldPresets.DEBUG_ALL_BLOCK_STATES); }
// public static void DEBUG_ALL_BLOCK_STATES(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.gen.WorldPresets.DEBUG_ALL_BLOCK_STATES = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey LARGE_BIOMES() { return new yarnwrap.registry.RegistryKey(wrapperContained.LARGE_BIOMES); }
// public void LARGE_BIOMES(yarnwrap.registry.RegistryKey value) { wrapperContained.LARGE_BIOMES = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey LARGE_BIOMES() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.WorldPresets.LARGE_BIOMES); }
// public static void LARGE_BIOMES(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.gen.WorldPresets.LARGE_BIOMES = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey AMPLIFIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.AMPLIFIED); }
// public void AMPLIFIED(yarnwrap.registry.RegistryKey value) { wrapperContained.AMPLIFIED = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey AMPLIFIED() { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.WorldPresets.AMPLIFIED); }
// public static void AMPLIFIED(yarnwrap.registry.RegistryKey value, ) { net.minecraft.world.gen.WorldPresets.AMPLIFIED = value.wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable presetRegisterable) { wrapperContained.bootstrap(presetRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable presetRegisterable, ) { net.minecraft.world.gen.WorldPresets.bootstrap(presetRegisterable.wrapperContained); }
// public java.util.Optional getWorldPreset(yarnwrap.world.dimension.DimensionOptionsRegistryHolder registry) { return wrapperContained.getWorldPreset(registry.wrapperContained); }
// public static java.util.Optional getWorldPreset(yarnwrap.world.dimension.DimensionOptionsRegistryHolder registry, ) { return net.minecraft.world.gen.WorldPresets.getWorldPreset(registry.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.world.gen.WorldPresets.of(id)); }
// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDemoOptions(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.createDemoOptions(dynamicRegistryManager.wrapperContained)); }
// public static yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDemoOptions(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager, ) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(net.minecraft.world.gen.WorldPresets.createDemoOptions(dynamicRegistryManager.wrapperContained)); }
// public yarnwrap.world.dimension.DimensionOptions getDefaultOverworldOptions(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager) { return new yarnwrap.world.dimension.DimensionOptions(wrapperContained.getDefaultOverworldOptions(dynamicRegistryManager.wrapperContained)); }
// public static yarnwrap.world.dimension.DimensionOptions getDefaultOverworldOptions(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager, ) { return new yarnwrap.world.dimension.DimensionOptions(net.minecraft.world.gen.WorldPresets.getDefaultOverworldOptions(dynamicRegistryManager.wrapperContained)); }
// public java.util.Optional method_45547(yarnwrap.world.dimension.DimensionOptions overworld) { return wrapperContained.method_45547(overworld.wrapperContained); }
// public static java.util.Optional method_45547(yarnwrap.world.dimension.DimensionOptions overworld, ) { return net.minecraft.world.gen.WorldPresets.method_45547(overworld.wrapperContained); }

}