package yarnwrap.client.render.entity.state;
public class EvokerEntityRenderState { public net.minecraft.client.render.entity.state.EvokerEntityRenderState wrapperContained; public EvokerEntityRenderState(net.minecraft.client.render.entity.state.EvokerEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean spellcasting() { return wrapperContained.spellcasting; }
public void spellcasting(boolean value) { wrapperContained.spellcasting = value; }
// public static boolean spellcasting() { return net.minecraft.client.render.entity.state.EvokerEntityRenderState.spellcasting; }
// public static void spellcasting(boolean value, ) { net.minecraft.client.render.entity.state.EvokerEntityRenderState.spellcasting = value; }


}