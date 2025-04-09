package yarnwrap.structure;
public class StructureSet { public net.minecraft.structure.StructureSet wrapperContained; public StructureSet(net.minecraft.structure.StructureSet wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public Object createEntry(yarnwrap.registry.entry.RegistryEntry structure) { return wrapperContained.createEntry(structure.wrapperContained); }
public Object createEntry(yarnwrap.registry.entry.RegistryEntry structure,int weight) { return wrapperContained.createEntry(structure.wrapperContained,weight); }

}