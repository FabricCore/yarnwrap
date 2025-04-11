package yarnwrap.structure;
public class VillageGenerator { public net.minecraft.structure.VillageGenerator wrapperContained; public VillageGenerator(net.minecraft.structure.VillageGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}