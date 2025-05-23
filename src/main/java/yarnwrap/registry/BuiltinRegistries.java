package yarnwrap.registry;
public class BuiltinRegistries { public net.minecraft.registry.BuiltinRegistries wrapperContained; public BuiltinRegistries(net.minecraft.registry.BuiltinRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryBuilder REGISTRY_BUILDER() { return new yarnwrap.registry.RegistryBuilder(wrapperContained.REGISTRY_BUILDER); }
// public void REGISTRY_BUILDER(yarnwrap.registry.RegistryBuilder value) { wrapperContained.REGISTRY_BUILDER = value.wrapperContained; }
// public static yarnwrap.registry.RegistryBuilder REGISTRY_BUILDER() { return new yarnwrap.registry.RegistryBuilder(net.minecraft.registry.BuiltinRegistries.REGISTRY_BUILDER); }
// public static void REGISTRY_BUILDER(yarnwrap.registry.RegistryBuilder value, ) { net.minecraft.registry.BuiltinRegistries.REGISTRY_BUILDER = value.wrapperContained; }

// public Object createWrapperLookup() { return wrapperContained.createWrapperLookup(); }
public static Object createWrapperLookup() { return net.minecraft.registry.BuiltinRegistries.createWrapperLookup(); }
// public boolean hasBiomePlacementModifier(yarnwrap.world.gen.feature.PlacedFeature placedFeature) { return wrapperContained.hasBiomePlacementModifier(placedFeature.wrapperContained); }
// public static boolean hasBiomePlacementModifier(yarnwrap.world.gen.feature.PlacedFeature placedFeature, ) { return net.minecraft.registry.BuiltinRegistries.hasBiomePlacementModifier(placedFeature.wrapperContained); }
// public void method_46819(Object value) { wrapperContained.method_46819(value); }
// public static void method_46819(Object value, ) { net.minecraft.registry.BuiltinRegistries.method_46819(value); }
// public void method_46820(yarnwrap.registry.RegistryEntryLookup key) { wrapperContained.method_46820(key.wrapperContained); }
// public static void method_46820(yarnwrap.registry.RegistryEntryLookup key, ) { net.minecraft.registry.BuiltinRegistries.method_46820(key.wrapperContained); }
// public void method_46821(yarnwrap.registry.RegistryEntryLookup placedFeature) { wrapperContained.method_46821(placedFeature.wrapperContained); }
// public static void method_46821(yarnwrap.registry.RegistryEntryLookup placedFeature, ) { net.minecraft.registry.BuiltinRegistries.method_46821(placedFeature.wrapperContained); }
// public void method_46822(yarnwrap.registry.RegistryEntryLookup biome) { wrapperContained.method_46822(biome.wrapperContained); }
// public static void method_46822(yarnwrap.registry.RegistryEntryLookup biome, ) { net.minecraft.registry.BuiltinRegistries.method_46822(biome.wrapperContained); }
// public void validate(Object registries) { wrapperContained.validate(registries); }
// public static void validate(Object registries, ) { net.minecraft.registry.BuiltinRegistries.validate(registries); }
// public void validate(yarnwrap.registry.RegistryEntryLookup placedFeatureLookup,yarnwrap.registry.RegistryWrapper biomeLookup) { wrapperContained.validate(placedFeatureLookup.wrapperContained,biomeLookup.wrapperContained); }
// public static void validate(yarnwrap.registry.RegistryEntryLookup placedFeatureLookup,yarnwrap.registry.RegistryWrapper biomeLookup, ) { net.minecraft.registry.BuiltinRegistries.validate(placedFeatureLookup.wrapperContained,biomeLookup.wrapperContained); }

}