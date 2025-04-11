package yarnwrap.client.model;
public class Model { public net.minecraft.client.model.Model wrapperContained; public Model(net.minecraft.client.model.Model wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function layerFactory() { return wrapperContained.layerFactory; }
// public void layerFactory(java.util.function.Function value) { wrapperContained.layerFactory = value; }
// public Model(java.util.function.Function layerFactory) { this.wrapperContained = new net.minecraft.client.model.Model(layerFactory); }
public yarnwrap.client.render.RenderLayer getLayer(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLayer(texture.wrapperContained)); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay,int color) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay,color); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }

}