package yarnwrap.client.texture;
public class PaintingManager { public net.minecraft.client.texture.PaintingManager wrapperContained; public PaintingManager(net.minecraft.client.texture.PaintingManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier PAINTING_BACK_ID() { return new yarnwrap.util.Identifier(wrapperContained.PAINTING_BACK_ID); }
// public void PAINTING_BACK_ID(yarnwrap.util.Identifier value) { wrapperContained.PAINTING_BACK_ID = value.wrapperContained; }
public yarnwrap.client.texture.Sprite getBackSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getBackSprite()); }
public yarnwrap.client.texture.Sprite getPaintingSprite(yarnwrap.entity.decoration.painting.PaintingVariant variant) { return new yarnwrap.client.texture.Sprite(wrapperContained.getPaintingSprite(variant.wrapperContained)); }

}