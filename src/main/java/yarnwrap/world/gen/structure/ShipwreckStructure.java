package yarnwrap.world.gen.structure;
public class ShipwreckStructure { public net.minecraft.world.gen.structure.ShipwreckStructure wrapperContained; public ShipwreckStructure(net.minecraft.world.gen.structure.ShipwreckStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean beached() { return wrapperContained.beached; }
// public void beached(boolean value) { wrapperContained.beached = value; }
// public ShipwreckStructure(Object config,boolean beached) { this.wrapperContained = new net.minecraft.world.gen.structure.ShipwreckStructure(config,beached); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public void method_41687(Object collector) { wrapperContained.method_41687(collector); }

}