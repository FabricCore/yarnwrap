package yarnwrap.network.packet.c2s.play;
public class ClickSlotC2SPacket { public net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket wrapperContained; public ClickSlotC2SPacket(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType actionType() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.actionType); }
// public void actionType(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.actionType = value.wrapperContained; }
// public static yarnwrap.screen.slot.SlotActionType actionType() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.actionType); }
// public static void actionType(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.actionType = value.wrapperContained; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.stack); }
// public static void stack(yarnwrap.item.ItemStack value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.stack = value.wrapperContained; }

// public int button() { return wrapperContained.button; }
// public void button(int value) { wrapperContained.button = value; }
// public static int button() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.button; }
// public static void button(int value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.button = value; }

// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
// public static int slot() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.slot; }
// public static void slot(int value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.slot = value; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.syncId = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap modifiedStacks() { return wrapperContained.modifiedStacks; }
// public void modifiedStacks(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.modifiedStacks = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap modifiedStacks() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.modifiedStacks; }
// public static void modifiedStacks(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.modifiedStacks = value; }

// public int revision() { return wrapperContained.revision; }
// public void revision(int value) { wrapperContained.revision = value; }
// public static int revision() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.revision; }
// public static void revision(int value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.revision = value; }

// public int MAX_MODIFIED_STACKS() { return wrapperContained.MAX_MODIFIED_STACKS; }
// public void MAX_MODIFIED_STACKS(int value) { wrapperContained.MAX_MODIFIED_STACKS = value; }
// public static int MAX_MODIFIED_STACKS() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.MAX_MODIFIED_STACKS; }
// public static void MAX_MODIFIED_STACKS(int value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.MAX_MODIFIED_STACKS = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec STACK_MAP_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.STACK_MAP_CODEC); }
// public void STACK_MAP_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.STACK_MAP_CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec STACK_MAP_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.STACK_MAP_CODEC); }
// public static void STACK_MAP_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.STACK_MAP_CODEC = value.wrapperContained; }

public ClickSlotC2SPacket(int syncId,int revision,int slot,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.item.ItemStack stack,it.unimi.dsi.fastutil.ints.Int2ObjectMap modifiedStacks) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket(syncId,revision,slot,button,actionType.wrapperContained,stack.wrapperContained,modifiedStacks); }
// public ClickSlotC2SPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket(buf.wrapperContained); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
// public static yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.getStack()); }
public int getSlot() { return wrapperContained.getSlot(); }
// public static int getSlot() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.getSlot(); }
public int getButton() { return wrapperContained.getButton(); }
// public static int getButton() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.getButton(); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.getSyncId(); }
public yarnwrap.screen.slot.SlotActionType getActionType() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.getActionType()); }
// public static yarnwrap.screen.slot.SlotActionType getActionType() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.getActionType()); }
public it.unimi.dsi.fastutil.ints.Int2ObjectMap getModifiedStacks() { return wrapperContained.getModifiedStacks(); }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap getModifiedStacks() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.getModifiedStacks(); }
public int getRevision() { return wrapperContained.getRevision(); }
// public static int getRevision() { return net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.getRevision(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket.write(buf.wrapperContained); }

}