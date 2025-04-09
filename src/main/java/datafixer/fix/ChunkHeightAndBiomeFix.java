package yarnwrap.datafixer.fix;
public class ChunkHeightAndBiomeFix { public net.minecraft.datafixer.fix.ChunkHeightAndBiomeFix wrapperContained; public ChunkHeightAndBiomeFix(net.minecraft.datafixer.fix.ChunkHeightAndBiomeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String PLAINS_ID() { return wrapperContained.PLAINS_ID; }
// public java.lang.String NAME() { return wrapperContained.NAME; }
// public int CHUNK_SECTIONS_IN_OLD_CHUNK() { return wrapperContained.CHUNK_SECTIONS_IN_OLD_CHUNK; }
// public int CHUNK_SECTIONS_IN_NEW_CHUNK() { return wrapperContained.CHUNK_SECTIONS_IN_NEW_CHUNK; }
// public int MIN_CHUNK_SECTION_Y() { return wrapperContained.MIN_CHUNK_SECTION_Y; }
// public java.lang.String[] HEIGHTMAP_KEYS() { return wrapperContained.HEIGHTMAP_KEYS; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap RAW_BIOME_IDS() { return wrapperContained.RAW_BIOME_IDS; }
public java.lang.String CONTEXT() { return wrapperContained.CONTEXT; }
// public java.util.Set STATUSES_TO_SKIP_UPDATE() { return wrapperContained.STATUSES_TO_SKIP_UPDATE; }
// public java.util.Set SURFACE_BLOCKS() { return wrapperContained.SURFACE_BLOCKS; }
public int ceilLog2(int value) { return wrapperContained.ceilLog2(value); }
// public com.mojang.serialization.Dynamic fixHeightmaps(com.mojang.serialization.Dynamic level) { return wrapperContained.fixHeightmaps(level); }
// public com.mojang.serialization.Dynamic fixCarvingMasks(com.mojang.serialization.Dynamic level,int sectionsPerChunk,int oldBottomSectionY) { return wrapperContained.fixCarvingMasks(level,sectionsPerChunk,oldBottomSectionY); }
// public com.mojang.serialization.Dynamic fixPaletteWithData(com.mojang.serialization.Dynamic palette,com.mojang.serialization.Dynamic data) { return wrapperContained.fixPaletteWithData(palette,data); }
// public com.mojang.serialization.Dynamic fixBiomes(com.mojang.serialization.Dynamic level,it.unimi.dsi.fastutil.ints.Int2IntFunction biomeGetter) { return wrapperContained.fixBiomes(level,biomeGetter); }
// public com.mojang.serialization.Dynamic fixChunkSectionList(com.mojang.serialization.Dynamic level,java.lang.String key) { return wrapperContained.fixChunkSectionList(level,key); }
// public com.mojang.serialization.Dynamic[] fixBiomes(com.mojang.serialization.Dynamic level,boolean overworld,int heightAlreadyUpdated) { return wrapperContained.fixBiomes(level,overworld,heightAlreadyUpdated); }
// public com.mojang.serialization.Dynamic fixLevel(com.mojang.serialization.Dynamic level,boolean overworld,boolean heightAlreadyUpdated,boolean atNoiseStatus) { return wrapperContained.fixLevel(level,overworld,heightAlreadyUpdated,atNoiseStatus); }
// public com.mojang.serialization.Dynamic fixHeightmap(com.mojang.serialization.Dynamic heightmap) { return wrapperContained.fixHeightmap(heightmap); }
// public com.mojang.serialization.Dynamic fixPalette() { return wrapperContained.fixPalette(); }
// public com.mojang.serialization.Dynamic fixPalette(com.mojang.serialization.Dynamic palette) { return wrapperContained.fixPalette(palette); }
// public com.mojang.serialization.Dynamic fixStatus(com.mojang.serialization.Dynamic level,java.util.Set blocks) { return wrapperContained.fixStatus(level,blocks); }
// public int getClamped(int is,int index) { return wrapperContained.getClamped(is,index); }
// public com.mojang.serialization.Dynamic fixUpgradeData(com.mojang.serialization.Dynamic upgradeData) { return wrapperContained.fixUpgradeData(upgradeData); }

}