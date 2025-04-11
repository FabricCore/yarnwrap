package yarnwrap.world.gen.carver;
public class RavineCarverConfig { public net.minecraft.world.gen.carver.RavineCarverConfig wrapperContained; public RavineCarverConfig(net.minecraft.world.gen.carver.RavineCarverConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec RAVINE_CODEC() { return wrapperContained.RAVINE_CODEC; }
// public void RAVINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.RAVINE_CODEC = value; }
public yarnwrap.util.math.floatprovider.FloatProvider verticalRotation() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.verticalRotation); }
// public void verticalRotation(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.verticalRotation = value.wrapperContained; }
public Object shape() { return wrapperContained.shape; }
// // public void shape(Object value) { wrapperContained.shape = value; }
// public RavineCarverConfig(float probability,yarnwrap.world.gen.heightprovider.HeightProvider y,yarnwrap.util.math.floatprovider.FloatProvider yScale,yarnwrap.world.gen.YOffset lavaLevel,yarnwrap.world.gen.carver.CarverDebugConfig debugConfig,yarnwrap.registry.entry.RegistryEntryList replaceable,yarnwrap.util.math.floatprovider.FloatProvider verticalRotation,Object shape) { this.wrapperContained = new net.minecraft.world.gen.carver.RavineCarverConfig(probability,y.wrapperContained,yScale.wrapperContained,lavaLevel.wrapperContained,debugConfig.wrapperContained,replaceable.wrapperContained,verticalRotation.wrapperContained,shape); }
// public RavineCarverConfig(yarnwrap.world.gen.carver.CarverConfig config,yarnwrap.util.math.floatprovider.FloatProvider verticalRotation,Object shape) { this.wrapperContained = new net.minecraft.world.gen.carver.RavineCarverConfig(config.wrapperContained,verticalRotation.wrapperContained,shape); }
// public com.mojang.datafixers.kinds.App method_35336(Object instance) { return wrapperContained.method_35336(instance); }
// public Object method_35337(yarnwrap.world.gen.carver.RavineCarverConfig config) { return wrapperContained.method_35337(config.wrapperContained); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_35338(yarnwrap.world.gen.carver.RavineCarverConfig config) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_35338(config.wrapperContained)); }

}