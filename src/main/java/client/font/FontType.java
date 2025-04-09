package yarnwrap.client.font;
public class FontType { public net.minecraft.client.font.FontType wrapperContained; public FontType(net.minecraft.client.font.FontType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.MapCodec loaderCodec() { return wrapperContained.loaderCodec; }
public com.mojang.serialization.MapCodec getLoaderCodec() { return wrapperContained.getLoaderCodec(); }

}