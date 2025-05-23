package yarnwrap.network.handler;
public class EncoderHandler { public net.minecraft.network.handler.EncoderHandler wrapperContained; public EncoderHandler(net.minecraft.network.handler.EncoderHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.network.handler.EncoderHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.handler.EncoderHandler.LOGGER = value; }

// public yarnwrap.network.state.NetworkState state() { return new yarnwrap.network.state.NetworkState(wrapperContained.state); }
// public void state(yarnwrap.network.state.NetworkState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.network.state.NetworkState state() { return new yarnwrap.network.state.NetworkState(net.minecraft.network.handler.EncoderHandler.state); }
// public static void state(yarnwrap.network.state.NetworkState value, ) { net.minecraft.network.handler.EncoderHandler.state = value.wrapperContained; }

public EncoderHandler(yarnwrap.network.state.NetworkState state) { this.wrapperContained = new net.minecraft.network.handler.EncoderHandler(state.wrapperContained); }
// public void encode(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet,io.netty.buffer.ByteBuf out) { wrapperContained.encode(context,packet,out); }
// public static void encode(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet,io.netty.buffer.ByteBuf out, ) { net.minecraft.network.handler.EncoderHandler.encode(context,packet,out); }

}