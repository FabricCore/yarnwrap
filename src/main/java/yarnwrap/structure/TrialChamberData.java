package yarnwrap.structure;
public class TrialChamberData { public net.minecraft.structure.TrialChamberData wrapperContained; public TrialChamberData(net.minecraft.structure.TrialChamberData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey CHAMBER_END_POOL_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHAMBER_END_POOL_KEY); }
// public void CHAMBER_END_POOL_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.CHAMBER_END_POOL_KEY = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey CHAMBER_END_POOL_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.TrialChamberData.CHAMBER_END_POOL_KEY); }
// public static void CHAMBER_END_POOL_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.TrialChamberData.CHAMBER_END_POOL_KEY = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey HALLWAY_FALLBACK_POOL_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.HALLWAY_FALLBACK_POOL_KEY); }
// public void HALLWAY_FALLBACK_POOL_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.HALLWAY_FALLBACK_POOL_KEY = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey HALLWAY_FALLBACK_POOL_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.TrialChamberData.HALLWAY_FALLBACK_POOL_KEY); }
// public static void HALLWAY_FALLBACK_POOL_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.TrialChamberData.HALLWAY_FALLBACK_POOL_KEY = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey CHAMBER_ENTRANCE_CAP_POOL_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHAMBER_ENTRANCE_CAP_POOL_KEY); }
// public void CHAMBER_ENTRANCE_CAP_POOL_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.CHAMBER_ENTRANCE_CAP_POOL_KEY = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey CHAMBER_ENTRANCE_CAP_POOL_KEY() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.TrialChamberData.CHAMBER_ENTRANCE_CAP_POOL_KEY); }
// public static void CHAMBER_ENTRANCE_CAP_POOL_KEY(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.TrialChamberData.CHAMBER_ENTRANCE_CAP_POOL_KEY = value.wrapperContained; }

// public java.util.List ALIAS_BINDINGS() { return wrapperContained.ALIAS_BINDINGS; }
// public void ALIAS_BINDINGS(java.util.List value) { wrapperContained.ALIAS_BINDINGS = value; }
public static java.util.List ALIAS_BINDINGS() { return net.minecraft.structure.TrialChamberData.ALIAS_BINDINGS; }
// public static void ALIAS_BINDINGS(java.util.List value, ) { net.minecraft.structure.TrialChamberData.ALIAS_BINDINGS = value; }

// public java.lang.String spawner(java.lang.String path) { return wrapperContained.spawner(path); }
// public static java.lang.String spawner(java.lang.String path, ) { return net.minecraft.structure.TrialChamberData.spawner(path); }
// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.TrialChamberData.bootstrap(poolRegisterable.wrapperContained); }

}