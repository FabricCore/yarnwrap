package yarnwrap.client.render.model;
public class BakedQuad { public net.minecraft.client.render.model.BakedQuad wrapperContained; public BakedQuad(net.minecraft.client.render.model.BakedQuad wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean shade() { return wrapperContained.shade; }
// public void shade(boolean value) { wrapperContained.shade = value; }
// public static boolean shade() { return net.minecraft.client.render.model.BakedQuad.shade; }
// public static void shade(boolean value, ) { net.minecraft.client.render.model.BakedQuad.shade = value; }

// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face); }
// public void face(yarnwrap.util.math.Direction value) { wrapperContained.face = value.wrapperContained; }
// public static yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.model.BakedQuad.face); }
// public static void face(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.model.BakedQuad.face = value.wrapperContained; }

// public int colorIndex() { return wrapperContained.colorIndex; }
// public void colorIndex(int value) { wrapperContained.colorIndex = value; }
// public static int colorIndex() { return net.minecraft.client.render.model.BakedQuad.colorIndex; }
// public static void colorIndex(int value, ) { net.minecraft.client.render.model.BakedQuad.colorIndex = value; }

// public int[] vertexData() { return wrapperContained.vertexData; }
// public void vertexData(int[] value) { wrapperContained.vertexData = value; }
// public static int[] vertexData() { return net.minecraft.client.render.model.BakedQuad.vertexData; }
// public static void vertexData(int[] value, ) { net.minecraft.client.render.model.BakedQuad.vertexData = value; }

// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BakedQuad.sprite); }
// public static void sprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.render.model.BakedQuad.sprite = value.wrapperContained; }

// public BakedQuad(int vertexData,int colorIndex,net.minecraft.util.math.Direction[] face,yarnwrap.client.texture.Sprite sprite,boolean shade) { this.wrapperContained = new net.minecraft.client.render.model.BakedQuad(vertexData,colorIndex,face,sprite.wrapperContained,shade); }
public boolean hasShade() { return wrapperContained.hasShade(); }
// public static boolean hasShade() { return net.minecraft.client.render.model.BakedQuad.hasShade(); }
public int[] getVertexData() { return wrapperContained.getVertexData(); }
// public static int[] getVertexData() { return net.minecraft.client.render.model.BakedQuad.getVertexData(); }
public yarnwrap.util.math.Direction getFace() { return new yarnwrap.util.math.Direction(wrapperContained.getFace()); }
// public static yarnwrap.util.math.Direction getFace() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.model.BakedQuad.getFace()); }
public int getColorIndex() { return wrapperContained.getColorIndex(); }
// public static int getColorIndex() { return net.minecraft.client.render.model.BakedQuad.getColorIndex(); }
public boolean hasColor() { return wrapperContained.hasColor(); }
// public static boolean hasColor() { return net.minecraft.client.render.model.BakedQuad.hasColor(); }
public yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite()); }
// public static yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BakedQuad.getSprite()); }

}