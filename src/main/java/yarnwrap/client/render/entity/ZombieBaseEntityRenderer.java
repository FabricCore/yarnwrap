package yarnwrap.client.render.entity;
public class ZombieBaseEntityRenderer { public net.minecraft.client.render.entity.ZombieBaseEntityRenderer wrapperContained; public ZombieBaseEntityRenderer(net.minecraft.client.render.entity.ZombieBaseEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ZombieBaseEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.ZombieBaseEntityRenderer.TEXTURE = value.wrapperContained; }

// public ZombieBaseEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.ZombieEntityModel bodyModel,yarnwrap.client.render.entity.model.ZombieEntityModel legsArmorModel,yarnwrap.client.render.entity.model.ZombieEntityModel bodyArmorModel) { this.wrapperContained = new net.minecraft.client.render.entity.ZombieBaseEntityRenderer(ctx,bodyModel.wrapperContained,legsArmorModel.wrapperContained,bodyArmorModel.wrapperContained); }

}