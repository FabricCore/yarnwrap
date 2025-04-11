package yarnwrap.client.texture.atlas;
public class AtlasSourceManager { public net.minecraft.client.texture.atlas.AtlasSourceManager wrapperContained; public AtlasSourceManager(net.minecraft.client.texture.atlas.AtlasSourceManager wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
// public com.google.common.collect.BiMap SOURCE_TYPE_BY_ID() { return wrapperContained.SOURCE_TYPE_BY_ID; }
// public void SOURCE_TYPE_BY_ID(com.google.common.collect.BiMap value) { wrapperContained.SOURCE_TYPE_BY_ID = value; }
// public yarnwrap.client.texture.atlas.AtlasSourceType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.client.texture.atlas.AtlasSourceType(wrapperContained.register(id,codec)); }

}