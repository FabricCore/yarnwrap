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
public RootSystemFeatureConfig(yarnwrap.registry.entry.RegistryEntry feature,int requiredVerticalSpaceForTree,int rootRadius,yarnwrap.registry.tag.TagKey rootReplaceable,yarnwrap.world.gen.stateprovider.BlockStateProvider rootStateProvider,int rootPlacementAttempts,int maxRootColumnHeight,int hangingRootRadius,int hangingRootVerticalSpan,yarnwrap.world.gen.stateprovider.BlockStateProvider hangingRootStateProvider,int hangingRootPlacementAttempts,int allowedVerticalWaterForTree,yarnwrap.world.gen.blockpredicate.BlockPredicate predicate) { this.wrapperContained = new net.minecraft.world.gen.feature.RootSystemFeatureConfig(feature.wrapperContained,requiredVerticalSpaceForTree,rootRadius,rootReplaceable.wrapperContained,rootStateProvider.wrapperContained,rootPlacementAttempts,maxRootColumnHeight,hangingRootRadius,hangingRootVerticalSpan,hangingRootStateProvider.wrapperContained,hangingRootPlacementAttempts,allowedVerticalWaterForTree,predicate.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_34332(Object instance) { return wrapperContained.method_34332(instance); }
// public java.lang.Integer method_34333(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_34333(config.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_34334(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_34334(config.wrapperContained)); }
// public java.lang.Integer method_34335(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_34335(config.wrapperContained); }
// public java.lang.Integer method_34336(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_34336(config.wrapperContained); }
// public java.lang.Integer method_34337(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_34337(config.wrapperContained); }
// public java.lang.Integer method_34338(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_34338(config.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_34339(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_34339(config.wrapperContained)); }
// public yarnwrap.registry.tag.TagKey method_34340(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_34340(config.wrapperContained)); }
// public java.lang.Integer method_34341(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_34341(config.wrapperContained); }
// public java.lang.Integer method_34342(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_34342(config.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_34343(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_34343(config.wrapperContained)); }
// public java.lang.Integer method_36421(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return wrapperContained.method_36421(config.wrapperContained); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate method_39919(yarnwrap.world.gen.feature.RootSystemFeatureConfig config) { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.method_39919(config.wrapperContained)); }

}