package yarnwrap.world.gen.feature;
public class OceanConfiguredFeatures { public net.minecraft.world.gen.feature.OceanConfiguredFeatures wrapperContained; public OceanConfiguredFeatures(net.minecraft.world.gen.feature.OceanConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey SEAGRASS_SHORT() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_SHORT); }
public yarnwrap.registry.RegistryKey SEAGRASS_SLIGHTLY_LESS_SHORT() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_SLIGHTLY_LESS_SHORT); }
public yarnwrap.registry.RegistryKey SEAGRASS_MID() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_MID); }
public yarnwrap.registry.RegistryKey SEAGRASS_TALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_TALL); }
public yarnwrap.registry.RegistryKey SEA_PICKLE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEA_PICKLE); }
public yarnwrap.registry.RegistryKey SEAGRASS_SIMPLE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_SIMPLE); }
public yarnwrap.registry.RegistryKey KELP() { return new yarnwrap.registry.RegistryKey(wrapperContained.KELP); }
public yarnwrap.registry.RegistryKey WARM_OCEAN_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARM_OCEAN_VEGETATION); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}