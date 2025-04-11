package yarnwrap.structure.pool;
public class ListPoolElement { public net.minecraft.structure.pool.ListPoolElement wrapperContained; public ListPoolElement(net.minecraft.structure.pool.ListPoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void setAllElementsProjection(Object projection) { wrapperContained.setAllElementsProjection(projection); }

}