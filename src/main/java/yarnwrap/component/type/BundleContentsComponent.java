package yarnwrap.component.type;
public class BundleContentsComponent { public net.minecraft.component.type.BundleContentsComponent wrapperContained; public BundleContentsComponent(net.minecraft.component.type.BundleContentsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.BundleContentsComponent DEFAULT() { return new yarnwrap.component.type.BundleContentsComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.BundleContentsComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.BundleContentsComponent DEFAULT() { return new yarnwrap.component.type.BundleContentsComponent(net.minecraft.component.type.BundleContentsComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.BundleContentsComponent value, ) { net.minecraft.component.type.BundleContentsComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.BundleContentsComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.BundleContentsComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.BundleContentsComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.BundleContentsComponent.PACKET_CODEC = value.wrapperContained; }

// public org.apache.commons.lang3.math.Fraction NESTED_BUNDLE_OCCUPANCY() { return wrapperContained.NESTED_BUNDLE_OCCUPANCY; }
// public void NESTED_BUNDLE_OCCUPANCY(org.apache.commons.lang3.math.Fraction value) { wrapperContained.NESTED_BUNDLE_OCCUPANCY = value; }
// public static org.apache.commons.lang3.math.Fraction NESTED_BUNDLE_OCCUPANCY() { return net.minecraft.component.type.BundleContentsComponent.NESTED_BUNDLE_OCCUPANCY; }
// public static void NESTED_BUNDLE_OCCUPANCY(org.apache.commons.lang3.math.Fraction value, ) { net.minecraft.component.type.BundleContentsComponent.NESTED_BUNDLE_OCCUPANCY = value; }

// public int ADD_TO_NEW_SLOT() { return wrapperContained.ADD_TO_NEW_SLOT; }
// public void ADD_TO_NEW_SLOT(int value) { wrapperContained.ADD_TO_NEW_SLOT = value; }
// public static int ADD_TO_NEW_SLOT() { return net.minecraft.component.type.BundleContentsComponent.ADD_TO_NEW_SLOT; }
// public static void ADD_TO_NEW_SLOT(int value, ) { net.minecraft.component.type.BundleContentsComponent.ADD_TO_NEW_SLOT = value; }

// public java.util.List stacks() { return wrapperContained.stacks; }
// public void stacks(java.util.List value) { wrapperContained.stacks = value; }
// public static java.util.List stacks() { return net.minecraft.component.type.BundleContentsComponent.stacks; }
// public static void stacks(java.util.List value, ) { net.minecraft.component.type.BundleContentsComponent.stacks = value; }

// public org.apache.commons.lang3.math.Fraction occupancy() { return wrapperContained.occupancy; }
// public void occupancy(org.apache.commons.lang3.math.Fraction value) { wrapperContained.occupancy = value; }
// public static org.apache.commons.lang3.math.Fraction occupancy() { return net.minecraft.component.type.BundleContentsComponent.occupancy; }
// public static void occupancy(org.apache.commons.lang3.math.Fraction value, ) { net.minecraft.component.type.BundleContentsComponent.occupancy = value; }

public BundleContentsComponent(java.util.List stacks) { this.wrapperContained = new net.minecraft.component.type.BundleContentsComponent(stacks); }
// public BundleContentsComponent(java.util.List stacks,org.apache.commons.lang3.math.Fraction occupancy) { this.wrapperContained = new net.minecraft.component.type.BundleContentsComponent(stacks,occupancy); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.type.BundleContentsComponent.equals(o); }
public java.lang.Iterable iterate() { return wrapperContained.iterate(); }
// public static java.lang.Iterable iterate() { return net.minecraft.component.type.BundleContentsComponent.iterate(); }
public yarnwrap.item.ItemStack get(int index) { return new yarnwrap.item.ItemStack(wrapperContained.get(index)); }
// public static yarnwrap.item.ItemStack get(int index, ) { return new yarnwrap.item.ItemStack(net.minecraft.component.type.BundleContentsComponent.get(index)); }
// public org.apache.commons.lang3.math.Fraction getOccupancy(yarnwrap.item.ItemStack stack) { return wrapperContained.getOccupancy(stack.wrapperContained); }
// public static org.apache.commons.lang3.math.Fraction getOccupancy(yarnwrap.item.ItemStack stack, ) { return net.minecraft.component.type.BundleContentsComponent.getOccupancy(stack.wrapperContained); }
// public java.util.List method_57424(yarnwrap.component.type.BundleContentsComponent component) { return wrapperContained.method_57424(component.wrapperContained); }
// public static java.util.List method_57424(yarnwrap.component.type.BundleContentsComponent component, ) { return net.minecraft.component.type.BundleContentsComponent.method_57424(component.wrapperContained); }
// public org.apache.commons.lang3.math.Fraction calculateOccupancy(java.util.List stacks) { return wrapperContained.calculateOccupancy(stacks); }
// public static org.apache.commons.lang3.math.Fraction calculateOccupancy(java.util.List stacks, ) { return net.minecraft.component.type.BundleContentsComponent.calculateOccupancy(stacks); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.component.type.BundleContentsComponent.size(); }
// public java.util.List method_57427(yarnwrap.component.type.BundleContentsComponent component) { return wrapperContained.method_57427(component.wrapperContained); }
// public static java.util.List method_57427(yarnwrap.component.type.BundleContentsComponent component, ) { return net.minecraft.component.type.BundleContentsComponent.method_57427(component.wrapperContained); }
public org.apache.commons.lang3.math.Fraction getOccupancy() { return wrapperContained.getOccupancy(); }
// public static org.apache.commons.lang3.math.Fraction getOccupancy() { return net.minecraft.component.type.BundleContentsComponent.getOccupancy(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.component.type.BundleContentsComponent.isEmpty(); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.component.type.BundleContentsComponent.stream(); }
public java.lang.Iterable iterateCopy() { return wrapperContained.iterateCopy(); }
// public static java.lang.Iterable iterateCopy() { return net.minecraft.component.type.BundleContentsComponent.iterateCopy(); }

}