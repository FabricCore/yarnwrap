package yarnwrap.network.packet.c2s.play;
public class ClickSlotC2SPacket { public net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket wrapperContained; public ClickSlotC2SPacket(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType actionType() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.actionType); }
// public void actionType(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.actionType = value.wrapperContained; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public int button() { return wrapperContained.button; }
// public void button(int value) { wrapperContained.button = value; }
// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap modifiedStacks() { return wrapperContained.modifiedStacks; }
// public void modifiedStacks(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.modifiedStacks = value; }
// public int revision() { return wrapperContained.revision; }
// public void revision(int value) { wrapperContained.revision = value; }
// public int MAX_MODIFIED_STACKS() { return wrapperContained.MAX_MODIFIED_STACKS; }
// public void MAX_MODIFIED_STACKS(int value) { wrapperContained.MAX_MODIFIED_STACKS = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public yarnwrap.network.codec.PacketCodec STACK_MAP_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.STACK_MAP_CODEC); }
// public void STACK_MAP_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.STACK_MAP_CODEC = value.wrapperContained; }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
public int getSlot() { return wrapperContained.getSlot(); }
public int getButton() { return wrapperContained.getButton(); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public yarnwrap.screen.slot.SlotActionType getActionType() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.getActionType()); }
public it.unimi.dsi.fastutil.ints.Int2ObjectMap getModifiedStacks() { return wrapperContained.getModifiedStacks(); }
public int getRevision() { return wrapperContained.getRevision(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}