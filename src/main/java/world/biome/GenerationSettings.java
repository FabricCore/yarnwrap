package yarnwrap.world.biome;
public class GenerationSettings { public net.minecraft.world.biome.GenerationSettings wrapperContained; public GenerationSettings(net.minecraft.world.biome.GenerationSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Map carvers() { return wrapperContained.carvers; }
// public java.util.List features() { return wrapperContained.features; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.world.biome.GenerationSettings INSTANCE() { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.INSTANCE); }
// public java.util.function.Supplier flowerFeatures() { return wrapperContained.flowerFeatures; }
// public java.util.function.Supplier allowedFeatures() { return wrapperContained.allowedFeatures; }
// public java.lang.Iterable getCarversForStep(Object carverStep) { return wrapperContained.getCarversForStep(carverStep); }
public java.util.List getFlowerFeatures() { return wrapperContained.getFlowerFeatures(); }
public java.util.List getFeatures() { return wrapperContained.getFeatures(); }
public boolean isFeatureAllowed(yarnwrap.world.gen.feature.PlacedFeature feature) { return wrapperContained.isFeatureAllowed(feature.wrapperContained); }

}