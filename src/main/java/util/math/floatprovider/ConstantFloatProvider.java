package yarnwrap.util.math.floatprovider;
public class ConstantFloatProvider { public net.minecraft.util.math.floatprovider.ConstantFloatProvider wrapperContained; public ConstantFloatProvider(net.minecraft.util.math.floatprovider.ConstantFloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.floatprovider.ConstantFloatProvider ZERO() { return new yarnwrap.util.math.floatprovider.ConstantFloatProvider(wrapperContained.ZERO); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float value() { return wrapperContained.value; }
public yarnwrap.util.math.floatprovider.ConstantFloatProvider create(float value) { return new yarnwrap.util.math.floatprovider.ConstantFloatProvider(wrapperContained.create(value)); }
public float getValue() { return wrapperContained.getValue(); }

}