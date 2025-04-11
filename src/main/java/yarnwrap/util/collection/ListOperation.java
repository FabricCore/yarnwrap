package yarnwrap.util.collection;
public class ListOperation { public net.minecraft.util.collection.ListOperation wrapperContained; public ListOperation(net.minecraft.util.collection.ListOperation wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec UNLIMITED_SIZE_CODEC() { return wrapperContained.UNLIMITED_SIZE_CODEC; }
// public void UNLIMITED_SIZE_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.UNLIMITED_SIZE_CODEC = value; }
public Object getMode() { return wrapperContained.getMode(); }
public java.util.List apply(java.util.List current,java.util.List values,int maxSize) { return wrapperContained.apply(current,values,maxSize); }
// public com.mojang.serialization.MapCodec createCodec(int maxSize) { return wrapperContained.createCodec(maxSize); }
// public com.mojang.serialization.DataResult method_58458(int operation) { return wrapperContained.method_58458(operation); }
// public com.mojang.serialization.MapCodec method_58459(Object mode) { return wrapperContained.method_58459(mode); }
public java.util.List apply(java.util.List current,java.util.List values) { return wrapperContained.apply(current,values); }

}