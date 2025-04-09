package yarnwrap.client.render;
public class OutlineVertexConsumerProvider { public net.minecraft.client.render.OutlineVertexConsumerProvider wrapperContained; public OutlineVertexConsumerProvider(net.minecraft.client.render.OutlineVertexConsumerProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object parent() { return wrapperContained.parent; }
// public Object plainDrawer() { return wrapperContained.plainDrawer; }
// public int red() { return wrapperContained.red; }
// public int green() { return wrapperContained.green; }
// public int blue() { return wrapperContained.blue; }
// public int alpha() { return wrapperContained.alpha; }
public void draw() { wrapperContained.draw(); }
public void setColor(int red,int green,int blue,int alpha) { wrapperContained.setColor(red,green,blue,alpha); }

}