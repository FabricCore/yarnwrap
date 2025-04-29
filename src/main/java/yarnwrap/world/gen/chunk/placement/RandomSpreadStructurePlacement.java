package yarnwrap.world.gen.chunk.placement;
public class RandomSpreadStructurePlacement { public net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement wrapperContained; public RandomSpreadStructurePlacement(net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.CODEC = value; }

// public int spacing() { return wrapperContained.spacing; }
// public void spacing(int value) { wrapperContained.spacing = value; }
// public static int spacing() { return net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.spacing; }
// public static void spacing(int value, ) { net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.spacing = value; }

// public int separation() { return wrapperContained.separation; }
// public void separation(int value) { wrapperContained.separation = value; }
// public static int separation() { return net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.separation; }
// public static void separation(int value, ) { net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.separation = value; }

// public yarnwrap.world.gen.chunk.placement.SpreadType spreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(wrapperContained.spreadType); }
// public void spreadType(yarnwrap.world.gen.chunk.placement.SpreadType value) { wrapperContained.spreadType = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.placement.SpreadType spreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.spreadType); }
// public static void spreadType(yarnwrap.world.gen.chunk.placement.SpreadType value, ) { net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.spreadType = value.wrapperContained; }

public RandomSpreadStructurePlacement(int spacing,int separation,yarnwrap.world.gen.chunk.placement.SpreadType spreadType,int salt) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement(spacing,separation,spreadType.wrapperContained,salt); }
// public RandomSpreadStructurePlacement(yarnwrap.util.math.Vec3i locateOffset,Object frequencyReductionMethod,float frequency,int salt,java.util.Optional exclusionZone,int spacing,int separation,yarnwrap.world.gen.chunk.placement.SpreadType spreadType) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement(locateOffset.wrapperContained,frequencyReductionMethod,frequency,salt,exclusionZone,spacing,separation,spreadType.wrapperContained); }
public yarnwrap.util.math.ChunkPos getStartChunk(long seed,int chunkX,int chunkZ) { return new yarnwrap.util.math.ChunkPos(wrapperContained.getStartChunk(seed,chunkX,chunkZ)); }
// public static yarnwrap.util.math.ChunkPos getStartChunk(long seed,int chunkX,int chunkZ, ) { return new yarnwrap.util.math.ChunkPos(net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.getStartChunk(seed,chunkX,chunkZ)); }
// public com.mojang.datafixers.kinds.App method_40170(Object instance) { return wrapperContained.method_40170(instance); }
// public static com.mojang.datafixers.kinds.App method_40170(Object instance, ) { return net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.method_40170(instance); }
public int getSpacing() { return wrapperContained.getSpacing(); }
// public static int getSpacing() { return net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.getSpacing(); }
public int getSeparation() { return wrapperContained.getSeparation(); }
// public static int getSeparation() { return net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.getSeparation(); }
public yarnwrap.world.gen.chunk.placement.SpreadType getSpreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(wrapperContained.getSpreadType()); }
// public static yarnwrap.world.gen.chunk.placement.SpreadType getSpreadType() { return new yarnwrap.world.gen.chunk.placement.SpreadType(net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.getSpreadType()); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.chunk.placement.RandomSpreadStructurePlacement structurePlacement) { return wrapperContained.validate(structurePlacement.wrapperContained); }
// public static com.mojang.serialization.DataResult validate(yarnwrap.world.gen.chunk.placement.RandomSpreadStructurePlacement structurePlacement, ) { return net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement.validate(structurePlacement.wrapperContained); }

}