package yarnwrap.structure;
public class TrialChamberData { public net.minecraft.structure.TrialChamberData wrapperContained; public TrialChamberData(net.minecraft.structure.TrialChamberData wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey CHAMBER_END_POOL_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHAMBER_END_POOL_KEY); }
public yarnwrap.registry.RegistryKey HALLWAY_FALLBACK_POOL_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.HALLWAY_FALLBACK_POOL_KEY); }
public yarnwrap.registry.RegistryKey CHAMBER_ENTRANCE_CAP_POOL_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHAMBER_ENTRANCE_CAP_POOL_KEY); }
public java.util.List ALIAS_BINDINGS() { return wrapperContained.ALIAS_BINDINGS; }
public java.lang.String spawner(java.lang.String path) { return wrapperContained.spawner(path); }
public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}