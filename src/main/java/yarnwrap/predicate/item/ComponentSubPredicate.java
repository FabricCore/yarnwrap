package yarnwrap.predicate.item;
public class ComponentSubPredicate { public net.minecraft.predicate.item.ComponentSubPredicate wrapperContained; public ComponentSubPredicate(net.minecraft.predicate.item.ComponentSubPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(wrapperContained.getComponentType()); }
// public static yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(net.minecraft.predicate.item.ComponentSubPredicate.getComponentType()); }
public boolean test(yarnwrap.item.ItemStack stack,java.lang.Object component) { return wrapperContained.test(stack.wrapperContained,component); }
// public static boolean test(yarnwrap.item.ItemStack stack,java.lang.Object component, ) { return net.minecraft.predicate.item.ComponentSubPredicate.test(stack.wrapperContained,component); }

}