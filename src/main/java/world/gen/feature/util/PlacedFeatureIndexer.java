package yarnwrap.world.gen.feature.util;
public class PlacedFeatureIndexer { public net.minecraft.world.gen.feature.util.PlacedFeatureIndexer wrapperContained; public PlacedFeatureIndexer(net.minecraft.world.gen.feature.util.PlacedFeatureIndexer wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List collectIndexedFeatures(java.util.List biomes,java.util.function.Function biomesToPlacedFeaturesList,boolean listInvolvedBiomesOnFailure) { return wrapperContained.collectIndexedFeatures(biomes,biomesToPlacedFeaturesList,listInvolvedBiomesOnFailure); }

}