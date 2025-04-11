package yarnwrap.client.render.debug;
public class CollisionDebugRenderer { public net.minecraft.client.render.debug.CollisionDebugRenderer wrapperContained; public CollisionDebugRenderer(net.minecraft.client.render.debug.CollisionDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public double lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public void lastUpdateTime(double value) { wrapperContained.lastUpdateTime = value; }
// public java.util.List collisions() { return wrapperContained.collisions; }
// public void collisions(java.util.List value) { wrapperContained.collisions = value; }

}