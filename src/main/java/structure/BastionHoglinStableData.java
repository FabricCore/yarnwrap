package yarnwrap.structure;
public class BastionHoglinStableData { public net.minecraft.structure.BastionHoglinStableData wrapperContained; public BastionHoglinStableData(net.minecraft.structure.BastionHoglinStableData wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}