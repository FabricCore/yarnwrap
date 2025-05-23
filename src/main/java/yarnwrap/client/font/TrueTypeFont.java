package yarnwrap.client.font;
public class TrueTypeFont { public net.minecraft.client.font.TrueTypeFont wrapperContained; public TrueTypeFont(net.minecraft.client.font.TrueTypeFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public float oversample() { return wrapperContained.oversample; }
// public void oversample(float value) { wrapperContained.oversample = value; }
// public static float oversample() { return net.minecraft.client.font.TrueTypeFont.oversample; }
// public static void oversample(float value, ) { net.minecraft.client.font.TrueTypeFont.oversample = value; }

// public java.nio.ByteBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(java.nio.ByteBuffer value) { wrapperContained.buffer = value; }
// public static java.nio.ByteBuffer buffer() { return net.minecraft.client.font.TrueTypeFont.buffer; }
// public static void buffer(java.nio.ByteBuffer value, ) { net.minecraft.client.font.TrueTypeFont.buffer = value; }

// public org.lwjgl.util.freetype.FT_Face face() { return wrapperContained.face; }
// public void face(org.lwjgl.util.freetype.FT_Face value) { wrapperContained.face = value; }
// public static org.lwjgl.util.freetype.FT_Face face() { return net.minecraft.client.font.TrueTypeFont.face; }
// public static void face(org.lwjgl.util.freetype.FT_Face value, ) { net.minecraft.client.font.TrueTypeFont.face = value; }

// public yarnwrap.client.font.GlyphContainer container() { return new yarnwrap.client.font.GlyphContainer(wrapperContained.container); }
// public void container(yarnwrap.client.font.GlyphContainer value) { wrapperContained.container = value.wrapperContained; }
// public static yarnwrap.client.font.GlyphContainer container() { return new yarnwrap.client.font.GlyphContainer(net.minecraft.client.font.TrueTypeFont.container); }
// public static void container(yarnwrap.client.font.GlyphContainer value, ) { net.minecraft.client.font.TrueTypeFont.container = value.wrapperContained; }

public TrueTypeFont(java.nio.ByteBuffer buffer,org.lwjgl.util.freetype.FT_Face face,float size,float oversample,float shiftX,float shiftY,java.lang.String excludedCharacters) { this.wrapperContained = new net.minecraft.client.font.TrueTypeFont(buffer,face,size,oversample,shiftX,shiftY,excludedCharacters); }
// public org.lwjgl.util.freetype.FT_Face getInfo() { return wrapperContained.getInfo(); }
// public static org.lwjgl.util.freetype.FT_Face getInfo() { return net.minecraft.client.font.TrueTypeFont.getInfo(); }
// public yarnwrap.client.font.Glyph getOrLoadGlyph(int codePoint,Object glyph) { return new yarnwrap.client.font.Glyph(wrapperContained.getOrLoadGlyph(codePoint,glyph)); }
// public static yarnwrap.client.font.Glyph getOrLoadGlyph(int codePoint,Object glyph, ) { return new yarnwrap.client.font.Glyph(net.minecraft.client.font.TrueTypeFont.getOrLoadGlyph(codePoint,glyph)); }
// public yarnwrap.client.font.Glyph loadGlyph(int codePoint,org.lwjgl.util.freetype.FT_Face face,int index) { return new yarnwrap.client.font.Glyph(wrapperContained.loadGlyph(codePoint,face,index)); }
// public static yarnwrap.client.font.Glyph loadGlyph(int codePoint,org.lwjgl.util.freetype.FT_Face face,int index, ) { return new yarnwrap.client.font.Glyph(net.minecraft.client.font.TrueTypeFont.loadGlyph(codePoint,face,index)); }

}