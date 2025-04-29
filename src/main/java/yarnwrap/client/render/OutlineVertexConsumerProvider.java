package yarnwrap.client.render;
public class OutlineVertexConsumerProvider { public net.minecraft.client.render.OutlineVertexConsumerProvider wrapperContained; public OutlineVertexConsumerProvider(net.minecraft.client.render.OutlineVertexConsumerProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object parent() { return wrapperContained.parent; }
// // public void parent(Object value) { wrapperContained.parent = value; }
// // public static Object parent() { return net.minecraft.client.render.OutlineVertexConsumerProvider.parent; }
// // public static void parent(Object value, ) { net.minecraft.client.render.OutlineVertexConsumerProvider.parent = value; }

// public Object plainDrawer() { return wrapperContained.plainDrawer; }
// // public void plainDrawer(Object value) { wrapperContained.plainDrawer = value; }
// // public static Object plainDrawer() { return net.minecraft.client.render.OutlineVertexConsumerProvider.plainDrawer; }
// // public static void plainDrawer(Object value, ) { net.minecraft.client.render.OutlineVertexConsumerProvider.plainDrawer = value; }

// public int red() { return wrapperContained.red; }
// public void red(int value) { wrapperContained.red = value; }
// public static int red() { return net.minecraft.client.render.OutlineVertexConsumerProvider.red; }
// public static void red(int value, ) { net.minecraft.client.render.OutlineVertexConsumerProvider.red = value; }

// public int green() { return wrapperContained.green; }
// public void green(int value) { wrapperContained.green = value; }
// public static int green() { return net.minecraft.client.render.OutlineVertexConsumerProvider.green; }
// public static void green(int value, ) { net.minecraft.client.render.OutlineVertexConsumerProvider.green = value; }

// public int blue() { return wrapperContained.blue; }
// public void blue(int value) { wrapperContained.blue = value; }
// public static int blue() { return net.minecraft.client.render.OutlineVertexConsumerProvider.blue; }
// public static void blue(int value, ) { net.minecraft.client.render.OutlineVertexConsumerProvider.blue = value; }

// public int alpha() { return wrapperContained.alpha; }
// public void alpha(int value) { wrapperContained.alpha = value; }
// public static int alpha() { return net.minecraft.client.render.OutlineVertexConsumerProvider.alpha; }
// public static void alpha(int value, ) { net.minecraft.client.render.OutlineVertexConsumerProvider.alpha = value; }

// public OutlineVertexConsumerProvider(Object parent) { this.wrapperContained = new net.minecraft.client.render.OutlineVertexConsumerProvider(parent); }
public void draw() { wrapperContained.draw(); }
// public static void draw() { net.minecraft.client.render.OutlineVertexConsumerProvider.draw(); }
public void setColor(int red,int green,int blue,int alpha) { wrapperContained.setColor(red,green,blue,alpha); }
// public static void setColor(int red,int green,int blue,int alpha, ) { net.minecraft.client.render.OutlineVertexConsumerProvider.setColor(red,green,blue,alpha); }

}