package yarnwrap.network.packet.c2s.play;
public class RequestCommandCompletionsC2SPacket { public net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket wrapperContained; public RequestCommandCompletionsC2SPacket(net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int completionId() { return wrapperContained.completionId; }
// public void completionId(int value) { wrapperContained.completionId = value; }
// public static int completionId() { return net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.completionId; }
// public static void completionId(int value, ) { net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.completionId = value; }

// public java.lang.String partialCommand() { return wrapperContained.partialCommand; }
// public void partialCommand(java.lang.String value) { wrapperContained.partialCommand = value; }
// public static java.lang.String partialCommand() { return net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.partialCommand; }
// public static void partialCommand(java.lang.String value, ) { net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.partialCommand = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.CODEC = value.wrapperContained; }

public RequestCommandCompletionsC2SPacket(int completionId,java.lang.String partialCommand) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket(completionId,partialCommand); }
// public RequestCommandCompletionsC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket(buf.wrapperContained); }
public java.lang.String getPartialCommand() { return wrapperContained.getPartialCommand(); }
// public static java.lang.String getPartialCommand() { return net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.getPartialCommand(); }
public int getCompletionId() { return wrapperContained.getCompletionId(); }
// public static int getCompletionId() { return net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.getCompletionId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket.write(buf.wrapperContained); }

}