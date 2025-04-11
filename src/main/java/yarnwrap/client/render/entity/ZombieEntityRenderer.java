package yarnwrap.client.render.entity;
public class ZombieEntityRenderer { public net.minecraft.client.render.entity.ZombieEntityRenderer wrapperContained; public ZombieEntityRenderer(net.minecraft.client.render.entity.ZombieEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public ZombieEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.EntityModelLayer layer,yarnwrap.client.render.entity.model.EntityModelLayer legsArmorLayer,yarnwrap.client.render.entity.model.EntityModelLayer bodyArmorLayer) { this.wrapperContained = new net.minecraft.client.render.entity.ZombieEntityRenderer(ctx,layer.wrapperContained,legsArmorLayer.wrapperContained,bodyArmorLayer.wrapperContained); }

}