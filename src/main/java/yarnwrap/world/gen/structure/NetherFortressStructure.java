package yarnwrap.world.gen.structure;
public class NetherFortressStructure { public net.minecraft.world.gen.structure.NetherFortressStructure wrapperContained; public NetherFortressStructure(net.minecraft.world.gen.structure.NetherFortressStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.collection.Pool MONSTER_SPAWNS() { return new yarnwrap.util.collection.Pool(wrapperContained.MONSTER_SPAWNS); }
// public void MONSTER_SPAWNS(yarnwrap.util.collection.Pool value) { wrapperContained.MONSTER_SPAWNS = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}