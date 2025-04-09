package yarnwrap.client.render.model;
public class BakedQuad { public net.minecraft.client.render.model.BakedQuad wrapperContained; public BakedQuad(net.minecraft.client.render.model.BakedQuad wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean shade() { return wrapperContained.shade; }
// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face); }
// public int colorIndex() { return wrapperContained.colorIndex; }
// public int[] vertexData() { return wrapperContained.vertexData; }
// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
public boolean hasShade() { return wrapperContained.hasShade(); }
public int[] getVertexData() { return wrapperContained.getVertexData(); }
public yarnwrap.util.math.Direction getFace() { return new yarnwrap.util.math.Direction(wrapperContained.getFace()); }
public int getColorIndex() { return wrapperContained.getColorIndex(); }
public boolean hasColor() { return wrapperContained.hasColor(); }
public yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite()); }

}