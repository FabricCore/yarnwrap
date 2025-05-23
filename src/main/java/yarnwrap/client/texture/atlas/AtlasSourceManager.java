package yarnwrap.client.texture.atlas;
public class AtlasSourceManager { public net.minecraft.client.texture.atlas.AtlasSourceManager wrapperContained; public AtlasSourceManager(net.minecraft.client.texture.atlas.AtlasSourceManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.client.texture.atlas.AtlasSourceManager.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.texture.atlas.AtlasSourceManager.TYPE_CODEC = value; }

// public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
public static com.mojang.serialization.Codec LIST_CODEC() { return net.minecraft.client.texture.atlas.AtlasSourceManager.LIST_CODEC; }
// public static void LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.texture.atlas.AtlasSourceManager.LIST_CODEC = value; }

// public Object ID_MAPPER() { return wrapperContained.ID_MAPPER; }
// // public void ID_MAPPER(Object value) { wrapperContained.ID_MAPPER = value; }
// // public static Object ID_MAPPER() { return net.minecraft.client.texture.atlas.AtlasSourceManager.ID_MAPPER; }
// // public static void ID_MAPPER(Object value, ) { net.minecraft.client.texture.atlas.AtlasSourceManager.ID_MAPPER = value; }

// public void bootstrap() { wrapperContained.bootstrap(); }
public static void bootstrap() { net.minecraft.client.texture.atlas.AtlasSourceManager.bootstrap(); }
// public com.mojang.serialization.MapCodec method_67290(com.mojang.serialization.MapCodec codec) { return wrapperContained.method_67290(codec); }
// public static com.mojang.serialization.MapCodec method_67290(com.mojang.serialization.MapCodec codec, ) { return net.minecraft.client.texture.atlas.AtlasSourceManager.method_67290(codec); }

}