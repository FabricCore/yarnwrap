package yarnwrap.world.gen.feature;
public class SpringFeatureConfig { public net.minecraft.world.gen.feature.SpringFeatureConfig wrapperContained; public SpringFeatureConfig(net.minecraft.world.gen.feature.SpringFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.fluid.FluidState state() { return new yarnwrap.fluid.FluidState(wrapperContained.state); }
// public void state(yarnwrap.fluid.FluidState value) { wrapperContained.state = value.wrapperContained; }
public boolean requiresBlockBelow() { return wrapperContained.requiresBlockBelow; }
// public void requiresBlockBelow(boolean value) { wrapperContained.requiresBlockBelow = value; }
public int rockCount() { return wrapperContained.rockCount; }
// public void rockCount(int value) { wrapperContained.rockCount = value; }
public int holeCount() { return wrapperContained.holeCount; }
// public void holeCount(int value) { wrapperContained.holeCount = value; }
public yarnwrap.registry.entry.RegistryEntryList validBlocks() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.validBlocks); }
// public void validBlocks(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.validBlocks = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}