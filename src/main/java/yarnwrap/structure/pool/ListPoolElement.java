package yarnwrap.structure.pool;
public class ListPoolElement { public net.minecraft.structure.pool.ListPoolElement wrapperContained; public ListPoolElement(net.minecraft.structure.pool.ListPoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public static java.util.List elements() { return net.minecraft.structure.pool.ListPoolElement.elements; }
// public static void elements(java.util.List value, ) { net.minecraft.structure.pool.ListPoolElement.elements = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.pool.ListPoolElement.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.pool.ListPoolElement.CODEC = value; }

// public ListPoolElement(java.util.List elements,Object projection) { this.wrapperContained = new net.minecraft.structure.pool.ListPoolElement(elements,projection); }
// public void method_16620(Object element) { wrapperContained.method_16620(element); }
// public static void method_16620(Object element, ) { net.minecraft.structure.pool.ListPoolElement.method_16620(element); }
// public void setAllElementsProjection(Object projection) { wrapperContained.setAllElementsProjection(projection); }
// public static void setAllElementsProjection(Object projection, ) { net.minecraft.structure.pool.ListPoolElement.setAllElementsProjection(projection); }
// public com.mojang.datafixers.kinds.App method_28875(Object instance) { return wrapperContained.method_28875(instance); }
// public static com.mojang.datafixers.kinds.App method_28875(Object instance, ) { return net.minecraft.structure.pool.ListPoolElement.method_28875(instance); }
// public java.util.List method_28876(yarnwrap.structure.pool.ListPoolElement pool) { return wrapperContained.method_28876(pool.wrapperContained); }
// public static java.util.List method_28876(yarnwrap.structure.pool.ListPoolElement pool, ) { return net.minecraft.structure.pool.ListPoolElement.method_28876(pool.wrapperContained); }
// public boolean method_35369(yarnwrap.structure.pool.StructurePoolElement element) { return wrapperContained.method_35369(element.wrapperContained); }
// public static boolean method_35369(yarnwrap.structure.pool.StructurePoolElement element, ) { return net.minecraft.structure.pool.ListPoolElement.method_35369(element.wrapperContained); }
// public yarnwrap.util.math.BlockBox method_35370(yarnwrap.structure.StructureTemplateManager element) { return new yarnwrap.util.math.BlockBox(wrapperContained.method_35370(element.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox method_35370(yarnwrap.structure.StructureTemplateManager element, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.pool.ListPoolElement.method_35370(element.wrapperContained)); }

}