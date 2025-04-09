package yarnwrap.client.font;
public class Glyph { public net.minecraft.client.font.Glyph wrapperContained; public Glyph(net.minecraft.client.font.Glyph wrapperContained) { this.wrapperContained = wrapperContained; }

public float getAdvance(boolean bold) { return wrapperContained.getAdvance(bold); }
public float getBoldOffset() { return wrapperContained.getBoldOffset(); }
public float getShadowOffset() { return wrapperContained.getShadowOffset(); }

}