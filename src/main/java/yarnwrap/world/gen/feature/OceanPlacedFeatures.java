package yarnwrap.world.gen.feature;
public class OceanPlacedFeatures { public net.minecraft.world.gen.feature.OceanPlacedFeatures wrapperContained; public OceanPlacedFeatures(net.minecraft.world.gen.feature.OceanPlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey SEAGRASS_WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_WARM); }
// public void SEAGRASS_WARM(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_WARM = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_NORMAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_NORMAL); }
// public void SEAGRASS_NORMAL(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_NORMAL = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_COLD); }
// public void SEAGRASS_COLD(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_COLD = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_RIVER() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_RIVER); }
// public void SEAGRASS_RIVER(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_RIVER = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_SWAMP() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_SWAMP); }
// public void SEAGRASS_SWAMP(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_SWAMP = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_DEEP_WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_DEEP_WARM); }
// public void SEAGRASS_DEEP_WARM(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_DEEP_WARM = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_DEEP() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_DEEP); }
// public void SEAGRASS_DEEP(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_DEEP = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_DEEP_COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_DEEP_COLD); }
// public void SEAGRASS_DEEP_COLD(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_DEEP_COLD = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEAGRASS_SIMPLE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEAGRASS_SIMPLE); }
// public void SEAGRASS_SIMPLE(yarnwrap.registry.RegistryKey value) { wrapperContained.SEAGRASS_SIMPLE = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SEA_PICKLE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEA_PICKLE); }
// public void SEA_PICKLE(yarnwrap.registry.RegistryKey value) { wrapperContained.SEA_PICKLE = value.wrapperContained; }
public yarnwrap.registry.RegistryKey KELP_COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.KELP_COLD); }
// public void KELP_COLD(yarnwrap.registry.RegistryKey value) { wrapperContained.KELP_COLD = value.wrapperContained; }
public yarnwrap.registry.RegistryKey KELP_WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.KELP_WARM); }
// public void KELP_WARM(yarnwrap.registry.RegistryKey value) { wrapperContained.KELP_WARM = value.wrapperContained; }
public yarnwrap.registry.RegistryKey WARM_OCEAN_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARM_OCEAN_VEGETATION); }
// public void WARM_OCEAN_VEGETATION(yarnwrap.registry.RegistryKey value) { wrapperContained.WARM_OCEAN_VEGETATION = value.wrapperContained; }
// public java.util.List seagrassModifiers(int count) { return wrapperContained.seagrassModifiers(count); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}