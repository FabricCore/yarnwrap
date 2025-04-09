package yarnwrap.util.math.floatprovider;
public class TrapezoidFloatProvider { public net.minecraft.util.math.floatprovider.TrapezoidFloatProvider wrapperContained; public TrapezoidFloatProvider(net.minecraft.util.math.floatprovider.TrapezoidFloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float min() { return wrapperContained.min; }
// public float max() { return wrapperContained.max; }
// public float plateau() { return wrapperContained.plateau; }
public yarnwrap.util.math.floatprovider.TrapezoidFloatProvider create(float min,float max,float plateau) { return new yarnwrap.util.math.floatprovider.TrapezoidFloatProvider(wrapperContained.create(min,max,plateau)); }

}