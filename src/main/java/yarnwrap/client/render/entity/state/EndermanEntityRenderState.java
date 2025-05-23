package yarnwrap.client.render.entity.state;
public class EndermanEntityRenderState { public net.minecraft.client.render.entity.state.EndermanEntityRenderState wrapperContained; public EndermanEntityRenderState(net.minecraft.client.render.entity.state.EndermanEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean angry() { return wrapperContained.angry; }
public void angry(boolean value) { wrapperContained.angry = value; }
// public static boolean angry() { return net.minecraft.client.render.entity.state.EndermanEntityRenderState.angry; }
// public static void angry(boolean value, ) { net.minecraft.client.render.entity.state.EndermanEntityRenderState.angry = value; }

public yarnwrap.block.BlockState carriedBlock() { return new yarnwrap.block.BlockState(wrapperContained.carriedBlock); }
public void carriedBlock(yarnwrap.block.BlockState value) { wrapperContained.carriedBlock = value.wrapperContained; }
// public static yarnwrap.block.BlockState carriedBlock() { return new yarnwrap.block.BlockState(net.minecraft.client.render.entity.state.EndermanEntityRenderState.carriedBlock); }
// public static void carriedBlock(yarnwrap.block.BlockState value, ) { net.minecraft.client.render.entity.state.EndermanEntityRenderState.carriedBlock = value.wrapperContained; }


}