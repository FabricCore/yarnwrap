package yarnwrap.world.gen.feature;
public class EndPlacedFeatures { public net.minecraft.world.gen.feature.EndPlacedFeatures wrapperContained; public EndPlacedFeatures(net.minecraft.world.gen.feature.EndPlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey END_SPIKE() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_SPIKE); }
// public void END_SPIKE(yarnwrap.registry.RegistryKey value) { wrapperContained.END_SPIKE = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END_GATEWAY_RETURN() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_GATEWAY_RETURN); }
// public void END_GATEWAY_RETURN(yarnwrap.registry.RegistryKey value) { wrapperContained.END_GATEWAY_RETURN = value.wrapperContained; }
public yarnwrap.registry.RegistryKey CHORUS_PLANT() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHORUS_PLANT); }
// public void CHORUS_PLANT(yarnwrap.registry.RegistryKey value) { wrapperContained.CHORUS_PLANT = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END_ISLAND_DECORATED() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_ISLAND_DECORATED); }
// public void END_ISLAND_DECORATED(yarnwrap.registry.RegistryKey value) { wrapperContained.END_ISLAND_DECORATED = value.wrapperContained; }
public yarnwrap.registry.RegistryKey END_PLATFORM() { return new yarnwrap.registry.RegistryKey(wrapperContained.END_PLATFORM); }
// public void END_PLATFORM(yarnwrap.registry.RegistryKey value) { wrapperContained.END_PLATFORM = value.wrapperContained; }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}