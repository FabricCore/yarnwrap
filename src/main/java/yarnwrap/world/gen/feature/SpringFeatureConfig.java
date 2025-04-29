package yarnwrap.world.gen.feature;
public class SpringFeatureConfig { public net.minecraft.world.gen.feature.SpringFeatureConfig wrapperContained; public SpringFeatureConfig(net.minecraft.world.gen.feature.SpringFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.fluid.FluidState state() { return new yarnwrap.fluid.FluidState(wrapperContained.state); }
// public void state(yarnwrap.fluid.FluidState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.fluid.FluidState state() { return new yarnwrap.fluid.FluidState(net.minecraft.world.gen.feature.SpringFeatureConfig.state); }
// public static void state(yarnwrap.fluid.FluidState value, ) { net.minecraft.world.gen.feature.SpringFeatureConfig.state = value.wrapperContained; }

public boolean requiresBlockBelow() { return wrapperContained.requiresBlockBelow; }
// public void requiresBlockBelow(boolean value) { wrapperContained.requiresBlockBelow = value; }
// public static boolean requiresBlockBelow() { return net.minecraft.world.gen.feature.SpringFeatureConfig.requiresBlockBelow; }
// public static void requiresBlockBelow(boolean value, ) { net.minecraft.world.gen.feature.SpringFeatureConfig.requiresBlockBelow = value; }

public int rockCount() { return wrapperContained.rockCount; }
// public void rockCount(int value) { wrapperContained.rockCount = value; }
// public static int rockCount() { return net.minecraft.world.gen.feature.SpringFeatureConfig.rockCount; }
// public static void rockCount(int value, ) { net.minecraft.world.gen.feature.SpringFeatureConfig.rockCount = value; }

public int holeCount() { return wrapperContained.holeCount; }
// public void holeCount(int value) { wrapperContained.holeCount = value; }
// public static int holeCount() { return net.minecraft.world.gen.feature.SpringFeatureConfig.holeCount; }
// public static void holeCount(int value, ) { net.minecraft.world.gen.feature.SpringFeatureConfig.holeCount = value; }

public yarnwrap.registry.entry.RegistryEntryList validBlocks() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.validBlocks); }
// public void validBlocks(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.validBlocks = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryList validBlocks() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.feature.SpringFeatureConfig.validBlocks); }
// public static void validBlocks(yarnwrap.registry.entry.RegistryEntryList value, ) { net.minecraft.world.gen.feature.SpringFeatureConfig.validBlocks = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.SpringFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.SpringFeatureConfig.CODEC = value; }

public SpringFeatureConfig(yarnwrap.fluid.FluidState state,boolean requiresBlockBelow,int rockCount,int holeCount,yarnwrap.registry.entry.RegistryEntryList validBlocks) { this.wrapperContained = new net.minecraft.world.gen.feature.SpringFeatureConfig(state.wrapperContained,requiresBlockBelow,rockCount,holeCount,validBlocks.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntryList method_28793(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_28793(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_28793(yarnwrap.world.gen.feature.SpringFeatureConfig config, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.feature.SpringFeatureConfig.method_28793(config.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_28794(Object instance) { return wrapperContained.method_28794(instance); }
// public static com.mojang.datafixers.kinds.App method_28794(Object instance, ) { return net.minecraft.world.gen.feature.SpringFeatureConfig.method_28794(instance); }
// public java.lang.Integer method_28795(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return wrapperContained.method_28795(config.wrapperContained); }
// public static java.lang.Integer method_28795(yarnwrap.world.gen.feature.SpringFeatureConfig config, ) { return net.minecraft.world.gen.feature.SpringFeatureConfig.method_28795(config.wrapperContained); }
// public java.lang.Integer method_28796(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return wrapperContained.method_28796(config.wrapperContained); }
// public static java.lang.Integer method_28796(yarnwrap.world.gen.feature.SpringFeatureConfig config, ) { return net.minecraft.world.gen.feature.SpringFeatureConfig.method_28796(config.wrapperContained); }
// public java.lang.Boolean method_28797(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return wrapperContained.method_28797(config.wrapperContained); }
// public static java.lang.Boolean method_28797(yarnwrap.world.gen.feature.SpringFeatureConfig config, ) { return net.minecraft.world.gen.feature.SpringFeatureConfig.method_28797(config.wrapperContained); }
// public yarnwrap.fluid.FluidState method_28798(yarnwrap.world.gen.feature.SpringFeatureConfig config) { return new yarnwrap.fluid.FluidState(wrapperContained.method_28798(config.wrapperContained)); }
// public static yarnwrap.fluid.FluidState method_28798(yarnwrap.world.gen.feature.SpringFeatureConfig config, ) { return new yarnwrap.fluid.FluidState(net.minecraft.world.gen.feature.SpringFeatureConfig.method_28798(config.wrapperContained)); }

}