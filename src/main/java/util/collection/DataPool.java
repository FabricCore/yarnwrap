package yarnwrap.util.collection;
public class DataPool { public net.minecraft.util.collection.DataPool wrapperContained; public DataPool(net.minecraft.util.collection.DataPool wrapperContained) { this.wrapperContained = wrapperContained; }

public Object builder() { return wrapperContained.builder(); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec dataCodec) { return wrapperContained.createCodec(dataCodec); }
public java.util.Optional getDataOrEmpty(yarnwrap.util.math.random.Random random) { return wrapperContained.getDataOrEmpty(random.wrapperContained); }
public yarnwrap.util.collection.DataPool of(java.lang.Object object) { return new yarnwrap.util.collection.DataPool(wrapperContained.of(object)); }
// // public yarnwrap.util.collection.DataPool empty() { return new yarnwrap.util.collection.DataPool(wrapperContained.empty()); }
public com.mojang.serialization.Codec createEmptyAllowedCodec(com.mojang.serialization.Codec dataCodec) { return wrapperContained.createEmptyAllowedCodec(dataCodec); }

}