package yarnwrap.datafixer.fix;
public class ChunkToProtoChunkFix { public net.minecraft.datafixer.fix.ChunkToProtoChunkFix wrapperContained; public ChunkToProtoChunkFix(net.minecraft.datafixer.fix.ChunkToProtoChunkFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ChunkToProtoChunkFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changestype) { this.wrapperContained = new net.minecraft.datafixer.fix.ChunkToProtoChunkFix(outputSchema,changestype); }
// public short packChunkSectionPos(int x,int y,int z) { return wrapperContained.packChunkSectionPos(x,y,z); }
// public it.unimi.dsi.fastutil.shorts.ShortArrayList method_39941(int sectionY) { return wrapperContained.method_39941(sectionY); }
// public com.mojang.serialization.Dynamic fixLevel(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.fixLevel(levelDynamic); }
// public com.mojang.serialization.Dynamic method_39944(com.mojang.serialization.Dynamic packedLocalPos) { return wrapperContained.method_39944(packedLocalPos); }
// public com.mojang.serialization.Dynamic method_39945(com.mojang.serialization.Dynamic biomesDynamic) { return wrapperContained.method_39945(biomesDynamic); }
// public com.mojang.serialization.Dynamic method_39946(com.mojang.serialization.Dynamic section) { return wrapperContained.method_39946(section); }
// public com.mojang.serialization.Dynamic method_39947(com.mojang.serialization.Dynamic biomes) { return wrapperContained.method_39947(biomes); }
// public com.mojang.serialization.Dynamic method_39948(com.mojang.serialization.Dynamic tileTicksDynamic) { return wrapperContained.method_39948(tileTicksDynamic); }
// public void method_39949(java.util.List tickTag) { wrapperContained.method_39949(tickTag); }
// public com.mojang.serialization.Dynamic fixBiomes(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.fixBiomes(levelDynamic); }
// public com.mojang.serialization.Dynamic fixTileTicks(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.fixTileTicks(levelDynamic); }
// public com.mojang.serialization.Dynamic method_39954(com.mojang.serialization.Dynamic chunkDynamic) { return wrapperContained.method_39954(chunkDynamic); }

}