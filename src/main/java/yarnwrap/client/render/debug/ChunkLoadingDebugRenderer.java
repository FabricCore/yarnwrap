package yarnwrap.client.render.debug;
public class ChunkLoadingDebugRenderer { public net.minecraft.client.render.debug.ChunkLoadingDebugRenderer wrapperContained; public ChunkLoadingDebugRenderer(net.minecraft.client.render.debug.ChunkLoadingDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.client = value.wrapperContained; }

// public double lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public void lastUpdateTime(double value) { wrapperContained.lastUpdateTime = value; }
// public static double lastUpdateTime() { return net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.lastUpdateTime; }
// public static void lastUpdateTime(double value, ) { net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.lastUpdateTime = value; }

// public int LOADING_DATA_CHUNK_RANGE() { return wrapperContained.LOADING_DATA_CHUNK_RANGE; }
// public void LOADING_DATA_CHUNK_RANGE(int value) { wrapperContained.LOADING_DATA_CHUNK_RANGE = value; }
// public static int LOADING_DATA_CHUNK_RANGE() { return net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.LOADING_DATA_CHUNK_RANGE; }
// public static void LOADING_DATA_CHUNK_RANGE(int value, ) { net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.LOADING_DATA_CHUNK_RANGE = value; }

// public Object loadingData() { return wrapperContained.loadingData; }
// // public void loadingData(Object value) { wrapperContained.loadingData = value; }
// // public static Object loadingData() { return net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.loadingData; }
// // public static void loadingData(Object value, ) { net.minecraft.client.render.debug.ChunkLoadingDebugRenderer.loadingData = value; }

public ChunkLoadingDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.ChunkLoadingDebugRenderer(client.wrapperContained); }

}