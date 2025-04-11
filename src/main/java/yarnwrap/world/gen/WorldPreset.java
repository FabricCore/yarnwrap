package yarnwrap.world.gen;
public class WorldPreset { public net.minecraft.world.gen.WorldPreset wrapperContained; public WorldPreset(net.minecraft.world.gen.WorldPreset wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
// public java.util.Map dimensions() { return wrapperContained.dimensions; }
// public void dimensions(java.util.Map value) { wrapperContained.dimensions = value; }
public java.util.Optional getOverworld() { return wrapperContained.getOverworld(); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.WorldPreset preset) { return wrapperContained.validate(preset.wrapperContained); }
public yarnwrap.world.dimension.DimensionOptionsRegistryHolder createDimensionsRegistryHolder() { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.createDimensionsRegistryHolder()); }
// public com.google.common.collect.ImmutableMap collectDimensions() { return wrapperContained.collectDimensions(); }

}