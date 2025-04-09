package yarnwrap.network.packet.s2c.play;
public class UpdateSelectedSlotS2CPacket { public net.minecraft.network.packet.s2c.play.UpdateSelectedSlotS2CPacket wrapperContained; public UpdateSelectedSlotS2CPacket(net.minecraft.network.packet.s2c.play.UpdateSelectedSlotS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slot() { return wrapperContained.slot; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getSlot() { return wrapperContained.getSlot(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}