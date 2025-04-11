package yarnwrap.world.chunk.light;
public class SkyLightStorage { public net.minecraft.world.chunk.light.SkyLightStorage wrapperContained; public SkyLightStorage(net.minecraft.world.chunk.light.SkyLightStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public SkyLightStorage(yarnwrap.world.chunk.ChunkProvider chunkProvider) { this.wrapperContained = new net.minecraft.world.chunk.light.SkyLightStorage(chunkProvider.wrapperContained); }
// public boolean isAboveMinHeight(int sectionY) { return wrapperContained.isAboveMinHeight(sectionY); }
// public boolean isAtOrAboveTopmostSection(long sectionPos) { return wrapperContained.isAtOrAboveTopmostSection(sectionPos); }
// public int getLight(long blockPos,boolean cached) { return wrapperContained.getLight(blockPos,cached); }
// public yarnwrap.world.chunk.ChunkNibbleArray copy(yarnwrap.world.chunk.ChunkNibbleArray source) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.copy(source.wrapperContained)); }
// public int getMinSectionY() { return wrapperContained.getMinSectionY(); }
// public int getTopSectionForColumn(long columnPos) { return wrapperContained.getTopSectionForColumn(columnPos); }

}