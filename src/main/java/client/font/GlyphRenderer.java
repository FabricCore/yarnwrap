package yarnwrap.client.font;
public class GlyphRenderer { public net.minecraft.client.font.GlyphRenderer wrapperContained; public GlyphRenderer(net.minecraft.client.font.GlyphRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float minX() { return wrapperContained.minX; }
// public float maxV() { return wrapperContained.maxV; }
// public float minV() { return wrapperContained.minV; }
// public float maxU() { return wrapperContained.maxU; }
// public float minU() { return wrapperContained.minU; }
// public float maxY() { return wrapperContained.maxY; }
// public float minY() { return wrapperContained.minY; }
// public float maxX() { return wrapperContained.maxX; }
// public yarnwrap.client.font.TextRenderLayerSet textRenderLayers() { return new yarnwrap.client.font.TextRenderLayerSet(wrapperContained.textRenderLayers); }
public void draw(boolean italic,float x,float y,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,float red,float green,float blue,float alpha,int light) { wrapperContained.draw(italic,x,y,matrix,vertexConsumer.wrapperContained,red,green,blue,alpha,light); }
// public void drawRectangle(Object rectangle,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,int light) { wrapperContained.drawRectangle(rectangle,matrix,vertexConsumer.wrapperContained,light); }
// public yarnwrap.client.render.RenderLayer getLayer(Object layerType) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLayer(layerType)); }

}