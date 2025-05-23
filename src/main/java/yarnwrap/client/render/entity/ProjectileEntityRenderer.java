package yarnwrap.client.render.entity;
public class ProjectileEntityRenderer { public net.minecraft.client.render.entity.ProjectileEntityRenderer wrapperContained; public ProjectileEntityRenderer(net.minecraft.client.render.entity.ProjectileEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ArrowEntityModel model() { return new yarnwrap.client.render.entity.model.ArrowEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.ArrowEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ArrowEntityModel model() { return new yarnwrap.client.render.entity.model.ArrowEntityModel(net.minecraft.client.render.entity.ProjectileEntityRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.ArrowEntityModel value, ) { net.minecraft.client.render.entity.ProjectileEntityRenderer.model = value.wrapperContained; }

// public yarnwrap.util.Identifier getTexture(yarnwrap.client.render.entity.state.ProjectileEntityRenderState state) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(state.wrapperContained)); }
// public static yarnwrap.util.Identifier getTexture(yarnwrap.client.render.entity.state.ProjectileEntityRenderState state, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ProjectileEntityRenderer.getTexture(state.wrapperContained)); }

}