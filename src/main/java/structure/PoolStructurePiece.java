package yarnwrap.structure;
public class PoolStructurePiece { public net.minecraft.structure.PoolStructurePiece wrapperContained; public PoolStructurePiece(net.minecraft.structure.PoolStructurePiece wrapperContained) { this.wrapperContained = wrapperContained; }

// public int groundLevelDelta() { return wrapperContained.groundLevelDelta; }
// public yarnwrap.structure.pool.StructurePoolElement poolElement() { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.poolElement); }
// public yarnwrap.util.BlockRotation rotation() { return new yarnwrap.util.BlockRotation(wrapperContained.rotation); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public java.util.List junctions() { return wrapperContained.junctions; }
// public yarnwrap.structure.StructureTemplateManager structureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.structureTemplateManager); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.liquidSettings); }
public yarnwrap.structure.pool.StructurePoolElement getPoolElement() { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.getPoolElement()); }
public java.util.List getJunctions() { return wrapperContained.getJunctions(); }
public int getGroundLevelDelta() { return wrapperContained.getGroundLevelDelta(); }
public void addJunction(yarnwrap.structure.JigsawJunction junction) { wrapperContained.addJunction(junction.wrapperContained); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public void generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox boundingBox,yarnwrap.util.math.BlockPos pivot,boolean keepJigsaws) { wrapperContained.generate(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,boundingBox.wrapperContained,pivot.wrapperContained,keepJigsaws); }

}