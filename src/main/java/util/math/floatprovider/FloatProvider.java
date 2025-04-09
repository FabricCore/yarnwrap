package yarnwrap.util.math.floatprovider;
public class FloatProvider { public net.minecraft.util.math.floatprovider.FloatProvider wrapperContained; public FloatProvider(net.minecraft.util.math.floatprovider.FloatProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec FLOAT_CODEC() { return wrapperContained.FLOAT_CODEC; }
public com.mojang.serialization.Codec VALUE_CODEC() { return wrapperContained.VALUE_CODEC; }
public float getMin() { return wrapperContained.getMin(); }
public com.mojang.serialization.Codec createValidatedCodec(float min,float max) { return wrapperContained.createValidatedCodec(min,max); }
public float getMax() { return wrapperContained.getMax(); }
public yarnwrap.util.math.floatprovider.FloatProviderType getType() { return new yarnwrap.util.math.floatprovider.FloatProviderType(wrapperContained.getType()); }

}