package yarnwrap.client.font;
public class EmptyGlyphRenderer { public net.minecraft.client.font.EmptyGlyphRenderer wrapperContained; public EmptyGlyphRenderer(net.minecraft.client.font.EmptyGlyphRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.font.EmptyGlyphRenderer INSTANCE() { return new yarnwrap.client.font.EmptyGlyphRenderer(wrapperContained.INSTANCE); }

}