package yarnwrap.client.render;
public class SpriteTexturedVertexConsumer { public net.minecraft.client.render.SpriteTexturedVertexConsumer wrapperContained; public SpriteTexturedVertexConsumer(net.minecraft.client.render.SpriteTexturedVertexConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.VertexConsumer delegate() { return new yarnwrap.client.render.VertexConsumer(wrapperContained.delegate); }
// public void delegate(yarnwrap.client.render.VertexConsumer value) { wrapperContained.delegate = value.wrapperContained; }
// public static yarnwrap.client.render.VertexConsumer delegate() { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.SpriteTexturedVertexConsumer.delegate); }
// public static void delegate(yarnwrap.client.render.VertexConsumer value, ) { net.minecraft.client.render.SpriteTexturedVertexConsumer.delegate = value.wrapperContained; }

// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.SpriteTexturedVertexConsumer.sprite); }
// public static void sprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.render.SpriteTexturedVertexConsumer.sprite = value.wrapperContained; }

public SpriteTexturedVertexConsumer(yarnwrap.client.render.VertexConsumer delegate,yarnwrap.client.texture.Sprite sprite) { this.wrapperContained = new net.minecraft.client.render.SpriteTexturedVertexConsumer(delegate.wrapperContained,sprite.wrapperContained); }

}