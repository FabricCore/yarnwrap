package yarnwrap.world.gen.feature;
public class OceanPlacedFeatures { public net.minecraft.world.gen.feature.OceanPlacedFeatures wrapperContained; public OceanPlacedFeatures(net.minecraft.world.gen.feature.OceanPlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey SEAGRASS_WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_WARM); }
public yarnwrap.registry.RegistryKey SEAGRASS_NORMAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_NORMAL); }
public yarnwrap.registry.RegistryKey SEAGRASS_COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_COLD); }
public yarnwrap.registry.RegistryKey SEAGRASS_RIVER() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_RIVER); }
public yarnwrap.registry.RegistryKey SEAGRASS_SWAMP() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_SWAMP); }
public yarnwrap.registry.RegistryKey SEAGRASS_DEEP_WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_DEEP_WARM); }
public yarnwrap.registry.RegistryKey SEAGRASS_DEEP() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_DEEP); }
public yarnwrap.registry.RegistryKey SEAGRASS_DEEP_COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_DEEP_COLD); }
public yarnwrap.registry.RegistryKey SEAGRASS_SIMPLE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_SIMPLE); }
public yarnwrap.registry.RegistryKey SEA_PICKLE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEA_PICKLE); }
public yarnwrap.registry.RegistryKey KELP_COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.KELP_COLD); }
public yarnwrap.registry.RegistryKey KELP_WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.KELP_WARM); }
public yarnwrap.registry.RegistryKey WARM_OCEAN_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARM_OCEAN_VEGETATION); }
// public java.util.List seagrassModifiers(int count) { return wrapperContained.seagrassModifiers(count); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}