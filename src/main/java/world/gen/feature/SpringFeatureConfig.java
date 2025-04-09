package yarnwrap.world.gen.feature;
public class SpringFeatureConfig { public net.minecraft.world.gen.feature.SpringFeatureConfig wrapperContained; public SpringFeatureConfig(net.minecraft.world.gen.feature.SpringFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.fluid.FluidState state() { return new yarnwrap.fluid.FluidState(wrapperContained.state); }
public boolean requiresBlockBelow() { return wrapperContained.requiresBlockBelow; }
public int rockCount() { return wrapperContained.rockCount; }
public int holeCount() { return wrapperContained.holeCount; }
public yarnwrap.registry.entry.RegistryEntryList validBlocks() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.validBlocks); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}