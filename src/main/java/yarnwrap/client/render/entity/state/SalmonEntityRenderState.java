package yarnwrap.client.render.entity.state;
public class SalmonEntityRenderState { public net.minecraft.client.render.entity.state.SalmonEntityRenderState wrapperContained; public SalmonEntityRenderState(net.minecraft.client.render.entity.state.SalmonEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object variant() { return wrapperContained.variant; }
// public void variant(Object value) { wrapperContained.variant = value; }
// // public static Object variant() { return net.minecraft.client.render.entity.state.SalmonEntityRenderState.variant; }
// // public static void variant(Object value, ) { net.minecraft.client.render.entity.state.SalmonEntityRenderState.variant = value; }


}