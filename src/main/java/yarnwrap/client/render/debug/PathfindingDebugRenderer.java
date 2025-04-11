package yarnwrap.client.render.debug;
public class PathfindingDebugRenderer { public net.minecraft.client.render.debug.PathfindingDebugRenderer wrapperContained; public PathfindingDebugRenderer(net.minecraft.client.render.debug.PathfindingDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public long MAX_PATH_AGE() { return wrapperContained.MAX_PATH_AGE; }
// public void MAX_PATH_AGE(long value) { wrapperContained.MAX_PATH_AGE = value; }
// public float RANGE() { return wrapperContained.RANGE; }
// public void RANGE(float value) { wrapperContained.RANGE = value; }
// public float DRAWN_STRING_SIZE() { return wrapperContained.DRAWN_STRING_SIZE; }
// public void DRAWN_STRING_SIZE(float value) { wrapperContained.DRAWN_STRING_SIZE = value; }
// public java.util.Map pathTimes() { return wrapperContained.pathTimes; }
// public void pathTimes(java.util.Map value) { wrapperContained.pathTimes = value; }
// public java.util.Map paths() { return wrapperContained.paths; }
// public void paths(java.util.Map value) { wrapperContained.paths = value; }
// public java.util.Map nodeSizes() { return wrapperContained.nodeSizes; }
// public void nodeSizes(java.util.Map value) { wrapperContained.nodeSizes = value; }
public void drawPathLines(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumers,yarnwrap.entity.ai.pathing.Path path,double cameraX,double cameraY,double cameraZ) { wrapperContained.drawPathLines(matrices.wrapperContained,vertexConsumers.wrapperContained,path.wrapperContained,cameraX,cameraY,cameraZ); }
public void drawPath(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.ai.pathing.Path path,float nodeSize,boolean drawDebugNodes,boolean drawLabels,double cameraX,double cameraY,double cameraZ) { wrapperContained.drawPath(matrices.wrapperContained,vertexConsumers.wrapperContained,path.wrapperContained,nodeSize,drawDebugNodes,drawLabels,cameraX,cameraY,cameraZ); }
// public float getManhattanDistance(yarnwrap.util.math.BlockPos pos,double x,double y,double z) { return wrapperContained.getManhattanDistance(pos.wrapperContained,x,y,z); }
public void addPath(int id,yarnwrap.entity.ai.pathing.Path path,float nodeSize) { wrapperContained.addPath(id,path.wrapperContained,nodeSize); }

}