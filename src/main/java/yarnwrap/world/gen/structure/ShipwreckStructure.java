package yarnwrap.world.gen.structure;
public class ShipwreckStructure { public net.minecraft.world.gen.structure.ShipwreckStructure wrapperContained; public ShipwreckStructure(net.minecraft.world.gen.structure.ShipwreckStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.ShipwreckStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.ShipwreckStructure.CODEC = value; }

public boolean beached() { return wrapperContained.beached; }
// public void beached(boolean value) { wrapperContained.beached = value; }
// public static boolean beached() { return net.minecraft.world.gen.structure.ShipwreckStructure.beached; }
// public static void beached(boolean value, ) { net.minecraft.world.gen.structure.ShipwreckStructure.beached = value; }

// public ShipwreckStructure(Object config,boolean beached) { this.wrapperContained = new net.minecraft.world.gen.structure.ShipwreckStructure(config,beached); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.world.gen.structure.ShipwreckStructure.addPieces(collector.wrapperContained,context); }
// public void method_41687(Object collector) { wrapperContained.method_41687(collector); }
// public static void method_41687(Object collector, ) { net.minecraft.world.gen.structure.ShipwreckStructure.method_41687(collector); }

}