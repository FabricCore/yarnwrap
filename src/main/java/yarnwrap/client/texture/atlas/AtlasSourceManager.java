package yarnwrap.client.texture.atlas;
public class AtlasSourceManager { public net.minecraft.client.texture.atlas.AtlasSourceManager wrapperContained; public AtlasSourceManager(net.minecraft.client.texture.atlas.AtlasSourceManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.texture.atlas.AtlasSourceManager.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.texture.atlas.AtlasSourceManager.CODEC = value; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.client.texture.atlas.AtlasSourceManager.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.texture.atlas.AtlasSourceManager.TYPE_CODEC = value; }

// public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
public static com.mojang.serialization.Codec LIST_CODEC() { return net.minecraft.client.texture.atlas.AtlasSourceManager.LIST_CODEC; }
// public static void LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.texture.atlas.AtlasSourceManager.LIST_CODEC = value; }

// public com.google.common.collect.BiMap SOURCE_TYPE_BY_ID() { return wrapperContained.SOURCE_TYPE_BY_ID; }
// public void SOURCE_TYPE_BY_ID(com.google.common.collect.BiMap value) { wrapperContained.SOURCE_TYPE_BY_ID = value; }
// public static com.google.common.collect.BiMap SOURCE_TYPE_BY_ID() { return net.minecraft.client.texture.atlas.AtlasSourceManager.SOURCE_TYPE_BY_ID; }
// public static void SOURCE_TYPE_BY_ID(com.google.common.collect.BiMap value, ) { net.minecraft.client.texture.atlas.AtlasSourceManager.SOURCE_TYPE_BY_ID = value; }

// public com.mojang.serialization.DataResult method_47677(yarnwrap.util.Identifier id) { return wrapperContained.method_47677(id.wrapperContained); }
// public static com.mojang.serialization.DataResult method_47677(yarnwrap.util.Identifier id, ) { return net.minecraft.client.texture.atlas.AtlasSourceManager.method_47677(id.wrapperContained); }
// public com.mojang.serialization.DataResult method_47679(yarnwrap.client.texture.atlas.AtlasSourceType type) { return wrapperContained.method_47679(type.wrapperContained); }
// public static com.mojang.serialization.DataResult method_47679(yarnwrap.client.texture.atlas.AtlasSourceType type, ) { return net.minecraft.client.texture.atlas.AtlasSourceManager.method_47679(type.wrapperContained); }
// public yarnwrap.client.texture.atlas.AtlasSourceType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.client.texture.atlas.AtlasSourceType(wrapperContained.register(id,codec)); }
// public static yarnwrap.client.texture.atlas.AtlasSourceType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.client.texture.atlas.AtlasSourceType(net.minecraft.client.texture.atlas.AtlasSourceManager.register(id,codec)); }

}