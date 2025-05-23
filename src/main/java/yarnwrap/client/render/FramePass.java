package yarnwrap.client.render;
public class FramePass { public net.minecraft.client.render.FramePass wrapperContained; public FramePass(net.minecraft.client.render.FramePass wrapperContained) { this.wrapperContained = wrapperContained; }

public void markToBeVisited() { wrapperContained.markToBeVisited(); }
// public static void markToBeVisited() { net.minecraft.client.render.FramePass.markToBeVisited(); }
public void addRequired(yarnwrap.client.render.FramePass pass) { wrapperContained.addRequired(pass.wrapperContained); }
// public static void addRequired(yarnwrap.client.render.FramePass pass, ) { net.minecraft.client.render.FramePass.addRequired(pass.wrapperContained); }
public void dependsOn(yarnwrap.client.util.Handle handle) { wrapperContained.dependsOn(handle.wrapperContained); }
// public static void dependsOn(yarnwrap.client.util.Handle handle, ) { net.minecraft.client.render.FramePass.dependsOn(handle.wrapperContained); }
public void setRenderer(java.lang.Runnable renderer) { wrapperContained.setRenderer(renderer); }
// public static void setRenderer(java.lang.Runnable renderer, ) { net.minecraft.client.render.FramePass.setRenderer(renderer); }
public yarnwrap.client.util.Handle addRequiredResource(java.lang.String name,yarnwrap.client.util.ClosableFactory factory) { return new yarnwrap.client.util.Handle(wrapperContained.addRequiredResource(name,factory.wrapperContained)); }
// public static yarnwrap.client.util.Handle addRequiredResource(java.lang.String name,yarnwrap.client.util.ClosableFactory factory, ) { return new yarnwrap.client.util.Handle(net.minecraft.client.render.FramePass.addRequiredResource(name,factory.wrapperContained)); }
public yarnwrap.client.util.Handle transfer(yarnwrap.client.util.Handle handle) { return new yarnwrap.client.util.Handle(wrapperContained.transfer(handle.wrapperContained)); }
// public static yarnwrap.client.util.Handle transfer(yarnwrap.client.util.Handle handle, ) { return new yarnwrap.client.util.Handle(net.minecraft.client.render.FramePass.transfer(handle.wrapperContained)); }

}