package yarnwrap.world.gen.structure;
public class WoodlandMansionStructure { public net.minecraft.world.gen.structure.WoodlandMansionStructure wrapperContained; public WoodlandMansionStructure(net.minecraft.world.gen.structure.WoodlandMansionStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation) { wrapperContained.addPieces(collector.wrapperContained,context,pos.wrapperContained,rotation.wrapperContained); }

}