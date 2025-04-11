package yarnwrap.loot;
public class ContainerComponentModifier { public net.minecraft.loot.ContainerComponentModifier wrapperContained; public ContainerComponentModifier(net.minecraft.loot.ContainerComponentModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(wrapperContained.getComponentType()); }
public void apply(yarnwrap.item.ItemStack stack,java.lang.Object component,java.util.stream.Stream contents) { wrapperContained.apply(stack.wrapperContained,component,contents); }
public void apply(yarnwrap.item.ItemStack stack,java.util.function.UnaryOperator contentsOperator) { wrapperContained.apply(stack.wrapperContained,contentsOperator); }
public void apply(yarnwrap.item.ItemStack stack,java.util.stream.Stream contents) { wrapperContained.apply(stack.wrapperContained,contents); }
public java.util.stream.Stream stream(java.lang.Object component) { return wrapperContained.stream(component); }
public java.lang.Object create(java.lang.Object component,java.util.stream.Stream contents) { return wrapperContained.create(component,contents); }
public java.lang.Object getDefault() { return wrapperContained.getDefault(); }

}