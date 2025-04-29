package yarnwrap.world.gen.structure;
public class OceanRuinStructure { public net.minecraft.world.gen.structure.OceanRuinStructure wrapperContained; public OceanRuinStructure(net.minecraft.world.gen.structure.OceanRuinStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.OceanRuinStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.OceanRuinStructure.CODEC = value; }

public Object biomeTemperature() { return wrapperContained.biomeTemperature; }
// // public void biomeTemperature(Object value) { wrapperContained.biomeTemperature = value; }
// // public static Object biomeTemperature() { return net.minecraft.world.gen.structure.OceanRuinStructure.biomeTemperature; }
// // public static void biomeTemperature(Object value, ) { net.minecraft.world.gen.structure.OceanRuinStructure.biomeTemperature = value; }

public float largeProbability() { return wrapperContained.largeProbability; }
// public void largeProbability(float value) { wrapperContained.largeProbability = value; }
// public static float largeProbability() { return net.minecraft.world.gen.structure.OceanRuinStructure.largeProbability; }
// public static void largeProbability(float value, ) { net.minecraft.world.gen.structure.OceanRuinStructure.largeProbability = value; }

public float clusterProbability() { return wrapperContained.clusterProbability; }
// public void clusterProbability(float value) { wrapperContained.clusterProbability = value; }
// public static float clusterProbability() { return net.minecraft.world.gen.structure.OceanRuinStructure.clusterProbability; }
// public static void clusterProbability(float value, ) { net.minecraft.world.gen.structure.OceanRuinStructure.clusterProbability = value; }

// public OceanRuinStructure(Object config,Object biomeTemperature,float largeProbability,float clusterProbability) { this.wrapperContained = new net.minecraft.world.gen.structure.OceanRuinStructure(config,biomeTemperature,largeProbability,clusterProbability); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public static void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.world.gen.structure.OceanRuinStructure.addPieces(collector.wrapperContained,context); }
// public void method_41677(Object collector) { wrapperContained.method_41677(collector); }
// public static void method_41677(Object collector, ) { net.minecraft.world.gen.structure.OceanRuinStructure.method_41677(collector); }
// public java.lang.Float method_41678(yarnwrap.world.gen.structure.OceanRuinStructure structure) { return wrapperContained.method_41678(structure.wrapperContained); }
// public static java.lang.Float method_41678(yarnwrap.world.gen.structure.OceanRuinStructure structure, ) { return net.minecraft.world.gen.structure.OceanRuinStructure.method_41678(structure.wrapperContained); }
// public java.lang.Float method_41680(yarnwrap.world.gen.structure.OceanRuinStructure structure) { return wrapperContained.method_41680(structure.wrapperContained); }
// public static java.lang.Float method_41680(yarnwrap.world.gen.structure.OceanRuinStructure structure, ) { return net.minecraft.world.gen.structure.OceanRuinStructure.method_41680(structure.wrapperContained); }
// public Object method_41681(yarnwrap.world.gen.structure.OceanRuinStructure structure) { return wrapperContained.method_41681(structure.wrapperContained); }
// public static Object method_41681(yarnwrap.world.gen.structure.OceanRuinStructure structure, ) { return net.minecraft.world.gen.structure.OceanRuinStructure.method_41681(structure.wrapperContained); }

}