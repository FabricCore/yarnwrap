package yarnwrap.structure;
public class BastionData { public net.minecraft.structure.BastionData wrapperContained; public BastionData(net.minecraft.structure.BastionData wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}