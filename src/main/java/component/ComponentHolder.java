package yarnwrap.component;
public class ComponentHolder { public net.minecraft.component.ComponentHolder wrapperContained; public ComponentHolder(net.minecraft.component.ComponentHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getComponents()); }
public java.lang.Object get(yarnwrap.component.ComponentType type) { return wrapperContained.get(type.wrapperContained); }
public java.lang.Object getOrDefault(yarnwrap.component.ComponentType type,java.lang.Object fallback) { return wrapperContained.getOrDefault(type.wrapperContained,fallback); }
public boolean contains(yarnwrap.component.ComponentType type) { return wrapperContained.contains(type.wrapperContained); }

}