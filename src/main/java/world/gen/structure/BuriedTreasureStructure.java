package yarnwrap.world.gen.structure;
public class BuriedTreasureStructure { public net.minecraft.world.gen.structure.BuriedTreasureStructure wrapperContained; public BuriedTreasureStructure(net.minecraft.world.gen.structure.BuriedTreasureStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}