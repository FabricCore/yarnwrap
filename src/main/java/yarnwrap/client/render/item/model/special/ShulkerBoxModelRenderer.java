package yarnwrap.client.render.item.model.special;
public class ShulkerBoxModelRenderer { public net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer wrapperContained; public ShulkerBoxModelRenderer(net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.entity.ShulkerBoxBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.ShulkerBoxBlockEntityRenderer(wrapperContained.blockEntityRenderer); }
// public void blockEntityRenderer(yarnwrap.client.render.block.entity.ShulkerBoxBlockEntityRenderer value) { wrapperContained.blockEntityRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.ShulkerBoxBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.ShulkerBoxBlockEntityRenderer(net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.blockEntityRenderer); }
// public static void blockEntityRenderer(yarnwrap.client.render.block.entity.ShulkerBoxBlockEntityRenderer value, ) { net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.blockEntityRenderer = value.wrapperContained; }

// public float openness() { return wrapperContained.openness; }
// public void openness(float value) { wrapperContained.openness = value; }
// public static float openness() { return net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.openness; }
// public static void openness(float value, ) { net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.openness = value; }

// public yarnwrap.util.math.Direction orientation() { return new yarnwrap.util.math.Direction(wrapperContained.orientation); }
// public void orientation(yarnwrap.util.math.Direction value) { wrapperContained.orientation = value.wrapperContained; }
// public static yarnwrap.util.math.Direction orientation() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.orientation); }
// public static void orientation(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.orientation = value.wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier textureId() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.textureId); }
// public void textureId(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.textureId = value.wrapperContained; }
// public static yarnwrap.client.util.SpriteIdentifier textureId() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.textureId); }
// public static void textureId(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer.textureId = value.wrapperContained; }

public ShulkerBoxModelRenderer(yarnwrap.client.render.block.entity.ShulkerBoxBlockEntityRenderer blockEntityRenderer,float openness,yarnwrap.util.math.Direction facing,yarnwrap.client.util.SpriteIdentifier textureId) { this.wrapperContained = new net.minecraft.client.render.item.model.special.ShulkerBoxModelRenderer(blockEntityRenderer.wrapperContained,openness,facing.wrapperContained,textureId.wrapperContained); }

}