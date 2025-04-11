package yarnwrap.client.font;
public class SpaceFont { public net.minecraft.client.font.SpaceFont wrapperContained; public SpaceFont(net.minecraft.client.font.SpaceFont wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap codePointsToGlyphs() { return wrapperContained.codePointsToGlyphs; }
// public void codePointsToGlyphs(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.codePointsToGlyphs = value; }
public SpaceFont(java.util.Map codePointsToAdvances) { this.wrapperContained = new net.minecraft.client.font.SpaceFont(codePointsToAdvances); }
// public void method_41716(java.lang.Integer codePoint,java.lang.Float glyph) { wrapperContained.method_41716(codePoint,glyph); }

}