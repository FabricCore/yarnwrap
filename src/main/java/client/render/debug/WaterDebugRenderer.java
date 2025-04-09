package yarnwrap.client.render.debug;
public class WaterDebugRenderer { public net.minecraft.client.render.debug.WaterDebugRenderer wrapperContained; public WaterDebugRenderer(net.minecraft.client.render.debug.WaterDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }

}