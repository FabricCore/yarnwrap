package yarnwrap.structure;
public class PoolStructurePiece { public net.minecraft.structure.PoolStructurePiece wrapperContained; public PoolStructurePiece(net.minecraft.structure.PoolStructurePiece wrapperContained) { this.wrapperContained = wrapperContained; }

// public int groundLevelDelta() { return wrapperContained.groundLevelDelta; }
// public void groundLevelDelta(int value) { wrapperContained.groundLevelDelta = value; }
// public yarnwrap.structure.pool.StructurePoolElement poolElement() { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.poolElement); }
// public void poolElement(yarnwrap.structure.pool.StructurePoolElement value) { wrapperContained.poolElement = value.wrapperContained; }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.BlockRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public java.util.List junctions() { return wrapperContained.junctions; }
// public void junctions(java.util.List value) { wrapperContained.junctions = value; }
// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public void structureTemplateManager(yarnwrap.structure.StructureTemplateManager value) { wrapperContained.structureTemplateManager = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.liquidSettings); }
// public void liquidSettings(yarnwrap.structure.StructureLiquidSettings value) { wrapperContained.liquidSettings = value.wrapperContained; }
public yarnwrap.structure.pool.StructurePoolElement getPoolElement() { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.getPoolElement()); }
public java.util.List getJunctions() { return wrapperContained.getJunctions(); }
public int getGroundLevelDelta() { return wrapperContained.getGroundLevelDelta(); }
public void addJunction(yarnwrap.structure.JigsawJunction junction) { wrapperContained.addJunction(junction.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public void generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.BlockPos pivot,boolean keepJigsaws) { wrapperContained.generate(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,boundingBox.wrapperContained,pivot.wrapperContained,keepJigsaws); }

}