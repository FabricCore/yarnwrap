package yarnwrap.world.gen.chunk.placement;
public class StructurePlacement { public net.minecraft.world.gen.chunk.placement.StructurePlacement wrapperContained; public StructurePlacement(net.minecraft.world.gen.chunk.placement.StructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public int ARBITRARY_SALT() { return wrapperContained.ARBITRARY_SALT; }
// public void ARBITRARY_SALT(int value) { wrapperContained.ARBITRARY_SALT = value; }
// public yarnwrap.util.math.Vec3i locateOffset() { return new yarnwrap.util.math.Vec3i(wrapperContained.locateOffset); }
// public void locateOffset(yarnwrap.util.math.Vec3i value) { wrapperContained.locateOffset = value.wrapperContained; }
// public Object frequencyReductionMethod() { return wrapperContained.frequencyReductionMethod; }
// // public void frequencyReductionMethod(Object value) { wrapperContained.frequencyReductionMethod = value; }
// public float frequency() { return wrapperContained.frequency; }
// public void frequency(float value) { wrapperContained.frequency = value; }
// public int salt() { return wrapperContained.salt; }
// public void salt(int value) { wrapperContained.salt = value; }
// public java.util.Optional exclusionZone() { return wrapperContained.exclusionZone; }
// public void exclusionZone(java.util.Optional value) { wrapperContained.exclusionZone = value; }
// public StructurePlacement(yarnwrap.util.math.Vec3i locateOffset,Object frequencyReductionMethod,float frequency,int salt,java.util.Optional exclusionZone) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.StructurePlacement(locateOffset.wrapperContained,frequencyReductionMethod,frequency,salt,exclusionZone); }
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