package yarnwrap.world.gen.feature;
public class VegetationPatchFeatureConfig { public net.minecraft.world.gen.feature.VegetationPatchFeatureConfig wrapperContained; public VegetationPatchFeatureConfig(net.minecraft.world.gen.feature.VegetationPatchFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.registry.tag.TagKey replaceable() { return new yarnwrap.registry.tag.TagKey(wrapperContained.replaceable); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider groundState() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.groundState); }
public yarnwrap.registry.entry.RegistryEntry vegetationFeature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.vegetationFeature); }
public yarnwrap.util.math.VerticalSurfaceType surface() { return new yarnwrap.util.math.VerticalSurfaceType(wrapperContained.surface); }
public yarnwrap.util.math.intprovider.IntProvider depth() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.depth); }
public float extraBottomBlockChance() { return wrapperContained.extraBottomBlockChance; }
public int verticalRange() { return wrapperContained.verticalRange; }
public float vegetationChance() { return wrapperContained.vegetationChance; }
public yarnwrap.util.math.intprovider.IntProvider horizontalRadius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.horizontalRadius); }
public float extraEdgeColumnChance() { return wrapperContained.extraEdgeColumnChance; }

}