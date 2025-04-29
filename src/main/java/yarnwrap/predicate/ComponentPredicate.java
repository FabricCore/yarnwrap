package yarnwrap.predicate;
public class ComponentPredicate { public net.minecraft.predicate.ComponentPredicate wrapperContained; public ComponentPredicate(net.minecraft.predicate.ComponentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.ComponentPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.ComponentPredicate.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.ComponentPredicate.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.ComponentPredicate.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.predicate.ComponentPredicate EMPTY() { return new yarnwrap.predicate.ComponentPredicate(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.predicate.ComponentPredicate value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.predicate.ComponentPredicate EMPTY() { return new yarnwrap.predicate.ComponentPredicate(net.minecraft.predicate.ComponentPredicate.EMPTY); }
// public static void EMPTY(yarnwrap.predicate.ComponentPredicate value, ) { net.minecraft.predicate.ComponentPredicate.EMPTY = value.wrapperContained; }

// public java.util.List components() { return wrapperContained.components; }
// public void components(java.util.List value) { wrapperContained.components = value; }
// public static java.util.List components() { return net.minecraft.predicate.ComponentPredicate.components; }
// public static void components(java.util.List value, ) { net.minecraft.predicate.ComponentPredicate.components = value; }

// public ComponentPredicate(java.util.List components) { this.wrapperContained = new net.minecraft.predicate.ComponentPredicate(components); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.predicate.ComponentPredicate.equals(o); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.predicate.ComponentPredicate.builder(); }
public boolean test(yarnwrap.component.ComponentHolder holder) { return wrapperContained.test(holder.wrapperContained); }
// public static boolean test(yarnwrap.component.ComponentHolder holder, ) { return net.minecraft.predicate.ComponentPredicate.test(holder.wrapperContained); }
// public yarnwrap.predicate.ComponentPredicate of(yarnwrap.component.ComponentMap components) { return new yarnwrap.predicate.ComponentPredicate(wrapperContained.of(components.wrapperContained)); }
// public static yarnwrap.predicate.ComponentPredicate of(yarnwrap.component.ComponentMap components, ) { return new yarnwrap.predicate.ComponentPredicate(net.minecraft.predicate.ComponentPredicate.of(components.wrapperContained)); }
// public java.util.List method_57866(yarnwrap.predicate.ComponentPredicate predicate) { return wrapperContained.method_57866(predicate.wrapperContained); }
// public static java.util.List method_57866(yarnwrap.predicate.ComponentPredicate predicate, ) { return net.minecraft.predicate.ComponentPredicate.method_57866(predicate.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.predicate.ComponentPredicate.isEmpty(); }
// public java.util.Map method_57869(yarnwrap.predicate.ComponentPredicate predicate) { return wrapperContained.method_57869(predicate.wrapperContained); }
// public static java.util.Map method_57869(yarnwrap.predicate.ComponentPredicate predicate, ) { return net.minecraft.predicate.ComponentPredicate.method_57869(predicate.wrapperContained); }
public yarnwrap.component.ComponentChanges toChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.toChanges()); }
// public static yarnwrap.component.ComponentChanges toChanges() { return new yarnwrap.component.ComponentChanges(net.minecraft.predicate.ComponentPredicate.toChanges()); }
// public boolean test(java.lang.Object components) { return wrapperContained.test(components); }
// public static boolean test(java.lang.Object components, ) { return net.minecraft.predicate.ComponentPredicate.test(components); }

}