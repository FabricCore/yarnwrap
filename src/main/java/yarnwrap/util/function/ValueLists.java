package yarnwrap.util.function;
public class ValueLists { public net.minecraft.util.function.ValueLists wrapperContained; public ValueLists(net.minecraft.util.function.ValueLists wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object method_47911(int index) { return wrapperContained.method_47911(index); }
// public java.lang.Object method_47912(java.util.function.IntFunction index) { return wrapperContained.method_47912(index); }
// public java.util.function.IntFunction createIdToValueFunction(java.util.function.ToIntFunction valueToIdFunction,java.lang.Object[] values) { return wrapperContained.createIdToValueFunction(valueToIdFunction,values); }
public java.util.function.IntFunction createIdToValueFunction(java.util.function.ToIntFunction valueToIdFunction,java.lang.Object[] values,Object outOfBoundsHandling) { return wrapperContained.createIdToValueFunction(valueToIdFunction,values,outOfBoundsHandling); }
// public java.util.function.IntFunction createIdToValueFunction(java.util.function.ToIntFunction valueToIdFunction,java.lang.Object[] values,java.lang.Object fallback) { return wrapperContained.createIdToValueFunction(valueToIdFunction,values,fallback); }
// public java.lang.Object method_47916(java.lang.Object[] index) { return wrapperContained.method_47916(index); }
// public java.lang.Object[] validate(java.util.function.ToIntFunction valueToIndexFunction,java.lang.Object[] values) { return wrapperContained.validate(valueToIndexFunction,values); }
// public java.lang.Object method_47918(java.lang.Object[] index) { return wrapperContained.method_47918(index); }

}