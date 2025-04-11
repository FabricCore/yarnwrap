package yarnwrap.component.type;
public class ContainerComponent { public net.minecraft.component.type.ContainerComponent wrapperContained; public ContainerComponent(net.minecraft.component.type.ContainerComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ContainerComponent DEFAULT() { return new yarnwrap.component.type.ContainerComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.ContainerComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int MAX_SLOTS() { return wrapperContained.MAX_SLOTS; }
// public void MAX_SLOTS(int value) { wrapperContained.MAX_SLOTS = value; }
// public yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.stacks); }
// public void stacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.stacks = value.wrapperContained; }
// public int ALL_SLOTS_EMPTY() { return wrapperContained.ALL_SLOTS_EMPTY; }
// public void ALL_SLOTS_EMPTY(int value) { wrapperContained.ALL_SLOTS_EMPTY = value; }
// public int hashCode() { return wrapperContained.hashCode; }
// public void hashCode(int value) { wrapperContained.hashCode = value; }
// public ContainerComponent(int size) { this.wrapperContained = new net.minecraft.component.type.ContainerComponent(size); }
// public ContainerComponent(java.util.List stacks) { this.wrapperContained = new net.minecraft.component.type.ContainerComponent(stacks); }
// public ContainerComponent(yarnwrap.util.collection.DefaultedList stacks) { this.wrapperContained = new net.minecraft.component.type.ContainerComponent(stacks.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public java.util.List method_57491(yarnwrap.component.type.ContainerComponent component) { return wrapperContained.method_57491(component.wrapperContained); }
public void copyTo(yarnwrap.util.collection.DefaultedList stacks) { wrapperContained.copyTo(stacks.wrapperContained); }
public yarnwrap.component.type.ContainerComponent fromStacks(java.util.List stacks) { return new yarnwrap.component.type.ContainerComponent(wrapperContained.fromStacks(stacks)); }
// public java.util.List collectSlots() { return wrapperContained.collectSlots(); }
// public yarnwrap.component.type.ContainerComponent fromSlots(java.util.List slots) { return new yarnwrap.component.type.ContainerComponent(wrapperContained.fromSlots(slots)); }
public yarnwrap.item.ItemStack copyFirstStack() { return new yarnwrap.item.ItemStack(wrapperContained.copyFirstStack()); }
// public boolean method_59710(yarnwrap.item.ItemStack stack) { return wrapperContained.method_59710(stack.wrapperContained); }
// public boolean method_59711(yarnwrap.item.ItemStack stack) { return wrapperContained.method_59711(stack.wrapperContained); }
public java.util.stream.Stream streamNonEmpty() { return wrapperContained.streamNonEmpty(); }
// public int findLastNonEmptyIndex(java.util.List stacks) { return wrapperContained.findLastNonEmptyIndex(stacks); }
public java.lang.Iterable iterateNonEmpty() { return wrapperContained.iterateNonEmpty(); }
public java.lang.Iterable iterateNonEmptyCopy() { return wrapperContained.iterateNonEmptyCopy(); }

}