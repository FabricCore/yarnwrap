package yarnwrap.world.gen.structure;
public class OceanRuinStructure { public net.minecraft.world.gen.structure.OceanRuinStructure wrapperContained; public OceanRuinStructure(net.minecraft.world.gen.structure.OceanRuinStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object biomeTemperature() { return wrapperContained.biomeTemperature; }
// // public void biomeTemperature(Object value) { wrapperContained.biomeTemperature = value; }
public float largeProbability() { return wrapperContained.largeProbability; }
// public void largeProbability(float value) { wrapperContained.largeProbability = value; }
public float clusterProbability() { return wrapperContained.clusterProbability; }
// public void clusterProbability(float value) { wrapperContained.clusterProbability = value; }
// public OceanRuinStructure(Object config,Object biomeTemperature,float largeProbability,float clusterProbability) { this.wrapperContained = new net.minecraft.world.gen.structure.OceanRuinStructure(config,biomeTemperature,largeProbability,clusterProbability); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }
// public void method_41677(Object collector) { wrapperContained.method_41677(collector); }
// public java.lang.Float method_41678(yarnwrap.world.gen.structure.OceanRuinStructure structure) { return wrapperContained.method_41678(structure.wrapperContained); }
// public java.lang.Float method_41680(yarnwrap.world.gen.structure.OceanRuinStructure structure) { return wrapperContained.method_41680(structure.wrapperContained); }
// public Object method_41681(yarnwrap.world.gen.structure.OceanRuinStructure structure) { return wrapperContained.method_41681(structure.wrapperContained); }

}