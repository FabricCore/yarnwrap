package yarnwrap.world.gen.structure;
public class WoodlandMansionStructure { public net.minecraft.world.gen.structure.WoodlandMansionStructure wrapperContained; public WoodlandMansionStructure(net.minecraft.world.gen.structure.WoodlandMansionStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.WoodlandMansionStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.WoodlandMansionStructure.CODEC = value; }

// public void method_41695(Object collector) { wrapperContained.method_41695(collector); }
// public static void method_41695(Object collector, ) { net.minecraft.world.gen.structure.WoodlandMansionStructure.method_41695(collector); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation) { wrapperContained.addPieces(collector.wrapperContained,context,pos.wrapperContained,rotation.wrapperContained); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation, ) { net.minecraft.world.gen.structure.WoodlandMansionStructure.addPieces(collector.wrapperContained,context,pos.wrapperContained,rotation.wrapperContained); }

}