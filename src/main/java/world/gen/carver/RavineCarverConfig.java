package yarnwrap.world.gen.carver;
public class RavineCarverConfig { public net.minecraft.world.gen.carver.RavineCarverConfig wrapperContained; public RavineCarverConfig(net.minecraft.world.gen.carver.RavineCarverConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec RAVINE_CODEC() { return wrapperContained.RAVINE_CODEC; }
public yarnwrap.util.math.floatprovider.FloatProvider verticalRotation() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.verticalRotation); }
public Object shape() { return wrapperContained.shape; }

}