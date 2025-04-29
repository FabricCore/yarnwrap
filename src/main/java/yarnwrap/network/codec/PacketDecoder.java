package yarnwrap.network.codec;
public class PacketDecoder { public net.minecraft.network.codec.PacketDecoder wrapperContained; public PacketDecoder(net.minecraft.network.codec.PacketDecoder wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object decode(java.lang.Object buf) { return wrapperContained.decode(buf); }
// public static java.lang.Object decode(java.lang.Object buf, ) { return net.minecraft.network.codec.PacketDecoder.decode(buf); }

}