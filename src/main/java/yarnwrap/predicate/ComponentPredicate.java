package yarnwrap.predicate;
public class ComponentPredicate { public net.minecraft.predicate.ComponentPredicate wrapperContained; public ComponentPredicate(net.minecraft.predicate.ComponentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.predicate.ComponentPredicate EMPTY() { return new yarnwrap.predicate.ComponentPredicate(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.predicate.ComponentPredicate value) { wrapperContained.EMPTY = value.wrapperContained; }
// public java.util.List components() { return wrapperContained.components; }
// public void components(java.util.List value) { wrapperContained.components = value; }
// public ComponentPredicate(java.util.List components) { this.wrapperContained = new net.minecraft.predicate.ComponentPredicate(components); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public Object builder() { return wrapperContained.builder(); }
public boolean test(yarnwrap.component.ComponentHolder holder) { return wrapperContained.test(holder.wrapperContained); }
public yarnwrap.predicate.ComponentPredicate of(yarnwrap.component.ComponentMap components) { return new yarnwrap.predicate.ComponentPredicate(wrapperContained.of(components.wrapperContained)); }
// public java.util.List method_57866(yarnwrap.predicate.ComponentPredicate predicate) { return wrapperContained.method_57866(predicate.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public java.util.Map method_57869(yarnwrap.predicate.ComponentPredicate predicate) { return wrapperContained.method_57869(predicate.wrapperContained); }
public yarnwrap.component.ComponentChanges toChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.toChanges()); }
// public boolean test(java.lang.Object components) { return wrapperContained.test(components); }

}