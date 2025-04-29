package yarnwrap.client.render.debug;
public class CollisionDebugRenderer { public net.minecraft.client.render.debug.CollisionDebugRenderer wrapperContained; public CollisionDebugRenderer(net.minecraft.client.render.debug.CollisionDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.CollisionDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.CollisionDebugRenderer.client = value.wrapperContained; }

// public double lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public void lastUpdateTime(double value) { wrapperContained.lastUpdateTime = value; }
// public static double lastUpdateTime() { return net.minecraft.client.render.debug.CollisionDebugRenderer.lastUpdateTime; }
// public static void lastUpdateTime(double value, ) { net.minecraft.client.render.debug.CollisionDebugRenderer.lastUpdateTime = value; }

// public java.util.List collisions() { return wrapperContained.collisions; }
// public void collisions(java.util.List value) { wrapperContained.collisions = value; }
// public static java.util.List collisions() { return net.minecraft.client.render.debug.CollisionDebugRenderer.collisions; }
// public static void collisions(java.util.List value, ) { net.minecraft.client.render.debug.CollisionDebugRenderer.collisions = value; }

public CollisionDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.CollisionDebugRenderer(client.wrapperContained); }

}