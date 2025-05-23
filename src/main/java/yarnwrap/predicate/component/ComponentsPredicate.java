package yarnwrap.predicate.component;
public class ComponentsPredicate { public net.minecraft.predicate.component.ComponentsPredicate wrapperContained; public ComponentsPredicate(net.minecraft.predicate.component.ComponentsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.predicate.component.ComponentsPredicate EMPTY() { return new yarnwrap.predicate.component.ComponentsPredicate(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.predicate.component.ComponentsPredicate value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.predicate.component.ComponentsPredicate EMPTY() { return new yarnwrap.predicate.component.ComponentsPredicate(net.minecraft.predicate.component.ComponentsPredicate.EMPTY); }
// public static void EMPTY(yarnwrap.predicate.component.ComponentsPredicate value, ) { net.minecraft.predicate.component.ComponentsPredicate.EMPTY = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.predicate.component.ComponentsPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.predicate.component.ComponentsPredicate.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.component.ComponentsPredicate.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.component.ComponentsPredicate.PACKET_CODEC = value.wrapperContained; }

public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.predicate.component.ComponentsPredicate.isEmpty(); }
// public com.mojang.datafixers.kinds.App method_68681(Object instance) { return wrapperContained.method_68681(instance); }
// public static com.mojang.datafixers.kinds.App method_68681(Object instance, ) { return net.minecraft.predicate.component.ComponentsPredicate.method_68681(instance); }
// public boolean test(java.lang.Object components) { return wrapperContained.test(components); }
// public static boolean test(java.lang.Object components, ) { return net.minecraft.predicate.component.ComponentsPredicate.test(components); }

}