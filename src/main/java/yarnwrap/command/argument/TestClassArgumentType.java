package yarnwrap.command.argument;
public class TestClassArgumentType { public net.minecraft.command.argument.TestClassArgumentType wrapperContained; public TestClassArgumentType(net.minecraft.command.argument.TestClassArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public java.lang.String getTestClass(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getTestClass(context,name); }
public yarnwrap.command.argument.TestClassArgumentType testClass() { return new yarnwrap.command.argument.TestClassArgumentType(wrapperContained.testClass()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}