package yarnwrap.structure.pool;
public class StructurePool { public net.minecraft.structure.pool.StructurePool wrapperContained; public StructurePool(net.minecraft.structure.pool.StructurePool wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.ObjectArrayList elements() { return wrapperContained.elements; }
// public void elements(it.unimi.dsi.fastutil.objects.ObjectArrayList value) { wrapperContained.elements = value; }
// public java.util.List elementCounts() { return wrapperContained.elementCounts; }
// public void elementCounts(java.util.List value) { wrapperContained.elementCounts = value; }
// public int highestY() { return wrapperContained.highestY; }
// public void highestY(int value) { wrapperContained.highestY = value; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public int DEFAULT_Y() { return wrapperContained.DEFAULT_Y; }
// public void DEFAULT_Y(int value) { wrapperContained.DEFAULT_Y = value; }
// public org.apache.commons.lang3.mutable.MutableObject FALLBACK() { return wrapperContained.FALLBACK; }
// public void FALLBACK(org.apache.commons.lang3.mutable.MutableObject value) { wrapperContained.FALLBACK = value; }
// public yarnwrap.registry.entry.RegistryEntry fallback() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.fallback); }
// public void fallback(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.fallback = value.wrapperContained; }
public StructurePool(yarnwrap.registry.entry.RegistryEntry fallback,java.util.List elementCounts) { this.wrapperContained = new net.minecraft.structure.pool.StructurePool(fallback.wrapperContained,elementCounts); }
// public StructurePool(yarnwrap.registry.entry.RegistryEntry fallback,java.util.List elementCountsByGetters,Object projection) { this.wrapperContained = new net.minecraft.structure.pool.StructurePool(fallback.wrapperContained,elementCountsByGetters,projection); }
public yarnwrap.structure.pool.StructurePoolElement getRandomElement(yarnwrap.util.math.random.Random random) { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.getRandomElement(random.wrapperContained)); }
public int getElementCount() { return wrapperContained.getElementCount(); }
public java.util.List getElementIndicesInRandomOrder(yarnwrap.util.math.random.Random random) { return wrapperContained.getElementIndicesInRandomOrder(random.wrapperContained); }
public int getHighestY(yarnwrap.structure.StructureTemplateManager structureTemplateManager) { return wrapperContained.getHighestY(structureTemplateManager.wrapperContained); }
// public int method_19310(yarnwrap.structure.StructureTemplateManager element) { return wrapperContained.method_19310(element.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28886(Object instance) { return wrapperContained.method_28886(instance); }
// public java.util.List method_28888(yarnwrap.structure.pool.StructurePool pool) { return wrapperContained.method_28888(pool.wrapperContained); }
// public boolean method_35372(yarnwrap.structure.pool.StructurePoolElement element) { return wrapperContained.method_35372(element.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getFallback() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getFallback()); }

}