package yarnwrap.util.dynamic;
public class CodecCache { public net.minecraft.util.dynamic.CodecCache wrapperContained; public CodecCache(net.minecraft.util.dynamic.CodecCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.cache.LoadingCache cache() { return wrapperContained.cache; }
public com.mojang.serialization.Codec wrap(com.mojang.serialization.Codec codec) { return wrapperContained.wrap(codec); }

}