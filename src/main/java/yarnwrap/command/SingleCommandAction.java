package yarnwrap.command;
public class SingleCommandAction { public net.minecraft.command.SingleCommandAction wrapperContained; public SingleCommandAction(net.minecraft.command.SingleCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FORK_LIMIT_EXCEPTION() { return wrapperContained.FORK_LIMIT_EXCEPTION; }
// public void FORK_LIMIT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FORK_LIMIT_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType FORK_LIMIT_EXCEPTION() { return net.minecraft.command.SingleCommandAction.FORK_LIMIT_EXCEPTION; }
// public static void FORK_LIMIT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.SingleCommandAction.FORK_LIMIT_EXCEPTION = value; }

// public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public static java.lang.String command() { return net.minecraft.command.SingleCommandAction.command; }
// public static void command(java.lang.String value, ) { net.minecraft.command.SingleCommandAction.command = value; }

// public com.mojang.brigadier.context.ContextChain contextChain() { return wrapperContained.contextChain; }
// public void contextChain(com.mojang.brigadier.context.ContextChain value) { wrapperContained.contextChain = value; }
// public static com.mojang.brigadier.context.ContextChain contextChain() { return net.minecraft.command.SingleCommandAction.contextChain; }
// public static void contextChain(com.mojang.brigadier.context.ContextChain value, ) { net.minecraft.command.SingleCommandAction.contextChain = value; }

public SingleCommandAction(java.lang.String command,com.mojang.brigadier.context.ContextChain contextChain) { this.wrapperContained = new net.minecraft.command.SingleCommandAction(command,contextChain); }
// public void traceCommandStart(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame) { wrapperContained.traceCommandStart(context.wrapperContained,frame.wrapperContained); }
// public static void traceCommandStart(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame, ) { net.minecraft.command.SingleCommandAction.traceCommandStart(context.wrapperContained,frame.wrapperContained); }
// public yarnwrap.command.CommandQueueEntry method_54408(yarnwrap.command.FixedCommandAction frame,yarnwrap.command.Frame source) { return new yarnwrap.command.CommandQueueEntry(wrapperContained.method_54408(frame.wrapperContained,source.wrapperContained)); }
// public static yarnwrap.command.CommandQueueEntry method_54408(yarnwrap.command.FixedCommandAction frame,yarnwrap.command.Frame source, ) { return new yarnwrap.command.CommandQueueEntry(net.minecraft.command.SingleCommandAction.method_54408(frame.wrapperContained,source.wrapperContained)); }
// public com.mojang.brigadier.Message method_54409(java.lang.Object count) { return wrapperContained.method_54409(count); }
// public static com.mojang.brigadier.Message method_54409(java.lang.Object count, ) { return net.minecraft.command.SingleCommandAction.method_54409(count); }
// public void execute(yarnwrap.server.command.AbstractServerCommandSource baseSource,java.util.List sources,yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame,yarnwrap.command.ExecutionFlags flags) { wrapperContained.execute(baseSource.wrapperContained,sources,context.wrapperContained,frame.wrapperContained,flags.wrapperContained); }
// public static void execute(yarnwrap.server.command.AbstractServerCommandSource baseSource,java.util.List sources,yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame,yarnwrap.command.ExecutionFlags flags, ) { net.minecraft.command.SingleCommandAction.execute(baseSource.wrapperContained,sources,context.wrapperContained,frame.wrapperContained,flags.wrapperContained); }
// public void method_54897(com.mojang.brigadier.context.CommandContext context,boolean successful,int returnValue) { wrapperContained.method_54897(context,successful,returnValue); }
// public static void method_54897(com.mojang.brigadier.context.CommandContext context,boolean successful,int returnValue, ) { net.minecraft.command.SingleCommandAction.method_54897(context,successful,returnValue); }

}