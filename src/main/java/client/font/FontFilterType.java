package yarnwrap.client.font;
public class FontFilterType { public net.minecraft.client.font.FontFilterType wrapperContained; public FontFilterType(net.minecraft.client.font.FontFilterType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String id() { return wrapperContained.id; }

}