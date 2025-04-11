package yarnwrap.network.packet.c2s.play;
public class SlotChangedStateC2SPacket { public net.minecraft.network.packet.c2s.play.SlotChangedStateC2SPacket wrapperContained; public SlotChangedStateC2SPacket(net.minecraft.network.packet.c2s.play.SlotChangedStateC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int screenHandlerId() { return wrapperContained.screenHandlerId; }
// public void screenHandlerId(int value) { wrapperContained.screenHandlerId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public SlotChangedStateC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.SlotChangedStateC2SPacket(buf.wrapperContained); }
// public int screenHandlerId() { return wrapperContained.screenHandlerId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}