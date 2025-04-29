package yarnwrap.nbt.visitor;
public class StringNbtWriter { public net.minecraft.nbt.visitor.StringNbtWriter wrapperContained; public StringNbtWriter(net.minecraft.nbt.visitor.StringNbtWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern SIMPLE_NAME() { return wrapperContained.SIMPLE_NAME; }
// public void SIMPLE_NAME(java.util.regex.Pattern value) { wrapperContained.SIMPLE_NAME = value; }
// public static java.util.regex.Pattern SIMPLE_NAME() { return net.minecraft.nbt.visitor.StringNbtWriter.SIMPLE_NAME; }
// public static void SIMPLE_NAME(java.util.regex.Pattern value, ) { net.minecraft.nbt.visitor.StringNbtWriter.SIMPLE_NAME = value; }

// public java.lang.StringBuilder result() { return wrapperContained.result; }
// public void result(java.lang.StringBuilder value) { wrapperContained.result = value; }
// public static java.lang.StringBuilder result() { return net.minecraft.nbt.visitor.StringNbtWriter.result; }
// public static void result(java.lang.StringBuilder value, ) { net.minecraft.nbt.visitor.StringNbtWriter.result = value; }

// public java.lang.String escapeName(java.lang.String name) { return wrapperContained.escapeName(name); }
// public static java.lang.String escapeName(java.lang.String name, ) { return net.minecraft.nbt.visitor.StringNbtWriter.escapeName(name); }
public java.lang.String apply(yarnwrap.nbt.NbtElement element) { return wrapperContained.apply(element.wrapperContained); }
// public static java.lang.String apply(yarnwrap.nbt.NbtElement element, ) { return net.minecraft.nbt.visitor.StringNbtWriter.apply(element.wrapperContained); }

}