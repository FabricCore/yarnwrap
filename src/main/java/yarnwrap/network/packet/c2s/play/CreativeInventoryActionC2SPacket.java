package yarnwrap.network.packet.c2s.play;
public class CreativeInventoryActionC2SPacket { public net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket wrapperContained; public CreativeInventoryActionC2SPacket(net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public short slot() { return wrapperContained.slot; }
// public void slot(short value) { wrapperContained.slot = value; }
// public static short slot() { return net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.slot; }
// public static void slot(short value, ) { net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.slot = value; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.stack); }
// public static void stack(yarnwrap.item.ItemStack value, ) { net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.stack = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.CODEC = value.wrapperContained; }

public CreativeInventoryActionC2SPacket(int slot,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket(slot,stack.wrapperContained); }
// public short slot() { return wrapperContained.slot(); }
// // public static short slot() { return net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.slot(); }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack()); }
// // public static yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.c2s.play.CreativeInventoryActionC2SPacket.stack()); }

}