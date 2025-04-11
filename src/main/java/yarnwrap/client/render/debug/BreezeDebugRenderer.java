package yarnwrap.client.render.debug;
public class BreezeDebugRenderer { public net.minecraft.client.render.debug.BreezeDebugRenderer wrapperContained; public BreezeDebugRenderer(net.minecraft.client.render.debug.BreezeDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int PINK() { return wrapperContained.PINK; }
// public void PINK(int value) { wrapperContained.PINK = value; }
// public int LIGHT_BLUE() { return wrapperContained.LIGHT_BLUE; }
// public void LIGHT_BLUE(int value) { wrapperContained.LIGHT_BLUE = value; }
// public int GREEN() { return wrapperContained.GREEN; }
// public void GREEN(int value) { wrapperContained.GREEN = value; }
// public int ORANGE() { return wrapperContained.ORANGE; }
// public void ORANGE(int value) { wrapperContained.ORANGE = value; }
// public int RED() { return wrapperContained.RED; }
// public void RED(int value) { wrapperContained.RED = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Map breezes() { return wrapperContained.breezes; }
// public void breezes(java.util.Map value) { wrapperContained.breezes = value; }
public void clear() { wrapperContained.clear(); }
// public void drawCurvePart(int index,org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color) { wrapperContained.drawCurvePart(index,matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ); }
// public void drawLine(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.Vec3d entityPos,yarnwrap.util.math.Vec3d targetPos,int color) { wrapperContained.drawLine(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,entityPos.wrapperContained,targetPos.wrapperContained,color); }
// public void drawCurve(org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color) { wrapperContained.drawCurve(matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
// public void addBreezeDebugInfo(Object breezeDebugInfo) { wrapperContained.addBreezeDebugInfo(breezeDebugInfo); }

}