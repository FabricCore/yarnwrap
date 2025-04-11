package yarnwrap.util.math.intprovider;
public class IntProvider { public net.minecraft.util.math.intprovider.IntProvider wrapperContained; public IntProvider(net.minecraft.util.math.intprovider.IntProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec INT_CODEC() { return wrapperContained.INT_CODEC; }
// public void INT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INT_CODEC = value; }
public com.mojang.serialization.Codec VALUE_CODEC() { return wrapperContained.VALUE_CODEC; }
// public void VALUE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VALUE_CODEC = value; }
public com.mojang.serialization.Codec NON_NEGATIVE_CODEC() { return wrapperContained.NON_NEGATIVE_CODEC; }
// public void NON_NEGATIVE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.NON_NEGATIVE_CODEC = value; }
public com.mojang.serialization.Codec POSITIVE_CODEC() { return wrapperContained.POSITIVE_CODEC; }
// public void POSITIVE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.POSITIVE_CODEC = value; }
public com.mojang.serialization.Codec createValidatingCodec(int min,int max) { return wrapperContained.createValidatingCodec(min,max); }
public int get(yarnwrap.util.math.random.Random random) { return wrapperContained.get(random.wrapperContained); }
public int getMin() { return wrapperContained.getMin(); }
public int getMax() { return wrapperContained.getMax(); }
public yarnwrap.util.math.intprovider.IntProviderType getType() { return new yarnwrap.util.math.intprovider.IntProviderType(wrapperContained.getType()); }
public com.mojang.serialization.Codec createValidatingCodec(int min,int max,com.mojang.serialization.Codec providerCodec) { return wrapperContained.createValidatingCodec(min,max,providerCodec); }

}