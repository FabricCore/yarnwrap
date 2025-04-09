package yarnwrap.structure;
public class IglooGenerator { public net.minecraft.structure.IglooGenerator wrapperContained; public IglooGenerator(net.minecraft.structure.IglooGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map OFFSETS_FROM_TOP() { return wrapperContained.OFFSETS_FROM_TOP; }
// public yarnwrap.util.Identifier MIDDLE_TEMPLATE() { return new yarnwrap.util.Identifier(wrapperContained.MIDDLE_TEMPLATE); }
// public java.util.Map OFFSETS() { return wrapperContained.OFFSETS; }
// public yarnwrap.util.Identifier TOP_TEMPLATE() { return new yarnwrap.util.Identifier(wrapperContained.TOP_TEMPLATE); }
// public yarnwrap.util.Identifier BOTTOM_TEMPLATE() { return new yarnwrap.util.Identifier(wrapperContained.BOTTOM_TEMPLATE); }
public int OFFSET_Y() { return wrapperContained.OFFSET_Y; }
public void addPieces(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random) { wrapperContained.addPieces(manager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,holder.wrapperContained,random.wrapperContained); }

}