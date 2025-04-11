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
public SpringFeatureConfig(yarnwrap.fluid.FluidState state,boolean requiresBlockBelow,int rockCount,int holeCount,yarnwrap.registry.entry.RegistryEntryList validBlocks) { this.wrapperContained = new net.minecraft.world.gen.feature.SpringFeatureConfig(state.wrapperContained,requiresBlockBelow,rockCount,holeCount,validBlocks.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntryList method_28793(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_28793(config.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_28794(Object instance) { return wrapperContained.method_28794(instance); }
// public java.lang.Integer method_28795(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return wrapperContained.method_28795(config.wrapperContained); }
// public java.lang.Integer method_28796(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return wrapperContained.method_28796(config.wrapperContained); }
// public java.lang.Boolean method_28797(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return wrapperContained.method_28797(config.wrapperContained); }
// public yarnwrap.fluid.FluidState method_28798(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return new yarnwrap.fluid.FluidState(wrapperContained.method_28798(config.wrapperContained)); }

}