package yarnwrap.predicate.item;
public class ComponentSubPredicate { public net.minecraft.predicate.item.ComponentSubPredicate wrapperContained; public ComponentSubPredicate(net.minecraft.predicate.item.ComponentSubPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(wrapperContained.getComponentType()); }
public boolean test(yarnwrap.item.ItemStack stack,java.lang.Object component) { return wrapperContained.test(stack.wrapperContained,component); }

}