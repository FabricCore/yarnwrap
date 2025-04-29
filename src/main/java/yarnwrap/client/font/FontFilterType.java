package yarnwrap.client.font;
public class FontFilterType { public net.minecraft.client.font.FontFilterType wrapperContained; public FontFilterType(net.minecraft.client.font.FontFilterType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.font.FontFilterType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.font.FontFilterType.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.client.font.FontFilterType.id; }
// public static void id(java.lang.String value, ) { net.minecraft.client.font.FontFilterType.id = value; }

// public FontFilterType(java.lang.String id) { this.wrapperContained = new net.minecraft.client.font.FontFilterType(id); }

}