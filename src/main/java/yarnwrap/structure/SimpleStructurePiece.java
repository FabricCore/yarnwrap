package yarnwrap.structure;
public class SimpleStructurePiece { public net.minecraft.structure.SimpleStructurePiece wrapperContained; public SimpleStructurePiece(net.minecraft.structure.SimpleStructurePiece wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.structure.StructureTemplate template() { return new yarnwrap.structure.StructureTemplate(wrapperContained.template); }
// public void template(yarnwrap.structure.StructureTemplate value) { wrapperContained.template = value.wrapperContained; }
// public yarnwrap.structure.StructurePlacementData placementData() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.placementData); }
// public void placementData(yarnwrap.structure.StructurePlacementData value) { wrapperContained.placementData = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String templateIdString() { return wrapperContained.templateIdString; }
// public void templateIdString(java.lang.String value) { wrapperContained.templateIdString = value; }
// public void handleMetadata(java.lang.String metadata,yarnwrap.util.math.BlockPos pos,yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockBox boundingBox) { wrapperContained.handleMetadata(metadata,pos.wrapperContained,world.wrapperContained,random.wrapperContained,boundingBox.wrapperContained); }
// public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
public yarnwrap.structure.StructureTemplate getTemplate() { return new yarnwrap.structure.StructureTemplate(wrapperContained.getTemplate()); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.structure.StructurePlacementData getPlacementData() { return new yarnwrap.structure.StructurePlacementData(wrapperContained.getPlacementData()); }

}