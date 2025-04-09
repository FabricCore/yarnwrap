package yarnwrap.network.packet.c2s.play;
public class SlotChangedStateC2SPacket { public net.minecraft.network.packet.c2s.play.SlotChangedStateC2SPacket wrapperContained; public SlotChangedStateC2SPacket(net.minecraft.network.packet.c2s.play.SlotChangedStateC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int screenHandlerId() { return wrapperContained.screenHandlerId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int screenHandlerId() { return wrapperContained.screenHandlerId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}