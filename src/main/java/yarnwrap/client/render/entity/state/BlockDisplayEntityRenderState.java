package yarnwrap.client.render.entity.state;
public class BlockDisplayEntityRenderState { public net.minecraft.client.render.entity.state.BlockDisplayEntityRenderState wrapperContained; public BlockDisplayEntityRenderState(net.minecraft.client.render.entity.state.BlockDisplayEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object data() { return wrapperContained.data; }
// public void data(Object value) { wrapperContained.data = value; }
// // public static Object data() { return net.minecraft.client.render.entity.state.BlockDisplayEntityRenderState.data; }
// // public static void data(Object value, ) { net.minecraft.client.render.entity.state.BlockDisplayEntityRenderState.data = value; }


}