package yarnwrap.network.handler;
public class EncoderHandler { public net.minecraft.network.handler.EncoderHandler wrapperContained; public EncoderHandler(net.minecraft.network.handler.EncoderHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.network.NetworkState state() { return new yarnwrap.network.NetworkState(wrapperContained.state); }
// public void state(yarnwrap.network.NetworkState value) { wrapperContained.state = value.wrapperContained; }
public EncoderHandler(yarnwrap.network.NetworkState state) { this.wrapperContained = new net.minecraft.network.handler.EncoderHandler(state.wrapperContained); }
// public void encode(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet,io.netty.buffer.ByteBuf out) { wrapperContained.encode(context,packet,out); }

}