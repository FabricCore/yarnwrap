package yarnwrap.client.model;
public class ModelPart { public net.minecraft.client.model.ModelPart wrapperContained; public ModelPart(net.minecraft.client.model.ModelPart wrapperContained) { this.wrapperContained = wrapperContained; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
public float pivotZ() { return wrapperContained.pivotZ; }
public void pivotZ(float value) { wrapperContained.pivotZ = value; }
public float pivotY() { return wrapperContained.pivotY; }
public void pivotY(float value) { wrapperContained.pivotY = value; }
public float pivotX() { return wrapperContained.pivotX; }
public void pivotX(float value) { wrapperContained.pivotX = value; }
// public java.util.Map children() { return wrapperContained.children; }
// public void children(java.util.Map value) { wrapperContained.children = value; }
// public java.util.List cuboids() { return wrapperContained.cuboids; }
// public void cuboids(java.util.List value) { wrapperContained.cuboids = value; }
public boolean visible() { return wrapperContained.visible; }
public void visible(boolean value) { wrapperContained.visible = value; }
public float roll() { return wrapperContained.roll; }
public void roll(float value) { wrapperContained.roll = value; }
public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
public float xScale() { return wrapperContained.xScale; }
public void xScale(float value) { wrapperContained.xScale = value; }
public float yScale() { return wrapperContained.yScale; }
public void yScale(float value) { wrapperContained.yScale = value; }
public float zScale() { return wrapperContained.zScale; }
public void zScale(float value) { wrapperContained.zScale = value; }
// public yarnwrap.client.model.ModelTransform defaultTransform() { return new yarnwrap.client.model.ModelTransform(wrapperContained.defaultTransform); }
// public void defaultTransform(yarnwrap.client.model.ModelTransform value) { wrapperContained.defaultTransform = value.wrapperContained; }
public boolean hidden() { return wrapperContained.hidden; }
public void hidden(boolean value) { wrapperContained.hidden = value; }
public ModelPart(java.util.List cuboids,java.util.Map children) { this.wrapperContained = new net.minecraft.client.model.ModelPart(cuboids,children); }
public void copyTransform(yarnwrap.client.model.ModelPart part) { wrapperContained.copyTransform(part.wrapperContained); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay,int color) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay,color); }
public Object getRandomCuboid(yarnwrap.util.math.random.Random random) { return wrapperContained.getRandomCuboid(random.wrapperContained); }
// public void renderCuboids(Object entry,yarnwrap.client.render.VertexConsumer vertexConsumer,int light,int overlay,int color) { wrapperContained.renderCuboids(entry,vertexConsumer.wrapperContained,light,overlay,color); }
public void rotate(yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.rotate(matrices.wrapperContained); }
public void setPivot(float x,float y,float z) { wrapperContained.setPivot(x,y,z); }
public yarnwrap.client.model.ModelTransform getTransform() { return new yarnwrap.client.model.ModelTransform(wrapperContained.getTransform()); }
public void setTransform(yarnwrap.client.model.ModelTransform rotationData) { wrapperContained.setTransform(rotationData.wrapperContained); }
public yarnwrap.client.model.ModelPart getChild(java.lang.String name) { return new yarnwrap.client.model.ModelPart(wrapperContained.getChild(name)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public java.util.stream.Stream traverse() { return wrapperContained.traverse(); }
public void setAngles(float pitch,float yaw,float roll) { wrapperContained.setAngles(pitch,yaw,roll); }
// public void forEachCuboid(yarnwrap.client.util.math.MatrixStack matrices,Object consumer) { wrapperContained.forEachCuboid(matrices.wrapperContained,consumer); }
// public void forEachCuboid(yarnwrap.client.util.math.MatrixStack matrices,Object consumer,java.lang.String path) { wrapperContained.forEachCuboid(matrices.wrapperContained,consumer,path); }
// public void method_35747(yarnwrap.client.util.math.MatrixStack name,Object part) { wrapperContained.method_35747(name.wrapperContained,part); }
public void setDefaultTransform(yarnwrap.client.model.ModelTransform transform) { wrapperContained.setDefaultTransform(transform.wrapperContained); }
public boolean hasChild(java.lang.String child) { return wrapperContained.hasChild(child); }
public void translate(org.joml.Vector3f vec3f) { wrapperContained.translate(vec3f); }
public yarnwrap.client.model.ModelTransform getDefaultTransform() { return new yarnwrap.client.model.ModelTransform(wrapperContained.getDefaultTransform()); }
public void rotate(org.joml.Vector3f vec3f) { wrapperContained.rotate(vec3f); }
public void resetTransform() { wrapperContained.resetTransform(); }
public void scale(org.joml.Vector3f vec3f) { wrapperContained.scale(vec3f); }

}