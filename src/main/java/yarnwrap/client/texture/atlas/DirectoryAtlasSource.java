package yarnwrap.client.texture.atlas;
public class DirectoryAtlasSource { public net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained; public DirectoryAtlasSource(net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.texture.atlas.DirectoryAtlasSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.texture.atlas.DirectoryAtlasSource.CODEC = value; }

public DirectoryAtlasSource(java.lang.String source,java.lang.String prefix) { this.wrapperContained = new net.minecraft.client.texture.atlas.DirectoryAtlasSource(source,prefix); }
// public void method_47683(yarnwrap.resource.ResourceFinder id,Object resource) { wrapperContained.method_47683(id.wrapperContained,resource); }
// public static void method_47683(yarnwrap.resource.ResourceFinder id,Object resource, ) { net.minecraft.client.texture.atlas.DirectoryAtlasSource.method_47683(id.wrapperContained,resource); }
// public com.mojang.datafixers.kinds.App method_47684(Object instance) { return wrapperContained.method_47684(instance); }
// public static com.mojang.datafixers.kinds.App method_47684(Object instance, ) { return net.minecraft.client.texture.atlas.DirectoryAtlasSource.method_47684(instance); }

}