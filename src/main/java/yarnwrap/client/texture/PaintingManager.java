package yarnwrap.client.texture;
public class PaintingManager { public net.minecraft.client.texture.PaintingManager wrapperContained; public PaintingManager(net.minecraft.client.texture.PaintingManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier PAINTING_BACK_ID() { return new yarnwrap.util.Identifier(wrapperContained.PAINTING_BACK_ID); }
// public void PAINTING_BACK_ID(yarnwrap.util.Identifier value) { wrapperContained.PAINTING_BACK_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier PAINTING_BACK_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.PaintingManager.PAINTING_BACK_ID); }
// public static void PAINTING_BACK_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.PaintingManager.PAINTING_BACK_ID = value.wrapperContained; }

public PaintingManager(yarnwrap.client.texture.TextureManager manager) { this.wrapperContained = new net.minecraft.client.texture.PaintingManager(manager.wrapperContained); }
public yarnwrap.client.texture.Sprite getBackSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getBackSprite()); }
// public static yarnwrap.client.texture.Sprite getBackSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.texture.PaintingManager.getBackSprite()); }
public yarnwrap.client.texture.Sprite getPaintingSprite(yarnwrap.entity.decoration.painting.PaintingVariant variant) { return new yarnwrap.client.texture.Sprite(wrapperContained.getPaintingSprite(variant.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite getPaintingSprite(yarnwrap.entity.decoration.painting.PaintingVariant variant, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.texture.PaintingManager.getPaintingSprite(variant.wrapperContained)); }

}