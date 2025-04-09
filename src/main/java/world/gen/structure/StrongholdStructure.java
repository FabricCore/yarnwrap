package yarnwrap.world.gen.structure;
public class StrongholdStructure { public net.minecraft.world.gen.structure.StrongholdStructure wrapperContained; public StrongholdStructure(net.minecraft.world.gen.structure.StrongholdStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}