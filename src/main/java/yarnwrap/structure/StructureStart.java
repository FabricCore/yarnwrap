package yarnwrap.structure;
public class StructureStart { public net.minecraft.structure.StructureStart wrapperContained; public StructureStart(net.minecraft.structure.StructureStart wrapperContained) { this.wrapperContained = wrapperContained; }

// public int references() { return wrapperContained.references; }
// public void references(int value) { wrapperContained.references = value; }
public yarnwrap.structure.StructureStart DEFAULT() { return new yarnwrap.structure.StructureStart(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.structure.StructureStart value) { wrapperContained.DEFAULT = value.wrapperContained; }
// public yarnwrap.world.gen.structure.Structure structure() { return new yarnwrap.world.gen.structure.Structure(wrapperContained.structure); }
// public void structure(yarnwrap.world.gen.structure.Structure value) { wrapperContained.structure = value.wrapperContained; }
// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
public java.lang.String INVALID() { return wrapperContained.INVALID; }
// public void INVALID(java.lang.String value) { wrapperContained.INVALID = value; }
// public yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.BlockBox value) { wrapperContained.boundingBox = value.wrapperContained; }
// public yarnwrap.structure.StructurePiecesList children() { return new yarnwrap.structure.StructurePiecesList(wrapperContained.children); }
// public void children(yarnwrap.structure.StructurePiecesList value) { wrapperContained.children = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.List getChildren() { return wrapperContained.getChildren(); }
public void incrementReferences() { wrapperContained.incrementReferences(); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }
// public int getMinReferencedStructureReferenceCount() { return wrapperContained.getMinReferencedStructureReferenceCount(); }
public yarnwrap.nbt.NbtCompound toNbt(yarnwrap.structure.StructureContext context,yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(context.wrapperContained,chunkPos.wrapperContained)); }
public void place(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox chunkBox,yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.place(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,chunkBox.wrapperContained,chunkPos.wrapperContained); }
public boolean isNeverReferenced() { return wrapperContained.isNeverReferenced(); }
public yarnwrap.world.gen.structure.Structure getStructure() { return new yarnwrap.world.gen.structure.Structure(wrapperContained.getStructure()); }
public boolean hasChildren() { return wrapperContained.hasChildren(); }
public int getReferences() { return wrapperContained.getReferences(); }
public yarnwrap.util.math.ChunkPos getPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getPos()); }
public yarnwrap.structure.StructureStart fromNbt(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt,long seed) { return new yarnwrap.structure.StructureStart(wrapperContained.fromNbt(context.wrapperContained,nbt.wrapperContained,seed)); }

}