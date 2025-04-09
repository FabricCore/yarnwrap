package yarnwrap.world.gen.feature;
public class DeltaFeatureConfig { public net.minecraft.world.gen.feature.DeltaFeatureConfig wrapperContained; public DeltaFeatureConfig(net.minecraft.world.gen.feature.DeltaFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState contents() { return new yarnwrap.block.BlockState(wrapperContained.contents); }
// public yarnwrap.block.BlockState rim() { return new yarnwrap.block.BlockState(wrapperContained.rim); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.intprovider.IntProvider size() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.size); }
// public yarnwrap.util.math.intprovider.IntProvider rimSize() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.rimSize); }
public yarnwrap.block.BlockState getContents() { return new yarnwrap.block.BlockState(wrapperContained.getContents()); }
public yarnwrap.block.BlockState getRim() { return new yarnwrap.block.BlockState(wrapperContained.getRim()); }
public yarnwrap.util.math.intprovider.IntProvider getSize() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getSize()); }
public yarnwrap.util.math.intprovider.IntProvider getRimSize() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getRimSize()); }

}