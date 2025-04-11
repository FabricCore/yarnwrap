package yarnwrap.component;
public class ComponentMap { public net.minecraft.component.ComponentMap wrapperContained; public ComponentMap(net.minecraft.component.ComponentMap wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentMap EMPTY() { return new yarnwrap.component.ComponentMap(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.component.ComponentMap value) { wrapperContained.EMPTY = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public Object builder() { return wrapperContained.builder(); }
public yarnwrap.component.ComponentMap filtered(java.util.function.Predicate predicate) { return new yarnwrap.component.ComponentMap(wrapperContained.filtered(predicate)); }
public java.lang.Object get(yarnwrap.component.ComponentType type) { return wrapperContained.get(type.wrapperContained); }
public java.lang.Object getOrDefault(yarnwrap.component.ComponentType type,java.lang.Object fallback) { return wrapperContained.getOrDefault(type.wrapperContained,fallback); }
public java.util.Set getTypes() { return wrapperContained.getTypes(); }
public boolean contains(yarnwrap.component.ComponentType type) { return wrapperContained.contains(type.wrapperContained); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public yarnwrap.component.Component copy(yarnwrap.component.ComponentType type) { return new yarnwrap.component.Component(wrapperContained.copy(type.wrapperContained)); }
public int size() { return wrapperContained.size(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public yarnwrap.component.ComponentMap of(yarnwrap.component.ComponentMap base,yarnwrap.component.ComponentMap overrides) { return new yarnwrap.component.ComponentMap(wrapperContained.of(base.wrapperContained,overrides.wrapperContained)); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec componentTypeCodec) { return wrapperContained.createCodec(componentTypeCodec); }
// public com.mojang.serialization.Codec createCodecFromValueMap(com.mojang.serialization.Codec typeToValueMapCodec) { return wrapperContained.createCodecFromValueMap(typeToValueMapCodec); }

}