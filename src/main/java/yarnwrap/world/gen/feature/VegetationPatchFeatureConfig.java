package yarnwrap.world.gen.feature;
public class VegetationPatchFeatureConfig { public net.minecraft.world.gen.feature.VegetationPatchFeatureConfig wrapperContained; public VegetationPatchFeatureConfig(net.minecraft.world.gen.feature.VegetationPatchFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.registry.tag.TagKey replaceable() { return new yarnwrap.registry.tag.TagKey(wrapperContained.replaceable); }
// public void replaceable(yarnwrap.registry.tag.TagKey value) { wrapperContained.replaceable = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider groundState() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.groundState); }
// public void groundState(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.groundState = value.wrapperContained; }
public yarnwrap.registry.entry.RegistryEntry vegetationFeature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.vegetationFeature); }
// public void vegetationFeature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.vegetationFeature = value.wrapperContained; }
public yarnwrap.util.math.VerticalSurfaceType surface() { return new yarnwrap.util.math.VerticalSurfaceType(wrapperContained.surface); }
// public void surface(yarnwrap.util.math.VerticalSurfaceType value) { wrapperContained.surface = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider depth() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.depth); }
// public void depth(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.depth = value.wrapperContained; }
public float extraBottomBlockChance() { return wrapperContained.extraBottomBlockChance; }
// public void extraBottomBlockChance(float value) { wrapperContained.extraBottomBlockChance = value; }
public int verticalRange() { return wrapperContained.verticalRange; }
// public void verticalRange(int value) { wrapperContained.verticalRange = value; }
public float vegetationChance() { return wrapperContained.vegetationChance; }
// public void vegetationChance(float value) { wrapperContained.vegetationChance = value; }
public yarnwrap.util.math.intprovider.IntProvider horizontalRadius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.horizontalRadius); }
// public void horizontalRadius(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.horizontalRadius = value.wrapperContained; }
public float extraEdgeColumnChance() { return wrapperContained.extraEdgeColumnChance; }
// public void extraEdgeColumnChance(float value) { wrapperContained.extraEdgeColumnChance = value; }

}