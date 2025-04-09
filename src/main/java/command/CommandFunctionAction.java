package yarnwrap.command;
public class CommandFunctionAction { public net.minecraft.command.CommandFunctionAction wrapperContained; public CommandFunctionAction(net.minecraft.command.CommandFunctionAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.function.Procedure function() { return new yarnwrap.server.function.Procedure(wrapperContained.function); }
// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }
// public boolean propagateReturn() { return wrapperContained.propagateReturn; }

}