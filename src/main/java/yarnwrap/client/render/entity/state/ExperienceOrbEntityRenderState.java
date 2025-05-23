package yarnwrap.client.render.entity.state;
public class ExperienceOrbEntityRenderState { public net.minecraft.client.render.entity.state.ExperienceOrbEntityRenderState wrapperContained; public ExperienceOrbEntityRenderState(net.minecraft.client.render.entity.state.ExperienceOrbEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public int size() { return wrapperContained.size; }
public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.client.render.entity.state.ExperienceOrbEntityRenderState.size; }
// public static void size(int value, ) { net.minecraft.client.render.entity.state.ExperienceOrbEntityRenderState.size = value; }


}