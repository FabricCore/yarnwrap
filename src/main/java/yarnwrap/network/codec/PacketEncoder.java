package yarnwrap.network.codec;
public class PacketEncoder { public net.minecraft.network.codec.PacketEncoder wrapperContained; public PacketEncoder(net.minecraft.network.codec.PacketEncoder wrapperContained) { this.wrapperContained = wrapperContained; }

public void encode(java.lang.Object buf,java.lang.Object value) { wrapperContained.encode(buf,value); }
// public static void encode(java.lang.Object buf,java.lang.Object value, ) { net.minecraft.network.codec.PacketEncoder.encode(buf,value); }

}