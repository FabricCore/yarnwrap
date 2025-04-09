package yarnwrap.client.render.debug;
public class CollisionDebugRenderer { public net.minecraft.client.render.debug.CollisionDebugRenderer wrapperContained; public CollisionDebugRenderer(net.minecraft.client.render.debug.CollisionDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public double lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public java.util.List collisions() { return wrapperContained.collisions; }

}