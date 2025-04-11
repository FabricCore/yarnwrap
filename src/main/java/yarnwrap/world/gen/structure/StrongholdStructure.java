package yarnwrap.world.gen.structure;
public class StrongholdStructure { public net.minecraft.world.gen.structure.StrongholdStructure wrapperContained; public StrongholdStructure(net.minecraft.world.gen.structure.StrongholdStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void method_41690(Object collector) { wrapperContained.method_41690(collector); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}