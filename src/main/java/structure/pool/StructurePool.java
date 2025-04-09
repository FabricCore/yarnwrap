package yarnwrap.structure.pool;
public class StructurePool { public net.minecraft.structure.pool.StructurePool wrapperContained; public StructurePool(net.minecraft.structure.pool.StructurePool wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.ObjectArrayList elements() { return wrapperContained.elements; }
// public java.util.List elementCounts() { return wrapperContained.elementCounts; }
// public int highestY() { return wrapperContained.highestY; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public int DEFAULT_Y() { return wrapperContained.DEFAULT_Y; }
// public org.apache.commons.lang3.mutable.MutableObject FALLBACK() { return wrapperContained.FALLBACK; }
// public yarnwrap.registry.entry.RegistryEntry fallback() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.fallback); }
public yarnwrap.structure.pool.StructurePoolElement getRandomElement(yarnwrap.util.math.random.Random random) { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.getRandomElement(random.wrapperContained)); }
public int getElementCount() { return wrapperContained.getElementCount(); }
public java.util.List getElementIndicesInRandomOrder(yarnwrap.util.math.random.Random random) { return wrapperContained.getElementIndicesInRandomOrder(random.wrapperContained); }
public int getHighestY(yarnwrap.structure.StructureTemplateManager structureTemplateManager) { return wrapperContained.getHighestY(structureTemplateManager.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getFallback() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getFallback()); }

}