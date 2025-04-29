package yarnwrap.structure;
public class TrailRuinsGenerator { public net.minecraft.structure.TrailRuinsGenerator wrapperContained; public TrailRuinsGenerator(net.minecraft.structure.TrailRuinsGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey TOWER() { return new yarnwrap.registry.RegistryKey(wrapperContained.TOWER); }
// public void TOWER(yarnwrap.registry.RegistryKey value) { wrapperContained.TOWER = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey TOWER() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.TrailRuinsGenerator.TOWER); }
// public static void TOWER(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.TrailRuinsGenerator.TOWER = value.wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.TrailRuinsGenerator.bootstrap(poolRegisterable.wrapperContained); }

}