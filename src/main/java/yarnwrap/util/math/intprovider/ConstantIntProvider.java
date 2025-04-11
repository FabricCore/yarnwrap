package yarnwrap.util.math.intprovider;
public class ConstantIntProvider { public net.minecraft.util.math.intprovider.ConstantIntProvider wrapperContained; public ConstantIntProvider(net.minecraft.util.math.intprovider.ConstantIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.intprovider.ConstantIntProvider ZERO() { return new yarnwrap.util.math.intprovider.ConstantIntProvider(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.util.math.intprovider.ConstantIntProvider value) { wrapperContained.ZERO = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
public int getValue() { return wrapperContained.getValue(); }
public yarnwrap.util.math.intprovider.ConstantIntProvider create(int value) { return new yarnwrap.util.math.intprovider.ConstantIntProvider(wrapperContained.create(value)); }

}