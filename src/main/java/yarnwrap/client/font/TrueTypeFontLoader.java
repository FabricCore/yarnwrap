package yarnwrap.client.font;
public class TrueTypeFontLoader { public net.minecraft.client.font.TrueTypeFontLoader wrapperContained; public TrueTypeFontLoader(net.minecraft.client.font.TrueTypeFontLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.font.TrueTypeFontLoader.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.font.TrueTypeFontLoader.CODEC = value; }

// public com.mojang.serialization.Codec SKIP_CODEC() { return wrapperContained.SKIP_CODEC; }
// public void SKIP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SKIP_CODEC = value; }
// public static com.mojang.serialization.Codec SKIP_CODEC() { return net.minecraft.client.font.TrueTypeFontLoader.SKIP_CODEC; }
// public static void SKIP_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.font.TrueTypeFontLoader.SKIP_CODEC = value; }

// public yarnwrap.client.font.Font load(yarnwrap.resource.ResourceManager resourceManager) { return new yarnwrap.client.font.Font(wrapperContained.load(resourceManager.wrapperContained)); }
// public static yarnwrap.client.font.Font load(yarnwrap.resource.ResourceManager resourceManager, ) { return new yarnwrap.client.font.Font(net.minecraft.client.font.TrueTypeFontLoader.load(resourceManager.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_51761(Object instance) { return wrapperContained.method_51761(instance); }
// public static com.mojang.datafixers.kinds.App method_51761(Object instance, ) { return net.minecraft.client.font.TrueTypeFontLoader.method_51761(instance); }
// public java.lang.String method_52730(java.util.List chars) { return wrapperContained.method_52730(chars); }
// public static java.lang.String method_52730(java.util.List chars, ) { return net.minecraft.client.font.TrueTypeFontLoader.method_52730(chars); }

}