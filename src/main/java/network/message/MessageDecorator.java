package yarnwrap.network.message;
public class MessageDecorator { public net.minecraft.network.message.MessageDecorator wrapperContained; public MessageDecorator(net.minecraft.network.message.MessageDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.MessageDecorator NOOP() { return new yarnwrap.network.message.MessageDecorator(wrapperContained.NOOP); }

}