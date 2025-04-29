package yarnwrap.world.gen.structure;
public class SwampHutStructure { public net.minecraft.world.gen.structure.SwampHutStructure wrapperContained; public SwampHutStructure(net.minecraft.world.gen.structure.SwampHutStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.SwampHutStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.SwampHutStructure.CODEC = value; }

// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.world.gen.structure.SwampHutStructure.addPieces(collector.wrapperContained,context); }
// public void method_41693(Object collector) { wrapperContained.method_41693(collector); }
// public static void method_41693(Object collector, ) { net.minecraft.world.gen.structure.SwampHutStructure.method_41693(collector); }

}