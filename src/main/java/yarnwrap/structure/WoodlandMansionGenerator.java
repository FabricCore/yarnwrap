package yarnwrap.structure;
public class WoodlandMansionGenerator { public net.minecraft.structure.WoodlandMansionGenerator wrapperContained; public WoodlandMansionGenerator(net.minecraft.structure.WoodlandMansionGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public void addPieces(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,java.util.List pieces,yarnwrap.util.math.random.Random random) { wrapperContained.addPieces(manager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,pieces,random.wrapperContained); }
// public static void addPieces(yarnwrap.structure.StructureTemplateManager manager,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,java.util.List pieces,yarnwrap.util.math.random.Random random, ) { net.minecraft.structure.WoodlandMansionGenerator.addPieces(manager.wrapperContained,pos.wrapperContained,rotation.wrapperContained,pieces,random.wrapperContained); }

}