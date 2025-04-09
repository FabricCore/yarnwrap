package yarnwrap.world.chunk;
public class BelowZeroRetrogen { public net.minecraft.world.chunk.BelowZeroRetrogen wrapperContained; public BelowZeroRetrogen(net.minecraft.world.chunk.BelowZeroRetrogen wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.BitSet EMPTY_MISSING_BEDROCK_BIT_SET() { return wrapperContained.EMPTY_MISSING_BEDROCK_BIT_SET; }
// public com.mojang.serialization.Codec MISSING_BEDROCK_CODEC() { return wrapperContained.MISSING_BEDROCK_CODEC; }
// public com.mojang.serialization.Codec STATUS_CODEC() { return wrapperContained.STATUS_CODEC; }
// public yarnwrap.world.chunk.ChunkStatus targetStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.targetStatus); }
// public java.util.BitSet missingBedrock() { return wrapperContained.missingBedrock; }
public yarnwrap.world.HeightLimitView BELOW_ZERO_VIEW() { return new yarnwrap.world.HeightLimitView(wrapperContained.BELOW_ZERO_VIEW); }
// public java.util.Set CAVE_BIOMES() { return wrapperContained.CAVE_BIOMES; }
public yarnwrap.world.chunk.ChunkStatus getTargetStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getTargetStatus()); }
public yarnwrap.world.chunk.BelowZeroRetrogen fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.chunk.BelowZeroRetrogen(wrapperContained.fromNbt(nbt.wrapperContained)); }
public void replaceOldBedrock(yarnwrap.world.chunk.ProtoChunk chunk) { wrapperContained.replaceOldBedrock(chunk.wrapperContained); }
public yarnwrap.world.biome.source.BiomeSupplier getBiomeSupplier(yarnwrap.world.biome.source.BiomeSupplier biomeSupplier,yarnwrap.world.chunk.Chunk chunk) { return new yarnwrap.world.biome.source.BiomeSupplier(wrapperContained.getBiomeSupplier(biomeSupplier.wrapperContained,chunk.wrapperContained)); }
public boolean isColumnMissingBedrock(int x,int z) { return wrapperContained.isColumnMissingBedrock(x,z); }
public boolean hasMissingBedrock() { return wrapperContained.hasMissingBedrock(); }
public void fillColumnsWithAirIfMissingBedrock(yarnwrap.world.chunk.ProtoChunk chunk) { wrapperContained.fillColumnsWithAirIfMissingBedrock(chunk.wrapperContained); }

}