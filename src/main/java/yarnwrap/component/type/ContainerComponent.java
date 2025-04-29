package yarnwrap.component.type;
public class ContainerComponent { public net.minecraft.component.type.ContainerComponent wrapperContained; public ContainerComponent(net.minecraft.component.type.ContainerComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.ContainerComponent DEFAULT() { return new yarnwrap.component.type.ContainerComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.ContainerComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.ContainerComponent DEFAULT() { return new yarnwrap.component.type.ContainerComponent(net.minecraft.component.type.ContainerComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.ContainerComponent value, ) { net.minecraft.component.type.ContainerComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ContainerComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ContainerComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.ContainerComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.ContainerComponent.PACKET_CODEC = value.wrapperContained; }

// public int MAX_SLOTS() { return wrapperContained.MAX_SLOTS; }
// public void MAX_SLOTS(int value) { wrapperContained.MAX_SLOTS = value; }
// public static int MAX_SLOTS() { return net.minecraft.component.type.ContainerComponent.MAX_SLOTS; }
// public static void MAX_SLOTS(int value, ) { net.minecraft.component.type.ContainerComponent.MAX_SLOTS = value; }

// public yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.stacks); }
// public void stacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.stacks = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.component.type.ContainerComponent.stacks); }
// public static void stacks(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.component.type.ContainerComponent.stacks = value.wrapperContained; }

// public int ALL_SLOTS_EMPTY() { return wrapperContained.ALL_SLOTS_EMPTY; }
// public void ALL_SLOTS_EMPTY(int value) { wrapperContained.ALL_SLOTS_EMPTY = value; }
// public static int ALL_SLOTS_EMPTY() { return net.minecraft.component.type.ContainerComponent.ALL_SLOTS_EMPTY; }
// public static void ALL_SLOTS_EMPTY(int value, ) { net.minecraft.component.type.ContainerComponent.ALL_SLOTS_EMPTY = value; }

// public int hashCode() { return wrapperContained.hashCode; }
// public void hashCode(int value) { wrapperContained.hashCode = value; }
// public static int hashCode() { return net.minecraft.component.type.ContainerComponent.hashCode; }
// public static void hashCode(int value, ) { net.minecraft.component.type.ContainerComponent.hashCode = value; }

// public ContainerComponent(int size) { this.wrapperContained = new net.minecraft.component.type.ContainerComponent(size); }
// public ContainerComponent(java.util.List stacks) { this.wrapperContained = new net.minecraft.component.type.ContainerComponent(stacks); }
// public ContainerComponent(yarnwrap.util.collection.DefaultedList stacks) { this.wrapperContained = new net.minecraft.component.type.ContainerComponent(stacks.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.type.ContainerComponent.equals(o); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.component.type.ContainerComponent.stream(); }
// public java.util.List method_57491(yarnwrap.component.type.ContainerComponent component) { return wrapperContained.method_57491(component.wrapperContained); }
// public static java.util.List method_57491(yarnwrap.component.type.ContainerComponent component, ) { return net.minecraft.component.type.ContainerComponent.method_57491(component.wrapperContained); }
public void copyTo(yarnwrap.util.collection.DefaultedList stacks) { wrapperContained.copyTo(stacks.wrapperContained); }
// public static void copyTo(yarnwrap.util.collection.DefaultedList stacks, ) { net.minecraft.component.type.ContainerComponent.copyTo(stacks.wrapperContained); }
// public yarnwrap.component.type.ContainerComponent fromStacks(java.util.List stacks) { return new yarnwrap.component.type.ContainerComponent(wrapperContained.fromStacks(stacks)); }
// public static yarnwrap.component.type.ContainerComponent fromStacks(java.util.List stacks, ) { return new yarnwrap.component.type.ContainerComponent(net.minecraft.component.type.ContainerComponent.fromStacks(stacks)); }
// public java.util.List collectSlots() { return wrapperContained.collectSlots(); }
// public static java.util.List collectSlots() { return net.minecraft.component.type.ContainerComponent.collectSlots(); }
// public yarnwrap.component.type.ContainerComponent fromSlots(java.util.List slots) { return new yarnwrap.component.type.ContainerComponent(wrapperContained.fromSlots(slots)); }
// public static yarnwrap.component.type.ContainerComponent fromSlots(java.util.List slots, ) { return new yarnwrap.component.type.ContainerComponent(net.minecraft.component.type.ContainerComponent.fromSlots(slots)); }
public yarnwrap.item.ItemStack copyFirstStack() { return new yarnwrap.item.ItemStack(wrapperContained.copyFirstStack()); }
// public static yarnwrap.item.ItemStack copyFirstStack() { return new yarnwrap.item.ItemStack(net.minecraft.component.type.ContainerComponent.copyFirstStack()); }
// public boolean method_59710(yarnwrap.item.ItemStack stack) { return wrapperContained.method_59710(stack.wrapperContained); }
// public static boolean method_59710(yarnwrap.item.ItemStack stack, ) { return net.minecraft.component.type.ContainerComponent.method_59710(stack.wrapperContained); }
// public boolean method_59711(yarnwrap.item.ItemStack stack) { return wrapperContained.method_59711(stack.wrapperContained); }
// public static boolean method_59711(yarnwrap.item.ItemStack stack, ) { return net.minecraft.component.type.ContainerComponent.method_59711(stack.wrapperContained); }
public java.util.stream.Stream streamNonEmpty() { return wrapperContained.streamNonEmpty(); }
// public static java.util.stream.Stream streamNonEmpty() { return net.minecraft.component.type.ContainerComponent.streamNonEmpty(); }
// public int findLastNonEmptyIndex(java.util.List stacks) { return wrapperContained.findLastNonEmptyIndex(stacks); }
// public static int findLastNonEmptyIndex(java.util.List stacks, ) { return net.minecraft.component.type.ContainerComponent.findLastNonEmptyIndex(stacks); }
public java.lang.Iterable iterateNonEmpty() { return wrapperContained.iterateNonEmpty(); }
// public static java.lang.Iterable iterateNonEmpty() { return net.minecraft.component.type.ContainerComponent.iterateNonEmpty(); }
public java.lang.Iterable iterateNonEmptyCopy() { return wrapperContained.iterateNonEmptyCopy(); }
// public static java.lang.Iterable iterateNonEmptyCopy() { return net.minecraft.component.type.ContainerComponent.iterateNonEmptyCopy(); }

}