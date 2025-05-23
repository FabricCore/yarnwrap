package yarnwrap.network.handler;
public class PacketEncoderException { public net.minecraft.network.handler.PacketEncoderException wrapperContained; public PacketEncoderException(net.minecraft.network.handler.PacketEncoderException wrapperContained) { this.wrapperContained = wrapperContained; }

public PacketEncoderException(java.lang.String message) { this.wrapperContained = new net.minecraft.network.handler.PacketEncoderException(message); }
public PacketEncoderException(java.lang.Throwable cause) { this.wrapperContained = new net.minecraft.network.handler.PacketEncoderException(cause); }

}