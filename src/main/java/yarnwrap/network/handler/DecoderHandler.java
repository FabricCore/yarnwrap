package yarnwrap.network.handler;
public class DecoderHandler { public net.minecraft.network.handler.DecoderHandler wrapperContained; public DecoderHandler(net.minecraft.network.handler.DecoderHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.network.handler.DecoderHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.handler.DecoderHandler.LOGGER = value; }

// public yarnwrap.network.NetworkState state() { return new yarnwrap.network.NetworkState(wrapperContained.state); }
// public void state(yarnwrap.network.NetworkState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.network.NetworkState state() { return new yarnwrap.network.NetworkState(net.minecraft.network.handler.DecoderHandler.state); }
// public static void state(yarnwrap.network.NetworkState value, ) { net.minecraft.network.handler.DecoderHandler.state = value.wrapperContained; }

public DecoderHandler(yarnwrap.network.NetworkState state) { this.wrapperContained = new net.minecraft.network.handler.DecoderHandler(state.wrapperContained); }
// public void decode(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf,java.util.List objects) { wrapperContained.decode(context,buf,objects); }
// public static void decode(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf,java.util.List objects, ) { net.minecraft.network.handler.DecoderHandler.decode(context,buf,objects); }

}