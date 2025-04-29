package yarnwrap.client.render;
public class DiffuseLighting { public net.minecraft.client.render.DiffuseLighting wrapperContained; public DiffuseLighting(net.minecraft.client.render.DiffuseLighting wrapperContained) { this.wrapperContained = wrapperContained; }

// public void enableForLevel() { wrapperContained.enableForLevel(); }
public static void enableForLevel() { net.minecraft.client.render.DiffuseLighting.enableForLevel(); }
// public void disableGuiDepthLighting() { wrapperContained.disableGuiDepthLighting(); }
public static void disableGuiDepthLighting() { net.minecraft.client.render.DiffuseLighting.disableGuiDepthLighting(); }
// public void enableGuiDepthLighting() { wrapperContained.enableGuiDepthLighting(); }
public static void enableGuiDepthLighting() { net.minecraft.client.render.DiffuseLighting.enableGuiDepthLighting(); }
// public void disableForLevel() { wrapperContained.disableForLevel(); }
public static void disableForLevel() { net.minecraft.client.render.DiffuseLighting.disableForLevel(); }

}