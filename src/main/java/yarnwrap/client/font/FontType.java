package yarnwrap.client.font;
public class FontType { public net.minecraft.client.font.FontType wrapperContained; public FontType(net.minecraft.client.font.FontType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.client.font.FontType.id; }
// public static void id(java.lang.String value, ) { net.minecraft.client.font.FontType.id = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.font.FontType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.font.FontType.CODEC = value; }

// public com.mojang.serialization.MapCodec loaderCodec() { return wrapperContained.loaderCodec; }
// public void loaderCodec(com.mojang.serialization.MapCodec value) { wrapperContained.loaderCodec = value; }
// public static com.mojang.serialization.MapCodec loaderCodec() { return net.minecraft.client.font.FontType.loaderCodec; }
// public static void loaderCodec(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.font.FontType.loaderCodec = value; }

// // public FontType(java.lang.String id,int loaderCodec) { this.wrapperContained = new net.minecraft.client.font.FontType(id,loaderCodec); }
public com.mojang.serialization.MapCodec getLoaderCodec() { return wrapperContained.getLoaderCodec(); }
// public static com.mojang.serialization.MapCodec getLoaderCodec() { return net.minecraft.client.font.FontType.getLoaderCodec(); }

}