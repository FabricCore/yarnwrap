package yarnwrap.network.packet.s2c.play;
public class ScreenHandlerSlotUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket wrapperContained; public ScreenHandlerSlotUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slot() { return wrapperContained.slot; }
// public int syncId() { return wrapperContained.syncId; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
public int UPDATE_CURSOR_SYNC_ID() { return wrapperContained.UPDATE_CURSOR_SYNC_ID; }
public int UPDATE_PLAYER_INVENTORY_SYNC_ID() { return wrapperContained.UPDATE_PLAYER_INVENTORY_SYNC_ID; }
// public int revision() { return wrapperContained.revision; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
public int getSlot() { return wrapperContained.getSlot(); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public int getRevision() { return wrapperContained.getRevision(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}