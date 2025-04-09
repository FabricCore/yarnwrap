package yarnwrap.structure;
public class NetherFossilGenerator { public net.minecraft.structure.NetherFossilGenerator wrapperContained; public NetherFossilGenerator(net.minecraft.structure.NetherFossilGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.Identifier[] FOSSILS() { return wrapperContained.FOSSILS; }
public void addPieces(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { wrapperContained.addPieces(manager.wrapperContained,holder.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}