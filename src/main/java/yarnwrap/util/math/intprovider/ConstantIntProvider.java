package yarnwrap.util.math.intprovider;
public class ConstantIntProvider { public net.minecraft.util.math.intprovider.ConstantIntProvider wrapperContained; public ConstantIntProvider(net.minecraft.util.math.intprovider.ConstantIntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.ConstantIntProvider ZERO() { return new yarnwrap.util.math.intprovider.ConstantIntProvider(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.util.math.intprovider.ConstantIntProvider value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.util.math.intprovider.ConstantIntProvider ZERO() { return new yarnwrap.util.math.intprovider.ConstantIntProvider(net.minecraft.util.math.intprovider.ConstantIntProvider.ZERO); }
// public static void ZERO(yarnwrap.util.math.intprovider.ConstantIntProvider value, ) { net.minecraft.util.math.intprovider.ConstantIntProvider.ZERO = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.util.math.intprovider.ConstantIntProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.util.math.intprovider.ConstantIntProvider.CODEC = value; }

// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
// public static int value() { return net.minecraft.util.math.intprovider.ConstantIntProvider.value; }
// public static void value(int value, ) { net.minecraft.util.math.intprovider.ConstantIntProvider.value = value; }

// public ConstantIntProvider(int value) { this.wrapperContained = new net.minecraft.util.math.intprovider.ConstantIntProvider(value); }
public int getValue() { return wrapperContained.getValue(); }
// public static int getValue() { return net.minecraft.util.math.intprovider.ConstantIntProvider.getValue(); }
// public yarnwrap.util.math.intprovider.ConstantIntProvider create(int value) { return new yarnwrap.util.math.intprovider.ConstantIntProvider(wrapperContained.create(value)); }
// public static yarnwrap.util.math.intprovider.ConstantIntProvider create(int value, ) { return new yarnwrap.util.math.intprovider.ConstantIntProvider(net.minecraft.util.math.intprovider.ConstantIntProvider.create(value)); }

}