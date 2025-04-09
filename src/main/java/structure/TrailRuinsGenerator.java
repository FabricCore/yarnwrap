package yarnwrap.structure;
public class TrailRuinsGenerator { public net.minecraft.structure.TrailRuinsGenerator wrapperContained; public TrailRuinsGenerator(net.minecraft.structure.TrailRuinsGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey TOWER() { return new yarnwrap.registry.RegistryKey(wrapperContained.TOWER); }
public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}