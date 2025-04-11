package yarnwrap.client.util;
public class SpriteIdentifier { public net.minecraft.client.util.SpriteIdentifier wrapperContained; public SpriteIdentifier(net.minecraft.client.util.SpriteIdentifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier atlas() { return new yarnwrap.util.Identifier(wrapperContained.atlas); }
// public void atlas(yarnwrap.util.Identifier value) { wrapperContained.atlas = value.wrapperContained; }
// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public yarnwrap.client.render.RenderLayer layer() { return new yarnwrap.client.render.RenderLayer(wrapperContained.layer); }
// public void layer(yarnwrap.client.render.RenderLayer value) { wrapperContained.layer = value.wrapperContained; }
public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
public SpriteIdentifier(yarnwrap.util.Identifier atlas,yarnwrap.util.Identifier texture) { this.wrapperContained = new net.minecraft.client.util.SpriteIdentifier(atlas.wrapperContained,texture.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.util.Identifier getAtlasId() { return new yarnwrap.util.Identifier(wrapperContained.getAtlasId()); }
public yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory)); }
public yarnwrap.client.render.RenderLayer getRenderLayer(java.util.function.Function layerFactory) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer(layerFactory)); }
public yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTextureId()); }
public yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite()); }
public yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory,boolean glint) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory,glint)); }

}