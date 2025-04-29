package yarnwrap.client.render.debug;
public class SkyLightDebugRenderer { public net.minecraft.client.render.debug.SkyLightDebugRenderer wrapperContained; public SkyLightDebugRenderer(net.minecraft.client.render.debug.SkyLightDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
// public static int RANGE() { return net.minecraft.client.render.debug.SkyLightDebugRenderer.RANGE; }
// public static void RANGE(int value, ) { net.minecraft.client.render.debug.SkyLightDebugRenderer.RANGE = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.SkyLightDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.SkyLightDebugRenderer.client = value.wrapperContained; }

public SkyLightDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.SkyLightDebugRenderer(client.wrapperContained); }

}