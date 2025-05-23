package yarnwrap.client.render.debug;
public class OctreeDebugRenderer { public net.minecraft.client.render.debug.OctreeDebugRenderer wrapperContained; public OctreeDebugRenderer(net.minecraft.client.render.debug.OctreeDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.OctreeDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.OctreeDebugRenderer.client = value.wrapperContained; }

public OctreeDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.OctreeDebugRenderer(client.wrapperContained); }
// public float getColorComponent(long size,float gradient) { return wrapperContained.getColorComponent(size,gradient); }
// public static float getColorComponent(long size,float gradient, ) { return net.minecraft.client.render.debug.OctreeDebugRenderer.getColorComponent(size,gradient); }
// public void method_62981(yarnwrap.client.util.math.MatrixStack node,yarnwrap.client.render.VertexConsumerProvider skipVisibilityCheck,double depth) { wrapperContained.method_62981(node.wrapperContained,skipVisibilityCheck.wrapperContained,depth); }
// public static void method_62981(yarnwrap.client.util.math.MatrixStack node,yarnwrap.client.render.VertexConsumerProvider skipVisibilityCheck,double depth, ) { net.minecraft.client.render.debug.OctreeDebugRenderer.method_62981(node.wrapperContained,skipVisibilityCheck.wrapperContained,depth); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.Frustum frustum,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ) { wrapperContained.render(matrices.wrapperContained,frustum.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.Frustum frustum,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ, ) { net.minecraft.client.render.debug.OctreeDebugRenderer.render(matrices.wrapperContained,frustum.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ); }
// public void renderNode(Object node,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,int depth,boolean skipVisibilityCheck,org.apache.commons.lang3.mutable.MutableInt id) { wrapperContained.renderNode(node,matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,depth,skipVisibilityCheck,id); }
// public static void renderNode(Object node,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double cameraX,double cameraY,double cameraZ,int depth,boolean skipVisibilityCheck,org.apache.commons.lang3.mutable.MutableInt id, ) { net.minecraft.client.render.debug.OctreeDebugRenderer.renderNode(node,matrices.wrapperContained,vertexConsumers.wrapperContained,cameraX,cameraY,cameraZ,depth,skipVisibilityCheck,id); }

}