package yarnwrap.structure;
public class VillageGenerator { public net.minecraft.structure.VillageGenerator wrapperContained; public VillageGenerator(net.minecraft.structure.VillageGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.VillageGenerator.bootstrap(poolRegisterable.wrapperContained); }

}