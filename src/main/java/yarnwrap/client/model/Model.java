package yarnwrap.client.model;
public class Model { public net.minecraft.client.model.Model wrapperContained; public Model(net.minecraft.client.model.Model wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function layerFactory() { return wrapperContained.layerFactory; }
// public void layerFactory(java.util.function.Function value) { wrapperContained.layerFactory = value; }
// public static java.util.function.Function layerFactory() { return net.minecraft.client.model.Model.layerFactory; }
// public static void layerFactory(java.util.function.Function value, ) { net.minecraft.client.model.Model.layerFactory = value; }

// public java.util.List parts() { return wrapperContained.parts; }
// public void parts(java.util.List value) { wrapperContained.parts = value; }
// public static java.util.List parts() { return net.minecraft.client.model.Model.parts; }
// public static void parts(java.util.List value, ) { net.minecraft.client.model.Model.parts = value; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.model.Model.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.model.Model.root = value.wrapperContained; }

// public Model(yarnwrap.client.model.ModelPart root,java.util.function.Function layerFactory) { this.wrapperContained = new net.minecraft.client.model.Model(root.wrapperContained,layerFactory); }
public yarnwrap.client.render.RenderLayer getLayer(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLayer(texture.wrapperContained)); }
// public static yarnwrap.client.render.RenderLayer getLayer(yarnwrap.util.Identifier texture, ) { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.model.Model.getLayer(texture.wrapperContained)); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay, ) { net.minecraft.client.model.Model.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay,int color) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay,color); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay,int color, ) { net.minecraft.client.model.Model.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay,color); }
public yarnwrap.client.model.ModelPart getRootPart() { return new yarnwrap.client.model.ModelPart(wrapperContained.getRootPart()); }
// public static yarnwrap.client.model.ModelPart getRootPart() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.model.Model.getRootPart()); }
public java.util.List getParts() { return wrapperContained.getParts(); }
// public static java.util.List getParts() { return net.minecraft.client.model.Model.getParts(); }
public void resetTransforms() { wrapperContained.resetTransforms(); }
// public static void resetTransforms() { net.minecraft.client.model.Model.resetTransforms(); }

}