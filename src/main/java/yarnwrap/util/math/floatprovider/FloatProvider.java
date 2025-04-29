package yarnwrap.util.math.floatprovider;
public class FloatProvider { public net.minecraft.util.math.floatprovider.FloatProvider wrapperContained; public FloatProvider(net.minecraft.util.math.floatprovider.FloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec FLOAT_CODEC() { return wrapperContained.FLOAT_CODEC; }
// public void FLOAT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.FLOAT_CODEC = value; }
// public static com.mojang.serialization.Codec FLOAT_CODEC() { return net.minecraft.util.math.floatprovider.FloatProvider.FLOAT_CODEC; }
// public static void FLOAT_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.floatprovider.FloatProvider.FLOAT_CODEC = value; }

// public com.mojang.serialization.Codec VALUE_CODEC() { return wrapperContained.VALUE_CODEC; }
// public void VALUE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VALUE_CODEC = value; }
public static com.mojang.serialization.Codec VALUE_CODEC() { return net.minecraft.util.math.floatprovider.FloatProvider.VALUE_CODEC; }
// public static void VALUE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.floatprovider.FloatProvider.VALUE_CODEC = value; }

public float getMin() { return wrapperContained.getMin(); }
// public static float getMin() { return net.minecraft.util.math.floatprovider.FloatProvider.getMin(); }
// public com.mojang.serialization.Codec createValidatedCodec(float min,float max) { return wrapperContained.createValidatedCodec(min,max); }
// public static com.mojang.serialization.Codec createValidatedCodec(float min,float max, ) { return net.minecraft.util.math.floatprovider.FloatProvider.createValidatedCodec(min,max); }
// public com.mojang.serialization.DataResult method_33917(float provider) { return wrapperContained.method_33917(provider); }
// public static com.mojang.serialization.DataResult method_33917(float provider, ) { return net.minecraft.util.math.floatprovider.FloatProvider.method_33917(provider); }
// public com.mojang.datafixers.util.Either method_33918(yarnwrap.util.math.floatprovider.FloatProvider provider) { return wrapperContained.method_33918(provider.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_33918(yarnwrap.util.math.floatprovider.FloatProvider provider, ) { return net.minecraft.util.math.floatprovider.FloatProvider.method_33918(provider.wrapperContained); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33919(com.mojang.datafixers.util.Either either) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33919(either)); }
// public static yarnwrap.util.math.floatprovider.FloatProvider method_33919(com.mojang.datafixers.util.Either either, ) { return new yarnwrap.util.math.floatprovider.FloatProvider(net.minecraft.util.math.floatprovider.FloatProvider.method_33919(either)); }
public float getMax() { return wrapperContained.getMax(); }
// public static float getMax() { return net.minecraft.util.math.floatprovider.FloatProvider.getMax(); }
// public yarnwrap.util.math.floatprovider.FloatProvider method_33922(yarnwrap.util.math.floatprovider.FloatProvider provider) { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.method_33922(provider.wrapperContained)); }
// public static yarnwrap.util.math.floatprovider.FloatProvider method_33922(yarnwrap.util.math.floatprovider.FloatProvider provider, ) { return new yarnwrap.util.math.floatprovider.FloatProvider(net.minecraft.util.math.floatprovider.FloatProvider.method_33922(provider.wrapperContained)); }
public yarnwrap.util.math.floatprovider.FloatProviderType getType() { return new yarnwrap.util.math.floatprovider.FloatProviderType(wrapperContained.getType()); }
// public static yarnwrap.util.math.floatprovider.FloatProviderType getType() { return new yarnwrap.util.math.floatprovider.FloatProviderType(net.minecraft.util.math.floatprovider.FloatProvider.getType()); }

}