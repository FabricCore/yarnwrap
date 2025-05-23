package yarnwrap.client.font;
public class EmptyBakedGlyph { public net.minecraft.client.font.EmptyBakedGlyph wrapperContained; public EmptyBakedGlyph(net.minecraft.client.font.EmptyBakedGlyph wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.EmptyBakedGlyph INSTANCE() { return new yarnwrap.client.font.EmptyBakedGlyph(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.font.EmptyBakedGlyph value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.client.font.EmptyBakedGlyph INSTANCE() { return new yarnwrap.client.font.EmptyBakedGlyph(net.minecraft.client.font.EmptyBakedGlyph.INSTANCE); }
// public static void INSTANCE(yarnwrap.client.font.EmptyBakedGlyph value, ) { net.minecraft.client.font.EmptyBakedGlyph.INSTANCE = value.wrapperContained; }


}