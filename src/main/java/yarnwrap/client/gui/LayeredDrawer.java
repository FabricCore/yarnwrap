package yarnwrap.client.gui;
public class LayeredDrawer { public net.minecraft.client.gui.LayeredDrawer wrapperContained; public LayeredDrawer(net.minecraft.client.gui.LayeredDrawer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float LAYER_Z_PADDING() { return wrapperContained.LAYER_Z_PADDING; }
// public void LAYER_Z_PADDING(float value) { wrapperContained.LAYER_Z_PADDING = value; }
public static float LAYER_Z_PADDING() { return net.minecraft.client.gui.LayeredDrawer.LAYER_Z_PADDING; }
// public static void LAYER_Z_PADDING(float value, ) { net.minecraft.client.gui.LayeredDrawer.LAYER_Z_PADDING = value; }

// public java.util.List layers() { return wrapperContained.layers; }
// public void layers(java.util.List value) { wrapperContained.layers = value; }
// public static java.util.List layers() { return net.minecraft.client.gui.LayeredDrawer.layers; }
// public static void layers(java.util.List value, ) { net.minecraft.client.gui.LayeredDrawer.layers = value; }

public void render(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.render(context.wrapperContained,tickCounter.wrapperContained); }
// public static void render(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.LayeredDrawer.render(context.wrapperContained,tickCounter.wrapperContained); }
// public yarnwrap.client.gui.LayeredDrawer addLayer(Object layer) { return new yarnwrap.client.gui.LayeredDrawer(wrapperContained.addLayer(layer)); }
// public static yarnwrap.client.gui.LayeredDrawer addLayer(Object layer, ) { return new yarnwrap.client.gui.LayeredDrawer(net.minecraft.client.gui.LayeredDrawer.addLayer(layer)); }
public yarnwrap.client.gui.LayeredDrawer addSubDrawer(yarnwrap.client.gui.LayeredDrawer drawer,java.util.function.BooleanSupplier shouldRender) { return new yarnwrap.client.gui.LayeredDrawer(wrapperContained.addSubDrawer(drawer.wrapperContained,shouldRender)); }
// public static yarnwrap.client.gui.LayeredDrawer addSubDrawer(yarnwrap.client.gui.LayeredDrawer drawer,java.util.function.BooleanSupplier shouldRender, ) { return new yarnwrap.client.gui.LayeredDrawer(net.minecraft.client.gui.LayeredDrawer.addSubDrawer(drawer.wrapperContained,shouldRender)); }
// public void method_55812(java.util.function.BooleanSupplier context,yarnwrap.client.gui.LayeredDrawer tickCounter) { wrapperContained.method_55812(context,tickCounter.wrapperContained); }
// public static void method_55812(java.util.function.BooleanSupplier context,yarnwrap.client.gui.LayeredDrawer tickCounter, ) { net.minecraft.client.gui.LayeredDrawer.method_55812(context,tickCounter.wrapperContained); }
// public void renderInternal(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderInternal(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderInternal(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.LayeredDrawer.renderInternal(context.wrapperContained,tickCounter.wrapperContained); }

}