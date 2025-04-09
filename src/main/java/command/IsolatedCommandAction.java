package yarnwrap.command;
public class IsolatedCommandAction { public net.minecraft.command.IsolatedCommandAction wrapperContained; public IsolatedCommandAction(net.minecraft.command.IsolatedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer controlConsumer() { return wrapperContained.controlConsumer; }
// public yarnwrap.command.ReturnValueConsumer returnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.returnValueConsumer); }

}