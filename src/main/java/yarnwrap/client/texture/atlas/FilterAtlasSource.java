package yarnwrap.client.texture.atlas;
public class FilterAtlasSource { public net.minecraft.client.texture.atlas.FilterAtlasSource wrapperContained; public FilterAtlasSource(net.minecraft.client.texture.atlas.FilterAtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.texture.atlas.FilterAtlasSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.texture.atlas.FilterAtlasSource.CODEC = value; }

// public yarnwrap.resource.metadata.BlockEntry pattern() { return new yarnwrap.resource.metadata.BlockEntry(wrapperContained.pattern); }
// public void pattern(yarnwrap.resource.metadata.BlockEntry value) { wrapperContained.pattern = value.wrapperContained; }
// public static yarnwrap.resource.metadata.BlockEntry pattern() { return new yarnwrap.resource.metadata.BlockEntry(net.minecraft.client.texture.atlas.FilterAtlasSource.pattern); }
// public static void pattern(yarnwrap.resource.metadata.BlockEntry value, ) { net.minecraft.client.texture.atlas.FilterAtlasSource.pattern = value.wrapperContained; }

public FilterAtlasSource(yarnwrap.resource.metadata.BlockEntry pattern) { this.wrapperContained = new net.minecraft.client.texture.atlas.FilterAtlasSource(pattern.wrapperContained); }

}