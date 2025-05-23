package yarnwrap.client.render.item.model.special;
public class BedModelRenderer { public net.minecraft.client.render.item.model.special.BedModelRenderer wrapperContained; public BedModelRenderer(net.minecraft.client.render.item.model.special.BedModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.entity.BedBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.BedBlockEntityRenderer(wrapperContained.blockEntityRenderer); }
// public void blockEntityRenderer(yarnwrap.client.render.block.entity.BedBlockEntityRenderer value) { wrapperContained.blockEntityRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.BedBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.BedBlockEntityRenderer(net.minecraft.client.render.item.model.special.BedModelRenderer.blockEntityRenderer); }
// public static void blockEntityRenderer(yarnwrap.client.render.block.entity.BedBlockEntityRenderer value, ) { net.minecraft.client.render.item.model.special.BedModelRenderer.blockEntityRenderer = value.wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier textureId() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.textureId); }
// public void textureId(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.textureId = value.wrapperContained; }
// public static yarnwrap.client.util.SpriteIdentifier textureId() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.item.model.special.BedModelRenderer.textureId); }
// public static void textureId(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.item.model.special.BedModelRenderer.textureId = value.wrapperContained; }

public BedModelRenderer(yarnwrap.client.render.block.entity.BedBlockEntityRenderer blockEntityRenderer,yarnwrap.client.util.SpriteIdentifier textureId) { this.wrapperContained = new net.minecraft.client.render.item.model.special.BedModelRenderer(blockEntityRenderer.wrapperContained,textureId.wrapperContained); }

}