package yarnwrap.client.font;
public class SpaceFont { public net.minecraft.client.font.SpaceFont wrapperContained; public SpaceFont(net.minecraft.client.font.SpaceFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap codePointsToGlyphs() { return wrapperContained.codePointsToGlyphs; }
// public void codePointsToGlyphs(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.codePointsToGlyphs = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap codePointsToGlyphs() { return net.minecraft.client.font.SpaceFont.codePointsToGlyphs; }
// public static void codePointsToGlyphs(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.font.SpaceFont.codePointsToGlyphs = value; }

public SpaceFont(java.util.Map codePointsToAdvances) { this.wrapperContained = new net.minecraft.client.font.SpaceFont(codePointsToAdvances); }
// public void method_41716(java.lang.Integer codePoint,java.lang.Float glyph) { wrapperContained.method_41716(codePoint,glyph); }
// public static void method_41716(java.lang.Integer codePoint,java.lang.Float glyph, ) { net.minecraft.client.font.SpaceFont.method_41716(codePoint,glyph); }

}