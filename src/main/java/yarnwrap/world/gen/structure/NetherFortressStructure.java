package yarnwrap.world.gen.structure;
public class NetherFortressStructure { public net.minecraft.world.gen.structure.NetherFortressStructure wrapperContained; public NetherFortressStructure(net.minecraft.world.gen.structure.NetherFortressStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.Pool MONSTER_SPAWNS() { return new yarnwrap.util.collection.Pool(wrapperContained.MONSTER_SPAWNS); }
// public void MONSTER_SPAWNS(yarnwrap.util.collection.Pool value) { wrapperContained.MONSTER_SPAWNS = value.wrapperContained; }
public static yarnwrap.util.collection.Pool MONSTER_SPAWNS() { return new yarnwrap.util.collection.Pool(net.minecraft.world.gen.structure.NetherFortressStructure.MONSTER_SPAWNS); }
// public static void MONSTER_SPAWNS(yarnwrap.util.collection.Pool value, ) { net.minecraft.world.gen.structure.NetherFortressStructure.MONSTER_SPAWNS = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.NetherFortressStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.NetherFortressStructure.CODEC = value; }

// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.world.gen.structure.NetherFortressStructure.addPieces(collector.wrapperContained,context); }
// public void method_41670(Object collector) { wrapperContained.method_41670(collector); }
// public static void method_41670(Object collector, ) { net.minecraft.world.gen.structure.NetherFortressStructure.method_41670(collector); }

}