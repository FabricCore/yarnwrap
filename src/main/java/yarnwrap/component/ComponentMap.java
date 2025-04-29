package yarnwrap.component;
public class ComponentMap { public net.minecraft.component.ComponentMap wrapperContained; public ComponentMap(net.minecraft.component.ComponentMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.ComponentMap EMPTY() { return new yarnwrap.component.ComponentMap(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.component.ComponentMap value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.component.ComponentMap EMPTY() { return new yarnwrap.component.ComponentMap(net.minecraft.component.ComponentMap.EMPTY); }
// public static void EMPTY(yarnwrap.component.ComponentMap value, ) { net.minecraft.component.ComponentMap.EMPTY = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.ComponentMap.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.ComponentMap.CODEC = value; }

// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.component.ComponentMap.builder(); }
public yarnwrap.component.ComponentMap filtered(java.util.function.Predicate predicate) { return new yarnwrap.component.ComponentMap(wrapperContained.filtered(predicate)); }
// public static yarnwrap.component.ComponentMap filtered(java.util.function.Predicate predicate, ) { return new yarnwrap.component.ComponentMap(net.minecraft.component.ComponentMap.filtered(predicate)); }
public java.lang.Object get(yarnwrap.component.ComponentType type) { return wrapperContained.get(type.wrapperContained); }
// public static java.lang.Object get(yarnwrap.component.ComponentType type, ) { return net.minecraft.component.ComponentMap.get(type.wrapperContained); }
public java.lang.Object getOrDefault(yarnwrap.component.ComponentType type,java.lang.Object fallback) { return wrapperContained.getOrDefault(type.wrapperContained,fallback); }
// public static java.lang.Object getOrDefault(yarnwrap.component.ComponentType type,java.lang.Object fallback, ) { return net.minecraft.component.ComponentMap.getOrDefault(type.wrapperContained,fallback); }
public java.util.Set getTypes() { return wrapperContained.getTypes(); }
// public static java.util.Set getTypes() { return net.minecraft.component.ComponentMap.getTypes(); }
public boolean contains(yarnwrap.component.ComponentType type) { return wrapperContained.contains(type.wrapperContained); }
// public static boolean contains(yarnwrap.component.ComponentType type, ) { return net.minecraft.component.ComponentMap.contains(type.wrapperContained); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.component.ComponentMap.stream(); }
public yarnwrap.component.Component copy(yarnwrap.component.ComponentType type) { return new yarnwrap.component.Component(wrapperContained.copy(type.wrapperContained)); }
// public static yarnwrap.component.Component copy(yarnwrap.component.ComponentType type, ) { return new yarnwrap.component.Component(net.minecraft.component.ComponentMap.copy(type.wrapperContained)); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.component.ComponentMap.size(); }
// public yarnwrap.component.Component method_57836(yarnwrap.component.ComponentType type) { return new yarnwrap.component.Component(wrapperContained.method_57836(type.wrapperContained)); }
// public static yarnwrap.component.Component method_57836(yarnwrap.component.ComponentType type, ) { return new yarnwrap.component.Component(net.minecraft.component.ComponentMap.method_57836(type.wrapperContained)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.component.ComponentMap.isEmpty(); }
// public yarnwrap.component.ComponentMap of(yarnwrap.component.ComponentMap base,yarnwrap.component.ComponentMap overrides) { return new yarnwrap.component.ComponentMap(wrapperContained.of(base.wrapperContained,overrides.wrapperContained)); }
// public static yarnwrap.component.ComponentMap of(yarnwrap.component.ComponentMap base,yarnwrap.component.ComponentMap overrides, ) { return new yarnwrap.component.ComponentMap(net.minecraft.component.ComponentMap.of(base.wrapperContained,overrides.wrapperContained)); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec componentTypeCodec) { return wrapperContained.createCodec(componentTypeCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec componentTypeCodec, ) { return net.minecraft.component.ComponentMap.createCodec(componentTypeCodec); }
// public com.mojang.serialization.DataResult method_60387(yarnwrap.component.ComponentMap componentMap) { return wrapperContained.method_60387(componentMap.wrapperContained); }
// public static com.mojang.serialization.DataResult method_60387(yarnwrap.component.ComponentMap componentMap, ) { return net.minecraft.component.ComponentMap.method_60387(componentMap.wrapperContained); }
// public com.mojang.serialization.Codec createCodecFromValueMap(com.mojang.serialization.Codec typeToValueMapCodec) { return wrapperContained.createCodecFromValueMap(typeToValueMapCodec); }
// public static com.mojang.serialization.Codec createCodecFromValueMap(com.mojang.serialization.Codec typeToValueMapCodec, ) { return net.minecraft.component.ComponentMap.createCodecFromValueMap(typeToValueMapCodec); }

}