package yarnwrap.client.font;
public class FontType { public net.minecraft.client.font.FontType wrapperContained; public FontType(net.minecraft.client.font.FontType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.MapCodec loaderCodec() { return wrapperContained.loaderCodec; }
// public void loaderCodec(com.mojang.serialization.MapCodec value) { wrapperContained.loaderCodec = value; }
public com.mojang.serialization.MapCodec getLoaderCodec() { return wrapperContained.getLoaderCodec(); }

}