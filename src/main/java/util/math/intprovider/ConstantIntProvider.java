package yarnwrap.util.math.intprovider;
public class ConstantIntProvider { public net.minecraft.util.math.intprovider.ConstantIntProvider wrapperContained; public ConstantIntProvider(net.minecraft.util.math.intprovider.ConstantIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.intprovider.ConstantIntProvider ZERO() { return new yarnwrap.util.math.intprovider.ConstantIntProvider(wrapperContained.ZERO); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int value() { return wrapperContained.value; }
public int getValue() { return wrapperContained.getValue(); }
public yarnwrap.util.math.intprovider.ConstantIntProvider create(int value) { return new yarnwrap.util.math.intprovider.ConstantIntProvider(wrapperContained.create(value)); }

}