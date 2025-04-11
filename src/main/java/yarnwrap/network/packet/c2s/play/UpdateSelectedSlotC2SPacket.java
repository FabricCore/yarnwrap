package yarnwrap.network.packet.c2s.play;
public class UpdateSelectedSlotC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket wrapperContained; public UpdateSelectedSlotC2SPacket(net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int selectedSlot() { return wrapperContained.selectedSlot; }
// public void selectedSlot(int value) { wrapperContained.selectedSlot = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getSelectedSlot() { return wrapperContained.getSelectedSlot(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}