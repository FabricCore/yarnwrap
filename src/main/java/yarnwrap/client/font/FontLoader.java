package yarnwrap.client.font;
public class FontLoader { public net.minecraft.client.font.FontLoader wrapperContained; public FontLoader(net.minecraft.client.font.FontLoader wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.client.font.FontType getType() { return new yarnwrap.client.font.FontType(wrapperContained.getType()); }
public com.mojang.datafixers.util.Either build() { return wrapperContained.build(); }

}