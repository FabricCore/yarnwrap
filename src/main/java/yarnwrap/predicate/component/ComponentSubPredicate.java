package yarnwrap.predicate.component;
public class ComponentSubPredicate { public net.minecraft.predicate.component.ComponentSubPredicate wrapperContained; public ComponentSubPredicate(net.minecraft.predicate.component.ComponentSubPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(wrapperContained.getComponentType()); }
// public static yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(net.minecraft.predicate.component.ComponentSubPredicate.getComponentType()); }
public boolean test(java.lang.Object component) { return wrapperContained.test(component); }
// public static boolean test(java.lang.Object component, ) { return net.minecraft.predicate.component.ComponentSubPredicate.test(component); }

}