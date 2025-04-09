package yarnwrap.block;
public class SculkCatalystBlock { public net.minecraft.block.SculkCatalystBlock wrapperContained; public SculkCatalystBlock(net.minecraft.block.SculkCatalystBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty BLOOM() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.BLOOM); }
// public yarnwrap.util.math.intprovider.IntProvider experience() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.experience); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}