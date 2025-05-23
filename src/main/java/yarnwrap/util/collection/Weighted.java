package yarnwrap.util.collection;
public class Weighted { public net.minecraft.util.collection.Weighted wrapperContained; public Weighted(net.minecraft.util.collection.Weighted wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.collection.Weighted.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.collection.Weighted.LOGGER = value; }

public Weighted(java.lang.Object value,int weight) { this.wrapperContained = new net.minecraft.util.collection.Weighted(value,weight); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec dataCodec) { return wrapperContained.createCodec(dataCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec dataCodec, ) { return net.minecraft.util.collection.Weighted.createCodec(dataCodec); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.MapCodec dataCodec) { return wrapperContained.createCodec(dataCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.MapCodec dataCodec, ) { return net.minecraft.util.collection.Weighted.createCodec(dataCodec); }
// public com.mojang.datafixers.kinds.App method_66212(com.mojang.serialization.MapCodec instance) { return wrapperContained.method_66212(instance); }
// public static com.mojang.datafixers.kinds.App method_66212(com.mojang.serialization.MapCodec instance, ) { return net.minecraft.util.collection.Weighted.method_66212(instance); }
public yarnwrap.util.collection.Weighted transform(java.util.function.Function function) { return new yarnwrap.util.collection.Weighted(wrapperContained.transform(function)); }
// public static yarnwrap.util.collection.Weighted transform(java.util.function.Function function, ) { return new yarnwrap.util.collection.Weighted(net.minecraft.util.collection.Weighted.transform(function)); }

}