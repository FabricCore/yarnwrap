package yarnwrap.client.render.debug;
public class ChunkBorderDebugRenderer { public net.minecraft.client.render.debug.ChunkBorderDebugRenderer wrapperContained; public ChunkBorderDebugRenderer(net.minecraft.client.render.debug.ChunkBorderDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.ChunkBorderDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.ChunkBorderDebugRenderer.client = value.wrapperContained; }

// public int DARK_CYAN() { return wrapperContained.DARK_CYAN; }
// public void DARK_CYAN(int value) { wrapperContained.DARK_CYAN = value; }
// public static int DARK_CYAN() { return net.minecraft.client.render.debug.ChunkBorderDebugRenderer.DARK_CYAN; }
// public static void DARK_CYAN(int value, ) { net.minecraft.client.render.debug.ChunkBorderDebugRenderer.DARK_CYAN = value; }

// public int YELLOW() { return wrapperContained.YELLOW; }
// public void YELLOW(int value) { wrapperContained.YELLOW = value; }
// public static int YELLOW() { return net.minecraft.client.render.debug.ChunkBorderDebugRenderer.YELLOW; }
// public static void YELLOW(int value, ) { net.minecraft.client.render.debug.ChunkBorderDebugRenderer.YELLOW = value; }

public ChunkBorderDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.ChunkBorderDebugRenderer(client.wrapperContained); }

}