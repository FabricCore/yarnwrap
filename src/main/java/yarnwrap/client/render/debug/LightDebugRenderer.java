package yarnwrap.client.render.debug;
public class LightDebugRenderer { public net.minecraft.client.render.debug.LightDebugRenderer wrapperContained; public LightDebugRenderer(net.minecraft.client.render.debug.LightDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration UPDATE_INTERVAL() { return wrapperContained.UPDATE_INTERVAL; }
// public void UPDATE_INTERVAL(java.time.Duration value) { wrapperContained.UPDATE_INTERVAL = value; }
// public int RADIUS() { return wrapperContained.RADIUS; }
// public void RADIUS(int value) { wrapperContained.RADIUS = value; }
// public org.joml.Vector4f READY_SHAPE_COLOR() { return wrapperContained.READY_SHAPE_COLOR; }
// public void READY_SHAPE_COLOR(org.joml.Vector4f value) { wrapperContained.READY_SHAPE_COLOR = value; }
// public org.joml.Vector4f DEFAULT_SHAPE_COLOR() { return wrapperContained.DEFAULT_SHAPE_COLOR; }
// public void DEFAULT_SHAPE_COLOR(org.joml.Vector4f value) { wrapperContained.DEFAULT_SHAPE_COLOR = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.world.LightType lightType() { return new yarnwrap.world.LightType(wrapperContained.lightType); }
// public void lightType(yarnwrap.world.LightType value) { wrapperContained.lightType = value.wrapperContained; }
// public java.time.Instant prevUpdateTime() { return wrapperContained.prevUpdateTime; }
// public void prevUpdateTime(java.time.Instant value) { wrapperContained.prevUpdateTime = value; }
// public Object data() { return wrapperContained.data; }
// // public void data(Object value) { wrapperContained.data = value; }
// public void drawFaces(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color) { wrapperContained.drawFaces(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public void drawEdges(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color) { wrapperContained.drawEdges(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public void drawEdge(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,int x1,int y1,int z1,int x2,int y2,int z,org.joml.Vector4f color) { wrapperContained.drawEdge(matrices.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,x1,y1,z1,x2,y2,z,color); }
// public void drawFace(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Direction direction,double cameraX,double cameraY,double cameraZ,int x,int y,int z,org.joml.Vector4f color) { wrapperContained.drawFace(matrices.wrapperContained,vertexConsumer.wrapperContained,direction.wrapperContained,cameraX,cameraY,cameraZ,x,y,z,color); }

}