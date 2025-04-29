package yarnwrap.client.render.block.entity;
public class ShulkerBoxBlockEntityRenderer { public net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer wrapperContained; public ShulkerBoxBlockEntityRenderer(net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ShulkerEntityModel model() { return new yarnwrap.client.render.entity.model.ShulkerEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.ShulkerEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ShulkerEntityModel model() { return new yarnwrap.client.render.entity.model.ShulkerEntityModel(net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.ShulkerEntityModel value, ) { net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer.model = value.wrapperContained; }

// public ShulkerBoxBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.ShulkerBoxBlockEntityRenderer(ctx); }

}