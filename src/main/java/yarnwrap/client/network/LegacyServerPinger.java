package yarnwrap.client.network;
public class LegacyServerPinger { public net.minecraft.client.network.LegacyServerPinger wrapperContained; public LegacyServerPinger(net.minecraft.client.network.LegacyServerPinger wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.base.Splitter SPLITTER() { return wrapperContained.SPLITTER; }
// public void SPLITTER(com.google.common.base.Splitter value) { wrapperContained.SPLITTER = value; }
// public static com.google.common.base.Splitter SPLITTER() { return net.minecraft.client.network.LegacyServerPinger.SPLITTER; }
// public static void SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.client.network.LegacyServerPinger.SPLITTER = value; }

// public yarnwrap.client.network.ServerAddress serverAddress() { return new yarnwrap.client.network.ServerAddress(wrapperContained.serverAddress); }
// public void serverAddress(yarnwrap.client.network.ServerAddress value) { wrapperContained.serverAddress = value.wrapperContained; }
// public static yarnwrap.client.network.ServerAddress serverAddress() { return new yarnwrap.client.network.ServerAddress(net.minecraft.client.network.LegacyServerPinger.serverAddress); }
// public static void serverAddress(yarnwrap.client.network.ServerAddress value, ) { net.minecraft.client.network.LegacyServerPinger.serverAddress = value.wrapperContained; }

// public Object handler() { return wrapperContained.handler; }
// // public void handler(Object value) { wrapperContained.handler = value; }
// // public static Object handler() { return net.minecraft.client.network.LegacyServerPinger.handler; }
// // public static void handler(Object value, ) { net.minecraft.client.network.LegacyServerPinger.handler = value; }

// public LegacyServerPinger(yarnwrap.client.network.ServerAddress serverAddress,Object handler) { this.wrapperContained = new net.minecraft.client.network.LegacyServerPinger(serverAddress.wrapperContained,handler); }
// public void channelActive(io.netty.channel.ChannelHandlerContext context) { wrapperContained.channelActive(context); }
// public static void channelActive(io.netty.channel.ChannelHandlerContext context, ) { net.minecraft.client.network.LegacyServerPinger.channelActive(context); }
// public void channelRead0(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf) { wrapperContained.channelRead0(context,buf); }
// public static void channelRead0(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf, ) { net.minecraft.client.network.LegacyServerPinger.channelRead0(context,buf); }
public void exceptionCaught(io.netty.channel.ChannelHandlerContext context,java.lang.Throwable throwable) { wrapperContained.exceptionCaught(context,throwable); }
// public static void exceptionCaught(io.netty.channel.ChannelHandlerContext context,java.lang.Throwable throwable, ) { net.minecraft.client.network.LegacyServerPinger.exceptionCaught(context,throwable); }

}