package yarnwrap.client.font;
public class Glyph { public net.minecraft.client.font.Glyph wrapperContained; public Glyph(net.minecraft.client.font.Glyph wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.font.BakedGlyph bake(java.util.function.Function glyphRendererGetter) { return new yarnwrap.client.font.BakedGlyph(wrapperContained.bake(glyphRendererGetter)); }
// public static yarnwrap.client.font.BakedGlyph bake(java.util.function.Function glyphRendererGetter, ) { return new yarnwrap.client.font.BakedGlyph(net.minecraft.client.font.Glyph.bake(glyphRendererGetter)); }
public float getAdvance(boolean bold) { return wrapperContained.getAdvance(bold); }
// public static float getAdvance(boolean bold, ) { return net.minecraft.client.font.Glyph.getAdvance(bold); }
public float getBoldOffset() { return wrapperContained.getBoldOffset(); }
// public static float getBoldOffset() { return net.minecraft.client.font.Glyph.getBoldOffset(); }
public float getShadowOffset() { return wrapperContained.getShadowOffset(); }
// public static float getShadowOffset() { return net.minecraft.client.font.Glyph.getShadowOffset(); }

}