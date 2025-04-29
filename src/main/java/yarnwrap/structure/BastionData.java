package yarnwrap.structure;
public class BastionData { public net.minecraft.structure.BastionData wrapperContained; public BastionData(net.minecraft.structure.BastionData wrapperContained) { this.wrapperContained = wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.BastionData.bootstrap(poolRegisterable.wrapperContained); }

}