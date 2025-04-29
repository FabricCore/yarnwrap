package yarnwrap.world.gen.structure;
public class StrongholdStructure { public net.minecraft.world.gen.structure.StrongholdStructure wrapperContained; public StrongholdStructure(net.minecraft.world.gen.structure.StrongholdStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.StrongholdStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.StrongholdStructure.CODEC = value; }

// public void method_41690(Object collector) { wrapperContained.method_41690(collector); }
// public static void method_41690(Object collector, ) { net.minecraft.world.gen.structure.StrongholdStructure.method_41690(collector); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.world.gen.structure.StrongholdStructure.addPieces(collector.wrapperContained,context); }

}