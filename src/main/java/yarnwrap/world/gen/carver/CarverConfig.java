package yarnwrap.world.gen.carver;
public class CarverConfig { public net.minecraft.world.gen.carver.CarverConfig wrapperContained; public CarverConfig(net.minecraft.world.gen.carver.CarverConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.carver.CarverDebugConfig debugConfig() { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.debugConfig); }
// public void debugConfig(yarnwrap.world.gen.carver.CarverDebugConfig value) { wrapperContained.debugConfig = value.wrapperContained; }
public com.mojang.serialization.MapCodec CONFIG_CODEC() { return wrapperContained.CONFIG_CODEC; }
// public void CONFIG_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CONFIG_CODEC = value; }
public yarnwrap.world.gen.heightprovider.HeightProvider y() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.y); }
// public void y(yarnwrap.world.gen.heightprovider.HeightProvider value) { wrapperContained.y = value.wrapperContained; }
public yarnwrap.util.math.floatprovider.FloatProvider yScale() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.yScale); }
// public void yScale(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.yScale = value.wrapperContained; }
public yarnwrap.world.gen.YOffset lavaLevel() { return new yarnwrap.world.gen.YOffset(wrapperContained.lavaLevel); }
// public void lavaLevel(yarnwrap.world.gen.YOffset value) { wrapperContained.lavaLevel = value.wrapperContained; }
public yarnwrap.registry.entry.RegistryEntryList replaceable() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.replaceable); }
// public void replaceable(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.replaceable = value.wrapperContained; }
public CarverConfig(float probability,yarnwrap.world.gen.heightprovider.HeightProvider y,yarnwrap.util.math.floatprovider.FloatProvider yScale,yarnwrap.world.gen.YOffset lavaLevel,yarnwrap.world.gen.carver.CarverDebugConfig debugConfig,yarnwrap.registry.entry.RegistryEntryList replaceable) { this.wrapperContained = new net.minecraft.world.gen.carver.CarverConfig(probability,y.wrapperContained,yScale.wrapperContained,lavaLevel.wrapperContained,debugConfig.wrapperContained,replaceable.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_33968(Object instance) { return wrapperContained.method_33968(instance); }
// public yarnwrap.world.gen.YOffset method_35348(yarnwrap.world.gen.carver.CarverConfig config) { return new yarnwrap.world.gen.YOffset(wrapperContained.method_35348(config.wrapperContained)); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_35349(yarnwrap.world.gen.carver.CarverConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_35349(config.wrapperContained)); }
// public yarnwrap.world.gen.heightprovider.HeightProvider method_35350(yarnwrap.world.gen.carver.CarverConfig config) { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.method_35350(config.wrapperContained)); }
// public java.lang.Float method_35351(yarnwrap.world.gen.carver.CarverConfig config) { return wrapperContained.method_35351(config.wrapperContained); }
// public yarnwrap.world.gen.carver.CarverDebugConfig method_36411(yarnwrap.world.gen.carver.CarverConfig config) { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.method_36411(config.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntryList method_43292(yarnwrap.world.gen.carver.CarverConfig config) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_43292(config.wrapperContained)); }

}