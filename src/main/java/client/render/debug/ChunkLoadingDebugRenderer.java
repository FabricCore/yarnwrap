package yarnwrap.client.render.debug;
public class ChunkLoadingDebugRenderer { public net.minecraft.client.render.debug.ChunkLoadingDebugRenderer wrapperContained; public ChunkLoadingDebugRenderer(net.minecraft.client.render.debug.ChunkLoadingDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object loadingData() { return wrapperContained.loadingData; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public double lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public int LOADING_DATA_CHUNK_RANGE() { return wrapperContained.LOADING_DATA_CHUNK_RANGE; }

}