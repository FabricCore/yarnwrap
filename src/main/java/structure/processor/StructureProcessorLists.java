package yarnwrap.structure.processor;
public class StructureProcessorLists { public net.minecraft.structure.processor.StructureProcessorLists wrapperContained; public StructureProcessorLists(net.minecraft.structure.processor.StructureProcessorLists wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(yarnwrap.registry.Registerable processorListRegisterable,yarnwrap.registry.RegistryKey key,java.util.List processors) { wrapperContained.register(processorListRegisterable.wrapperContained,key.wrapperContained,processors); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public void bootstrap(yarnwrap.registry.Registerable processorListRegisterable) { wrapperContained.bootstrap(processorListRegisterable.wrapperContained); }
// public yarnwrap.structure.processor.CappedStructureProcessor createTrailRuinsTowerTopProcessor(yarnwrap.registry.RegistryKey lootTable,int limit) { return new yarnwrap.structure.processor.CappedStructureProcessor(wrapperContained.createTrailRuinsTowerTopProcessor(lootTable.wrapperContained,limit)); }

}