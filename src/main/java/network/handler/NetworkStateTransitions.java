package yarnwrap.network.handler;
public class NetworkStateTransitions { public net.minecraft.network.handler.NetworkStateTransitions wrapperContained; public NetworkStateTransitions(net.minecraft.network.handler.NetworkStateTransitions wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object decoderSwapper(io.netty.channel.ChannelInboundHandler newDecoder) { return wrapperContained.decoderSwapper(newDecoder); }
// public Object encoderSwapper(io.netty.channel.ChannelOutboundHandler newEncoder) { return wrapperContained.encoderSwapper(newEncoder); }
public Object decoderTransitioner(yarnwrap.network.NetworkState newState) { return wrapperContained.decoderTransitioner(newState.wrapperContained); }
public Object encoderTransitioner(yarnwrap.network.NetworkState newState) { return wrapperContained.encoderTransitioner(newState.wrapperContained); }

}