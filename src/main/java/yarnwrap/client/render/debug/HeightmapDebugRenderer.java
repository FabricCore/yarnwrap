package yarnwrap.client.render.debug;
public class HeightmapDebugRenderer { public net.minecraft.client.render.debug.HeightmapDebugRenderer wrapperContained; public HeightmapDebugRenderer(net.minecraft.client.render.debug.HeightmapDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.HeightmapDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.HeightmapDebugRenderer.client = value.wrapperContained; }

// public int CHUNK_RANGE() { return wrapperContained.CHUNK_RANGE; }
// public void CHUNK_RANGE(int value) { wrapperContained.CHUNK_RANGE = value; }
// public static int CHUNK_RANGE() { return net.minecraft.client.render.debug.HeightmapDebugRenderer.CHUNK_RANGE; }
// public static void CHUNK_RANGE(int value, ) { net.minecraft.client.render.debug.HeightmapDebugRenderer.CHUNK_RANGE = value; }

// public float BOX_HEIGHT() { return wrapperContained.BOX_HEIGHT; }
// public void BOX_HEIGHT(float value) { wrapperContained.BOX_HEIGHT = value; }
// public static float BOX_HEIGHT() { return net.minecraft.client.render.debug.HeightmapDebugRenderer.BOX_HEIGHT; }
// public static void BOX_HEIGHT(float value, ) { net.minecraft.client.render.debug.HeightmapDebugRenderer.BOX_HEIGHT = value; }

public HeightmapDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.HeightmapDebugRenderer(client.wrapperContained); }
// public org.joml.Vector3f getColorForHeightmapType(Object type) { return wrapperContained.getColorForHeightmapType(type); }
// public static org.joml.Vector3f getColorForHeightmapType(Object type, ) { return net.minecraft.client.render.debug.HeightmapDebugRenderer.getColorForHeightmapType(type); }

}