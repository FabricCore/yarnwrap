package yarnwrap.world.gen.structure;
public class MineshaftStructure { public net.minecraft.world.gen.structure.MineshaftStructure wrapperContained; public MineshaftStructure(net.minecraft.world.gen.structure.MineshaftStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public int addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { return wrapperContained.addPieces(collector.wrapperContained,context); }

}