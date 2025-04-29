package yarnwrap.client.font;
public class GlyphRenderer { public net.minecraft.client.font.GlyphRenderer wrapperContained; public GlyphRenderer(net.minecraft.client.font.GlyphRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float minX() { return wrapperContained.minX; }
// public void minX(float value) { wrapperContained.minX = value; }
// public static float minX() { return net.minecraft.client.font.GlyphRenderer.minX; }
// public static void minX(float value, ) { net.minecraft.client.font.GlyphRenderer.minX = value; }

// public float maxV() { return wrapperContained.maxV; }
// public void maxV(float value) { wrapperContained.maxV = value; }
// public static float maxV() { return net.minecraft.client.font.GlyphRenderer.maxV; }
// public static void maxV(float value, ) { net.minecraft.client.font.GlyphRenderer.maxV = value; }

// public float minV() { return wrapperContained.minV; }
// public void minV(float value) { wrapperContained.minV = value; }
// public static float minV() { return net.minecraft.client.font.GlyphRenderer.minV; }
// public static void minV(float value, ) { net.minecraft.client.font.GlyphRenderer.minV = value; }

// public float maxU() { return wrapperContained.maxU; }
// public void maxU(float value) { wrapperContained.maxU = value; }
// public static float maxU() { return net.minecraft.client.font.GlyphRenderer.maxU; }
// public static void maxU(float value, ) { net.minecraft.client.font.GlyphRenderer.maxU = value; }

// public float minU() { return wrapperContained.minU; }
// public void minU(float value) { wrapperContained.minU = value; }
// public static float minU() { return net.minecraft.client.font.GlyphRenderer.minU; }
// public static void minU(float value, ) { net.minecraft.client.font.GlyphRenderer.minU = value; }

// public float maxY() { return wrapperContained.maxY; }
// public void maxY(float value) { wrapperContained.maxY = value; }
// public static float maxY() { return net.minecraft.client.font.GlyphRenderer.maxY; }
// public static void maxY(float value, ) { net.minecraft.client.font.GlyphRenderer.maxY = value; }

// public float minY() { return wrapperContained.minY; }
// public void minY(float value) { wrapperContained.minY = value; }
// public static float minY() { return net.minecraft.client.font.GlyphRenderer.minY; }
// public static void minY(float value, ) { net.minecraft.client.font.GlyphRenderer.minY = value; }

// public float maxX() { return wrapperContained.maxX; }
// public void maxX(float value) { wrapperContained.maxX = value; }
// public static float maxX() { return net.minecraft.client.font.GlyphRenderer.maxX; }
// public static void maxX(float value, ) { net.minecraft.client.font.GlyphRenderer.maxX = value; }

// public yarnwrap.client.font.TextRenderLayerSet textRenderLayers() { return new yarnwrap.client.font.TextRenderLayerSet(wrapperContained.textRenderLayers); }
// public void textRenderLayers(yarnwrap.client.font.TextRenderLayerSet value) { wrapperContained.textRenderLayers = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderLayerSet textRenderLayers() { return new yarnwrap.client.font.TextRenderLayerSet(net.minecraft.client.font.GlyphRenderer.textRenderLayers); }
// public static void textRenderLayers(yarnwrap.client.font.TextRenderLayerSet value, ) { net.minecraft.client.font.GlyphRenderer.textRenderLayers = value.wrapperContained; }

public GlyphRenderer(yarnwrap.client.font.TextRenderLayerSet textRenderLayers,float minU,float maxU,float minV,float maxV,float minX,float maxX,float minY,float maxY) { this.wrapperContained = new net.minecraft.client.font.GlyphRenderer(textRenderLayers.wrapperContained,minU,maxU,minV,maxV,minX,maxX,minY,maxY); }
public void draw(boolean italic,float x,float y,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,float red,float green,float blue,float alpha,int light) { wrapperContained.draw(italic,x,y,matrix,vertexConsumer.wrapperContained,red,green,blue,alpha,light); }
// public static void draw(boolean italic,float x,float y,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,float red,float green,float blue,float alpha,int light, ) { net.minecraft.client.font.GlyphRenderer.draw(italic,x,y,matrix,vertexConsumer.wrapperContained,red,green,blue,alpha,light); }
// public void drawRectangle(Object rectangle,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,int light) { wrapperContained.drawRectangle(rectangle,matrix,vertexConsumer.wrapperContained,light); }
// public static void drawRectangle(Object rectangle,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,int light, ) { net.minecraft.client.font.GlyphRenderer.drawRectangle(rectangle,matrix,vertexConsumer.wrapperContained,light); }
// public yarnwrap.client.render.RenderLayer getLayer(Object layerType) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLayer(layerType)); }
// public static yarnwrap.client.render.RenderLayer getLayer(Object layerType, ) { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.font.GlyphRenderer.getLayer(layerType)); }

}