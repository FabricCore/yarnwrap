package yarnwrap.predicate;
public class ComponentPredicate { public net.minecraft.predicate.ComponentPredicate wrapperContained; public ComponentPredicate(net.minecraft.predicate.ComponentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.predicate.ComponentPredicate EMPTY() { return new yarnwrap.predicate.ComponentPredicate(wrapperContained.EMPTY); }
// public java.util.List components() { return wrapperContained.components; }
public Object builder() { return wrapperContained.builder(); }
public boolean test(yarnwrap.component.ComponentHolder holder) { return wrapperContained.test(holder.wrapperContained); }
public yarnwrap.predicate.ComponentPredicate of(yarnwrap.component.ComponentMap components) { return new yarnwrap.predicate.ComponentPredicate(wrapperContained.of(components.wrapperContained)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.component.ComponentChanges toChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.toChanges()); }

}