package yarnwrap.component;
public class ComponentHolder { public net.minecraft.component.ComponentHolder wrapperContained; public ComponentHolder(net.minecraft.component.ComponentHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getComponents()); }
// public static yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(net.minecraft.component.ComponentHolder.getComponents()); }
public boolean contains(yarnwrap.component.ComponentType type) { return wrapperContained.contains(type.wrapperContained); }
// public static boolean contains(yarnwrap.component.ComponentType type, ) { return net.minecraft.component.ComponentHolder.contains(type.wrapperContained); }
public java.util.stream.Stream streamAll(java.lang.Class valueClass) { return wrapperContained.streamAll(valueClass); }
// public static java.util.stream.Stream streamAll(java.lang.Class valueClass, ) { return net.minecraft.component.ComponentHolder.streamAll(valueClass); }
// public boolean method_62985(java.lang.Class value) { return wrapperContained.method_62985(value); }
// public static boolean method_62985(java.lang.Class value, ) { return net.minecraft.component.ComponentHolder.method_62985(value); }
// public java.lang.Object method_62986(java.lang.Object value) { return wrapperContained.method_62986(value); }
// public static java.lang.Object method_62986(java.lang.Object value, ) { return net.minecraft.component.ComponentHolder.method_62986(value); }

}