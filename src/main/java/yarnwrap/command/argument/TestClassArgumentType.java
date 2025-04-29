package yarnwrap.command.argument;
public class TestClassArgumentType { public net.minecraft.command.argument.TestClassArgumentType wrapperContained; public TestClassArgumentType(net.minecraft.command.argument.TestClassArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.TestClassArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.TestClassArgumentType.EXAMPLES = value; }

public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.TestClassArgumentType.listSuggestions(context,builder); }
// public java.lang.String getTestClass(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getTestClass(context,name); }
// public static java.lang.String getTestClass(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.TestClassArgumentType.getTestClass(context,name); }
// public yarnwrap.command.argument.TestClassArgumentType testClass() { return new yarnwrap.command.argument.TestClassArgumentType(wrapperContained.testClass()); }
public static yarnwrap.command.argument.TestClassArgumentType testClass() { return new yarnwrap.command.argument.TestClassArgumentType(net.minecraft.command.argument.TestClassArgumentType.testClass()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.TestClassArgumentType.parse(reader); }

}