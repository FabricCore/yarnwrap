package yarnwrap.client.render.item.model.special;
public class ChestModelRenderer { public net.minecraft.client.render.item.model.special.ChestModelRenderer wrapperContained; public ChestModelRenderer(net.minecraft.client.render.item.model.special.ChestModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier CHRISTMAS_ID() { return new yarnwrap.util.Identifier(wrapperContained.CHRISTMAS_ID); }
// public void CHRISTMAS_ID(yarnwrap.util.Identifier value) { wrapperContained.CHRISTMAS_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier CHRISTMAS_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.render.item.model.special.ChestModelRenderer.CHRISTMAS_ID); }
// public static void CHRISTMAS_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.item.model.special.ChestModelRenderer.CHRISTMAS_ID = value.wrapperContained; }

// public yarnwrap.util.Identifier NORMAL_ID() { return new yarnwrap.util.Identifier(wrapperContained.NORMAL_ID); }
// public void NORMAL_ID(yarnwrap.util.Identifier value) { wrapperContained.NORMAL_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier NORMAL_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.render.item.model.special.ChestModelRenderer.NORMAL_ID); }
// public static void NORMAL_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.item.model.special.ChestModelRenderer.NORMAL_ID = value.wrapperContained; }

// public yarnwrap.util.Identifier TRAPPED_ID() { return new yarnwrap.util.Identifier(wrapperContained.TRAPPED_ID); }
// public void TRAPPED_ID(yarnwrap.util.Identifier value) { wrapperContained.TRAPPED_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier TRAPPED_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.render.item.model.special.ChestModelRenderer.TRAPPED_ID); }
// public static void TRAPPED_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.item.model.special.ChestModelRenderer.TRAPPED_ID = value.wrapperContained; }

// public yarnwrap.util.Identifier ENDER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ENDER_ID); }
// public void ENDER_ID(yarnwrap.util.Identifier value) { wrapperContained.ENDER_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier ENDER_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.render.item.model.special.ChestModelRenderer.ENDER_ID); }
// public static void ENDER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.item.model.special.ChestModelRenderer.ENDER_ID = value.wrapperContained; }

// public yarnwrap.client.render.block.entity.model.ChestBlockModel model() { return new yarnwrap.client.render.block.entity.model.ChestBlockModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.block.entity.model.ChestBlockModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.model.ChestBlockModel model() { return new yarnwrap.client.render.block.entity.model.ChestBlockModel(net.minecraft.client.render.item.model.special.ChestModelRenderer.model); }
// public static void model(yarnwrap.client.render.block.entity.model.ChestBlockModel value, ) { net.minecraft.client.render.item.model.special.ChestModelRenderer.model = value.wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier textureId() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.textureId); }
// public void textureId(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.textureId = value.wrapperContained; }
// public static yarnwrap.client.util.SpriteIdentifier textureId() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.item.model.special.ChestModelRenderer.textureId); }
// public static void textureId(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.item.model.special.ChestModelRenderer.textureId = value.wrapperContained; }

// public float openness() { return wrapperContained.openness; }
// public void openness(float value) { wrapperContained.openness = value; }
// public static float openness() { return net.minecraft.client.render.item.model.special.ChestModelRenderer.openness; }
// public static void openness(float value, ) { net.minecraft.client.render.item.model.special.ChestModelRenderer.openness = value; }

public ChestModelRenderer(yarnwrap.client.render.block.entity.model.ChestBlockModel model,yarnwrap.client.util.SpriteIdentifier textureId,float openness) { this.wrapperContained = new net.minecraft.client.render.item.model.special.ChestModelRenderer(model.wrapperContained,textureId.wrapperContained,openness); }

}