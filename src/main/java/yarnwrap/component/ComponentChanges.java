package yarnwrap.component;
public class ComponentChanges { public net.minecraft.component.ComponentChanges wrapperContained; public ComponentChanges(net.minecraft.component.ComponentChanges wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentChanges EMPTY() { return new yarnwrap.component.ComponentChanges(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.component.ComponentChanges value) { wrapperContained.EMPTY = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents() { return wrapperContained.changedComponents; }
// public void changedComponents(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value) { wrapperContained.changedComponents = value; }
// public java.lang.String REMOVE_PREFIX() { return wrapperContained.REMOVE_PREFIX; }
// public void REMOVE_PREFIX(java.lang.String value) { wrapperContained.REMOVE_PREFIX = value; }
// public ComponentChanges(it.unimi.dsi.fastutil.objects.Reference2ObjectMap changedComponents) { this.wrapperContained = new net.minecraft.component.ComponentChanges(changedComponents); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public Object builder() { return wrapperContained.builder(); }
// public java.lang.String toString(it.unimi.dsi.fastutil.objects.Reference2ObjectMap changes) { return wrapperContained.toString(changes); }
// public yarnwrap.component.ComponentChanges method_57843(java.util.Map changes) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_57843(changes)); }
// public java.util.Map method_57844(yarnwrap.component.ComponentChanges changes) { return wrapperContained.method_57844(changes.wrapperContained); }
public java.util.Optional get(yarnwrap.component.ComponentType type) { return wrapperContained.get(type.wrapperContained); }
public java.util.Set entrySet() { return wrapperContained.entrySet(); }
public int size() { return wrapperContained.size(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.component.ComponentChanges withRemovedIf(java.util.function.Predicate removedTypePredicate) { return new yarnwrap.component.ComponentChanges(wrapperContained.withRemovedIf(removedTypePredicate)); }
// public void method_58758(Object type,java.util.Set value) { wrapperContained.method_58758(type,value); }
public Object toAddedRemovedPair() { return wrapperContained.toAddedRemovedPair(); }

}