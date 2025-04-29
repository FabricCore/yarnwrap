package yarnwrap.world.biome;
public class GenerationSettings { public net.minecraft.world.biome.GenerationSettings wrapperContained; public GenerationSettings(net.minecraft.world.biome.GenerationSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.biome.GenerationSettings.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.biome.GenerationSettings.CODEC = value; }

// public java.util.Map carvers() { return wrapperContained.carvers; }
// public void carvers(java.util.Map value) { wrapperContained.carvers = value; }
// public static java.util.Map carvers() { return net.minecraft.world.biome.GenerationSettings.carvers; }
// public static void carvers(java.util.Map value, ) { net.minecraft.world.biome.GenerationSettings.carvers = value; }

// public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
// public static java.util.List features() { return net.minecraft.world.biome.GenerationSettings.features; }
// public static void features(java.util.List value, ) { net.minecraft.world.biome.GenerationSettings.features = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.biome.GenerationSettings.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.biome.GenerationSettings.LOGGER = value; }

// public yarnwrap.world.biome.GenerationSettings INSTANCE() { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.biome.GenerationSettings value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.world.biome.GenerationSettings INSTANCE() { return new yarnwrap.world.biome.GenerationSettings(net.minecraft.world.biome.GenerationSettings.INSTANCE); }
// public static void INSTANCE(yarnwrap.world.biome.GenerationSettings value, ) { net.minecraft.world.biome.GenerationSettings.INSTANCE = value.wrapperContained; }

// public java.util.function.Supplier flowerFeatures() { return wrapperContained.flowerFeatures; }
// public void flowerFeatures(java.util.function.Supplier value) { wrapperContained.flowerFeatures = value; }
// public static java.util.function.Supplier flowerFeatures() { return net.minecraft.world.biome.GenerationSettings.flowerFeatures; }
// public static void flowerFeatures(java.util.function.Supplier value, ) { net.minecraft.world.biome.GenerationSettings.flowerFeatures = value; }

// public java.util.function.Supplier allowedFeatures() { return wrapperContained.allowedFeatures; }
// public void allowedFeatures(java.util.function.Supplier value) { wrapperContained.allowedFeatures = value; }
// public static java.util.function.Supplier allowedFeatures() { return net.minecraft.world.biome.GenerationSettings.allowedFeatures; }
// public static void allowedFeatures(java.util.function.Supplier value, ) { net.minecraft.world.biome.GenerationSettings.allowedFeatures = value; }

// public GenerationSettings(java.util.Map carvers,java.util.List features) { this.wrapperContained = new net.minecraft.world.biome.GenerationSettings(carvers,features); }
// public com.mojang.datafixers.kinds.App method_30802(Object instance) { return wrapperContained.method_30802(instance); }
// public static com.mojang.datafixers.kinds.App method_30802(Object instance, ) { return net.minecraft.world.biome.GenerationSettings.method_30802(instance); }
// public java.util.Map method_30808(yarnwrap.world.biome.GenerationSettings generationSettings) { return wrapperContained.method_30808(generationSettings.wrapperContained); }
// public static java.util.Map method_30808(yarnwrap.world.biome.GenerationSettings generationSettings, ) { return net.minecraft.world.biome.GenerationSettings.method_30808(generationSettings.wrapperContained); }
// public java.util.List method_30809(yarnwrap.world.biome.GenerationSettings generationSettings) { return wrapperContained.method_30809(generationSettings.wrapperContained); }
// public static java.util.List method_30809(yarnwrap.world.biome.GenerationSettings generationSettings, ) { return net.minecraft.world.biome.GenerationSettings.method_30809(generationSettings.wrapperContained); }
// public java.lang.Iterable getCarversForStep(Object carverStep) { return wrapperContained.getCarversForStep(carverStep); }
// public static java.lang.Iterable getCarversForStep(Object carverStep, ) { return net.minecraft.world.biome.GenerationSettings.getCarversForStep(carverStep); }
public java.util.List getFlowerFeatures() { return wrapperContained.getFlowerFeatures(); }
// public static java.util.List getFlowerFeatures() { return net.minecraft.world.biome.GenerationSettings.getFlowerFeatures(); }
public java.util.List getFeatures() { return wrapperContained.getFeatures(); }
// public static java.util.List getFeatures() { return net.minecraft.world.biome.GenerationSettings.getFeatures(); }
public boolean isFeatureAllowed(yarnwrap.world.gen.feature.PlacedFeature feature) { return wrapperContained.isFeatureAllowed(feature.wrapperContained); }
// public static boolean isFeatureAllowed(yarnwrap.world.gen.feature.PlacedFeature feature, ) { return net.minecraft.world.biome.GenerationSettings.isFeatureAllowed(feature.wrapperContained); }
// public boolean method_40138(yarnwrap.world.gen.feature.ConfiguredFeature feature) { return wrapperContained.method_40138(feature.wrapperContained); }
// public static boolean method_40138(yarnwrap.world.gen.feature.ConfiguredFeature feature, ) { return net.minecraft.world.biome.GenerationSettings.method_40138(feature.wrapperContained); }

}