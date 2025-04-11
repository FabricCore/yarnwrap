package yarnwrap.structure;
public class StructurePiecesList { public net.minecraft.structure.StructurePiecesList wrapperContained; public StructurePiecesList(net.minecraft.structure.StructurePiecesList wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.Identifier JIGSAW() { return new yarnwrap.util.Identifier(wrapperContained.JIGSAW); }
// public void JIGSAW(yarnwrap.util.Identifier value) { wrapperContained.JIGSAW = value.wrapperContained; }
// public java.util.Map ID_UPDATES() { return wrapperContained.ID_UPDATES; }
// public void ID_UPDATES(java.util.Map value) { wrapperContained.ID_UPDATES = value; }
public StructurePiecesList(java.util.List pieces) { this.wrapperContained = new net.minecraft.structure.StructurePiecesList(pieces); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.nbt.NbtElement toNbt(yarnwrap.structure.StructureContext context) { return new yarnwrap.nbt.NbtElement(wrapperContained.toNbt(context.wrapperContained)); }
public boolean contains(yarnwrap.util.math.BlockPos pos) { return wrapperContained.contains(pos.wrapperContained); }
public yarnwrap.structure.StructurePiecesList fromNbt(yarnwrap.nbt.NbtList list,yarnwrap.structure.StructureContext context) { return new yarnwrap.structure.StructurePiecesList(wrapperContained.fromNbt(list.wrapperContained,context.wrapperContained)); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }

}