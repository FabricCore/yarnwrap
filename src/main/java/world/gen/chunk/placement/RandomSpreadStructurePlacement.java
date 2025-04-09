package yarnwrap.world.gen.chunk.placement;
public class RandomSpreadStructurePlacement { public net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement wrapperContained; public RandomSpreadStructurePlacement(net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int spacing() { return wrapperContained.spacing; }
// public int separation() { return wrapperContained.separation; }
// public yarnwrap.world.gen.chunk.placement.SpreadType spreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(wrapperContained.spreadType); }
public yarnwrap.util.math.ChunkPos getStartChunk(long seed,int chunkX,int chunkZ) { return new yarnwrap.util.math.ChunkPos(wrapperContained.getStartChunk(seed,chunkX,chunkZ)); }
public int getSpacing() { return wrapperContained.getSpacing(); }
public int getSeparation() { return wrapperContained.getSeparation(); }
public yarnwrap.world.gen.chunk.placement.SpreadType getSpreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(wrapperContained.getSpreadType()); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.chunk.placement.RandomSpreadStructurePlacement structurePlacement) { return wrapperContained.validate(structurePlacement.wrapperContained); }

}