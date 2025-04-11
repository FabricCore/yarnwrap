package yarnwrap.network.packet.s2c.play;
public class UpdateSelectedSlotS2CPacket { public net.minecraft.network.packet.s2c.play.UpdateSelectedSlotS2CPacket wrapperContained; public UpdateSelectedSlotS2CPacket(net.minecraft.network.packet.s2c.play.UpdateSelectedSlotS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public UpdateSelectedSlotS2CPacket(int slot) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.UpdateSelectedSlotS2CPacket(slot); }
// public UpdateSelectedSlotS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.UpdateSelectedSlotS2CPacket(buf.wrapperContained); }
public int getSlot() { return wrapperContained.getSlot(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}