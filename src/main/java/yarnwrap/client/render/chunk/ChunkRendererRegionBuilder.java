package yarnwrap.client.render.chunk;
public class ChunkRendererRegionBuilder { public net.minecraft.client.render.chunk.ChunkRendererRegionBuilder wrapperContained; public ChunkRendererRegionBuilder(net.minecraft.client.render.chunk.ChunkRendererRegionBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.chunk.ChunkRendererRegion build() { return new yarnwrap.client.render.chunk.ChunkRendererRegion(wrapperContained.build()); }
// public static yarnwrap.client.render.chunk.ChunkRendererRegion build() { return new yarnwrap.client.render.chunk.ChunkRendererRegion(net.minecraft.client.render.chunk.ChunkRendererRegionBuilder.build()); }

}