package yarnwrap.client.render.debug;
public class WaterDebugRenderer { public net.minecraft.client.render.debug.WaterDebugRenderer wrapperContained; public WaterDebugRenderer(net.minecraft.client.render.debug.WaterDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public WaterDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.WaterDebugRenderer(client.wrapperContained); }

}