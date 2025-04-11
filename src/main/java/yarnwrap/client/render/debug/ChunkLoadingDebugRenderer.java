package yarnwrap.client.render.debug;
public class ChunkLoadingDebugRenderer { public net.minecraft.client.render.debug.ChunkLoadingDebugRenderer wrapperContained; public ChunkLoadingDebugRenderer(net.minecraft.client.render.debug.ChunkLoadingDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object loadingData() { return wrapperContained.loadingData; }
// // public void loadingData(Object value) { wrapperContained.loadingData = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public double lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public void lastUpdateTime(double value) { wrapperContained.lastUpdateTime = value; }
// public int LOADING_DATA_CHUNK_RANGE() { return wrapperContained.LOADING_DATA_CHUNK_RANGE; }
// public void LOADING_DATA_CHUNK_RANGE(int value) { wrapperContained.LOADING_DATA_CHUNK_RANGE = value; }
public ChunkLoadingDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.ChunkLoadingDebugRenderer(client.wrapperContained); }

}