package yarnwrap.network.packet.c2s.play;
public class UpdateSelectedSlotC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket wrapperContained; public UpdateSelectedSlotC2SPacket(net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int selectedSlot() { return wrapperContained.selectedSlot; }
// public void selectedSlot(int value) { wrapperContained.selectedSlot = value; }
// public static int selectedSlot() { return net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket.selectedSlot; }
// public static void selectedSlot(int value, ) { net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket.selectedSlot = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket.CODEC = value.wrapperContained; }

public UpdateSelectedSlotC2SPacket(int selectedSlot) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket(selectedSlot); }
// public UpdateSelectedSlotC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket(buf.wrapperContained); }
public int getSelectedSlot() { return wrapperContained.getSelectedSlot(); }
// public static int getSelectedSlot() { return net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket.getSelectedSlot(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket.write(buf.wrapperContained); }

}