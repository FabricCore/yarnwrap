package yarnwrap.structure;
public class IglooGenerator { public net.minecraft.structure.IglooGenerator wrapperContained; public IglooGenerator(net.minecraft.structure.IglooGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map OFFSETS_FROM_TOP() { return wrapperContained.OFFSETS_FROM_TOP; }
// public void OFFSETS_FROM_TOP(java.util.Map value) { wrapperContained.OFFSETS_FROM_TOP = value; }
// public yarnwrap.util.Identifier MIDDLE_TEMPLATE() { return new yarnwrap.util.Identifier(wrapperContained.MIDDLE_TEMPLATE); }
// public void MIDDLE_TEMPLATE(yarnwrap.util.Identifier value) { wrapperContained.MIDDLE_TEMPLATE = value.wrapperContained; }
// public java.util.Map OFFSETS() { return wrapperContained.OFFSETS; }
// public void OFFSETS(java.util.Map value) { wrapperContained.OFFSETS = value; }
// public yarnwrap.util.Identifier TOP_TEMPLATE() { return new yarnwrap.util.Identifier(wrapperContained.TOP_TEMPLATE); }
// public void TOP_TEMPLATE(yarnwrap.util.Identifier value) { wrapperContained.TOP_TEMPLATE = value.wrapperContained; }
// public yarnwrap.util.Identifier BOTTOM_TEMPLATE() { return new yarnwrap.util.Identifier(wrapperContained.BOTTOM_TEMPLATE); }
// public void BOTTOM_TEMPLATE(yarnwrap.util.Identifier value) { wrapperContained.BOTTOM_TEMPLATE = value.wrapperContained; }
public int OFFSET_Y() { return wrapperContained.OFFSET_Y; }
// public void OFFSET_Y(int value) { wrapperContained.OFFSET_Y = value; }
public void addPieces(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random) { wrapperContained.addPieces(manager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,holder.wrapperContained,random.wrapperContained); }

}