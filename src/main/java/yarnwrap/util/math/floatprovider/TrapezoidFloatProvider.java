package yarnwrap.util.math.floatprovider;
public class TrapezoidFloatProvider { public net.minecraft.util.math.floatprovider.TrapezoidFloatProvider wrapperContained; public TrapezoidFloatProvider(net.minecraft.util.math.floatprovider.TrapezoidFloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float min() { return wrapperContained.min; }
// public void min(float value) { wrapperContained.min = value; }
// public float max() { return wrapperContained.max; }
// public void max(float value) { wrapperContained.max = value; }
// public float plateau() { return wrapperContained.plateau; }
// public void plateau(float value) { wrapperContained.plateau = value; }
public yarnwrap.util.math.floatprovider.TrapezoidFloatProvider create(float min,float max,float plateau) { return new yarnwrap.util.math.floatprovider.TrapezoidFloatProvider(wrapperContained.create(min,max,plateau)); }

}