package yarnwrap.client.render.entity;
public class AbstractHoglinEntityRenderer { public net.minecraft.client.render.entity.AbstractHoglinEntityRenderer wrapperContained; public AbstractHoglinEntityRenderer(net.minecraft.client.render.entity.AbstractHoglinEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public AbstractHoglinEntityRenderer(Object context,yarnwrap.client.render.entity.model.EntityModelLayer layer,yarnwrap.client.render.entity.model.EntityModelLayer babyLayer,float scale) { this.wrapperContained = new net.minecraft.client.render.entity.AbstractHoglinEntityRenderer(context,layer.wrapperContained,babyLayer.wrapperContained,scale); }

}