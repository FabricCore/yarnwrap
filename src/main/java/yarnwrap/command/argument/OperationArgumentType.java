package yarnwrap.command.argument;
public class OperationArgumentType { public net.minecraft.command.argument.OperationArgumentType wrapperContained; public OperationArgumentType(net.minecraft.command.argument.OperationArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType DIVISION_ZERO_EXCEPTION() { return wrapperContained.DIVISION_ZERO_EXCEPTION; }
// public void DIVISION_ZERO_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.DIVISION_ZERO_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_OPERATION() { return wrapperContained.INVALID_OPERATION; }
// public void INVALID_OPERATION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_OPERATION = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public yarnwrap.command.argument.OperationArgumentType operation() { return new yarnwrap.command.argument.OperationArgumentType(wrapperContained.operation()); }
// public int method_9406(int a,int b) { return wrapperContained.method_9406(a,b); }
// public Object getIntOperator(java.lang.String operator) { return wrapperContained.getIntOperator(operator); }
// public int method_9408(int a,int b) { return wrapperContained.method_9408(a,b); }
public Object getOperation(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getOperation(context,name); }
// public void method_9410(yarnwrap.scoreboard.ScoreAccess a,yarnwrap.scoreboard.ScoreAccess b) { wrapperContained.method_9410(a.wrapperContained,b.wrapperContained); }
// public int method_9411(int a,int b) { return wrapperContained.method_9411(a,b); }
// public Object getOperator(java.lang.String operator) { return wrapperContained.getOperator(operator); }
// public int method_9414(int a,int b) { return wrapperContained.method_9414(a,b); }
// public int method_9415(int a,int b) { return wrapperContained.method_9415(a,b); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}