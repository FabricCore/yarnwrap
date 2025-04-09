package yarnwrap.client.texture.atlas;
public class DirectoryAtlasSource { public net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained; public DirectoryAtlasSource(net.minecraft.client.texture.atlas.DirectoryAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String source() { return wrapperContained.source; }
// public java.lang.String prefix() { return wrapperContained.prefix; }

}