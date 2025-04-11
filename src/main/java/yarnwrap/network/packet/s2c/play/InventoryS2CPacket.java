package yarnwrap.network.packet.s2c.play;
public class InventoryS2CPacket { public net.minecraft.network.packet.s2c.play.InventoryS2CPacket wrapperContained; public InventoryS2CPacket(net.minecraft.network.packet.s2c.play.InventoryS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public java.util.List contents() { return wrapperContained.contents; }
// public void contents(java.util.List value) { wrapperContained.contents = value; }
// public int revision() { return wrapperContained.revision; }
// public void revision(int value) { wrapperContained.revision = value; }
// public yarnwrap.item.ItemStack cursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.cursorStack); }
// public void cursorStack(yarnwrap.item.ItemStack value) { wrapperContained.cursorStack = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public InventoryS2CPacket(int syncId,int revision,yarnwrap.util.collection.DefaultedList contents,yarnwrap.item.ItemStack cursorStack) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.InventoryS2CPacket(syncId,revision,contents.wrapperContained,cursorStack.wrapperContained); }
// public InventoryS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.InventoryS2CPacket(buf.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public java.util.List getContents() { return wrapperContained.getContents(); }
public yarnwrap.item.ItemStack getCursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.getCursorStack()); }
public int getRevision() { return wrapperContained.getRevision(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}