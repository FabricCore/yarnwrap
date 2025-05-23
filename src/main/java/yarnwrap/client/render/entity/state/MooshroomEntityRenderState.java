package yarnwrap.client.render.entity.state;
public class MooshroomEntityRenderState { public net.minecraft.client.render.entity.state.MooshroomEntityRenderState wrapperContained; public MooshroomEntityRenderState(net.minecraft.client.render.entity.state.MooshroomEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object type() { return wrapperContained.type; }
// public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.render.entity.state.MooshroomEntityRenderState.type; }
// // public static void type(Object value, ) { net.minecraft.client.render.entity.state.MooshroomEntityRenderState.type = value; }


}