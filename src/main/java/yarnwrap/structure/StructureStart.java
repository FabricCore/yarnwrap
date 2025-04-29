package yarnwrap.structure;
public class StructureStart { public net.minecraft.structure.StructureStart wrapperContained; public StructureStart(net.minecraft.structure.StructureStart wrapperContained) { this.wrapperContained = wrapperContained; }

// public int references() { return wrapperContained.references; }
// public void references(int value) { wrapperContained.references = value; }
// public static int references() { return net.minecraft.structure.StructureStart.references; }
// public static void references(int value, ) { net.minecraft.structure.StructureStart.references = value; }

// public yarnwrap.structure.StructureStart DEFAULT() { return new yarnwrap.structure.StructureStart(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.structure.StructureStart value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.structure.StructureStart DEFAULT() { return new yarnwrap.structure.StructureStart(net.minecraft.structure.StructureStart.DEFAULT); }
// public static void DEFAULT(yarnwrap.structure.StructureStart value, ) { net.minecraft.structure.StructureStart.DEFAULT = value.wrapperContained; }

// public yarnwrap.world.gen.structure.Structure structure() { return new yarnwrap.world.gen.structure.Structure(wrapperContained.structure); }
// public void structure(yarnwrap.world.gen.structure.Structure value) { wrapperContained.structure = value.wrapperContained; }
// public static yarnwrap.world.gen.structure.Structure structure() { return new yarnwrap.world.gen.structure.Structure(net.minecraft.structure.StructureStart.structure); }
// public static void structure(yarnwrap.world.gen.structure.Structure value, ) { net.minecraft.structure.StructureStart.structure = value.wrapperContained; }

// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.structure.StructureStart.pos); }
// public static void pos(yarnwrap.util.math.ChunkPos value, ) { net.minecraft.structure.StructureStart.pos = value.wrapperContained; }

// public java.lang.String INVALID() { return wrapperContained.INVALID; }
// public void INVALID(java.lang.String value) { wrapperContained.INVALID = value; }
public static java.lang.String INVALID() { return net.minecraft.structure.StructureStart.INVALID; }
// public static void INVALID(java.lang.String value, ) { net.minecraft.structure.StructureStart.INVALID = value; }

// public yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.BlockBox value) { wrapperContained.boundingBox = value.wrapperContained; }
// public static yarnwrap.util.math.BlockBox boundingBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructureStart.boundingBox); }
// public static void boundingBox(yarnwrap.util.math.BlockBox value, ) { net.minecraft.structure.StructureStart.boundingBox = value.wrapperContained; }

// public yarnwrap.structure.StructurePiecesList children() { return new yarnwrap.structure.StructurePiecesList(wrapperContained.children); }
// public void children(yarnwrap.structure.StructurePiecesList value) { wrapperContained.children = value.wrapperContained; }
// public static yarnwrap.structure.StructurePiecesList children() { return new yarnwrap.structure.StructurePiecesList(net.minecraft.structure.StructureStart.children); }
// public static void children(yarnwrap.structure.StructurePiecesList value, ) { net.minecraft.structure.StructureStart.children = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.structure.StructureStart.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.structure.StructureStart.LOGGER = value; }

public StructureStart(yarnwrap.world.gen.structure.Structure structure,yarnwrap.util.math.ChunkPos pos,int references,yarnwrap.structure.StructurePiecesList children) { this.wrapperContained = new net.minecraft.structure.StructureStart(structure.wrapperContained,pos.wrapperContained,references,children.wrapperContained); }
public java.util.List getChildren() { return wrapperContained.getChildren(); }
// public static java.util.List getChildren() { return net.minecraft.structure.StructureStart.getChildren(); }
public void incrementReferences() { wrapperContained.incrementReferences(); }
// public static void incrementReferences() { net.minecraft.structure.StructureStart.incrementReferences(); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }
// public static yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructureStart.getBoundingBox()); }
// public int getMinReferencedStructureReferenceCount() { return wrapperContained.getMinReferencedStructureReferenceCount(); }
// public static int getMinReferencedStructureReferenceCount() { return net.minecraft.structure.StructureStart.getMinReferencedStructureReferenceCount(); }
public yarnwrap.nbt.NbtCompound toNbt(yarnwrap.structure.StructureContext context,yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(context.wrapperContained,chunkPos.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound toNbt(yarnwrap.structure.StructureContext context,yarnwrap.util.math.ChunkPos chunkPos, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.StructureStart.toNbt(context.wrapperContained,chunkPos.wrapperContained)); }
public void place(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox chunkBox,yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.place(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,chunkBox.wrapperContained,chunkPos.wrapperContained); }
// public static void place(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.StructureAccessor structureAccessor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox chunkBox,yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.structure.StructureStart.place(world.wrapperContained,structureAccessor.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,chunkBox.wrapperContained,chunkPos.wrapperContained); }
public boolean isNeverReferenced() { return wrapperContained.isNeverReferenced(); }
// public static boolean isNeverReferenced() { return net.minecraft.structure.StructureStart.isNeverReferenced(); }
public yarnwrap.world.gen.structure.Structure getStructure() { return new yarnwrap.world.gen.structure.Structure(wrapperContained.getStructure()); }
// public static yarnwrap.world.gen.structure.Structure getStructure() { return new yarnwrap.world.gen.structure.Structure(net.minecraft.structure.StructureStart.getStructure()); }
public boolean hasChildren() { return wrapperContained.hasChildren(); }
// public static boolean hasChildren() { return net.minecraft.structure.StructureStart.hasChildren(); }
public int getReferences() { return wrapperContained.getReferences(); }
// public static int getReferences() { return net.minecraft.structure.StructureStart.getReferences(); }
public yarnwrap.util.math.ChunkPos getPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.ChunkPos getPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.structure.StructureStart.getPos()); }
// public yarnwrap.structure.StructureStart fromNbt(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt,long seed) { return new yarnwrap.structure.StructureStart(wrapperContained.fromNbt(context.wrapperContained,nbt.wrapperContained,seed)); }
// public static yarnwrap.structure.StructureStart fromNbt(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt,long seed, ) { return new yarnwrap.structure.StructureStart(net.minecraft.structure.StructureStart.fromNbt(context.wrapperContained,nbt.wrapperContained,seed)); }

}