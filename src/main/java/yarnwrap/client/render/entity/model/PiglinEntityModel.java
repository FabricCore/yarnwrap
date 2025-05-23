package yarnwrap.client.render.entity.model;
public class PiglinEntityModel { public net.minecraft.client.render.entity.model.PiglinEntityModel wrapperContained; public PiglinEntityModel(net.minecraft.client.render.entity.model.PiglinEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public void rotateMainArm(yarnwrap.client.render.entity.state.PiglinEntityRenderState state) { wrapperContained.rotateMainArm(state.wrapperContained); }
// public static void rotateMainArm(yarnwrap.client.render.entity.state.PiglinEntityRenderState state, ) { net.minecraft.client.render.entity.model.PiglinEntityModel.rotateMainArm(state.wrapperContained); }

}