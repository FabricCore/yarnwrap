package yarnwrap.client.render.model;
public class BakedQuad { public net.minecraft.client.render.model.BakedQuad wrapperContained; public BakedQuad(net.minecraft.client.render.model.BakedQuad wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean shade() { return wrapperContained.shade; }
// public void shade(boolean value) { wrapperContained.shade = value; }
// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face); }
// public void face(yarnwrap.util.math.Direction value) { wrapperContained.face = value.wrapperContained; }
// public int colorIndex() { return wrapperContained.colorIndex; }
// public void colorIndex(int value) { wrapperContained.colorIndex = value; }
// public int[] vertexData() { return wrapperContained.vertexData; }
// public void vertexData(int[] value) { wrapperContained.vertexData = value; }
// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public BakedQuad(int vertexData,int colorIndex,net.minecraft.util.math.Direction[] face,yarnwrap.client.texture.Sprite sprite,boolean shade) { this.wrapperContained = new net.minecraft.client.render.model.BakedQuad(vertexData,colorIndex,face,sprite.wrapperContained,shade); }
public boolean hasShade() { return wrapperContained.hasShade(); }
public int[] getVertexData() { return wrapperContained.getVertexData(); }
public yarnwrap.util.math.Direction getFace() { return new yarnwrap.util.math.Direction(wrapperContained.getFace()); }
public int getColorIndex() { return wrapperContained.getColorIndex(); }
public boolean hasColor() { return wrapperContained.hasColor(); }
public yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite()); }

}