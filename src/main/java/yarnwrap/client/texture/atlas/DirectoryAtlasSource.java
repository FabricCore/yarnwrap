package yarnwrap.client.texture.atlas;
public class DirectoryAtlasSource { public net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained; public DirectoryAtlasSource(net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.texture.atlas.DirectoryAtlasSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.texture.atlas.DirectoryAtlasSource.CODEC = value; }

// public java.lang.String source() { return wrapperContained.source; }
// public void source(java.lang.String value) { wrapperContained.source = value; }
// public static java.lang.String source() { return net.minecraft.client.texture.atlas.DirectoryAtlasSource.source; }
// public static void source(java.lang.String value, ) { net.minecraft.client.texture.atlas.DirectoryAtlasSource.source = value; }

// public java.lang.String prefix() { return wrapperContained.prefix; }
// public void prefix(java.lang.String value) { wrapperContained.prefix = value; }
// public static java.lang.String prefix() { return net.minecraft.client.texture.atlas.DirectoryAtlasSource.prefix; }
// public static void prefix(java.lang.String value, ) { net.minecraft.client.texture.atlas.DirectoryAtlasSource.prefix = value; }

public DirectoryAtlasSource(java.lang.String source,java.lang.String prefix) { this.wrapperContained = new net.minecraft.client.texture.atlas.DirectoryAtlasSource(source,prefix); }
// public void method_47683(yarnwrap.resource.ResourceFinder resource) { wrapperContained.method_47683(resource.wrapperContained); }
// public static void method_47683(yarnwrap.resource.ResourceFinder resource, ) { net.minecraft.client.texture.atlas.DirectoryAtlasSource.method_47683(resource.wrapperContained); }

}