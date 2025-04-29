package yarnwrap.world.gen.structure;
public class IglooStructure { public net.minecraft.world.gen.structure.IglooStructure wrapperContained; public IglooStructure(net.minecraft.world.gen.structure.IglooStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.IglooStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.IglooStructure.CODEC = value; }

// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.world.gen.structure.IglooStructure.addPieces(collector.wrapperContained,context); }
// public void method_41657(Object collector) { wrapperContained.method_41657(collector); }
// public static void method_41657(Object collector, ) { net.minecraft.world.gen.structure.IglooStructure.method_41657(collector); }

}