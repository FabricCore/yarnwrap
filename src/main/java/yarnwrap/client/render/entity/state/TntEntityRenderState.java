package yarnwrap.client.render.entity.state;
public class TntEntityRenderState { public net.minecraft.client.render.entity.state.TntEntityRenderState wrapperContained; public TntEntityRenderState(net.minecraft.client.render.entity.state.TntEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float fuse() { return wrapperContained.fuse; }
public void fuse(float value) { wrapperContained.fuse = value; }
// public static float fuse() { return net.minecraft.client.render.entity.state.TntEntityRenderState.fuse; }
// public static void fuse(float value, ) { net.minecraft.client.render.entity.state.TntEntityRenderState.fuse = value; }

public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
// public static yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(net.minecraft.client.render.entity.state.TntEntityRenderState.blockState); }
// public static void blockState(yarnwrap.block.BlockState value, ) { net.minecraft.client.render.entity.state.TntEntityRenderState.blockState = value.wrapperContained; }


}