package yarnwrap.network.handler;
public class NetworkStateTransitions { public net.minecraft.network.handler.NetworkStateTransitions wrapperContained; public NetworkStateTransitions(net.minecraft.network.handler.NetworkStateTransitions wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object decoderSwapper(io.netty.channel.ChannelInboundHandler newDecoder) { return wrapperContained.decoderSwapper(newDecoder); }
// public void method_56353(io.netty.channel.ChannelInboundHandler context) { wrapperContained.method_56353(context); }
// public Object encoderSwapper(io.netty.channel.ChannelOutboundHandler newEncoder) { return wrapperContained.encoderSwapper(newEncoder); }
// public void method_56355(io.netty.channel.ChannelOutboundHandler context) { wrapperContained.method_56355(context); }
public Object decoderTransitioner(yarnwrap.network.NetworkState newState) { return wrapperContained.decoderTransitioner(newState.wrapperContained); }
public Object encoderTransitioner(yarnwrap.network.NetworkState newState) { return wrapperContained.encoderTransitioner(newState.wrapperContained); }

}