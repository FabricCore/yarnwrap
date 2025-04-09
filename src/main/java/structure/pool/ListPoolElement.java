package yarnwrap.structure.pool;
public class ListPoolElement { public net.minecraft.structure.pool.ListPoolElement wrapperContained; public ListPoolElement(net.minecraft.structure.pool.ListPoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List elements() { return wrapperContained.elements; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void setAllElementsProjection(Object projection) { wrapperContained.setAllElementsProjection(projection); }

}