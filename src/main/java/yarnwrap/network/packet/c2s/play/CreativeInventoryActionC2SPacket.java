package yarnwrap.network.packet.c2s.play;
public class CreativeInventoryActionC2SPacket { public net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket wrapperContained; public CreativeInventoryActionC2SPacket(net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public short slot() { return wrapperContained.slot; }
// public void slot(short value) { wrapperContained.slot = value; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public short slot() { return wrapperContained.slot(); }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack()); }

}