package yarnwrap.command;
public class SingleCommandAction { public net.minecraft.command.SingleCommandAction wrapperContained; public SingleCommandAction(net.minecraft.command.SingleCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FORK_LIMIT_EXCEPTION() { return wrapperContained.FORK_LIMIT_EXCEPTION; }
// public java.lang.String command() { return wrapperContained.command; }
// public com.mojang.brigadier.context.ContextChain contextChain() { return wrapperContained.contextChain; }
// public void traceCommandStart(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame) { wrapperContained.traceCommandStart(context.wrapperContained,frame.wrapperContained); }
// public void execute(yarnwrap.server.command.AbstractServerCommandSource baseSource,java.util.List sources,yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame,yarnwrap.command.ExecutionFlags flags) { wrapperContained.execute(baseSource.wrapperContained,sources,context.wrapperContained,frame.wrapperContained,flags.wrapperContained); }

}