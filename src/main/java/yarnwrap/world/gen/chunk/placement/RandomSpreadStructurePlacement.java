package yarnwrap.world.gen.chunk.placement;
public class RandomSpreadStructurePlacement { public net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement wrapperContained; public RandomSpreadStructurePlacement(net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int spacing() { return wrapperContained.spacing; }
// public void spacing(int value) { wrapperContained.spacing = value; }
// public int separation() { return wrapperContained.separation; }
// public void separation(int value) { wrapperContained.separation = value; }
// public yarnwrap.world.gen.chunk.placement.SpreadType spreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(wrapperContained.spreadType); }
// public void spreadType(yarnwrap.world.gen.chunk.placement.SpreadType value) { wrapperContained.spreadType = value.wrapperContained; }
public yarnwrap.util.math.ChunkPos getStartChunk(long seed,int chunkX,int chunkZ) { return new yarnwrap.util.math.ChunkPos(wrapperContained.getStartChunk(seed,chunkX,chunkZ)); }
public int getSpacing() { return wrapperContained.getSpacing(); }
public int getSeparation() { return wrapperContained.getSeparation(); }
public yarnwrap.world.gen.chunk.placement.SpreadType getSpreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(wrapperContained.getSpreadType()); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.chunk.placement.RandomSpreadStructurePlacement structurePlacement) { return wrapperContained.validate(structurePlacement.wrapperContained); }

}