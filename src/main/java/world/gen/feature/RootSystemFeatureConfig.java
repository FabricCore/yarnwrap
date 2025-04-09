package yarnwrap.world.gen.feature;
public class RootSystemFeatureConfig { public net.minecraft.world.gen.feature.RootSystemFeatureConfig wrapperContained; public RootSystemFeatureConfig(net.minecraft.world.gen.feature.RootSystemFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
public int requiredVerticalSpaceForTree() { return wrapperContained.requiredVerticalSpaceForTree; }
public int rootRadius() { return wrapperContained.rootRadius; }
public yarnwrap.registry.tag.TagKey rootReplaceable() { return new yarnwrap.registry.tag.TagKey(wrapperContained.rootReplaceable); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider rootStateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.rootStateProvider); }
public int rootPlacementAttempts() { return wrapperContained.rootPlacementAttempts; }
public int maxRootColumnHeight() { return wrapperContained.maxRootColumnHeight; }
public int hangingRootRadius() { return wrapperContained.hangingRootRadius; }
public int hangingRootVerticalSpan() { return wrapperContained.hangingRootVerticalSpan; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider hangingRootStateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.hangingRootStateProvider); }
public int hangingRootPlacementAttempts() { return wrapperContained.hangingRootPlacementAttempts; }
public int allowedVerticalWaterForTree() { return wrapperContained.allowedVerticalWaterForTree; }
public yarnwrap.world.gen.blockpredicate.BlockPredicate predicate() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.predicate); }

}