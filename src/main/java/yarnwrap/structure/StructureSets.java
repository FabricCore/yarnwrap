package yarnwrap.structure;
public class StructureSets { public net.minecraft.structure.StructureSets wrapperContained; public StructureSets(net.minecraft.structure.StructureSets wrapperContained) { this.wrapperContained = wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable structureSetRegisterable) { wrapperContained.bootstrap(structureSetRegisterable.wrapperContained); }

}