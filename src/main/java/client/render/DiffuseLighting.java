package yarnwrap.client.render;
public class DiffuseLighting { public net.minecraft.client.render.DiffuseLighting wrapperContained; public DiffuseLighting(net.minecraft.client.render.DiffuseLighting wrapperContained) { this.wrapperContained = wrapperContained; }

public void enableForLevel() { wrapperContained.enableForLevel(); }
public void disableGuiDepthLighting() { wrapperContained.disableGuiDepthLighting(); }
public void enableGuiDepthLighting() { wrapperContained.enableGuiDepthLighting(); }
public void disableForLevel() { wrapperContained.disableForLevel(); }

}