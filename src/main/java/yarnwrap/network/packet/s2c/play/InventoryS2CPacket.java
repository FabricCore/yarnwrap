package yarnwrap.network.packet.s2c.play;
public class InventoryS2CPacket { public net.minecraft.network.packet.s2c.play.InventoryS2CPacket wrapperContained; public InventoryS2CPacket(net.minecraft.network.packet.s2c.play.InventoryS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.InventoryS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.InventoryS2CPacket.syncId = value; }

// public java.util.List contents() { return wrapperContained.contents; }
// public void contents(java.util.List value) { wrapperContained.contents = value; }
// public static java.util.List contents() { return net.minecraft.network.packet.s2c.play.InventoryS2CPacket.contents; }
// public static void contents(java.util.List value, ) { net.minecraft.network.packet.s2c.play.InventoryS2CPacket.contents = value; }

// public int revision() { return wrapperContained.revision; }
// public void revision(int value) { wrapperContained.revision = value; }
// public static int revision() { return net.minecraft.network.packet.s2c.play.InventoryS2CPacket.revision; }
// public static void revision(int value, ) { net.minecraft.network.packet.s2c.play.InventoryS2CPacket.revision = value; }

// public yarnwrap.item.ItemStack cursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.cursorStack); }
// public void cursorStack(yarnwrap.item.ItemStack value) { wrapperContained.cursorStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack cursorStack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.s2c.play.InventoryS2CPacket.cursorStack); }
// public static void cursorStack(yarnwrap.item.ItemStack value, ) { net.minecraft.network.packet.s2c.play.InventoryS2CPacket.cursorStack = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.InventoryS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.InventoryS2CPacket.CODEC = value.wrapperContained; }

public InventoryS2CPacket(int syncId,int revision,yarnwrap.util.collection.DefaultedList contents,yarnwrap.item.ItemStack cursorStack) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.InventoryS2CPacket(syncId,revision,contents.wrapperContained,cursorStack.wrapperContained); }
// public InventoryS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.InventoryS2CPacket(buf.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.InventoryS2CPacket.getSyncId(); }
public java.util.List getContents() { return wrapperContained.getContents(); }
// public static java.util.List getContents() { return net.minecraft.network.packet.s2c.play.InventoryS2CPacket.getContents(); }
public yarnwrap.item.ItemStack getCursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.getCursorStack()); }
// public static yarnwrap.item.ItemStack getCursorStack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.s2c.play.InventoryS2CPacket.getCursorStack()); }
public int getRevision() { return wrapperContained.getRevision(); }
// public static int getRevision() { return net.minecraft.network.packet.s2c.play.InventoryS2CPacket.getRevision(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.InventoryS2CPacket.write(buf.wrapperContained); }

}