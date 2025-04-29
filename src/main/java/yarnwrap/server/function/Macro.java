package yarnwrap.server.function;
public class Macro { public net.minecraft.server.function.Macro wrapperContained; public Macro(net.minecraft.server.function.Macro wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List varNames() { return wrapperContained.varNames; }
// public void varNames(java.util.List value) { wrapperContained.varNames = value; }
// public static java.util.List varNames() { return net.minecraft.server.function.Macro.varNames; }
// public static void varNames(java.util.List value, ) { net.minecraft.server.function.Macro.varNames = value; }

// public int CACHE_SIZE() { return wrapperContained.CACHE_SIZE; }
// public void CACHE_SIZE(int value) { wrapperContained.CACHE_SIZE = value; }
// public static int CACHE_SIZE() { return net.minecraft.server.function.Macro.CACHE_SIZE; }
// public static void CACHE_SIZE(int value, ) { net.minecraft.server.function.Macro.CACHE_SIZE = value; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap cache() { return wrapperContained.cache; }
// public void cache(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap value) { wrapperContained.cache = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap cache() { return net.minecraft.server.function.Macro.cache; }
// public static void cache(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap value, ) { net.minecraft.server.function.Macro.cache = value; }

// public java.text.DecimalFormat DECIMAL_FORMAT() { return wrapperContained.DECIMAL_FORMAT; }
// public void DECIMAL_FORMAT(java.text.DecimalFormat value) { wrapperContained.DECIMAL_FORMAT = value; }
// public static java.text.DecimalFormat DECIMAL_FORMAT() { return net.minecraft.server.function.Macro.DECIMAL_FORMAT; }
// public static void DECIMAL_FORMAT(java.text.DecimalFormat value, ) { net.minecraft.server.function.Macro.DECIMAL_FORMAT = value; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.server.function.Macro.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.server.function.Macro.id = value.wrapperContained; }

// public java.util.List lines() { return wrapperContained.lines; }
// public void lines(java.util.List value) { wrapperContained.lines = value; }
// public static java.util.List lines() { return net.minecraft.server.function.Macro.lines; }
// public static void lines(java.util.List value, ) { net.minecraft.server.function.Macro.lines = value; }

public Macro(yarnwrap.util.Identifier id,java.util.List lines,java.util.List varNames) { this.wrapperContained = new net.minecraft.server.function.Macro(id.wrapperContained,lines,varNames); }
// public yarnwrap.server.function.Procedure withMacroReplaced(java.util.List varNames,java.util.List arguments,com.mojang.brigadier.CommandDispatcher dispatcher) { return new yarnwrap.server.function.Procedure(wrapperContained.withMacroReplaced(varNames,arguments,dispatcher)); }
// public static yarnwrap.server.function.Procedure withMacroReplaced(java.util.List varNames,java.util.List arguments,com.mojang.brigadier.CommandDispatcher dispatcher, ) { return new yarnwrap.server.function.Procedure(net.minecraft.server.function.Macro.withMacroReplaced(varNames,arguments,dispatcher)); }
// public java.lang.String toString(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.toString(nbt.wrapperContained); }
// public static java.lang.String toString(yarnwrap.nbt.NbtElement nbt, ) { return net.minecraft.server.function.Macro.toString(nbt.wrapperContained); }
// public void method_54423(java.text.DecimalFormat format) { wrapperContained.method_54423(format); }
// public static void method_54423(java.text.DecimalFormat format, ) { net.minecraft.server.function.Macro.method_54423(format); }
// public void addArgumentsByIndices(java.util.List arguments,it.unimi.dsi.fastutil.ints.IntList indices,java.util.List out) { wrapperContained.addArgumentsByIndices(arguments,indices,out); }
// public static void addArgumentsByIndices(java.util.List arguments,it.unimi.dsi.fastutil.ints.IntList indices,java.util.List out, ) { net.minecraft.server.function.Macro.addArgumentsByIndices(arguments,indices,out); }
// public java.lang.String method_54425(java.util.List path) { return wrapperContained.method_54425(path); }
// public static java.lang.String method_54425(java.util.List path, ) { return net.minecraft.server.function.Macro.method_54425(path); }
// public void method_54426(java.util.List index) { wrapperContained.method_54426(index); }
// public static void method_54426(java.util.List index, ) { net.minecraft.server.function.Macro.method_54426(index); }

}