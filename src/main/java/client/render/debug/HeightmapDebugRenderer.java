package yarnwrap.client.render.debug;
public class HeightmapDebugRenderer { public net.minecraft.client.render.debug.HeightmapDebugRenderer wrapperContained; public HeightmapDebugRenderer(net.minecraft.client.render.debug.HeightmapDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CHUNK_RANGE() { return wrapperContained.CHUNK_RANGE; }
// public float BOX_HEIGHT() { return wrapperContained.BOX_HEIGHT; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public org.joml.Vector3f getColorForHeightmapType(Object type) { return wrapperContained.getColorForHeightmapType(type); }

}