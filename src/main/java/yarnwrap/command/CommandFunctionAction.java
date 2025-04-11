package yarnwrap.command;
public class CommandFunctionAction { public net.minecraft.command.CommandFunctionAction wrapperContained; public CommandFunctionAction(net.minecraft.command.CommandFunctionAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.function.Procedure function() { return new yarnwrap.server.function.Procedure(wrapperContained.function); }
// public void function(yarnwrap.server.function.Procedure value) { wrapperContained.function = value.wrapperContained; }
// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }
// public void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.returnValueConsumer = value.wrapperContained; }
// public boolean propagateReturn() { return wrapperContained.propagateReturn; }
// public void propagateReturn(boolean value) { wrapperContained.propagateReturn = value; }
public CommandFunctionAction(yarnwrap.server.function.Procedure function,yarnwrap.command.ReturnValueConsumer returnValueConsumer,boolean propagateReturn) { this.wrapperContained = new net.minecraft.command.CommandFunctionAction(function.wrapperContained,returnValueConsumer.wrapperContained,propagateReturn); }
// public yarnwrap.command.CommandQueueEntry method_54898(yarnwrap.server.command.AbstractServerCommandSource frame,yarnwrap.command.Frame action) { return new yarnwrap.command.CommandQueueEntry(wrapperContained.method_54898(frame.wrapperContained,action.wrapperContained)); }

}