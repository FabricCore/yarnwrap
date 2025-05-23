package yarnwrap.client.model;
public class ModelPart { public net.minecraft.client.model.ModelPart wrapperContained; public ModelPart(net.minecraft.client.model.ModelPart wrapperContained) { this.wrapperContained = wrapperContained; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.model.ModelPart.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.model.ModelPart.pitch = value; }

public float originZ() { return wrapperContained.originZ; }
public void originZ(float value) { wrapperContained.originZ = value; }
// public static float originZ() { return net.minecraft.client.model.ModelPart.originZ; }
// public static void originZ(float value, ) { net.minecraft.client.model.ModelPart.originZ = value; }

public float originY() { return wrapperContained.originY; }
public void originY(float value) { wrapperContained.originY = value; }
// public static float originY() { return net.minecraft.client.model.ModelPart.originY; }
// public static void originY(float value, ) { net.minecraft.client.model.ModelPart.originY = value; }

public float originX() { return wrapperContained.originX; }
public void originX(float value) { wrapperContained.originX = value; }
// public static float originX() { return net.minecraft.client.model.ModelPart.originX; }
// public static void originX(float value, ) { net.minecraft.client.model.ModelPart.originX = value; }

// public java.util.Map children() { return wrapperContained.children; }
// public void children(java.util.Map value) { wrapperContained.children = value; }
// public static java.util.Map children() { return net.minecraft.client.model.ModelPart.children; }
// public static void children(java.util.Map value, ) { net.minecraft.client.model.ModelPart.children = value; }

// public java.util.List cuboids() { return wrapperContained.cuboids; }
// public void cuboids(java.util.List value) { wrapperContained.cuboids = value; }
// public static java.util.List cuboids() { return net.minecraft.client.model.ModelPart.cuboids; }
// public static void cuboids(java.util.List value, ) { net.minecraft.client.model.ModelPart.cuboids = value; }

public boolean visible() { return wrapperContained.visible; }
public void visible(boolean value) { wrapperContained.visible = value; }
// public static boolean visible() { return net.minecraft.client.model.ModelPart.visible; }
// public static void visible(boolean value, ) { net.minecraft.client.model.ModelPart.visible = value; }

public float roll() { return wrapperContained.roll; }
public void roll(float value) { wrapperContained.roll = value; }
// public static float roll() { return net.minecraft.client.model.ModelPart.roll; }
// public static void roll(float value, ) { net.minecraft.client.model.ModelPart.roll = value; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.model.ModelPart.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.model.ModelPart.yaw = value; }

public float xScale() { return wrapperContained.xScale; }
public void xScale(float value) { wrapperContained.xScale = value; }
// public static float xScale() { return net.minecraft.client.model.ModelPart.xScale; }
// public static void xScale(float value, ) { net.minecraft.client.model.ModelPart.xScale = value; }

public float yScale() { return wrapperContained.yScale; }
public void yScale(float value) { wrapperContained.yScale = value; }
// public static float yScale() { return net.minecraft.client.model.ModelPart.yScale; }
// public static void yScale(float value, ) { net.minecraft.client.model.ModelPart.yScale = value; }

public float zScale() { return wrapperContained.zScale; }
public void zScale(float value) { wrapperContained.zScale = value; }
// public static float zScale() { return net.minecraft.client.model.ModelPart.zScale; }
// public static void zScale(float value, ) { net.minecraft.client.model.ModelPart.zScale = value; }

// public yarnwrap.client.model.ModelTransform defaultTransform() { return new yarnwrap.client.model.ModelTransform(wrapperContained.defaultTransform); }
// public void defaultTransform(yarnwrap.client.model.ModelTransform value) { wrapperContained.defaultTransform = value.wrapperContained; }
// public static yarnwrap.client.model.ModelTransform defaultTransform() { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelPart.defaultTransform); }
// public static void defaultTransform(yarnwrap.client.model.ModelTransform value, ) { net.minecraft.client.model.ModelPart.defaultTransform = value.wrapperContained; }

public boolean hidden() { return wrapperContained.hidden; }
public void hidden(boolean value) { wrapperContained.hidden = value; }
// public static boolean hidden() { return net.minecraft.client.model.ModelPart.hidden; }
// public static void hidden(boolean value, ) { net.minecraft.client.model.ModelPart.hidden = value; }

public ModelPart(java.util.List cuboids,java.util.Map children) { this.wrapperContained = new net.minecraft.client.model.ModelPart(cuboids,children); }
public void setOrigin(float x,float y,float z) { wrapperContained.setOrigin(x,y,z); }
// public static void setOrigin(float x,float y,float z, ) { net.minecraft.client.model.ModelPart.setOrigin(x,y,z); }
public void copyTransform(yarnwrap.client.model.ModelPart part) { wrapperContained.copyTransform(part.wrapperContained); }
// public static void copyTransform(yarnwrap.client.model.ModelPart part, ) { net.minecraft.client.model.ModelPart.copyTransform(part.wrapperContained); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay, ) { net.minecraft.client.model.ModelPart.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay,int color) { wrapperContained.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay,color); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertices,int light,int overlay,int color, ) { net.minecraft.client.model.ModelPart.render(matrices.wrapperContained,vertices.wrapperContained,light,overlay,color); }
public Object getRandomCuboid(yarnwrap.util.math.random.Random random) { return wrapperContained.getRandomCuboid(random.wrapperContained); }
// public static Object getRandomCuboid(yarnwrap.util.math.random.Random random, ) { return net.minecraft.client.model.ModelPart.getRandomCuboid(random.wrapperContained); }
// public void renderCuboids(Object entry,yarnwrap.client.render.VertexConsumer vertexConsumer,int light,int overlay,int color) { wrapperContained.renderCuboids(entry,vertexConsumer.wrapperContained,light,overlay,color); }
// public static void renderCuboids(Object entry,yarnwrap.client.render.VertexConsumer vertexConsumer,int light,int overlay,int color, ) { net.minecraft.client.model.ModelPart.renderCuboids(entry,vertexConsumer.wrapperContained,light,overlay,color); }
public void applyTransform(yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.applyTransform(matrices.wrapperContained); }
// public static void applyTransform(yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.model.ModelPart.applyTransform(matrices.wrapperContained); }
public yarnwrap.client.model.ModelTransform getTransform() { return new yarnwrap.client.model.ModelTransform(wrapperContained.getTransform()); }
// public static yarnwrap.client.model.ModelTransform getTransform() { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelPart.getTransform()); }
public void setTransform(yarnwrap.client.model.ModelTransform transform) { wrapperContained.setTransform(transform.wrapperContained); }
// public static void setTransform(yarnwrap.client.model.ModelTransform transform, ) { net.minecraft.client.model.ModelPart.setTransform(transform.wrapperContained); }
public yarnwrap.client.model.ModelPart getChild(java.lang.String name) { return new yarnwrap.client.model.ModelPart(wrapperContained.getChild(name)); }
// public static yarnwrap.client.model.ModelPart getChild(java.lang.String name, ) { return new yarnwrap.client.model.ModelPart(net.minecraft.client.model.ModelPart.getChild(name)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.model.ModelPart.isEmpty(); }
// public java.util.List traverse() { return wrapperContained.traverse(); }
// // public static java.util.List traverse() { return net.minecraft.client.model.ModelPart.traverse(); }
public void setAngles(float pitch,float yaw,float roll) { wrapperContained.setAngles(pitch,yaw,roll); }
// public static void setAngles(float pitch,float yaw,float roll, ) { net.minecraft.client.model.ModelPart.setAngles(pitch,yaw,roll); }
// public void forEachCuboid(yarnwrap.client.util.math.MatrixStack matrices,Object consumer) { wrapperContained.forEachCuboid(matrices.wrapperContained,consumer); }
// public static void forEachCuboid(yarnwrap.client.util.math.MatrixStack matrices,Object consumer, ) { net.minecraft.client.model.ModelPart.forEachCuboid(matrices.wrapperContained,consumer); }
// public void forEachCuboid(yarnwrap.client.util.math.MatrixStack matrices,Object consumer,java.lang.String path) { wrapperContained.forEachCuboid(matrices.wrapperContained,consumer,path); }
// public static void forEachCuboid(yarnwrap.client.util.math.MatrixStack matrices,Object consumer,java.lang.String path, ) { net.minecraft.client.model.ModelPart.forEachCuboid(matrices.wrapperContained,consumer,path); }
// public void method_35747(yarnwrap.client.util.math.MatrixStack name,Object part) { wrapperContained.method_35747(name.wrapperContained,part); }
// public static void method_35747(yarnwrap.client.util.math.MatrixStack name,Object part, ) { net.minecraft.client.model.ModelPart.method_35747(name.wrapperContained,part); }
public void setDefaultTransform(yarnwrap.client.model.ModelTransform transform) { wrapperContained.setDefaultTransform(transform.wrapperContained); }
// public static void setDefaultTransform(yarnwrap.client.model.ModelTransform transform, ) { net.minecraft.client.model.ModelPart.setDefaultTransform(transform.wrapperContained); }
public boolean hasChild(java.lang.String child) { return wrapperContained.hasChild(child); }
// public static boolean hasChild(java.lang.String child, ) { return net.minecraft.client.model.ModelPart.hasChild(child); }
public void moveOrigin(org.joml.Vector3f vec3f) { wrapperContained.moveOrigin(vec3f); }
// public static void moveOrigin(org.joml.Vector3f vec3f, ) { net.minecraft.client.model.ModelPart.moveOrigin(vec3f); }
public yarnwrap.client.model.ModelTransform getDefaultTransform() { return new yarnwrap.client.model.ModelTransform(wrapperContained.getDefaultTransform()); }
// public static yarnwrap.client.model.ModelTransform getDefaultTransform() { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelPart.getDefaultTransform()); }
public void rotate(org.joml.Vector3f vec3f) { wrapperContained.rotate(vec3f); }
// public static void rotate(org.joml.Vector3f vec3f, ) { net.minecraft.client.model.ModelPart.rotate(vec3f); }
public void resetTransform() { wrapperContained.resetTransform(); }
// public static void resetTransform() { net.minecraft.client.model.ModelPart.resetTransform(); }
public void scale(org.joml.Vector3f vec3f) { wrapperContained.scale(vec3f); }
// public static void scale(org.joml.Vector3f vec3f, ) { net.minecraft.client.model.ModelPart.scale(vec3f); }
public void rotate(org.joml.Quaternionf quaternion) { wrapperContained.rotate(quaternion); }
// public static void rotate(org.joml.Quaternionf quaternion, ) { net.minecraft.client.model.ModelPart.rotate(quaternion); }

}