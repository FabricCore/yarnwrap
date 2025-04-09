package yarnwrap.client.render.debug;
public class LightDebugRenderer { public net.minecraft.client.render.debug.LightDebugRenderer wrapperContained; public LightDebugRenderer(net.minecraft.client.render.debug.LightDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration UPDATE_INTERVAL() { return wrapperContained.UPDATE_INTERVAL; }
// public int RADIUS() { return wrapperContained.RADIUS; }
// public org.joml.Vector4f READY_SHAPE_COLOR() { return wrapperContained.READY_SHAPE_COLOR; }
// public org.joml.Vector4f DEFAULT_SHAPE_COLOR() { return wrapperContained.DEFAULT_SHAPE_COLOR; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.world.LightType lightType() { return new yarnwrap.world.LightType(wrapperContained.lightType); }
// public java.time.Instant prevUpdateTime() { return wrapperContained.prevUpdateTime; }
// public Object data() { return wrapperContained.data; }
// public void drawFaces(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color) { wrapperContained.drawFaces(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public void drawEdges(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.util.shape.VoxelSet shape,yarnwrap.util.math.ChunkSectionPos sectionPos,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,org.joml.Vector4f color) { wrapperContained.drawEdges(matrices.wrapperContained,shape.wrapperContained,sectionPos.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,color); }
// public void drawEdge(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double cameraX,double cameraY,double cameraZ,int x1,int y1,int z1,int x2,int y2,int z,org.joml.Vector4f color) { wrapperContained.drawEdge(matrices.wrapperContained,vertexConsumer.wrapperContained,cameraX,cameraY,cameraZ,x1,y1,z1,x2,y2,z,color); }
// public void drawFace(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Direction direction,double cameraX,double cameraY,double cameraZ,int x,int y,int z,org.joml.Vector4f color) { wrapperContained.drawFace(matrices.wrapperContained,vertexConsumer.wrapperContained,direction.wrapperContained,cameraX,cameraY,cameraZ,x,y,z,color); }

}