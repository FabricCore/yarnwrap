package yarnwrap.network.packet.s2c.play;
public class ScreenHandlerSlotUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket wrapperContained; public ScreenHandlerSlotUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
// public static int slot() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.slot; }
// public static void slot(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.slot = value; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.syncId = value; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.stack); }
// public static void stack(yarnwrap.item.ItemStack value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.stack = value.wrapperContained; }

// public int UPDATE_CURSOR_SYNC_ID() { return wrapperContained.UPDATE_CURSOR_SYNC_ID; }
// public void UPDATE_CURSOR_SYNC_ID(int value) { wrapperContained.UPDATE_CURSOR_SYNC_ID = value; }
public static int UPDATE_CURSOR_SYNC_ID() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.UPDATE_CURSOR_SYNC_ID; }
// public static void UPDATE_CURSOR_SYNC_ID(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.UPDATE_CURSOR_SYNC_ID = value; }

// public int UPDATE_PLAYER_INVENTORY_SYNC_ID() { return wrapperContained.UPDATE_PLAYER_INVENTORY_SYNC_ID; }
// public void UPDATE_PLAYER_INVENTORY_SYNC_ID(int value) { wrapperContained.UPDATE_PLAYER_INVENTORY_SYNC_ID = value; }
public static int UPDATE_PLAYER_INVENTORY_SYNC_ID() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.UPDATE_PLAYER_INVENTORY_SYNC_ID; }
// public static void UPDATE_PLAYER_INVENTORY_SYNC_ID(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.UPDATE_PLAYER_INVENTORY_SYNC_ID = value; }

// public int revision() { return wrapperContained.revision; }
// public void revision(int value) { wrapperContained.revision = value; }
// public static int revision() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.revision; }
// public static void revision(int value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.revision = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.CODEC = value.wrapperContained; }

public ScreenHandlerSlotUpdateS2CPacket(int syncId,int revision,int slot,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket(syncId,revision,slot,stack.wrapperContained); }
// public ScreenHandlerSlotUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket(buf.wrapperContained); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
// public static yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.getStack()); }
public int getSlot() { return wrapperContained.getSlot(); }
// public static int getSlot() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.getSlot(); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.getSyncId(); }
public int getRevision() { return wrapperContained.getRevision(); }
// public static int getRevision() { return net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.getRevision(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket.write(buf.wrapperContained); }

}