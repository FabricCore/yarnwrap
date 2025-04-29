package yarnwrap.world.chunk.light;
public class SkyLightStorage { public net.minecraft.world.chunk.light.SkyLightStorage wrapperContained; public SkyLightStorage(net.minecraft.world.chunk.light.SkyLightStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public SkyLightStorage(yarnwrap.world.chunk.ChunkProvider chunkProvider) { this.wrapperContained = new net.minecraft.world.chunk.light.SkyLightStorage(chunkProvider.wrapperContained); }
// public boolean isAboveMinHeight(int sectionY) { return wrapperContained.isAboveMinHeight(sectionY); }
// public static boolean isAboveMinHeight(int sectionY, ) { return net.minecraft.world.chunk.light.SkyLightStorage.isAboveMinHeight(sectionY); }
// public boolean isAtOrAboveTopmostSection(long sectionPos) { return wrapperContained.isAtOrAboveTopmostSection(sectionPos); }
// public static boolean isAtOrAboveTopmostSection(long sectionPos, ) { return net.minecraft.world.chunk.light.SkyLightStorage.isAtOrAboveTopmostSection(sectionPos); }
// public int getLight(long blockPos,boolean cached) { return wrapperContained.getLight(blockPos,cached); }
// public static int getLight(long blockPos,boolean cached, ) { return net.minecraft.world.chunk.light.SkyLightStorage.getLight(blockPos,cached); }
// public yarnwrap.world.chunk.ChunkNibbleArray copy(yarnwrap.world.chunk.ChunkNibbleArray source) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.copy(source.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray copy(yarnwrap.world.chunk.ChunkNibbleArray source, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.light.SkyLightStorage.copy(source.wrapperContained)); }
// public int getMinSectionY() { return wrapperContained.getMinSectionY(); }
// public static int getMinSectionY() { return net.minecraft.world.chunk.light.SkyLightStorage.getMinSectionY(); }
// public int getTopSectionForColumn(long columnPos) { return wrapperContained.getTopSectionForColumn(columnPos); }
// public static int getTopSectionForColumn(long columnPos, ) { return net.minecraft.world.chunk.light.SkyLightStorage.getTopSectionForColumn(columnPos); }

}