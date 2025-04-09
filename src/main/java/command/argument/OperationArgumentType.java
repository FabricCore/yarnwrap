package yarnwrap.command.argument;
public class OperationArgumentType { public net.minecraft.command.argument.OperationArgumentType wrapperContained; public OperationArgumentType(net.minecraft.command.argument.OperationArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType DIVISION_ZERO_EXCEPTION() { return wrapperContained.DIVISION_ZERO_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_OPERATION() { return wrapperContained.INVALID_OPERATION; }
public yarnwrap.command.argument.OperationArgumentType operation() { return new yarnwrap.command.argument.OperationArgumentType(wrapperContained.operation()); }
// public Object getIntOperator(java.lang.String operator) { return wrapperContained.getIntOperator(operator); }
public Object getOperation(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getOperation(context,name); }
// public Object getOperator(java.lang.String operator) { return wrapperContained.getOperator(operator); }

}