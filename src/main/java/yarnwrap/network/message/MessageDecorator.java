package yarnwrap.network.message;
public class MessageDecorator { public net.minecraft.network.message.MessageDecorator wrapperContained; public MessageDecorator(net.minecraft.network.message.MessageDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.MessageDecorator NOOP() { return new yarnwrap.network.message.MessageDecorator(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.network.message.MessageDecorator value) { wrapperContained.NOOP = value.wrapperContained; }
public yarnwrap.text.Text decorate(yarnwrap.server.network.ServerPlayerEntity sender,yarnwrap.text.Text message) { return new yarnwrap.text.Text(wrapperContained.decorate(sender.wrapperContained,message.wrapperContained)); }
// public yarnwrap.text.Text method_44303(yarnwrap.server.network.ServerPlayerEntity sender,yarnwrap.text.Text message) { return new yarnwrap.text.Text(wrapperContained.method_44303(sender.wrapperContained,message.wrapperContained)); }

}