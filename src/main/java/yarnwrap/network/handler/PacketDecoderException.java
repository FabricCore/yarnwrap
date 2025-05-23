package yarnwrap.network.handler;
public class PacketDecoderException { public net.minecraft.network.handler.PacketDecoderException wrapperContained; public PacketDecoderException(net.minecraft.network.handler.PacketDecoderException wrapperContained) { this.wrapperContained = wrapperContained; }

public PacketDecoderException(java.lang.String message) { this.wrapperContained = new net.minecraft.network.handler.PacketDecoderException(message); }
public PacketDecoderException(java.lang.Throwable cause) { this.wrapperContained = new net.minecraft.network.handler.PacketDecoderException(cause); }

}