package yarnwrap.network.packet.s2c.play;
public class InventoryS2CPacket { public net.minecraft.network.packet.s2c.play.InventoryS2CPacket wrapperContained; public InventoryS2CPacket(net.minecraft.network.packet.s2c.play.InventoryS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public java.util.List contents() { return wrapperContained.contents; }
// public int revision() { return wrapperContained.revision; }
// public yarnwrap.item.ItemStack cursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.cursorStack); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public java.util.List getContents() { return wrapperContained.getContents(); }
public yarnwrap.item.ItemStack getCursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.getCursorStack()); }
public int getRevision() { return wrapperContained.getRevision(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}