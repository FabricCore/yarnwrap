package yarnwrap.command.argument;
public class TestFunctionArgumentType { public net.minecraft.command.argument.TestFunctionArgumentType wrapperContained; public TestFunctionArgumentType(net.minecraft.command.argument.TestFunctionArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public yarnwrap.test.TestFunction getFunction(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.test.TestFunction(wrapperContained.getFunction(context,name)); }
public yarnwrap.command.argument.TestFunctionArgumentType testFunction() { return new yarnwrap.command.argument.TestFunctionArgumentType(wrapperContained.testFunction()); }
public java.util.concurrent.CompletableFuture suggestTestNames(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestTestNames(context,builder); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}