package yarnwrap.screen.slot;
public class SlotActionType { public net.minecraft.screen.slot.SlotActionType wrapperContained; public SlotActionType(net.minecraft.screen.slot.SlotActionType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType QUICK_CRAFT() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.QUICK_CRAFT); }
// public void QUICK_CRAFT(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.QUICK_CRAFT = value.wrapperContained; }
public static yarnwrap.screen.slot.SlotActionType QUICK_CRAFT() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.screen.slot.SlotActionType.QUICK_CRAFT); }
// public static void QUICK_CRAFT(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.screen.slot.SlotActionType.QUICK_CRAFT = value.wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType PICKUP() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.PICKUP); }
// public void PICKUP(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.PICKUP = value.wrapperContained; }
public static yarnwrap.screen.slot.SlotActionType PICKUP() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.screen.slot.SlotActionType.PICKUP); }
// public static void PICKUP(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.screen.slot.SlotActionType.PICKUP = value.wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType SWAP() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.SWAP); }
// public void SWAP(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.SWAP = value.wrapperContained; }
public static yarnwrap.screen.slot.SlotActionType SWAP() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.screen.slot.SlotActionType.SWAP); }
// public static void SWAP(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.screen.slot.SlotActionType.SWAP = value.wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType PICKUP_ALL() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.PICKUP_ALL); }
// public void PICKUP_ALL(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.PICKUP_ALL = value.wrapperContained; }
public static yarnwrap.screen.slot.SlotActionType PICKUP_ALL() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.screen.slot.SlotActionType.PICKUP_ALL); }
// public static void PICKUP_ALL(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.screen.slot.SlotActionType.PICKUP_ALL = value.wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType QUICK_MOVE() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.QUICK_MOVE); }
// public void QUICK_MOVE(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.QUICK_MOVE = value.wrapperContained; }
public static yarnwrap.screen.slot.SlotActionType QUICK_MOVE() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.screen.slot.SlotActionType.QUICK_MOVE); }
// public static void QUICK_MOVE(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.screen.slot.SlotActionType.QUICK_MOVE = value.wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType THROW() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.THROW); }
// public void THROW(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.THROW = value.wrapperContained; }
public static yarnwrap.screen.slot.SlotActionType THROW() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.screen.slot.SlotActionType.THROW); }
// public static void THROW(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.screen.slot.SlotActionType.THROW = value.wrapperContained; }

// public yarnwrap.screen.slot.SlotActionType CLONE() { return new yarnwrap.screen.slot.SlotActionType(wrapperContained.CLONE); }
// public void CLONE(yarnwrap.screen.slot.SlotActionType value) { wrapperContained.CLONE = value.wrapperContained; }
public static yarnwrap.screen.slot.SlotActionType CLONE() { return new yarnwrap.screen.slot.SlotActionType(net.minecraft.screen.slot.SlotActionType.CLONE); }
// public static void CLONE(yarnwrap.screen.slot.SlotActionType value, ) { net.minecraft.screen.slot.SlotActionType.CLONE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.screen.slot.SlotActionType.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.screen.slot.SlotActionType.PACKET_CODEC = value.wrapperContained; }

// public java.util.function.IntFunction INDEX_MAPPER() { return wrapperContained.INDEX_MAPPER; }
// public void INDEX_MAPPER(java.util.function.IntFunction value) { wrapperContained.INDEX_MAPPER = value; }
// public static java.util.function.IntFunction INDEX_MAPPER() { return net.minecraft.screen.slot.SlotActionType.INDEX_MAPPER; }
// public static void INDEX_MAPPER(java.util.function.IntFunction value, ) { net.minecraft.screen.slot.SlotActionType.INDEX_MAPPER = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.screen.slot.SlotActionType.index; }
// public static void index(int value, ) { net.minecraft.screen.slot.SlotActionType.index = value; }

// // public SlotActionType(java.lang.String index) { this.wrapperContained = new net.minecraft.screen.slot.SlotActionType(index); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.screen.slot.SlotActionType.getIndex(); }

}