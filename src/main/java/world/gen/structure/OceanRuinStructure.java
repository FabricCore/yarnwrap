package yarnwrap.world.gen.structure;
public class OceanRuinStructure { public net.minecraft.world.gen.structure.OceanRuinStructure wrapperContained; public OceanRuinStructure(net.minecraft.world.gen.structure.OceanRuinStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object biomeTemperature() { return wrapperContained.biomeTemperature; }
public float largeProbability() { return wrapperContained.largeProbability; }
public float clusterProbability() { return wrapperContained.clusterProbability; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}