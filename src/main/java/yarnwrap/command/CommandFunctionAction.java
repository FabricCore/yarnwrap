package yarnwrap.command;
public class CommandFunctionAction { public net.minecraft.command.CommandFunctionAction wrapperContained; public CommandFunctionAction(net.minecraft.command.CommandFunctionAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.function.Procedure function() { return new yarnwrap.server.function.Procedure(wrapperContained.function); }
// public void function(yarnwrap.server.function.Procedure value) { wrapperContained.function = value.wrapperContained; }
// public static yarnwrap.server.function.Procedure function() { return new yarnwrap.server.function.Procedure(net.minecraft.command.CommandFunctionAction.function); }
// public static void function(yarnwrap.server.function.Procedure value, ) { net.minecraft.command.CommandFunctionAction.function = value.wrapperContained; }

// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }
// public void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.returnValueConsumer = value.wrapperContained; }
// public static yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(net.minecraft.command.CommandFunctionAction.returnValueConsumer); }
// public static void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value, ) { net.minecraft.command.CommandFunctionAction.returnValueConsumer = value.wrapperContained; }

// public boolean propagateReturn() { return wrapperContained.propagateReturn; }
// public void propagateReturn(boolean value) { wrapperContained.propagateReturn = value; }
// public static boolean propagateReturn() { return net.minecraft.command.CommandFunctionAction.propagateReturn; }
// public static void propagateReturn(boolean value, ) { net.minecraft.command.CommandFunctionAction.propagateReturn = value; }

public CommandFunctionAction(yarnwrap.server.function.Procedure function,yarnwrap.command.ReturnValueConsumer returnValueConsumer,boolean propagateReturn) { this.wrapperContained = new net.minecraft.command.CommandFunctionAction(function.wrapperContained,returnValueConsumer.wrapperContained,propagateReturn); }
// public yarnwrap.command.CommandQueueEntry method_54898(yarnwrap.server.command.AbstractServerCommandSource frame,yarnwrap.command.Frame action) { return new yarnwrap.command.CommandQueueEntry(wrapperContained.method_54898(frame.wrapperContained,action.wrapperContained)); }
// public static yarnwrap.command.CommandQueueEntry method_54898(yarnwrap.server.command.AbstractServerCommandSource frame,yarnwrap.command.Frame action, ) { return new yarnwrap.command.CommandQueueEntry(net.minecraft.command.CommandFunctionAction.method_54898(frame.wrapperContained,action.wrapperContained)); }

}