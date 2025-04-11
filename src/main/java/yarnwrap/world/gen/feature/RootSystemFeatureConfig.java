package yarnwrap.world.gen.feature;
public class RootSystemFeatureConfig { public net.minecraft.world.gen.feature.RootSystemFeatureConfig wrapperContained; public RootSystemFeatureConfig(net.minecraft.world.gen.feature.RootSystemFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
// public void feature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.feature = value.wrapperContained; }
public int requiredVerticalSpaceForTree() { return wrapperContained.requiredVerticalSpaceForTree; }
// public void requiredVerticalSpaceForTree(int value) { wrapperContained.requiredVerticalSpaceForTree = value; }
public int rootRadius() { return wrapperContained.rootRadius; }
// public void rootRadius(int value) { wrapperContained.rootRadius = value; }
public yarnwrap.registry.tag.TagKey rootReplaceable() { return new yarnwrap.registry.tag.TagKey(wrapperContained.rootReplaceable); }
// public void rootReplaceable(yarnwrap.registry.tag.TagKey value) { wrapperContained.rootReplaceable = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider rootStateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.rootStateProvider); }
// public void rootStateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.rootStateProvider = value.wrapperContained; }
public int rootPlacementAttempts() { return wrapperContained.rootPlacementAttempts; }
// public void rootPlacementAttempts(int value) { wrapperContained.rootPlacementAttempts = value; }
public int maxRootColumnHeight() { return wrapperContained.maxRootColumnHeight; }
// public void maxRootColumnHeight(int value) { wrapperContained.maxRootColumnHeight = value; }
public int hangingRootRadius() { return wrapperContained.hangingRootRadius; }
// public void hangingRootRadius(int value) { wrapperContained.hangingRootRadius = value; }
public int hangingRootVerticalSpan() { return wrapperContained.hangingRootVerticalSpan; }
// public void hangingRootVerticalSpan(int value) { wrapperContained.hangingRootVerticalSpan = value; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider hangingRootStateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.hangingRootStateProvider); }
// public void hangingRootStateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.hangingRootStateProvider = value.wrapperContained; }
public int hangingRootPlacementAttempts() { return wrapperContained.hangingRootPlacementAttempts; }
// public void hangingRootPlacementAttempts(int value) { wrapperContained.hangingRootPlacementAttempts = value; }
public int allowedVerticalWaterForTree() { return wrapperContained.allowedVerticalWaterForTree; }
// public void allowedVerticalWaterForTree(int value) { wrapperContained.allowedVerticalWaterForTree = value; }
public yarnwrap.world.gen.blockpredicate.BlockPredicate predicate() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.predicate); }
// public void predicate(yarnwrap.world.gen.blockpredicate.BlockPredicate value) { wrapperContained.predicate = value.wrapperContained; }

}