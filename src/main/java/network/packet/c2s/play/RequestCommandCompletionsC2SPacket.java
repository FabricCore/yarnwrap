package yarnwrap.network.packet.c2s.play;
public class RequestCommandCompletionsC2SPacket { public net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket wrapperContained; public RequestCommandCompletionsC2SPacket(net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int completionId() { return wrapperContained.completionId; }
// public java.lang.String partialCommand() { return wrapperContained.partialCommand; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.lang.String getPartialCommand() { return wrapperContained.getPartialCommand(); }
public int getCompletionId() { return wrapperContained.getCompletionId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}