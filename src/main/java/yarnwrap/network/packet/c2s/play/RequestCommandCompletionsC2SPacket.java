package yarnwrap.network.packet.c2s.play;
public class RequestCommandCompletionsC2SPacket { public net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket wrapperContained; public RequestCommandCompletionsC2SPacket(net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int completionId() { return wrapperContained.completionId; }
// public void completionId(int value) { wrapperContained.completionId = value; }
// public java.lang.String partialCommand() { return wrapperContained.partialCommand; }
// public void partialCommand(java.lang.String value) { wrapperContained.partialCommand = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public java.lang.String getPartialCommand() { return wrapperContained.getPartialCommand(); }
public int getCompletionId() { return wrapperContained.getCompletionId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}