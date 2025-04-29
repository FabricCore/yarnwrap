package yarnwrap.world.gen;
public class WorldPreset { public net.minecraft.world.gen.WorldPreset wrapperContained; public WorldPreset(net.minecraft.world.gen.WorldPreset wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.WorldPreset.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.WorldPreset.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.world.gen.WorldPreset.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.WorldPreset.ENTRY_CODEC = value; }

// public java.util.Map dimensions() { return wrapperContained.dimensions; }
// public void dimensions(java.util.Map value) { wrapperContained.dimensions = value; }
// public static java.util.Map dimensions() { return net.minecraft.world.gen.WorldPreset.dimensions; }
// public static void dimensions(java.util.Map value, ) { net.minecraft.world.gen.WorldPreset.dimensions = value; }

public WorldPreset(java.util.Map dimensions) { this.wrapperContained = new net.minecraft.world.gen.WorldPreset(dimensions); }
public java.util.Optional getOverworld() { return wrapperContained.getOverworld(); }
// public static java.util.Optional getOverworld() { return net.minecraft.world.gen.WorldPreset.getOverworld(); }
// public com.mojang.datafixers.kinds.App method_41586(Object instance) { return wrapperContained.method_41586(instance); }
// public static com.mojang.datafixers.kinds.App method_41586(Object instance, ) { return net.minecraft.world.gen.WorldPreset.method_41586(instance); }
// public java.util.Map method_41588(yarnwrap.world.gen.WorldPreset preset) { return wrapperContained.method_41588(preset.wrapperContained); }
// public static java.util.Map method_41588(yarnwrap.world.gen.WorldPreset preset, ) { return net.minecraft.world.gen.WorldPreset.method_41588(preset.wrapperContained); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.WorldPreset preset) { return wrapperContained.validate(preset.wrapperContained); }
// public static com.mojang.serialization.DataResult validate(yarnwrap.world.gen.WorldPreset preset, ) { return net.minecraft.world.gen.WorldPreset.validate(preset.wrapperContained); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDimensionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.createDimensionsRegistryHolder()); }
// public static yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDimensionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(net.minecraft.world.gen.WorldPreset.createDimensionsRegistryHolder()); }
// public void method_57015(Object dimensionKey) { wrapperContained.method_57015(dimensionKey); }
// public static void method_57015(Object dimensionKey, ) { net.minecraft.world.gen.WorldPreset.method_57015(dimensionKey); }
// public com.google.common.collect.ImmutableMap collectDimensions() { return wrapperContained.collectDimensions(); }
// public static com.google.common.collect.ImmutableMap collectDimensions() { return net.minecraft.world.gen.WorldPreset.collectDimensions(); }

}