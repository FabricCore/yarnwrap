package yarnwrap.predicate.component;
public class ComponentPredicate { public net.minecraft.predicate.component.ComponentPredicate wrapperContained; public ComponentPredicate(net.minecraft.predicate.component.ComponentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec PREDICATES_MAP_CODEC() { return wrapperContained.PREDICATES_MAP_CODEC; }
// public void PREDICATES_MAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PREDICATES_MAP_CODEC = value; }
public static com.mojang.serialization.Codec PREDICATES_MAP_CODEC() { return net.minecraft.predicate.component.ComponentPredicate.PREDICATES_MAP_CODEC; }
// public static void PREDICATES_MAP_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.component.ComponentPredicate.PREDICATES_MAP_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec SINGLE_PREDICATE_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.SINGLE_PREDICATE_PACKET_CODEC); }
// public void SINGLE_PREDICATE_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.SINGLE_PREDICATE_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec SINGLE_PREDICATE_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.component.ComponentPredicate.SINGLE_PREDICATE_PACKET_CODEC); }
// public static void SINGLE_PREDICATE_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.component.ComponentPredicate.SINGLE_PREDICATE_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PREDICATES_MAP_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PREDICATES_MAP_PACKET_CODEC); }
// public void PREDICATES_MAP_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PREDICATES_MAP_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PREDICATES_MAP_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.predicate.component.ComponentPredicate.PREDICATES_MAP_PACKET_CODEC); }
// public static void PREDICATES_MAP_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.predicate.component.ComponentPredicate.PREDICATES_MAP_PACKET_CODEC = value.wrapperContained; }

public boolean test(yarnwrap.component.ComponentsAccess components) { return wrapperContained.test(components.wrapperContained); }
// public static boolean test(yarnwrap.component.ComponentsAccess components, ) { return net.minecraft.predicate.component.ComponentPredicate.test(components.wrapperContained); }
// public com.mojang.serialization.MapCodec createCodec(java.lang.String predicateFieldName) { return wrapperContained.createCodec(predicateFieldName); }
// public static com.mojang.serialization.MapCodec createCodec(java.lang.String predicateFieldName, ) { return net.minecraft.predicate.component.ComponentPredicate.createCodec(predicateFieldName); }
// public java.util.Map method_68712(java.util.List list) { return wrapperContained.method_68712(list); }
// public static java.util.Map method_68712(java.util.List list, ) { return net.minecraft.predicate.component.ComponentPredicate.method_68712(list); }
// public java.util.List method_68713(java.util.Map map) { return wrapperContained.method_68713(map); }
// public static java.util.List method_68713(java.util.Map map, ) { return net.minecraft.predicate.component.ComponentPredicate.method_68713(map); }

}