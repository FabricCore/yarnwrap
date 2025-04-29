package yarnwrap.client.render.debug;
public class GameEventDebugRenderer { public net.minecraft.client.render.debug.GameEventDebugRenderer wrapperContained; public GameEventDebugRenderer(net.minecraft.client.render.debug.GameEventDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.GameEventDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.client = value.wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.client.render.debug.GameEventDebugRenderer.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.entries = value; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public static java.util.List listeners() { return net.minecraft.client.render.debug.GameEventDebugRenderer.listeners; }
// public static void listeners(java.util.List value, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.listeners = value; }

public GameEventDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.GameEventDebugRenderer(client.wrapperContained); }
// public boolean method_33086(yarnwrap.world.World listener) { return wrapperContained.method_33086(listener.wrapperContained); }
// public static boolean method_33086(yarnwrap.world.World listener, ) { return net.minecraft.client.render.debug.GameEventDebugRenderer.method_33086(listener.wrapperContained); }
public void addEvent(yarnwrap.registry.RegistryKey eventKey,yarnwrap.util.math.Vec3d pos) { wrapperContained.addEvent(eventKey.wrapperContained,pos.wrapperContained); }
// public static void addEvent(yarnwrap.registry.RegistryKey eventKey,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.addEvent(eventKey.wrapperContained,pos.wrapperContained); }
public void addListener(yarnwrap.world.event.PositionSource positionSource,int range) { wrapperContained.addListener(positionSource.wrapperContained,range); }
// public static void addListener(yarnwrap.world.event.PositionSource positionSource,int range, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.addListener(positionSource.wrapperContained,range); }
// public void drawBoxIfCameraReady(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha) { wrapperContained.drawBoxIfCameraReady(matrices.wrapperContained,vertexConsumers.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
// public static void drawBoxIfCameraReady(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.drawBoxIfCameraReady(matrices.wrapperContained,vertexConsumers.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
// public void method_33090(yarnwrap.client.util.math.MatrixStack pos) { wrapperContained.method_33090(pos.wrapperContained); }
// public static void method_33090(yarnwrap.client.util.math.MatrixStack pos, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.method_33090(pos.wrapperContained); }
// public void method_33091(Object pos) { wrapperContained.method_33091(pos); }
// public static void method_33091(Object pos, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.method_33091(pos); }
// public void method_33092(yarnwrap.client.util.math.MatrixStack pos) { wrapperContained.method_33092(pos.wrapperContained); }
// public static void method_33092(yarnwrap.client.util.math.MatrixStack pos, ) { net.minecraft.client.render.debug.GameEventDebugRenderer.method_33092(pos.wrapperContained); }

}