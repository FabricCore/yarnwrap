package yarnwrap.world.gen.feature;
public class EndConfiguredFeatures { public net.minecraft.world.gen.feature.EndConfiguredFeatures wrapperContained; public EndConfiguredFeatures(net.minecraft.world.gen.feature.EndConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey END_SPIKE() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_SPIKE); }
// public void END_SPIKE(yarnwrap.registry.RegistryKey value) { wrapperContained.END_SPIKE = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END_GATEWAY_RETURN() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_GATEWAY_RETURN); }
// public void END_GATEWAY_RETURN(yarnwrap.registry.RegistryKey value) { wrapperContained.END_GATEWAY_RETURN = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END_GATEWAY_DELAYED() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_GATEWAY_DELAYED); }
// public void END_GATEWAY_DELAYED(yarnwrap.registry.RegistryKey value) { wrapperContained.END_GATEWAY_DELAYED = value.wrapperContained; }
public yarnwrap.registry.RegistryKey CHORUS_PLANT() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHORUS_PLANT); }
// public void CHORUS_PLANT(yarnwrap.registry.RegistryKey value) { wrapperContained.CHORUS_PLANT = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END_ISLAND() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_ISLAND); }
// public void END_ISLAND(yarnwrap.registry.RegistryKey value) { wrapperContained.END_ISLAND = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END_PLATFORM() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_PLATFORM); }
// public void END_PLATFORM(yarnwrap.registry.RegistryKey value) { wrapperContained.END_PLATFORM = value.wrapperContained; }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}