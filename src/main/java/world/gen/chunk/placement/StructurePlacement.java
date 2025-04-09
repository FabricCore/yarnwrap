package yarnwrap.world.gen.chunk.placement;
public class StructurePlacement { public net.minecraft.world.gen.chunk.placement.StructurePlacement wrapperContained; public StructurePlacement(net.minecraft.world.gen.chunk.placement.StructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public int ARBITRARY_SALT() { return wrapperContained.ARBITRARY_SALT; }
// public yarnwrap.util.math.Vec3i locateOffset() { return new yarnwrap.util.math.Vec3i(wrapperContained.locateOffset); }
// public Object frequencyReductionMethod() { return wrapperContained.frequencyReductionMethod; }
// public float frequency() { return wrapperContained.frequency; }
// public int salt() { return wrapperContained.salt; }
// public java.util.Optional exclusionZone() { return wrapperContained.exclusionZone; }
public yarnwrap.world.gen.chunk.placement.StructurePlacementType getType() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementType(wrapperContained.getType()); }
// public boolean isStartChunk(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int chunkX,int chunkZ) { return wrapperContained.isStartChunk(calculator.wrapperContained,chunkX,chunkZ); }
// public boolean defaultShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.defaultShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
public yarnwrap.util.math.BlockPos getLocatePos(yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLocatePos(chunkPos.wrapperContained)); }
// public Object buildCodec(Object instance) { return wrapperContained.buildCodec(instance); }
// public boolean legacyType3ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.legacyType3ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
public boolean shouldGenerate(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int chunkX,int chunkZ) { return wrapperContained.shouldGenerate(calculator.wrapperContained,chunkX,chunkZ); }
// public boolean legacyType2ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.legacyType2ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public boolean legacyType1ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.legacyType1ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public yarnwrap.util.math.Vec3i getLocateOffset() { return new yarnwrap.util.math.Vec3i(wrapperContained.getLocateOffset()); }
// public Object getFrequencyReductionMethod() { return wrapperContained.getFrequencyReductionMethod(); }
// public float getFrequency() { return wrapperContained.getFrequency(); }
// public int getSalt() { return wrapperContained.getSalt(); }
// public java.util.Optional getExclusionZone() { return wrapperContained.getExclusionZone(); }
public boolean applyFrequencyReduction(int chunkX,int chunkZ,long seed) { return wrapperContained.applyFrequencyReduction(chunkX,chunkZ,seed); }
public boolean applyExclusionZone(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int centerChunkX,int centerChunkZ) { return wrapperContained.applyExclusionZone(calculator.wrapperContained,centerChunkX,centerChunkZ); }

}