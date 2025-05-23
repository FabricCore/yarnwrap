package yarnwrap.predicate.component;
public class ComponentMapPredicate { public net.minecraft.predicate.component.ComponentMapPredicate wrapperContained; public ComponentMapPredicate(net.minecraft.predicate.component.ComponentMapPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.component.ComponentMapPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.component.ComponentMapPredicate.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.component.ComponentMapPredicate.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.component.ComponentMapPredicate.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.predicate.component.ComponentMapPredicate EMPTY() { return new yarnwrap.predicate.component.ComponentMapPredicate(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.predicate.component.ComponentMapPredicate value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.predicate.component.ComponentMapPredicate EMPTY() { return new yarnwrap.predicate.component.ComponentMapPredicate(net.minecraft.predicate.component.ComponentMapPredicate.EMPTY); }
// public static void EMPTY(yarnwrap.predicate.component.ComponentMapPredicate value, ) { net.minecraft.predicate.component.ComponentMapPredicate.EMPTY = value.wrapperContained; }

// public java.util.List components() { return wrapperContained.components; }
// public void components(java.util.List value) { wrapperContained.components = value; }
// public static java.util.List components() { return net.minecraft.predicate.component.ComponentMapPredicate.components; }
// public static void components(java.util.List value, ) { net.minecraft.predicate.component.ComponentMapPredicate.components = value; }

// public ComponentMapPredicate(java.util.List components) { this.wrapperContained = new net.minecraft.predicate.component.ComponentMapPredicate(components); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.predicate.component.ComponentMapPredicate.equals(o); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.predicate.component.ComponentMapPredicate.builder(); }
// public yarnwrap.predicate.component.ComponentMapPredicate method_57863(java.util.Map map) { return new yarnwrap.predicate.component.ComponentMapPredicate(wrapperContained.method_57863(map)); }
// public static yarnwrap.predicate.component.ComponentMapPredicate method_57863(java.util.Map map, ) { return new yarnwrap.predicate.component.ComponentMapPredicate(net.minecraft.predicate.component.ComponentMapPredicate.method_57863(map)); }
// public yarnwrap.predicate.component.ComponentMapPredicate of(yarnwrap.component.ComponentMap components) { return new yarnwrap.predicate.component.ComponentMapPredicate(wrapperContained.of(components.wrapperContained)); }
// public static yarnwrap.predicate.component.ComponentMapPredicate of(yarnwrap.component.ComponentMap components, ) { return new yarnwrap.predicate.component.ComponentMapPredicate(net.minecraft.predicate.component.ComponentMapPredicate.of(components.wrapperContained)); }
// public java.util.List method_57866(yarnwrap.predicate.component.ComponentMapPredicate predicate) { return wrapperContained.method_57866(predicate.wrapperContained); }
// public static java.util.List method_57866(yarnwrap.predicate.component.ComponentMapPredicate predicate, ) { return net.minecraft.predicate.component.ComponentMapPredicate.method_57866(predicate.wrapperContained); }
// public java.util.Map method_57869(yarnwrap.predicate.component.ComponentMapPredicate predicate) { return wrapperContained.method_57869(predicate.wrapperContained); }
// public static java.util.Map method_57869(yarnwrap.predicate.component.ComponentMapPredicate predicate, ) { return net.minecraft.predicate.component.ComponentMapPredicate.method_57869(predicate.wrapperContained); }
public yarnwrap.component.ComponentChanges toChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.toChanges()); }
// public static yarnwrap.component.ComponentChanges toChanges() { return new yarnwrap.component.ComponentChanges(net.minecraft.predicate.component.ComponentMapPredicate.toChanges()); }
// public boolean method_58760(yarnwrap.component.Component component) { return wrapperContained.method_58760(component.wrapperContained); }
// public static boolean method_58760(yarnwrap.component.Component component, ) { return net.minecraft.predicate.component.ComponentMapPredicate.method_58760(component.wrapperContained); }
// public yarnwrap.predicate.component.ComponentMapPredicate ofFiltered(yarnwrap.component.ComponentMap components,net.minecraft.component.ComponentType[] types) { return new yarnwrap.predicate.component.ComponentMapPredicate(wrapperContained.ofFiltered(components.wrapperContained,types)); }
// public static yarnwrap.predicate.component.ComponentMapPredicate ofFiltered(yarnwrap.component.ComponentMap components,net.minecraft.component.ComponentType[] types, ) { return new yarnwrap.predicate.component.ComponentMapPredicate(net.minecraft.predicate.component.ComponentMapPredicate.ofFiltered(components.wrapperContained,types)); }
// public yarnwrap.predicate.component.ComponentMapPredicate of(yarnwrap.component.ComponentType type,java.lang.Object value) { return new yarnwrap.predicate.component.ComponentMapPredicate(wrapperContained.of(type.wrapperContained,value)); }
// public static yarnwrap.predicate.component.ComponentMapPredicate of(yarnwrap.component.ComponentType type,java.lang.Object value, ) { return new yarnwrap.predicate.component.ComponentMapPredicate(net.minecraft.predicate.component.ComponentMapPredicate.of(type.wrapperContained,value)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.predicate.component.ComponentMapPredicate.isEmpty(); }
// public boolean test(java.lang.Object components) { return wrapperContained.test(components); }
// public static boolean test(java.lang.Object components, ) { return net.minecraft.predicate.component.ComponentMapPredicate.test(components); }

}