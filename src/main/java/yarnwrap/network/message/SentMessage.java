package yarnwrap.network.message;
public class SentMessage { public net.minecraft.network.message.SentMessage wrapperContained; public SentMessage(net.minecraft.network.message.SentMessage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.message.SentMessage of(yarnwrap.network.message.SignedMessage message) { return new yarnwrap.network.message.SentMessage(wrapperContained.of(message.wrapperContained)); }
// public static yarnwrap.network.message.SentMessage of(yarnwrap.network.message.SignedMessage message, ) { return new yarnwrap.network.message.SentMessage(net.minecraft.network.message.SentMessage.of(message.wrapperContained)); }
// public void send(yarnwrap.server.network.ServerPlayerEntity sender,boolean filterMaskEnabled,Object params) { wrapperContained.send(sender.wrapperContained,filterMaskEnabled,params); }
// public static void send(yarnwrap.server.network.ServerPlayerEntity sender,boolean filterMaskEnabled,Object params, ) { net.minecraft.network.message.SentMessage.send(sender.wrapperContained,filterMaskEnabled,params); }

}