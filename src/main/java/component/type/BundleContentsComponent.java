package yarnwrap.component.type;
public class BundleContentsComponent { public net.minecraft.component.type.BundleContentsComponent wrapperContained; public BundleContentsComponent(net.minecraft.component.type.BundleContentsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.BundleContentsComponent DEFAULT() { return new yarnwrap.component.type.BundleContentsComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public org.apache.commons.lang3.math.Fraction NESTED_BUNDLE_OCCUPANCY() { return wrapperContained.NESTED_BUNDLE_OCCUPANCY; }
// public int ADD_TO_NEW_SLOT() { return wrapperContained.ADD_TO_NEW_SLOT; }
// public java.util.List stacks() { return wrapperContained.stacks; }
// public org.apache.commons.lang3.math.Fraction occupancy() { return wrapperContained.occupancy; }
public java.lang.Iterable iterate() { return wrapperContained.iterate(); }
public yarnwrap.item.ItemStack get(int index) { return new yarnwrap.item.ItemStack(wrapperContained.get(index)); }
// public org.apache.commons.lang3.math.Fraction getOccupancy(yarnwrap.item.ItemStack stack) { return wrapperContained.getOccupancy(stack.wrapperContained); }
// public org.apache.commons.lang3.math.Fraction calculateOccupancy(java.util.List stacks) { return wrapperContained.calculateOccupancy(stacks); }
public int size() { return wrapperContained.size(); }
public org.apache.commons.lang3.math.Fraction getOccupancy() { return wrapperContained.getOccupancy(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public java.lang.Iterable iterateCopy() { return wrapperContained.iterateCopy(); }

}