package yarnwrap.util.dynamic;
public class CodecCache { public net.minecraft.util.dynamic.CodecCache wrapperContained; public CodecCache(net.minecraft.util.dynamic.CodecCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.cache.LoadingCache cache() { return wrapperContained.cache; }
// public void cache(com.google.common.cache.LoadingCache value) { wrapperContained.cache = value; }
// public static com.google.common.cache.LoadingCache cache() { return net.minecraft.util.dynamic.CodecCache.cache; }
// public static void cache(com.google.common.cache.LoadingCache value, ) { net.minecraft.util.dynamic.CodecCache.cache = value; }

public CodecCache(int size) { this.wrapperContained = new net.minecraft.util.dynamic.CodecCache(size); }
public com.mojang.serialization.Codec wrap(com.mojang.serialization.Codec codec) { return wrapperContained.wrap(codec); }
// public static com.mojang.serialization.Codec wrap(com.mojang.serialization.Codec codec, ) { return net.minecraft.util.dynamic.CodecCache.wrap(codec); }

}