package yarnwrap.component;
public class ComponentChanges { public net.minecraft.component.ComponentChanges wrapperContained; public ComponentChanges(net.minecraft.component.ComponentChanges wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.ComponentChanges EMPTY() { return new yarnwrap.component.ComponentChanges(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.component.ComponentChanges value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.component.ComponentChanges EMPTY() { return new yarnwrap.component.ComponentChanges(net.minecraft.component.ComponentChanges.EMPTY); }
// public static void EMPTY(yarnwrap.component.ComponentChanges value, ) { net.minecraft.component.ComponentChanges.EMPTY = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.ComponentChanges.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.ComponentChanges.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.ComponentChanges.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.ComponentChanges.PACKET_CODEC = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents() { return wrapperContained.changedComponents; }
// public void changedComponents(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value) { wrapperContained.changedComponents = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents() { return net.minecraft.component.ComponentChanges.changedComponents; }
// public static void changedComponents(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value, ) { net.minecraft.component.ComponentChanges.changedComponents = value; }

// public java.lang.String REMOVE_PREFIX() { return wrapperContained.REMOVE_PREFIX; }
// public void REMOVE_PREFIX(java.lang.String value) { wrapperContained.REMOVE_PREFIX = value; }
// public static java.lang.String REMOVE_PREFIX() { return net.minecraft.component.ComponentChanges.REMOVE_PREFIX; }
// public static void REMOVE_PREFIX(java.lang.String value, ) { net.minecraft.component.ComponentChanges.REMOVE_PREFIX = value; }

// public yarnwrap.network.codec.PacketCodec LENGTH_PREPENDED_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LENGTH_PREPENDED_PACKET_CODEC); }
// public void LENGTH_PREPENDED_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.LENGTH_PREPENDED_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec LENGTH_PREPENDED_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.ComponentChanges.LENGTH_PREPENDED_PACKET_CODEC); }
// public static void LENGTH_PREPENDED_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.ComponentChanges.LENGTH_PREPENDED_PACKET_CODEC = value.wrapperContained; }

// public ComponentChanges(it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents) { this.wrapperContained = new net.minecraft.component.ComponentChanges(changedComponents); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.ComponentChanges.equals(o); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.component.ComponentChanges.builder(); }
// public java.lang.String toString(it.unimi.dsi.fastutil.objects.Reference2ObjectMap changes) { return wrapperContained.toString(changes); }
// public static java.lang.String toString(it.unimi.dsi.fastutil.objects.Reference2ObjectMap changes, ) { return net.minecraft.component.ComponentChanges.toString(changes); }
// public yarnwrap.component.ComponentChanges method_57843(java.util.Map changes) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_57843(changes)); }
// public static yarnwrap.component.ComponentChanges method_57843(java.util.Map changes, ) { return new yarnwrap.component.ComponentChanges(net.minecraft.component.ComponentChanges.method_57843(changes)); }
// public java.util.Map method_57844(yarnwrap.component.ComponentChanges changes) { return wrapperContained.method_57844(changes.wrapperContained); }
// public static java.util.Map method_57844(yarnwrap.component.ComponentChanges changes, ) { return net.minecraft.component.ComponentChanges.method_57844(changes.wrapperContained); }
public java.util.Optional get(yarnwrap.component.ComponentType type) { return wrapperContained.get(type.wrapperContained); }
// public static java.util.Optional get(yarnwrap.component.ComponentType type, ) { return net.minecraft.component.ComponentChanges.get(type.wrapperContained); }
public java.util.Set entrySet() { return wrapperContained.entrySet(); }
// public static java.util.Set entrySet() { return net.minecraft.component.ComponentChanges.entrySet(); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.component.ComponentChanges.size(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.component.ComponentChanges.isEmpty(); }
public yarnwrap.component.ComponentChanges withRemovedIf(java.util.function.Predicate removedTypePredicate) { return new yarnwrap.component.ComponentChanges(wrapperContained.withRemovedIf(removedTypePredicate)); }
// public static yarnwrap.component.ComponentChanges withRemovedIf(java.util.function.Predicate removedTypePredicate, ) { return new yarnwrap.component.ComponentChanges(net.minecraft.component.ComponentChanges.withRemovedIf(removedTypePredicate)); }
// public void method_58758(Object type,java.util.Set value) { wrapperContained.method_58758(type,value); }
// public static void method_58758(Object type,java.util.Set value, ) { net.minecraft.component.ComponentChanges.method_58758(type,value); }
public Object toAddedRemovedPair() { return wrapperContained.toAddedRemovedPair(); }
// public static Object toAddedRemovedPair() { return net.minecraft.component.ComponentChanges.toAddedRemovedPair(); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(Object packetCodecFunction) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(packetCodecFunction)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(Object packetCodecFunction, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.ComponentChanges.createPacketCodec(packetCodecFunction)); }

}