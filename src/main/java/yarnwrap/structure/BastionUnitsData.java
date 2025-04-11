package yarnwrap.structure;
public class BastionUnitsData { public net.minecraft.structure.BastionUnitsData wrapperContained; public BastionUnitsData(net.minecraft.structure.BastionUnitsData wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}