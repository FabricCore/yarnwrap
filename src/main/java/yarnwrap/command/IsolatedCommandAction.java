package yarnwrap.command;
public class IsolatedCommandAction { public net.minecraft.command.IsolatedCommandAction wrapperContained; public IsolatedCommandAction(net.minecraft.command.IsolatedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer controlConsumer() { return wrapperContained.controlConsumer; }
// public void controlConsumer(java.util.function.Consumer value) { wrapperContained.controlConsumer = value; }
// public static java.util.function.Consumer controlConsumer() { return net.minecraft.command.IsolatedCommandAction.controlConsumer; }
// public static void controlConsumer(java.util.function.Consumer value, ) { net.minecraft.command.IsolatedCommandAction.controlConsumer = value; }

// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }
// public void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.returnValueConsumer = value.wrapperContained; }
// public static yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(net.minecraft.command.IsolatedCommandAction.returnValueConsumer); }
// public static void returnValueConsumer(yarnwrap.command.ReturnValueConsumer value, ) { net.minecraft.command.IsolatedCommandAction.returnValueConsumer = value.wrapperContained; }

public IsolatedCommandAction(java.util.function.Consumer controlConsumer,yarnwrap.command.ReturnValueConsumer returnValueConsumer) { this.wrapperContained = new net.minecraft.command.IsolatedCommandAction(controlConsumer,returnValueConsumer.wrapperContained); }

}