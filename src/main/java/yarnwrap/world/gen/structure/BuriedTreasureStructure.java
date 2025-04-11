package yarnwrap.world.gen.structure;
public class BuriedTreasureStructure { public net.minecraft.world.gen.structure.BuriedTreasureStructure wrapperContained; public BuriedTreasureStructure(net.minecraft.world.gen.structure.BuriedTreasureStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public void method_41652(Object collector) { wrapperContained.method_41652(collector); }

}