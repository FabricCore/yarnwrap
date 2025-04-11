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
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}