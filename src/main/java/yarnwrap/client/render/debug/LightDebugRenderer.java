package yarnwrap.client.render.debug;
public class LightDebugRenderer { public net.minecraft.client.render.debug.LightDebugRenderer wrapperContained; public LightDebugRenderer(net.minecraft.client.render.debug.LightDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration UPDATE_INTERVAL() { return wrapperContained.UPDATE_INTERVAL; }
// public void UPDATE_INTERVAL(java.time.Duration value) { wrapperContained.UPDATE_INTERVAL = value; }
// public static java.time.Duration UPDATE_INTERVAL() { return net.minecraft.client.render.debug.LightDebugRenderer.UPDATE_INTERVAL; }
// public static void UPDATE_INTERVAL(java.time.Duration value, ) { net.minecraft.client.render.debug.LightDebugRenderer.UPDATE_INTERVAL = value; }

// public int RADIUS() { return wrapperContained.RADIUS; }
// public void RADIUS(int value) { wrapperContained.RADIUS = value; }
// public static int RADIUS() { return net.minecraft.client.render.debug.LightDebugRenderer.RADIUS; }
// public static void RADIUS(int value, ) { net.minecraft.client.render.debug.LightDebugRenderer.RADIUS = value; }

// public org.joml.Vector4f READY_SHAPE_COLOR() { return wrapperContained.READY_SHAPE_COLOR; }
// public void READY_SHAPE_COLOR(org.joml.Vector4f value) { wrapperContained.READY_SHAPE_COLOR = value; }
// public static org.joml.Vector4f READY_SHAPE_COLOR() { return net.minecraft.client.render.debug.LightDebugRenderer.READY_SHAPE_COLOR; }
// public static void READY_SHAPE_COLOR(org.joml.Vector4f value, ) { net.minecraft.client.render.debug.LightDebugRenderer.READY_SHAPE_COLOR = value; }

// public org.joml.Vector4f DEFAULT_SHAPE_COLOR() { return wrapperContained.DEFAULT_SHAPE_COLOR; }
// public void DEFAULT_SHAPE_COLOR(org.joml.Vector4f value) { wrapperContained.DEFAULT_SHAPE_COLOR = value; }
// public static org.joml.Vector4f DEFAULT_SHAPE_COLOR() { return net.minecraft.client.render.debug.LightDebugRenderer.DEFAULT_SHAPE_COLOR; }
// public static void DEFAULT_SHAPE_COLOR(org.joml.Vector4f value, ) { net.minecraft.client.render.debug.LightDebugRenderer.DEFAULT_SHAPE_COLOR = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.LightDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.LightDebugRenderer.client = value.wrapperContained; }

// public yarnwrap.world.LightType lightType() { return new yarnwrap.world.LightType(wrapperContained.lightType); }
// public void lightType(yarnwrap.world.LightType value) { wrapperContained.lightType = value.wrapperContained; }
// public static yarnwrap.world.LightType lightType() { return new yarnwrap.world.LightType(net.minecraft.client.render.debug.LightDebugRenderer.lightType); }
// public static void lightType(yarnwrap.world.LightType value, ) { net.minecraft.client.render.debug.LightDebugRenderer.lightType = value.wrapperContained; }

// public java.time.Instant prevUpdateTime() { return wrapperContained.prevUpdateTime; }
// public void prevUpdateTime(java.time.Instant value) { wrapperContained.prevUpdateTime = value; }
// public static java.time.Instant prevUpdateTime() { return net.minecraft.client.render.debug.LightDebugRenderer.prevUpdateTime; }
// public static void prevUpdateTime(java.time.Instant value, ) { net.minecraft.client.render.debug.LightDebugRenderer.prevUpdateTime = value; }

// public Object data() { return wrapperContained.data; }
// // public void data(Object value) { wrapperContained.data = value; }
// // public static Object data() { return net.minecraft.client.render.debug.LightDebugRenderer.data; }
// // public static void data(Object value, ) { net.minecraft.client.render.debug.LightDebugRenderer.data = value; }

public LightDebugRenderer(yarnwrap.client.MinecraftClient client,yarnwrap.world.LightType lightType) { this.wrapperContained = new net.minecraft.client.render.debug.LightDebugRenderer(client.wrapperContained,lightType.wrapperContained); }
// public void drawFaces(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color) { wrapperContained.drawFaces(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public static void drawFaces(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color, ) { net.minecraft.client.render.debug.LightDebugRenderer.drawFaces(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public void drawEdges(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color) { wrapperContained.drawEdges(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public static void drawEdges(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color, ) { net.minecraft.client.render.debug.LightDebugRenderer.drawEdges(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public void drawEdge(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,int x1,int y1,int z1,int x2,int y2,int z,org.joml.Vector4f color) { wrapperContained.drawEdge(matrices.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,x1,y1,z1,x2,y2,z,color); }
// public static void drawEdge(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,int x1,int y1,int z1,int x2,int y2,int z,org.joml.Vector4f color, ) { net.minecraft.client.render.debug.LightDebugRenderer.drawEdge(matrices.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,x1,y1,z1,x2,y2,z,color); }
// public void drawFace(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Direction direction,double cameraX,double cameraY,double cameraZ,int x,int y,int z,org.joml.Vector4f color) { wrapperContained.drawFace(matrices.wrapperContained,vertexConsumer.wrapperContained,direction.wrapperContained,cameraX,cameraY,cameraZ,x,y,z,color); }
// public static void drawFace(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Direction direction,double cameraX,double cameraY,double cameraZ,int x,int y,int z,org.joml.Vector4f color, ) { net.minecraft.client.render.debug.LightDebugRenderer.drawFace(matrices.wrapperContained,vertexConsumer.wrapperContained,direction.wrapperContained,cameraX,cameraY,cameraZ,x,y,z,color); }
// public void method_51461(yarnwrap.util.math.ChunkSectionPos direction,yarnwrap.client.util.math.MatrixStack offsetX,yarnwrap.client.render.VertexConsumer offsetY,double offsetZ) { wrapperContained.method_51461(direction.wrapperContained,offsetX.wrapperContained,offsetY.wrapperContained,offsetZ); }
// public static void method_51461(yarnwrap.util.math.ChunkSectionPos direction,yarnwrap.client.util.math.MatrixStack offsetX,yarnwrap.client.render.VertexConsumer offsetY,double offsetZ, ) { net.minecraft.client.render.debug.LightDebugRenderer.method_51461(direction.wrapperContained,offsetX.wrapperContained,offsetY.wrapperContained,offsetZ); }
// public void method_51462(yarnwrap.util.math.ChunkSectionPos x1,yarnwrap.client.render.VertexConsumerProvider y1,yarnwrap.client.util.math.MatrixStack z1,double x2,double y2,double z2) { wrapperContained.method_51462(x1.wrapperContained,y1.wrapperContained,z1.wrapperContained,x2,y2,z2); }
// public static void method_51462(yarnwrap.util.math.ChunkSectionPos x1,yarnwrap.client.render.VertexConsumerProvider y1,yarnwrap.client.util.math.MatrixStack z1,double x2,double y2,double z2, ) { net.minecraft.client.render.debug.LightDebugRenderer.method_51462(x1.wrapperContained,y1.wrapperContained,z1.wrapperContained,x2,y2,z2); }

}