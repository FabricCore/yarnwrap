package yarnwrap.structure;
public class BastionTreasureData { public net.minecraft.structure.BastionTreasureData wrapperContained; public BastionTreasureData(net.minecraft.structure.BastionTreasureData wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}