package yarnwrap.client.render.debug;
public class BlockOutlineDebugRenderer { public net.minecraft.client.render.debug.BlockOutlineDebugRenderer wrapperContained; public BlockOutlineDebugRenderer(net.minecraft.client.render.debug.BlockOutlineDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.BlockOutlineDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.BlockOutlineDebugRenderer.client = value.wrapperContained; }

public BlockOutlineDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.BlockOutlineDebugRenderer(client.wrapperContained); }

}