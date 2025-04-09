package yarnwrap.world.gen.feature;
public class EndConfiguredFeatures { public net.minecraft.world.gen.feature.EndConfiguredFeatures wrapperContained; public EndConfiguredFeatures(net.minecraft.world.gen.feature.EndConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey END_SPIKE() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_SPIKE); }
public yarnwrap.registry.RegistryKey END_GATEWAY_RETURN() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_GATEWAY_RETURN); }
public yarnwrap.registry.RegistryKey END_GATEWAY_DELAYED() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_GATEWAY_DELAYED); }
public yarnwrap.registry.RegistryKey CHORUS_PLANT() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHORUS_PLANT); }
public yarnwrap.registry.RegistryKey END_ISLAND() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_ISLAND); }
public yarnwrap.registry.RegistryKey END_PLATFORM() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_PLATFORM); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}