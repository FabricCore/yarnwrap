package yarnwrap.client.font;
public class FontLoader { public net.minecraft.client.font.FontLoader wrapperContained; public FontLoader(net.minecraft.client.font.FontLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.font.FontLoader.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.font.FontLoader.CODEC = value; }

public yarnwrap.client.font.FontType getType() { return new yarnwrap.client.font.FontType(wrapperContained.getType()); }
// public static yarnwrap.client.font.FontType getType() { return new yarnwrap.client.font.FontType(net.minecraft.client.font.FontLoader.getType()); }
public com.mojang.datafixers.util.Either build() { return wrapperContained.build(); }
// public static com.mojang.datafixers.util.Either build() { return net.minecraft.client.font.FontLoader.build(); }

}