package yarnwrap.structure;
public class SimpleStructurePiece { public net.minecraft.structure.SimpleStructurePiece wrapperContained; public SimpleStructurePiece(net.minecraft.structure.SimpleStructurePiece wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.SimpleStructurePiece.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.structure.SimpleStructurePiece.pos = value.wrapperContained; }

// public yarnwrap.structure.StructureTemplate template() { return new yarnwrap.structure.StructureTemplate(wrapperContained.template); }
// public void template(yarnwrap.structure.StructureTemplate value) { wrapperContained.template = value.wrapperContained; }
// public static yarnwrap.structure.StructureTemplate template() { return new yarnwrap.structure.StructureTemplate(net.minecraft.structure.SimpleStructurePiece.template); }
// public static void template(yarnwrap.structure.StructureTemplate value, ) { net.minecraft.structure.SimpleStructurePiece.template = value.wrapperContained; }

// public yarnwrap.structure.StructurePlacementData placementData() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.placementData); }
// public void placementData(yarnwrap.structure.StructurePlacementData value) { wrapperContained.placementData = value.wrapperContained; }
// public static yarnwrap.structure.StructurePlacementData placementData() { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.SimpleStructurePiece.placementData); }
// public static void placementData(yarnwrap.structure.StructurePlacementData value, ) { net.minecraft.structure.SimpleStructurePiece.placementData = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.structure.SimpleStructurePiece.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.structure.SimpleStructurePiece.LOGGER = value; }

// public java.lang.String templateIdString() { return wrapperContained.templateIdString; }
// public void templateIdString(java.lang.String value) { wrapperContained.templateIdString = value; }
// public static java.lang.String templateIdString() { return net.minecraft.structure.SimpleStructurePiece.templateIdString; }
// public static void templateIdString(java.lang.String value, ) { net.minecraft.structure.SimpleStructurePiece.templateIdString = value; }

// public SimpleStructurePiece(yarnwrap.structure.StructurePieceType type,int length,yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.Identifier id,java.lang.String template,yarnwrap.structure.StructurePlacementData placementData,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.structure.SimpleStructurePiece(type.wrapperContained,length,structureTemplateManager.wrapperContained,id.wrapperContained,template,placementData.wrapperContained,pos.wrapperContained); }
// public SimpleStructurePiece(yarnwrap.structure.StructurePieceType type,yarnwrap.nbt.NbtCompound nbt,yarnwrap.structure.StructureTemplateManager structureTemplateManager,java.util.function.Function placementDataGetter) { this.wrapperContained = new net.minecraft.structure.SimpleStructurePiece(type.wrapperContained,nbt.wrapperContained,structureTemplateManager.wrapperContained,placementDataGetter); }
// public void handleMetadata(java.lang.String metadata,yarnwrap.util.math.BlockPos pos,yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox boundingBox) { wrapperContained.handleMetadata(metadata,pos.wrapperContained,world.wrapperContained,random.wrapperContained,boundingBox.wrapperContained); }
// public static void handleMetadata(java.lang.String metadata,yarnwrap.util.math.BlockPos pos,yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox boundingBox, ) { net.minecraft.structure.SimpleStructurePiece.handleMetadata(metadata,pos.wrapperContained,world.wrapperContained,random.wrapperContained,boundingBox.wrapperContained); }
// public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.structure.SimpleStructurePiece.getId()); }
public yarnwrap.structure.StructureTemplate getTemplate() { return new yarnwrap.structure.StructureTemplate(wrapperContained.getTemplate()); }
// public static yarnwrap.structure.StructureTemplate getTemplate() { return new yarnwrap.structure.StructureTemplate(net.minecraft.structure.SimpleStructurePiece.getTemplate()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.SimpleStructurePiece.getPos()); }
public yarnwrap.structure.StructurePlacementData getPlacementData() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.getPlacementData()); }
// public static yarnwrap.structure.StructurePlacementData getPlacementData() { return new yarnwrap.structure.StructurePlacementData(net.minecraft.structure.SimpleStructurePiece.getPlacementData()); }

}