package yarnwrap.client.render.model;
public class BakedQuad { public net.minecraft.client.render.model.BakedQuad wrapperContained; public BakedQuad(net.minecraft.client.render.model.BakedQuad wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] vertexData() { return wrapperContained.vertexData; }
// public void vertexData(int[] value) { wrapperContained.vertexData = value; }
// public static int[] vertexData() { return net.minecraft.client.render.model.BakedQuad.vertexData; }
// public static void vertexData(int[] value, ) { net.minecraft.client.render.model.BakedQuad.vertexData = value; }

// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face); }
// public void face(yarnwrap.util.math.Direction value) { wrapperContained.face = value.wrapperContained; }
// public static yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.model.BakedQuad.face); }
// public static void face(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.model.BakedQuad.face = value.wrapperContained; }

// public BakedQuad(int vertexData,int tintIndex,net.minecraft.util.math.Direction[] face,yarnwrap.client.texture.Sprite sprite,boolean shade,int lightEmission) { this.wrapperContained = new net.minecraft.client.render.model.BakedQuad(vertexData,tintIndex,face,sprite.wrapperContained,shade,lightEmission); }
// public int[] vertexData() { return wrapperContained.vertexData(); }
// // public static int[] vertexData() { return net.minecraft.client.render.model.BakedQuad.vertexData(); }
// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face()); }
// // public static yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.model.BakedQuad.face()); }
public boolean hasTint() { return wrapperContained.hasTint(); }
// public static boolean hasTint() { return net.minecraft.client.render.model.BakedQuad.hasTint(); }

}