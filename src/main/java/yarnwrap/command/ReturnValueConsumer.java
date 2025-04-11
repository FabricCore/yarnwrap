package yarnwrap.command;
public class ReturnValueConsumer { public net.minecraft.command.ReturnValueConsumer wrapperContained; public ReturnValueConsumer(net.minecraft.command.ReturnValueConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.ReturnValueConsumer EMPTY() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.EMPTY = value.wrapperContained; }

}