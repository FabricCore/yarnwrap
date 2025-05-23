package yarnwrap.component;
public class ComponentsAccess { public net.minecraft.component.ComponentsAccess wrapperContained; public ComponentsAccess(net.minecraft.component.ComponentsAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object get(yarnwrap.component.ComponentType type) { return wrapperContained.get(type.wrapperContained); }
// public static java.lang.Object get(yarnwrap.component.ComponentType type, ) { return net.minecraft.component.ComponentsAccess.get(type.wrapperContained); }
public java.lang.Object getOrDefault(yarnwrap.component.ComponentType type,java.lang.Object fallback) { return wrapperContained.getOrDefault(type.wrapperContained,fallback); }
// public static java.lang.Object getOrDefault(yarnwrap.component.ComponentType type,java.lang.Object fallback, ) { return net.minecraft.component.ComponentsAccess.getOrDefault(type.wrapperContained,fallback); }
public yarnwrap.component.Component getTyped(yarnwrap.component.ComponentType type) { return new yarnwrap.component.Component(wrapperContained.getTyped(type.wrapperContained)); }
// public static yarnwrap.component.Component getTyped(yarnwrap.component.ComponentType type, ) { return new yarnwrap.component.Component(net.minecraft.component.ComponentsAccess.getTyped(type.wrapperContained)); }

}