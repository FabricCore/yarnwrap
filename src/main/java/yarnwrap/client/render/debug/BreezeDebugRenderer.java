package yarnwrap.client.render.debug;
public class BreezeDebugRenderer { public net.minecraft.client.render.debug.BreezeDebugRenderer wrapperContained; public BreezeDebugRenderer(net.minecraft.client.render.debug.BreezeDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int PINK() { return wrapperContained.PINK; }
// public void PINK(int value) { wrapperContained.PINK = value; }
// public static int PINK() { return net.minecraft.client.render.debug.BreezeDebugRenderer.PINK; }
// public static void PINK(int value, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.PINK = value; }

// public int LIGHT_BLUE() { return wrapperContained.LIGHT_BLUE; }
// public void LIGHT_BLUE(int value) { wrapperContained.LIGHT_BLUE = value; }
// public static int LIGHT_BLUE() { return net.minecraft.client.render.debug.BreezeDebugRenderer.LIGHT_BLUE; }
// public static void LIGHT_BLUE(int value, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.LIGHT_BLUE = value; }

// public int GREEN() { return wrapperContained.GREEN; }
// public void GREEN(int value) { wrapperContained.GREEN = value; }
// public static int GREEN() { return net.minecraft.client.render.debug.BreezeDebugRenderer.GREEN; }
// public static void GREEN(int value, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.GREEN = value; }

// public int ORANGE() { return wrapperContained.ORANGE; }
// public void ORANGE(int value) { wrapperContained.ORANGE = value; }
// public static int ORANGE() { return net.minecraft.client.render.debug.BreezeDebugRenderer.ORANGE; }
// public static void ORANGE(int value, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.ORANGE = value; }

// public int RED() { return wrapperContained.RED; }
// public void RED(int value) { wrapperContained.RED = value; }
// public static int RED() { return net.minecraft.client.render.debug.BreezeDebugRenderer.RED; }
// public static void RED(int value, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.RED = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.BreezeDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.client = value.wrapperContained; }

// public java.util.Map breezes() { return wrapperContained.breezes; }
// public void breezes(java.util.Map value) { wrapperContained.breezes = value; }
// public static java.util.Map breezes() { return net.minecraft.client.render.debug.BreezeDebugRenderer.breezes; }
// public static void breezes(java.util.Map value, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.breezes = value; }

public BreezeDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.BreezeDebugRenderer(client.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.debug.BreezeDebugRenderer.clear(); }
// public void drawCurvePart(int index,org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color) { wrapperContained.drawCurvePart(index,matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
// public static void drawCurvePart(int index,org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.drawCurvePart(index,matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
// public yarnwrap.util.math.Vec3d method_55257(yarnwrap.entity.Entity attackTarget) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_55257(attackTarget.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d method_55257(yarnwrap.entity.Entity attackTarget, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.debug.BreezeDebugRenderer.method_55257(attackTarget.wrapperContained)); }
// public boolean method_55258(yarnwrap.entity.mob.BreezeEntity entity) { return wrapperContained.method_55258(entity.wrapperContained); }
// public static boolean method_55258(yarnwrap.entity.mob.BreezeEntity entity, ) { return net.minecraft.client.render.debug.BreezeDebugRenderer.method_55258(entity.wrapperContained); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.render(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ); }
// public void method_55260(yarnwrap.client.util.math.MatrixStack targetPos) { wrapperContained.method_55260(targetPos.wrapperContained); }
// public static void method_55260(yarnwrap.client.util.math.MatrixStack targetPos, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.method_55260(targetPos.wrapperContained); }
// public void method_55261(yarnwrap.client.util.math.MatrixStack jumpTarget) { wrapperContained.method_55261(jumpTarget.wrapperContained); }
// public static void method_55261(yarnwrap.client.util.math.MatrixStack jumpTarget, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.method_55261(jumpTarget.wrapperContained); }
// public void drawLine(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.Vec3d entityPos,yarnwrap.util.math.Vec3d targetPos,int color) { wrapperContained.drawLine(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,entityPos.wrapperContained,targetPos.wrapperContained,color); }
// public static void drawLine(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.Vec3d entityPos,yarnwrap.util.math.Vec3d targetPos,int color, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.drawLine(matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,entityPos.wrapperContained,targetPos.wrapperContained,color); }
// public void method_55263(yarnwrap.client.network.ClientPlayerEntity breeze) { wrapperContained.method_55263(breeze.wrapperContained); }
// public static void method_55263(yarnwrap.client.network.ClientPlayerEntity breeze, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.method_55263(breeze.wrapperContained); }
// public yarnwrap.entity.Entity method_55264(yarnwrap.client.network.ClientPlayerEntity attackTarget) { return new yarnwrap.entity.Entity(wrapperContained.method_55264(attackTarget.wrapperContained)); }
// public static yarnwrap.entity.Entity method_55264(yarnwrap.client.network.ClientPlayerEntity attackTarget, ) { return new yarnwrap.entity.Entity(net.minecraft.client.render.debug.BreezeDebugRenderer.method_55264(attackTarget.wrapperContained)); }
// public void drawCurve(org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color) { wrapperContained.drawCurve(matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
// public static void drawCurve(org.joml.Matrix4f matrix,double cameraX,double cameraY,double cameraZ,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Vec3d targetPos,float multiplier,int color, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.drawCurve(matrix,cameraX,cameraY,cameraZ,vertexConsumer.wrapperContained,targetPos.wrapperContained,multiplier,color); }
// public void addBreezeDebugInfo(Object breezeDebugInfo) { wrapperContained.addBreezeDebugInfo(breezeDebugInfo); }
// public static void addBreezeDebugInfo(Object breezeDebugInfo, ) { net.minecraft.client.render.debug.BreezeDebugRenderer.addBreezeDebugInfo(breezeDebugInfo); }

}