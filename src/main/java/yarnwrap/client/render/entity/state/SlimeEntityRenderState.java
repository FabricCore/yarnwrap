package yarnwrap.client.render.entity.state;
public class SlimeEntityRenderState { public net.minecraft.client.render.entity.state.SlimeEntityRenderState wrapperContained; public SlimeEntityRenderState(net.minecraft.client.render.entity.state.SlimeEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float stretch() { return wrapperContained.stretch; }
public void stretch(float value) { wrapperContained.stretch = value; }
// public static float stretch() { return net.minecraft.client.render.entity.state.SlimeEntityRenderState.stretch; }
// public static void stretch(float value, ) { net.minecraft.client.render.entity.state.SlimeEntityRenderState.stretch = value; }

public int size() { return wrapperContained.size; }
public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.client.render.entity.state.SlimeEntityRenderState.size; }
// public static void size(int value, ) { net.minecraft.client.render.entity.state.SlimeEntityRenderState.size = value; }


}