package yarnwrap.client.render.entity.state;
public class TropicalFishEntityRenderState { public net.minecraft.client.render.entity.state.TropicalFishEntityRenderState wrapperContained; public TropicalFishEntityRenderState(net.minecraft.client.render.entity.state.TropicalFishEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object variety() { return wrapperContained.variety; }
// public void variety(Object value) { wrapperContained.variety = value; }
// // public static Object variety() { return net.minecraft.client.render.entity.state.TropicalFishEntityRenderState.variety; }
// // public static void variety(Object value, ) { net.minecraft.client.render.entity.state.TropicalFishEntityRenderState.variety = value; }

public int baseColor() { return wrapperContained.baseColor; }
public void baseColor(int value) { wrapperContained.baseColor = value; }
// public static int baseColor() { return net.minecraft.client.render.entity.state.TropicalFishEntityRenderState.baseColor; }
// public static void baseColor(int value, ) { net.minecraft.client.render.entity.state.TropicalFishEntityRenderState.baseColor = value; }

public int patternColor() { return wrapperContained.patternColor; }
public void patternColor(int value) { wrapperContained.patternColor = value; }
// public static int patternColor() { return net.minecraft.client.render.entity.state.TropicalFishEntityRenderState.patternColor; }
// public static void patternColor(int value, ) { net.minecraft.client.render.entity.state.TropicalFishEntityRenderState.patternColor = value; }


}