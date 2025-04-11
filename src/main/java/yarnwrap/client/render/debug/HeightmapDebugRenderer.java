package yarnwrap.client.render.debug;
public class HeightmapDebugRenderer { public net.minecraft.client.render.debug.HeightmapDebugRenderer wrapperContained; public HeightmapDebugRenderer(net.minecraft.client.render.debug.HeightmapDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CHUNK_RANGE() { return wrapperContained.CHUNK_RANGE; }
// public void CHUNK_RANGE(int value) { wrapperContained.CHUNK_RANGE = value; }
// public float BOX_HEIGHT() { return wrapperContained.BOX_HEIGHT; }
// public void BOX_HEIGHT(float value) { wrapperContained.BOX_HEIGHT = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public HeightmapDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.HeightmapDebugRenderer(client.wrapperContained); }
// public org.joml.Vector3f getColorForHeightmapType(Object type) { return wrapperContained.getColorForHeightmapType(type); }

}