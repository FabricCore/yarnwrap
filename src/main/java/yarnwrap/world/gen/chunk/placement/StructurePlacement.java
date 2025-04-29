package yarnwrap.world.gen.chunk.placement;
public class StructurePlacement { public net.minecraft.world.gen.chunk.placement.StructurePlacement wrapperContained; public StructurePlacement(net.minecraft.world.gen.chunk.placement.StructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.chunk.placement.StructurePlacement.TYPE_CODEC = value; }

// public int ARBITRARY_SALT() { return wrapperContained.ARBITRARY_SALT; }
// public void ARBITRARY_SALT(int value) { wrapperContained.ARBITRARY_SALT = value; }
// public static int ARBITRARY_SALT() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.ARBITRARY_SALT; }
// public static void ARBITRARY_SALT(int value, ) { net.minecraft.world.gen.chunk.placement.StructurePlacement.ARBITRARY_SALT = value; }

// public yarnwrap.util.math.Vec3i locateOffset() { return new yarnwrap.util.math.Vec3i(wrapperContained.locateOffset); }
// public void locateOffset(yarnwrap.util.math.Vec3i value) { wrapperContained.locateOffset = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3i locateOffset() { return new yarnwrap.util.math.Vec3i(net.minecraft.world.gen.chunk.placement.StructurePlacement.locateOffset); }
// public static void locateOffset(yarnwrap.util.math.Vec3i value, ) { net.minecraft.world.gen.chunk.placement.StructurePlacement.locateOffset = value.wrapperContained; }

// public Object frequencyReductionMethod() { return wrapperContained.frequencyReductionMethod; }
// // public void frequencyReductionMethod(Object value) { wrapperContained.frequencyReductionMethod = value; }
// // public static Object frequencyReductionMethod() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.frequencyReductionMethod; }
// // public static void frequencyReductionMethod(Object value, ) { net.minecraft.world.gen.chunk.placement.StructurePlacement.frequencyReductionMethod = value; }

// public float frequency() { return wrapperContained.frequency; }
// public void frequency(float value) { wrapperContained.frequency = value; }
// public static float frequency() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.frequency; }
// public static void frequency(float value, ) { net.minecraft.world.gen.chunk.placement.StructurePlacement.frequency = value; }

// public int salt() { return wrapperContained.salt; }
// public void salt(int value) { wrapperContained.salt = value; }
// public static int salt() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.salt; }
// public static void salt(int value, ) { net.minecraft.world.gen.chunk.placement.StructurePlacement.salt = value; }

// public java.util.Optional exclusionZone() { return wrapperContained.exclusionZone; }
// public void exclusionZone(java.util.Optional value) { wrapperContained.exclusionZone = value; }
// public static java.util.Optional exclusionZone() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.exclusionZone; }
// public static void exclusionZone(java.util.Optional value, ) { net.minecraft.world.gen.chunk.placement.StructurePlacement.exclusionZone = value; }

// public StructurePlacement(yarnwrap.util.math.Vec3i locateOffset,Object frequencyReductionMethod,float frequency,int salt,java.util.Optional exclusionZone) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.StructurePlacement(locateOffset.wrapperContained,frequencyReductionMethod,frequency,salt,exclusionZone); }
public yarnwrap.world.gen.chunk.placement.StructurePlacementType getType() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.chunk.placement.StructurePlacementType getType() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementType(net.minecraft.world.gen.chunk.placement.StructurePlacement.getType()); }
// public boolean isStartChunk(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int chunkX,int chunkZ) { return wrapperContained.isStartChunk(calculator.wrapperContained,chunkX,chunkZ); }
// public static boolean isStartChunk(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int chunkX,int chunkZ, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.isStartChunk(calculator.wrapperContained,chunkX,chunkZ); }
// public boolean defaultShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.defaultShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public static boolean defaultShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.defaultShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
public yarnwrap.util.math.BlockPos getLocatePos(yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLocatePos(chunkPos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getLocatePos(yarnwrap.util.math.ChunkPos chunkPos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.chunk.placement.StructurePlacement.getLocatePos(chunkPos.wrapperContained)); }
// public Object buildCodec(Object instance) { return wrapperContained.buildCodec(instance); }
// public static Object buildCodec(Object instance, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.buildCodec(instance); }
// public boolean legacyType3ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.legacyType3ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public static boolean legacyType3ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.legacyType3ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
public boolean shouldGenerate(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int chunkX,int chunkZ) { return wrapperContained.shouldGenerate(calculator.wrapperContained,chunkX,chunkZ); }
// public static boolean shouldGenerate(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int chunkX,int chunkZ, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.shouldGenerate(calculator.wrapperContained,chunkX,chunkZ); }
// public boolean legacyType2ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.legacyType2ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public static boolean legacyType2ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.legacyType2ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public boolean legacyType1ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency) { return wrapperContained.legacyType1ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public static boolean legacyType1ShouldGenerate(long seed,int salt,int chunkX,int chunkZ,float frequency, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.legacyType1ShouldGenerate(seed,salt,chunkX,chunkZ,frequency); }
// public yarnwrap.util.math.Vec3i getLocateOffset() { return new yarnwrap.util.math.Vec3i(wrapperContained.getLocateOffset()); }
// public static yarnwrap.util.math.Vec3i getLocateOffset() { return new yarnwrap.util.math.Vec3i(net.minecraft.world.gen.chunk.placement.StructurePlacement.getLocateOffset()); }
// public Object getFrequencyReductionMethod() { return wrapperContained.getFrequencyReductionMethod(); }
// public static Object getFrequencyReductionMethod() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.getFrequencyReductionMethod(); }
// public float getFrequency() { return wrapperContained.getFrequency(); }
// public static float getFrequency() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.getFrequency(); }
// public int getSalt() { return wrapperContained.getSalt(); }
// public static int getSalt() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.getSalt(); }
// public java.util.Optional getExclusionZone() { return wrapperContained.getExclusionZone(); }
// public static java.util.Optional getExclusionZone() { return net.minecraft.world.gen.chunk.placement.StructurePlacement.getExclusionZone(); }
public boolean applyFrequencyReduction(int chunkX,int chunkZ,long seed) { return wrapperContained.applyFrequencyReduction(chunkX,chunkZ,seed); }
// public static boolean applyFrequencyReduction(int chunkX,int chunkZ,long seed, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.applyFrequencyReduction(chunkX,chunkZ,seed); }
public boolean applyExclusionZone(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int centerChunkX,int centerChunkZ) { return wrapperContained.applyExclusionZone(calculator.wrapperContained,centerChunkX,centerChunkZ); }
// public static boolean applyExclusionZone(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator calculator,int centerChunkX,int centerChunkZ, ) { return net.minecraft.world.gen.chunk.placement.StructurePlacement.applyExclusionZone(calculator.wrapperContained,centerChunkX,centerChunkZ); }

}