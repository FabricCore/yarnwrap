package yarnwrap.client.texture.atlas;
public class FilterAtlasSource { public net.minecraft.client.texture.atlas.FilterAtlasSource wrapperContained; public FilterAtlasSource(net.minecraft.client.texture.atlas.FilterAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.resource.metadata.BlockEntry pattern() { return new yarnwrap.resource.metadata.BlockEntry(wrapperContained.pattern); }

}