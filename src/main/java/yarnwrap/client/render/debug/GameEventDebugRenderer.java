package yarnwrap.client.render.debug;
public class GameEventDebugRenderer { public net.minecraft.client.render.debug.GameEventDebugRenderer wrapperContained; public GameEventDebugRenderer(net.minecraft.client.render.debug.GameEventDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
public GameEventDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.GameEventDebugRenderer(client.wrapperContained); }
// public boolean method_33086(yarnwrap.world.World listener) { return wrapperContained.method_33086(listener.wrapperContained); }
public void addEvent(yarnwrap.registry.RegistryKey eventKey,yarnwrap.util.math.Vec3d pos) { wrapperContained.addEvent(eventKey.wrapperContained,pos.wrapperContained); }
public void addListener(yarnwrap.world.event.PositionSource positionSource,int range) { wrapperContained.addListener(positionSource.wrapperContained,range); }
// public void drawBoxIfCameraReady(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha) { wrapperContained.drawBoxIfCameraReady(matrices.wrapperContained,vertexConsumers.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
// public void method_33090(yarnwrap.client.util.math.MatrixStack pos) { wrapperContained.method_33090(pos.wrapperContained); }
// public void method_33091(Object pos) { wrapperContained.method_33091(pos); }
// public void method_33092(yarnwrap.client.util.math.MatrixStack pos) { wrapperContained.method_33092(pos.wrapperContained); }

}