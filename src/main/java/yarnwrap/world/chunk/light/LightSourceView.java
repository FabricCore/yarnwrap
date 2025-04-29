package yarnwrap.world.chunk.light;
public class LightSourceView { public net.minecraft.world.chunk.light.LightSourceView wrapperContained; public LightSourceView(net.minecraft.world.chunk.light.LightSourceView wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.light.ChunkSkyLight getChunkSkyLight() { return new yarnwrap.world.chunk.light.ChunkSkyLight(wrapperContained.getChunkSkyLight()); }
// public static yarnwrap.world.chunk.light.ChunkSkyLight getChunkSkyLight() { return new yarnwrap.world.chunk.light.ChunkSkyLight(net.minecraft.world.chunk.light.LightSourceView.getChunkSkyLight()); }
public void forEachLightSource(java.util.function.BiConsumer callback) { wrapperContained.forEachLightSource(callback); }
// public static void forEachLightSource(java.util.function.BiConsumer callback, ) { net.minecraft.world.chunk.light.LightSourceView.forEachLightSource(callback); }

}