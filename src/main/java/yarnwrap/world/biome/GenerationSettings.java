package yarnwrap.world.biome;
public class GenerationSettings { public net.minecraft.world.biome.GenerationSettings wrapperContained; public GenerationSettings(net.minecraft.world.biome.GenerationSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Map carvers() { return wrapperContained.carvers; }
// public void carvers(java.util.Map value) { wrapperContained.carvers = value; }
// public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.world.biome.GenerationSettings INSTANCE() { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.biome.GenerationSettings value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public java.util.function.Supplier flowerFeatures() { return wrapperContained.flowerFeatures; }
// public void flowerFeatures(java.util.function.Supplier value) { wrapperContained.flowerFeatures = value; }
// public java.util.function.Supplier allowedFeatures() { return wrapperContained.allowedFeatures; }
// public void allowedFeatures(java.util.function.Supplier value) { wrapperContained.allowedFeatures = value; }
// public java.lang.Iterable getCarversForStep(Object carverStep) { return wrapperContained.getCarversForStep(carverStep); }
public java.util.List getFlowerFeatures() { return wrapperContained.getFlowerFeatures(); }
public java.util.List getFeatures() { return wrapperContained.getFeatures(); }
public boolean isFeatureAllowed(yarnwrap.world.gen.feature.PlacedFeature feature) { return wrapperContained.isFeatureAllowed(feature.wrapperContained); }

}