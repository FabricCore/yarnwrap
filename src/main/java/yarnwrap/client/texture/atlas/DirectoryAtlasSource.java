package yarnwrap.client.texture.atlas;
public class DirectoryAtlasSource { public net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained; public DirectoryAtlasSource(net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.lang.String source() { return wrapperContained.source; }
// public void source(java.lang.String value) { wrapperContained.source = value; }
// public java.lang.String prefix() { return wrapperContained.prefix; }
// public void prefix(java.lang.String value) { wrapperContained.prefix = value; }

}