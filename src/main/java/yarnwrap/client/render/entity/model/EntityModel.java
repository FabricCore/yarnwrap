package yarnwrap.client.render.entity.model;
public class EntityModel { public net.minecraft.client.render.entity.model.EntityModel wrapperContained; public EntityModel(net.minecraft.client.render.entity.model.EntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public EntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.EntityModel(root.wrapperContained); }
public void setAngles(yarnwrap.client.render.entity.state.EntityRenderState state) { wrapperContained.setAngles(state.wrapperContained); }
// public static void setAngles(yarnwrap.client.render.entity.state.EntityRenderState state, ) { net.minecraft.client.render.entity.model.EntityModel.setAngles(state.wrapperContained); }

}