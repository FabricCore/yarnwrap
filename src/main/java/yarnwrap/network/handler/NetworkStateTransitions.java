package yarnwrap.network.handler;
public class NetworkStateTransitions { public net.minecraft.network.handler.NetworkStateTransitions wrapperContained; public NetworkStateTransitions(net.minecraft.network.handler.NetworkStateTransitions wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object decoderSwapper(io.netty.channel.ChannelInboundHandler newDecoder) { return wrapperContained.decoderSwapper(newDecoder); }
// public static Object decoderSwapper(io.netty.channel.ChannelInboundHandler newDecoder, ) { return net.minecraft.network.handler.NetworkStateTransitions.decoderSwapper(newDecoder); }
// public void method_56353(io.netty.channel.ChannelInboundHandler context) { wrapperContained.method_56353(context); }
// public static void method_56353(io.netty.channel.ChannelInboundHandler context, ) { net.minecraft.network.handler.NetworkStateTransitions.method_56353(context); }
// public Object encoderSwapper(io.netty.channel.ChannelOutboundHandler newEncoder) { return wrapperContained.encoderSwapper(newEncoder); }
// public static Object encoderSwapper(io.netty.channel.ChannelOutboundHandler newEncoder, ) { return net.minecraft.network.handler.NetworkStateTransitions.encoderSwapper(newEncoder); }
// public void method_56355(io.netty.channel.ChannelOutboundHandler context) { wrapperContained.method_56355(context); }
// public static void method_56355(io.netty.channel.ChannelOutboundHandler context, ) { net.minecraft.network.handler.NetworkStateTransitions.method_56355(context); }
// public Object decoderTransitioner(yarnwrap.network.state.NetworkState newState) { return wrapperContained.decoderTransitioner(newState.wrapperContained); }
// public static Object decoderTransitioner(yarnwrap.network.state.NetworkState newState, ) { return net.minecraft.network.handler.NetworkStateTransitions.decoderTransitioner(newState.wrapperContained); }
// public Object encoderTransitioner(yarnwrap.network.state.NetworkState newState) { return wrapperContained.encoderTransitioner(newState.wrapperContained); }
// public static Object encoderTransitioner(yarnwrap.network.state.NetworkState newState, ) { return net.minecraft.network.handler.NetworkStateTransitions.encoderTransitioner(newState.wrapperContained); }

}