package yarnwrap.client.render;
public class SpriteTexturedVertexConsumer { public net.minecraft.client.render.SpriteTexturedVertexConsumer wrapperContained; public SpriteTexturedVertexConsumer(net.minecraft.client.render.SpriteTexturedVertexConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.VertexConsumer delegate() { return new yarnwrap.client.render.VertexConsumer(wrapperContained.delegate); }
// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }

}