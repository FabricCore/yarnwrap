package yarnwrap.util.function;
public class ValueLists { public net.minecraft.util.function.ValueLists wrapperContained; public ValueLists(net.minecraft.util.function.ValueLists wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction createIdToValueFunction(java.util.function.ToIntFunction valueToIdFunction,java.lang.Object[] values) { return wrapperContained.createIdToValueFunction(valueToIdFunction,values); }
public java.util.function.IntFunction createIdToValueFunction(java.util.function.ToIntFunction valueToIdFunction,java.lang.Object[] values,Object outOfBoundsHandling) { return wrapperContained.createIdToValueFunction(valueToIdFunction,values,outOfBoundsHandling); }
// public java.util.function.IntFunction createIdToValueFunction(java.util.function.ToIntFunction valueToIdFunction,java.lang.Object[] values,java.lang.Object fallback) { return wrapperContained.createIdToValueFunction(valueToIdFunction,values,fallback); }
// public java.lang.Object[] validate(java.util.function.ToIntFunction valueToIndexFunction,java.lang.Object[] values) { return wrapperContained.validate(valueToIndexFunction,values); }

}