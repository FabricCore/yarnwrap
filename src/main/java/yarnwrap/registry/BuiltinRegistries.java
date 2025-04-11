package yarnwrap.registry;
public class BuiltinRegistries { public net.minecraft.registry.BuiltinRegistries wrapperContained; public BuiltinRegistries(net.minecraft.registry.BuiltinRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryBuilder REGISTRY_BUILDER() { return new yarnwrap.registry.RegistryBuilder(wrapperContained.REGISTRY_BUILDER); }
// public void REGISTRY_BUILDER(yarnwrap.registry.RegistryBuilder value) { wrapperContained.REGISTRY_BUILDER = value.wrapperContained; }
public Object createWrapperLookup() { return wrapperContained.createWrapperLookup(); }
// public boolean hasBiomePlacementModifier(yarnwrap.world.gen.feature.PlacedFeature placedFeature) { return wrapperContained.hasBiomePlacementModifier(placedFeature.wrapperContained); }
// public void validate(Object wrapperLookup) { wrapperContained.validate(wrapperLookup); }
public void validate(yarnwrap.registry.RegistryEntryLookup placedFeatureLookup,yarnwrap.registry.RegistryWrapper biomeLookup) { wrapperContained.validate(placedFeatureLookup.wrapperContained,biomeLookup.wrapperContained); }

}