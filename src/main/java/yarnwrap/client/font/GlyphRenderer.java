package yarnwrap.client.font;
public class GlyphRenderer { public net.minecraft.client.font.GlyphRenderer wrapperContained; public GlyphRenderer(net.minecraft.client.font.GlyphRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float minX() { return wrapperContained.minX; }
// public void minX(float value) { wrapperContained.minX = value; }
// public float maxV() { return wrapperContained.maxV; }
// public void maxV(float value) { wrapperContained.maxV = value; }
// public float minV() { return wrapperContained.minV; }
// public void minV(float value) { wrapperContained.minV = value; }
// public float maxU() { return wrapperContained.maxU; }
// public void maxU(float value) { wrapperContained.maxU = value; }
// public float minU() { return wrapperContained.minU; }
// public void minU(float value) { wrapperContained.minU = value; }
// public float maxY() { return wrapperContained.maxY; }
// public void maxY(float value) { wrapperContained.maxY = value; }
// public float minY() { return wrapperContained.minY; }
// public void minY(float value) { wrapperContained.minY = value; }
// public float maxX() { return wrapperContained.maxX; }
// public void maxX(float value) { wrapperContained.maxX = value; }
// public yarnwrap.client.font.TextRenderLayerSet textRenderLayers() { return new yarnwrap.client.font.TextRenderLayerSet(wrapperContained.textRenderLayers); }
// public void textRenderLayers(yarnwrap.client.font.TextRenderLayerSet value) { wrapperContained.textRenderLayers = value.wrapperContained; }
public void draw(boolean italic,float x,float y,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,float red,float green,float blue,float alpha,int light) { wrapperContained.draw(italic,x,y,matrix,vertexConsumer.wrapperContained,red,green,blue,alpha,light); }
// public void drawRectangle(Object rectangle,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,int light) { wrapperContained.drawRectangle(rectangle,matrix,vertexConsumer.wrapperContained,light); }
// public yarnwrap.client.render.RenderLayer getLayer(Object layerType) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLayer(layerType)); }

}