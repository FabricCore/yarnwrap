package yarnwrap.client.font;
public class EmptyGlyphRenderer { public net.minecraft.client.font.EmptyGlyphRenderer wrapperContained; public EmptyGlyphRenderer(net.minecraft.client.font.EmptyGlyphRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.EmptyGlyphRenderer INSTANCE() { return new yarnwrap.client.font.EmptyGlyphRenderer(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.font.EmptyGlyphRenderer value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.client.font.EmptyGlyphRenderer INSTANCE() { return new yarnwrap.client.font.EmptyGlyphRenderer(net.minecraft.client.font.EmptyGlyphRenderer.INSTANCE); }
// public static void INSTANCE(yarnwrap.client.font.EmptyGlyphRenderer value, ) { net.minecraft.client.font.EmptyGlyphRenderer.INSTANCE = value.wrapperContained; }


}