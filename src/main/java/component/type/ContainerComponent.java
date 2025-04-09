package yarnwrap.component.type;
public class ContainerComponent { public net.minecraft.component.type.ContainerComponent wrapperContained; public ContainerComponent(net.minecraft.component.type.ContainerComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ContainerComponent DEFAULT() { return new yarnwrap.component.type.ContainerComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public int MAX_SLOTS() { return wrapperContained.MAX_SLOTS; }
// public yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.stacks); }
// public int ALL_SLOTS_EMPTY() { return wrapperContained.ALL_SLOTS_EMPTY; }
// public int hashCode() { return wrapperContained.hashCode; }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public void copyTo(yarnwrap.util.collection.DefaultedList stacks) { wrapperContained.copyTo(stacks.wrapperContained); }
public yarnwrap.component.type.ContainerComponent fromStacks(java.util.List stacks) { return new yarnwrap.component.type.ContainerComponent(wrapperContained.fromStacks(stacks)); }
// public java.util.List collectSlots() { return wrapperContained.collectSlots(); }
// public yarnwrap.component.type.ContainerComponent fromSlots(java.util.List slots) { return new yarnwrap.component.type.ContainerComponent(wrapperContained.fromSlots(slots)); }
public yarnwrap.item.ItemStack copyFirstStack() { return new yarnwrap.item.ItemStack(wrapperContained.copyFirstStack()); }
public java.util.stream.Stream streamNonEmpty() { return wrapperContained.streamNonEmpty(); }
// public int findFirstNonEmptyIndex(java.util.List stacks) { return wrapperContained.findFirstNonEmptyIndex(stacks); }
public java.lang.Iterable iterateNonEmpty() { return wrapperContained.iterateNonEmpty(); }
public java.lang.Iterable iterateNonEmptyCopy() { return wrapperContained.iterateNonEmptyCopy(); }

}