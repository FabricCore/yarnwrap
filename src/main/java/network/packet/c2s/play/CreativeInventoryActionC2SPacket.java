package yarnwrap.network.packet.c2s.play;
public class CreativeInventoryActionC2SPacket { public net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket wrapperContained; public CreativeInventoryActionC2SPacket(net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public short slot() { return wrapperContained.slot; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public short slot() { return wrapperContained.slot(); }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack()); }

}