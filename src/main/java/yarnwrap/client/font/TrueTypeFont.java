package yarnwrap.client.font;
public class TrueTypeFont { public net.minecraft.client.font.TrueTypeFont wrapperContained; public TrueTypeFont(net.minecraft.client.font.TrueTypeFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.ByteBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(java.nio.ByteBuffer value) { wrapperContained.buffer = value; }
// public static java.nio.ByteBuffer buffer() { return net.minecraft.client.font.TrueTypeFont.buffer; }
// public static void buffer(java.nio.ByteBuffer value, ) { net.minecraft.client.font.TrueTypeFont.buffer = value; }

// public it.unimi.dsi.fastutil.ints.IntSet excludedCharacters() { return wrapperContained.excludedCharacters; }
// public void excludedCharacters(it.unimi.dsi.fastutil.ints.IntSet value) { wrapperContained.excludedCharacters = value; }
// public static it.unimi.dsi.fastutil.ints.IntSet excludedCharacters() { return net.minecraft.client.font.TrueTypeFont.excludedCharacters; }
// public static void excludedCharacters(it.unimi.dsi.fastutil.ints.IntSet value, ) { net.minecraft.client.font.TrueTypeFont.excludedCharacters = value; }

// public float oversample() { return wrapperContained.oversample; }
// public void oversample(float value) { wrapperContained.oversample = value; }
// public static float oversample() { return net.minecraft.client.font.TrueTypeFont.oversample; }
// public static void oversample(float value, ) { net.minecraft.client.font.TrueTypeFont.oversample = value; }

// public org.lwjgl.util.freetype.FT_Face face() { return wrapperContained.face; }
// public void face(org.lwjgl.util.freetype.FT_Face value) { wrapperContained.face = value; }
// public static org.lwjgl.util.freetype.FT_Face face() { return net.minecraft.client.font.TrueTypeFont.face; }
// public static void face(org.lwjgl.util.freetype.FT_Face value, ) { net.minecraft.client.font.TrueTypeFont.face = value; }

public TrueTypeFont(java.nio.ByteBuffer buffer,org.lwjgl.util.freetype.FT_Face face,float size,float oversample,float shiftX,float shiftY,java.lang.String excludedCharacters) { this.wrapperContained = new net.minecraft.client.font.TrueTypeFont(buffer,face,size,oversample,shiftX,shiftY,excludedCharacters); }
// public org.lwjgl.util.freetype.FT_Face getInfo() { return wrapperContained.getInfo(); }
// public static org.lwjgl.util.freetype.FT_Face getInfo() { return net.minecraft.client.font.TrueTypeFont.getInfo(); }

}