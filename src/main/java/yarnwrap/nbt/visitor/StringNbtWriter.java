package yarnwrap.nbt.visitor;
public class StringNbtWriter { public net.minecraft.nbt.visitor.StringNbtWriter wrapperContained; public StringNbtWriter(net.minecraft.nbt.visitor.StringNbtWriter wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.StringBuilder result() { return wrapperContained.result; }
// public void result(java.lang.StringBuilder value) { wrapperContained.result = value; }
// public static java.lang.StringBuilder result() { return net.minecraft.nbt.visitor.StringNbtWriter.result; }
// public static void result(java.lang.StringBuilder value, ) { net.minecraft.nbt.visitor.StringNbtWriter.result = value; }

// public java.util.regex.Pattern QUOTATION_UNNECESSARY_PATTERN() { return wrapperContained.QUOTATION_UNNECESSARY_PATTERN; }
// public void QUOTATION_UNNECESSARY_PATTERN(java.util.regex.Pattern value) { wrapperContained.QUOTATION_UNNECESSARY_PATTERN = value; }
// public static java.util.regex.Pattern QUOTATION_UNNECESSARY_PATTERN() { return net.minecraft.nbt.visitor.StringNbtWriter.QUOTATION_UNNECESSARY_PATTERN; }
// public static void QUOTATION_UNNECESSARY_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.nbt.visitor.StringNbtWriter.QUOTATION_UNNECESSARY_PATTERN = value; }

public java.lang.String getString() { return wrapperContained.getString(); }
// public static java.lang.String getString() { return net.minecraft.nbt.visitor.StringNbtWriter.getString(); }
// public void append(java.lang.String string) { wrapperContained.append(string); }
// public static void append(java.lang.String string, ) { net.minecraft.nbt.visitor.StringNbtWriter.append(string); }

}