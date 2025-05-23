package yarnwrap.structure.pool;
public class StructurePool { public net.minecraft.structure.pool.StructurePool wrapperContained; public StructurePool(net.minecraft.structure.pool.StructurePool wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.ObjectArrayList elements() { return wrapperContained.elements; }
// public void elements(it.unimi.dsi.fastutil.objects.ObjectArrayList value) { wrapperContained.elements = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList elements() { return net.minecraft.structure.pool.StructurePool.elements; }
// public static void elements(it.unimi.dsi.fastutil.objects.ObjectArrayList value, ) { net.minecraft.structure.pool.StructurePool.elements = value; }

// public java.util.List elementWeights() { return wrapperContained.elementWeights; }
// public void elementWeights(java.util.List value) { wrapperContained.elementWeights = value; }
// public static java.util.List elementWeights() { return net.minecraft.structure.pool.StructurePool.elementWeights; }
// public static void elementWeights(java.util.List value, ) { net.minecraft.structure.pool.StructurePool.elementWeights = value; }

// public int highestY() { return wrapperContained.highestY; }
// public void highestY(int value) { wrapperContained.highestY = value; }
// public static int highestY() { return net.minecraft.structure.pool.StructurePool.highestY; }
// public static void highestY(int value, ) { net.minecraft.structure.pool.StructurePool.highestY = value; }

// public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public static com.mojang.serialization.Codec REGISTRY_CODEC() { return net.minecraft.structure.pool.StructurePool.REGISTRY_CODEC; }
// public static void REGISTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.structure.pool.StructurePool.REGISTRY_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.structure.pool.StructurePool.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.structure.pool.StructurePool.CODEC = value; }

// public int DEFAULT_Y() { return wrapperContained.DEFAULT_Y; }
// public void DEFAULT_Y(int value) { wrapperContained.DEFAULT_Y = value; }
// public static int DEFAULT_Y() { return net.minecraft.structure.pool.StructurePool.DEFAULT_Y; }
// public static void DEFAULT_Y(int value, ) { net.minecraft.structure.pool.StructurePool.DEFAULT_Y = value; }

// public org.apache.commons.lang3.mutable.MutableObject FALLBACK() { return wrapperContained.FALLBACK; }
// public void FALLBACK(org.apache.commons.lang3.mutable.MutableObject value) { wrapperContained.FALLBACK = value; }
// public static org.apache.commons.lang3.mutable.MutableObject FALLBACK() { return net.minecraft.structure.pool.StructurePool.FALLBACK; }
// public static void FALLBACK(org.apache.commons.lang3.mutable.MutableObject value, ) { net.minecraft.structure.pool.StructurePool.FALLBACK = value; }

// public yarnwrap.registry.entry.RegistryEntry fallback() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.fallback); }
// public void fallback(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.fallback = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry fallback() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.structure.pool.StructurePool.fallback); }
// public static void fallback(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.structure.pool.StructurePool.fallback = value.wrapperContained; }

public StructurePool(yarnwrap.registry.entry.RegistryEntry fallback,java.util.List elementWeights) { this.wrapperContained = new net.minecraft.structure.pool.StructurePool(fallback.wrapperContained,elementWeights); }
// public StructurePool(yarnwrap.registry.entry.RegistryEntry fallback,java.util.List elementWeightsByGetters,Object projection) { this.wrapperContained = new net.minecraft.structure.pool.StructurePool(fallback.wrapperContained,elementWeightsByGetters,projection); }
public yarnwrap.structure.pool.StructurePoolElement getRandomElement(yarnwrap.util.math.random.Random random) { return new yarnwrap.structure.pool.StructurePoolElement(wrapperContained.getRandomElement(random.wrapperContained)); }
// public static yarnwrap.structure.pool.StructurePoolElement getRandomElement(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.structure.pool.StructurePoolElement(net.minecraft.structure.pool.StructurePool.getRandomElement(random.wrapperContained)); }
public int getElementCount() { return wrapperContained.getElementCount(); }
// public static int getElementCount() { return net.minecraft.structure.pool.StructurePool.getElementCount(); }
public java.util.List getElementIndicesInRandomOrder(yarnwrap.util.math.random.Random random) { return wrapperContained.getElementIndicesInRandomOrder(random.wrapperContained); }
// public static java.util.List getElementIndicesInRandomOrder(yarnwrap.util.math.random.Random random, ) { return net.minecraft.structure.pool.StructurePool.getElementIndicesInRandomOrder(random.wrapperContained); }
public int getHighestY(yarnwrap.structure.StructureTemplateManager structureTemplateManager) { return wrapperContained.getHighestY(structureTemplateManager.wrapperContained); }
// public static int getHighestY(yarnwrap.structure.StructureTemplateManager structureTemplateManager, ) { return net.minecraft.structure.pool.StructurePool.getHighestY(structureTemplateManager.wrapperContained); }
// public int method_19310(yarnwrap.structure.StructureTemplateManager element) { return wrapperContained.method_19310(element.wrapperContained); }
// public static int method_19310(yarnwrap.structure.StructureTemplateManager element, ) { return net.minecraft.structure.pool.StructurePool.method_19310(element.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28886(Object instance) { return wrapperContained.method_28886(instance); }
// public static com.mojang.datafixers.kinds.App method_28886(Object instance, ) { return net.minecraft.structure.pool.StructurePool.method_28886(instance); }
// public java.util.List method_28888(yarnwrap.structure.pool.StructurePool pool) { return wrapperContained.method_28888(pool.wrapperContained); }
// public static java.util.List method_28888(yarnwrap.structure.pool.StructurePool pool, ) { return net.minecraft.structure.pool.StructurePool.method_28888(pool.wrapperContained); }
// public boolean method_35372(yarnwrap.structure.pool.StructurePoolElement element) { return wrapperContained.method_35372(element.wrapperContained); }
// public static boolean method_35372(yarnwrap.structure.pool.StructurePoolElement element, ) { return net.minecraft.structure.pool.StructurePool.method_35372(element.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getFallback() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getFallback()); }
// public static yarnwrap.registry.entry.RegistryEntry getFallback() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.structure.pool.StructurePool.getFallback()); }
public java.util.List getElementWeights() { return wrapperContained.getElementWeights(); }
// public static java.util.List getElementWeights() { return net.minecraft.structure.pool.StructurePool.getElementWeights(); }

}