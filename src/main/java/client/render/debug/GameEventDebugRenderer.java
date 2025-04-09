package yarnwrap.client.render.debug;
public class GameEventDebugRenderer { public net.minecraft.client.render.debug.GameEventDebugRenderer wrapperContained; public GameEventDebugRenderer(net.minecraft.client.render.debug.GameEventDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.List entries() { return wrapperContained.entries; }
// public java.util.List listeners() { return wrapperContained.listeners; }
public void addEvent(yarnwrap.registry.RegistryKey eventKey,yarnwrap.util.math.Vec3d pos) { wrapperContained.addEvent(eventKey.wrapperContained,pos.wrapperContained); }
public void addListener(yarnwrap.world.event.PositionSource positionSource,int range) { wrapperContained.addListener(positionSource.wrapperContained,range); }
// public void drawBoxIfCameraReady(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha) { wrapperContained.drawBoxIfCameraReady(matrices.wrapperContained,vertexConsumers.wrapperContained,box.wrapperContained,red,green,blue,alpha); }

}