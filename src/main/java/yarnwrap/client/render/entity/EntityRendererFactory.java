package yarnwrap.client.render.entity;
public class EntityRendererFactory { public net.minecraft.client.render.entity.EntityRendererFactory wrapperContained; public EntityRendererFactory(net.minecraft.client.render.entity.EntityRendererFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderer create(Object ctx) { return new yarnwrap.client.render.entity.EntityRenderer(wrapperContained.create(ctx)); }

}