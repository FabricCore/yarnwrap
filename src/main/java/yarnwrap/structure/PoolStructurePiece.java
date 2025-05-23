package yarnwrap.structure;
public class PoolStructurePiece { public net.minecraft.structure.PoolStructurePiece wrapperContained; public PoolStructurePiece(net.minecraft.structure.PoolStructurePiece wrapperContained) { this.wrapperContained = wrapperContained; }

// public int groundLevelDelta() { return wrapperContained.groundLevelDelta; }
// public void groundLevelDelta(int value) { wrapperContained.groundLevelDelta = value; }
// public static int groundLevelDelta() { return net.minecraft.structure.PoolStructurePiece.groundLevelDelta; }
// public static void groundLevelDelta(int value, ) { net.minecraft.structure.PoolStructurePiece.groundLevelDelta = value; }

// public yarnwrap.structure.pool.StructurePoolElement poolElement() { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.poolElement); }
// public void poolElement(yarnwrap.structure.pool.StructurePoolElement value) { wrapperContained.poolElement = value.wrapperContained; }
// public static yarnwrap.structure.pool.StructurePoolElement poolElement() { return new yarnwrap.structure.pool.StructurePoolElement(net.minecraft.structure.PoolStructurePiece.poolElement); }
// public static void poolElement(yarnwrap.structure.pool.StructurePoolElement value, ) { net.minecraft.structure.PoolStructurePiece.poolElement = value.wrapperContained; }

// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public static yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(net.minecraft.structure.PoolStructurePiece.rotation); }
// public static void rotation(yarnwrap.util.BlockRotation value, ) { net.minecraft.structure.PoolStructurePiece.rotation = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.PoolStructurePiece.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.structure.PoolStructurePiece.pos = value.wrapperContained; }

// public java.util.List junctions() { return wrapperContained.junctions; }
// public void junctions(java.util.List value) { wrapperContained.junctions = value; }
// public static java.util.List junctions() { return net.minecraft.structure.PoolStructurePiece.junctions; }
// public static void junctions(java.util.List value, ) { net.minecraft.structure.PoolStructurePiece.junctions = value; }

// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value) { wrapperContained.structureTemplateManager = value.wrapperContained; }
// public static yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(net.minecraft.structure.PoolStructurePiece.structureTemplateManager); }
// public static void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value, ) { net.minecraft.structure.PoolStructurePiece.structureTemplateManager = value.wrapperContained; }

// public yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.liquidSettings); }
// public void liquidSettings(yarnwrap.structure.StructureLiquidSettings value) { wrapperContained.liquidSettings = value.wrapperContained; }
// public static yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(net.minecraft.structure.PoolStructurePiece.liquidSettings); }
// public static void liquidSettings(yarnwrap.structure.StructureLiquidSettings value, ) { net.minecraft.structure.PoolStructurePiece.liquidSettings = value.wrapperContained; }

public PoolStructurePiece(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.structure.pool.StructurePoolElement poolElement,yarnwrap.util.math.BlockPos pos,int groundLevelDelta,yarnwrap.util.BlockRotation rotation,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.structure.StructureLiquidSettings liquidSettings) { this.wrapperContained = new net.minecraft.structure.PoolStructurePiece(structureTemplateManager.wrapperContained,poolElement.wrapperContained,pos.wrapperContained,groundLevelDelta,rotation.wrapperContained,boundingBox.wrapperContained,liquidSettings.wrapperContained); }
public PoolStructurePiece(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.structure.PoolStructurePiece(context.wrapperContained,nbt.wrapperContained); }
public yarnwrap.structure.pool.StructurePoolElement getPoolElement() { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.getPoolElement()); }
// public static yarnwrap.structure.pool.StructurePoolElement getPoolElement() { return new yarnwrap.structure.pool.StructurePoolElement(net.minecraft.structure.PoolStructurePiece.getPoolElement()); }
public java.util.List getJunctions() { return wrapperContained.getJunctions(); }
// public static java.util.List getJunctions() { return net.minecraft.structure.PoolStructurePiece.getJunctions(); }
public int getGroundLevelDelta() { return wrapperContained.getGroundLevelDelta(); }
// public static int getGroundLevelDelta() { return net.minecraft.structure.PoolStructurePiece.getGroundLevelDelta(); }
public void addJunction(yarnwrap.structure.JigsawJunction junction) { wrapperContained.addJunction(junction.wrapperContained); }
// public static void addJunction(yarnwrap.structure.JigsawJunction junction, ) { net.minecraft.structure.PoolStructurePiece.addJunction(junction.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.PoolStructurePiece.getPos()); }
// public void method_16649(com.mojang.serialization.DynamicOps junctionTag) { wrapperContained.method_16649(junctionTag); }
// public static void method_16649(com.mojang.serialization.DynamicOps junctionTag, ) { net.minecraft.structure.PoolStructurePiece.method_16649(junctionTag); }
public void generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.BlockPos pivot,boolean keepJigsaws) { wrapperContained.generate(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,boundingBox.wrapperContained,pivot.wrapperContained,keepJigsaws); }
// public static void generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.BlockPos pivot,boolean keepJigsaws, ) { net.minecraft.structure.PoolStructurePiece.generate(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,boundingBox.wrapperContained,pivot.wrapperContained,keepJigsaws); }

}