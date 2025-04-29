package yarnwrap.loot;
public class ContainerComponentModifier { public net.minecraft.loot.ContainerComponentModifier wrapperContained; public ContainerComponentModifier(net.minecraft.loot.ContainerComponentModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(wrapperContained.getComponentType()); }
// public static yarnwrap.component.ComponentType getComponentType() { return new yarnwrap.component.ComponentType(net.minecraft.loot.ContainerComponentModifier.getComponentType()); }
public void apply(yarnwrap.item.ItemStack stack,java.lang.Object component,java.util.stream.Stream contents) { wrapperContained.apply(stack.wrapperContained,component,contents); }
// public static void apply(yarnwrap.item.ItemStack stack,java.lang.Object component,java.util.stream.Stream contents, ) { net.minecraft.loot.ContainerComponentModifier.apply(stack.wrapperContained,component,contents); }
public void apply(yarnwrap.item.ItemStack stack,java.util.function.UnaryOperator contentsOperator) { wrapperContained.apply(stack.wrapperContained,contentsOperator); }
// public static void apply(yarnwrap.item.ItemStack stack,java.util.function.UnaryOperator contentsOperator, ) { net.minecraft.loot.ContainerComponentModifier.apply(stack.wrapperContained,contentsOperator); }
public void apply(yarnwrap.item.ItemStack stack,java.util.stream.Stream contents) { wrapperContained.apply(stack.wrapperContained,contents); }
// public static void apply(yarnwrap.item.ItemStack stack,java.util.stream.Stream contents, ) { net.minecraft.loot.ContainerComponentModifier.apply(stack.wrapperContained,contents); }
public java.util.stream.Stream stream(java.lang.Object component) { return wrapperContained.stream(component); }
// public static java.util.stream.Stream stream(java.lang.Object component, ) { return net.minecraft.loot.ContainerComponentModifier.stream(component); }
public java.lang.Object create(java.lang.Object component,java.util.stream.Stream contents) { return wrapperContained.create(component,contents); }
// public static java.lang.Object create(java.lang.Object component,java.util.stream.Stream contents, ) { return net.minecraft.loot.ContainerComponentModifier.create(component,contents); }
// public yarnwrap.item.ItemStack method_59725(java.util.function.UnaryOperator contentStack) { return new yarnwrap.item.ItemStack(wrapperContained.method_59725(contentStack)); }
// public static yarnwrap.item.ItemStack method_59725(java.util.function.UnaryOperator contentStack, ) { return new yarnwrap.item.ItemStack(net.minecraft.loot.ContainerComponentModifier.method_59725(contentStack)); }
public java.lang.Object getDefault() { return wrapperContained.getDefault(); }
// public static java.lang.Object getDefault() { return net.minecraft.loot.ContainerComponentModifier.getDefault(); }

}