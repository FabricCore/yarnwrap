package yarnwrap.client.util;
public class SpriteIdentifier { public net.minecraft.client.util.SpriteIdentifier wrapperContained; public SpriteIdentifier(net.minecraft.client.util.SpriteIdentifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier atlas() { return new yarnwrap.util.Identifier(wrapperContained.atlas); }
// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public yarnwrap.client.render.RenderLayer layer() { return new yarnwrap.client.render.RenderLayer(wrapperContained.layer); }
public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
public yarnwrap.util.Identifier getAtlasId() { return new yarnwrap.util.Identifier(wrapperContained.getAtlasId()); }
public yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory)); }
public yarnwrap.client.render.RenderLayer getRenderLayer(java.util.function.Function layerFactory) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer(layerFactory)); }
public yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTextureId()); }
public yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite()); }
public yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory,boolean glint) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory,glint)); }

}