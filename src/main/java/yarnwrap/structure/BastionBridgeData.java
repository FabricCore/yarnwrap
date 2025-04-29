package yarnwrap.structure;
public class BastionBridgeData { public net.minecraft.structure.BastionBridgeData wrapperContained; public BastionBridgeData(net.minecraft.structure.BastionBridgeData wrapperContained) { this.wrapperContained = wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.BastionBridgeData.bootstrap(poolRegisterable.wrapperContained); }

}