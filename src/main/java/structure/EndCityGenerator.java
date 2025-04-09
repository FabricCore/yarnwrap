package yarnwrap.structure;
public class EndCityGenerator { public net.minecraft.structure.EndCityGenerator wrapperContained; public EndCityGenerator(net.minecraft.structure.EndCityGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object FAT_TOWER() { return wrapperContained.FAT_TOWER; }
// public java.util.List SMALL_TOWER_BRIDGE_ATTACHMENTS() { return wrapperContained.SMALL_TOWER_BRIDGE_ATTACHMENTS; }
// public Object SMALL_TOWER() { return wrapperContained.SMALL_TOWER; }
// public Object BRIDGE_PIECE() { return wrapperContained.BRIDGE_PIECE; }
// public java.util.List FAT_TOWER_BRIDGE_ATTACHMENTS() { return wrapperContained.FAT_TOWER_BRIDGE_ATTACHMENTS; }
// public Object BUILDING() { return wrapperContained.BUILDING; }
// public int MAX_DEPTH() { return wrapperContained.MAX_DEPTH; }
// public boolean createPart(yarnwrap.structure.StructureTemplateManager manager,Object piece,int depth,Object parent,yarnwrap.util.math.BlockPos pos,java.util.List pieces,yarnwrap.util.math.random.Random random) { return wrapperContained.createPart(manager.wrapperContained,piece,depth,parent,pos.wrapperContained,pieces,random.wrapperContained); }
public void addPieces(yarnwrap.structure.StructureTemplateManager structureTemplateManager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,java.util.List pieces,yarnwrap.util.math.random.Random random) { wrapperContained.addPieces(structureTemplateManager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,pieces,random.wrapperContained); }
// public Object addPiece(java.util.List pieces,Object piece) { return wrapperContained.addPiece(pieces,piece); }
// public Object createPiece(yarnwrap.structure.StructureTemplateManager structureTemplateManager,Object lastPiece,yarnwrap.util.math.BlockPos relativePosition,java.lang.String template,yarnwrap.util.BlockRotation rotation,boolean ignoreAir) { return wrapperContained.createPiece(structureTemplateManager.wrapperContained,lastPiece,relativePosition.wrapperContained,template,rotation.wrapperContained,ignoreAir); }

}