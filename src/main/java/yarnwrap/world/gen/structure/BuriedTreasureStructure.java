package yarnwrap.world.gen.structure;
public class BuriedTreasureStructure { public net.minecraft.world.gen.structure.BuriedTreasureStructure wrapperContained; public BuriedTreasureStructure(net.minecraft.world.gen.structure.BuriedTreasureStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.BuriedTreasureStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.BuriedTreasureStructure.CODEC = value; }

// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.world.gen.structure.BuriedTreasureStructure.addPieces(collector.wrapperContained,context); }
// public void method_41652(Object collector) { wrapperContained.method_41652(collector); }
// public static void method_41652(Object collector, ) { net.minecraft.world.gen.structure.BuriedTreasureStructure.method_41652(collector); }

}