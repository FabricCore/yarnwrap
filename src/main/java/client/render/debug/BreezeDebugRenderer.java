package yarnwrap.client.render.debug;
public class BreezeDebugRenderer { public net.minecraft.client.render.debug.BreezeDebugRenderer wrapperContained; public BreezeDebugRenderer(net.minecraft.client.render.debug.BreezeDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int PINK() { return wrapperContained.PINK; }
// public int LIGHT_BLUE() { return wrapperContained.LIGHT_BLUE; }
// public int GREEN() { return wrapperContained.GREEN; }
// public int ORANGE() { return wrapperContained.ORANGE; }
// public int RED() { return wrapperContained.RED; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Map breezes() { return wrapperContained.breezes; }
public void clear() { wrapperContained.clear(); }
// public void drawCurvePart(int index,org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color) { wrapperContained.drawCurvePart(index,matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ); }
// public void drawLine(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.Vec3d entityPos,yarnwrap.util.math.Vec3d targetPos,int color) { wrapperContained.drawLine(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,entityPos.wrapperContained,targetPos.wrapperContained,color); }
// public void drawCurve(org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color) { wrapperContained.drawCurve(matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
// public void addBreezeDebugInfo(Object breezeDebugInfo) { wrapperContained.addBreezeDebugInfo(breezeDebugInfo); }

}