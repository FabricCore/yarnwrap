package yarnwrap.util.collection;
public class ListOperation { public net.minecraft.util.collection.ListOperation wrapperContained; public ListOperation(net.minecraft.util.collection.ListOperation wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec UNLIMITED_SIZE_CODEC() { return wrapperContained.UNLIMITED_SIZE_CODEC; }
// public void UNLIMITED_SIZE_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.UNLIMITED_SIZE_CODEC = value; }
public static com.mojang.serialization.MapCodec UNLIMITED_SIZE_CODEC() { return net.minecraft.util.collection.ListOperation.UNLIMITED_SIZE_CODEC; }
// public static void UNLIMITED_SIZE_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.util.collection.ListOperation.UNLIMITED_SIZE_CODEC = value; }

public Object getMode() { return wrapperContained.getMode(); }
// public static Object getMode() { return net.minecraft.util.collection.ListOperation.getMode(); }
public java.util.List apply(java.util.List current,java.util.List values,int maxSize) { return wrapperContained.apply(current,values,maxSize); }
// public static java.util.List apply(java.util.List current,java.util.List values,int maxSize, ) { return net.minecraft.util.collection.ListOperation.apply(current,values,maxSize); }
// public com.mojang.serialization.MapCodec createCodec(int maxSize) { return wrapperContained.createCodec(maxSize); }
// public static com.mojang.serialization.MapCodec createCodec(int maxSize, ) { return net.minecraft.util.collection.ListOperation.createCodec(maxSize); }
// public com.mojang.serialization.DataResult method_58458(int operation) { return wrapperContained.method_58458(operation); }
// public static com.mojang.serialization.DataResult method_58458(int operation, ) { return net.minecraft.util.collection.ListOperation.method_58458(operation); }
// public com.mojang.serialization.MapCodec method_58459(Object mode) { return wrapperContained.method_58459(mode); }
// public static com.mojang.serialization.MapCodec method_58459(Object mode, ) { return net.minecraft.util.collection.ListOperation.method_58459(mode); }
public java.util.List apply(java.util.List current,java.util.List values) { return wrapperContained.apply(current,values); }
// public static java.util.List apply(java.util.List current,java.util.List values, ) { return net.minecraft.util.collection.ListOperation.apply(current,values); }

}