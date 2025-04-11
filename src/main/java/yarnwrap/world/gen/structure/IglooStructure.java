package yarnwrap.world.gen.structure;
public class IglooStructure { public net.minecraft.world.gen.structure.IglooStructure wrapperContained; public IglooStructure(net.minecraft.world.gen.structure.IglooStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}