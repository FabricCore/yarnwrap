package yarnwrap.client.font;
public class TrueTypeFontLoader { public net.minecraft.client.font.TrueTypeFontLoader wrapperContained; public TrueTypeFontLoader(net.minecraft.client.font.TrueTypeFontLoader wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec SKIP_CODEC() { return wrapperContained.SKIP_CODEC; }
// public yarnwrap.client.font.Font load(yarnwrap.resource.ResourceManager resourceManager) { return new yarnwrap.client.font.Font(wrapperContained.load(resourceManager.wrapperContained)); }

}