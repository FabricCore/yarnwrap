package yarnwrap.client.option;
public class StickyKeyBinding { public net.minecraft.client.option.StickyKeyBinding wrapperContained; public StickyKeyBinding(net.minecraft.client.option.StickyKeyBinding wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.BooleanSupplier toggleGetter() { return wrapperContained.toggleGetter; }
// public void toggleGetter(java.util.function.BooleanSupplier value) { wrapperContained.toggleGetter = value; }
// public static java.util.function.BooleanSupplier toggleGetter() { return net.minecraft.client.option.StickyKeyBinding.toggleGetter; }
// public static void toggleGetter(java.util.function.BooleanSupplier value, ) { net.minecraft.client.option.StickyKeyBinding.toggleGetter = value; }

public StickyKeyBinding(java.lang.String id,int code,java.lang.String category,java.util.function.BooleanSupplier toggleGetter) { this.wrapperContained = new net.minecraft.client.option.StickyKeyBinding(id,code,category,toggleGetter); }
// public void untoggle() { wrapperContained.untoggle(); }
// public static void untoggle() { net.minecraft.client.option.StickyKeyBinding.untoggle(); }

}