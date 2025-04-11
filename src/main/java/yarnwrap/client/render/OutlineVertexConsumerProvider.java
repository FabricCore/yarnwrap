package yarnwrap.client.render;
public class OutlineVertexConsumerProvider { public net.minecraft.client.render.OutlineVertexConsumerProvider wrapperContained; public OutlineVertexConsumerProvider(net.minecraft.client.render.OutlineVertexConsumerProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object parent() { return wrapperContained.parent; }
// // public void parent(Object value) { wrapperContained.parent = value; }
// public Object plainDrawer() { return wrapperContained.plainDrawer; }
// // public void plainDrawer(Object value) { wrapperContained.plainDrawer = value; }
// public int red() { return wrapperContained.red; }
// public void red(int value) { wrapperContained.red = value; }
// public int green() { return wrapperContained.green; }
// public void green(int value) { wrapperContained.green = value; }
// public int blue() { return wrapperContained.blue; }
// public void blue(int value) { wrapperContained.blue = value; }
// public int alpha() { return wrapperContained.alpha; }
// public void alpha(int value) { wrapperContained.alpha = value; }
// public OutlineVertexConsumerProvider(Object parent) { this.wrapperContained = new net.minecraft.client.render.OutlineVertexConsumerProvider(parent); }
public void draw() { wrapperContained.draw(); }
public void setColor(int red,int green,int blue,int alpha) { wrapperContained.setColor(red,green,blue,alpha); }

}