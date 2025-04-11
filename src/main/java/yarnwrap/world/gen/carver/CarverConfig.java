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

}