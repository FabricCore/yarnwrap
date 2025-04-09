package yarnwrap.world.gen.carver;
public class CarverConfig { public net.minecraft.world.gen.carver.CarverConfig wrapperContained; public CarverConfig(net.minecraft.world.gen.carver.CarverConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.carver.CarverDebugConfig debugConfig() { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.debugConfig); }
public com.mojang.serialization.MapCodec CONFIG_CODEC() { return wrapperContained.CONFIG_CODEC; }
public yarnwrap.world.gen.heightprovider.HeightProvider y() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.y); }
public yarnwrap.util.math.floatprovider.FloatProvider yScale() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.yScale); }
public yarnwrap.world.gen.YOffset lavaLevel() { return new yarnwrap.world.gen.YOffset(wrapperContained.lavaLevel); }
public yarnwrap.registry.entry.RegistryEntryList replaceable() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.replaceable); }

}