package yarnwrap.network.handler;
public class NetworkStateTransitionHandler { public net.minecraft.network.handler.NetworkStateTransitionHandler wrapperContained; public NetworkStateTransitionHandler(net.minecraft.network.handler.NetworkStateTransitionHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public void onDecoded(io.netty.channel.ChannelHandlerContext context,yarnwrap.network.packet.Packet packet) { wrapperContained.onDecoded(context,packet.wrapperContained); }
// public static void onDecoded(io.netty.channel.ChannelHandlerContext context,yarnwrap.network.packet.Packet packet, ) { net.minecraft.network.handler.NetworkStateTransitionHandler.onDecoded(context,packet.wrapperContained); }
// public void onEncoded(io.netty.channel.ChannelHandlerContext context,yarnwrap.network.packet.Packet packet) { wrapperContained.onEncoded(context,packet.wrapperContained); }
// public static void onEncoded(io.netty.channel.ChannelHandlerContext context,yarnwrap.network.packet.Packet packet, ) { net.minecraft.network.handler.NetworkStateTransitionHandler.onEncoded(context,packet.wrapperContained); }

}