package yarnwrap.client.util;
public class SpriteIdentifier { public net.minecraft.client.util.SpriteIdentifier wrapperContained; public SpriteIdentifier(net.minecraft.client.util.SpriteIdentifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier atlas() { return new yarnwrap.util.Identifier(wrapperContained.atlas); }
// public void atlas(yarnwrap.util.Identifier value) { wrapperContained.atlas = value.wrapperContained; }
// public static yarnwrap.util.Identifier atlas() { return new yarnwrap.util.Identifier(net.minecraft.client.util.SpriteIdentifier.atlas); }
// public static void atlas(yarnwrap.util.Identifier value, ) { net.minecraft.client.util.SpriteIdentifier.atlas = value.wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.util.SpriteIdentifier.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.util.SpriteIdentifier.texture = value.wrapperContained; }

// public yarnwrap.client.render.RenderLayer layer() { return new yarnwrap.client.render.RenderLayer(wrapperContained.layer); }
// public void layer(yarnwrap.client.render.RenderLayer value) { wrapperContained.layer = value.wrapperContained; }
// public static yarnwrap.client.render.RenderLayer layer() { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.util.SpriteIdentifier.layer); }
// public static void layer(yarnwrap.client.render.RenderLayer value, ) { net.minecraft.client.util.SpriteIdentifier.layer = value.wrapperContained; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
public static java.util.Comparator COMPARATOR() { return net.minecraft.client.util.SpriteIdentifier.COMPARATOR; }
// public static void COMPARATOR(java.util.Comparator value, ) { net.minecraft.client.util.SpriteIdentifier.COMPARATOR = value; }

public SpriteIdentifier(yarnwrap.util.Identifier atlas,yarnwrap.util.Identifier texture) { this.wrapperContained = new net.minecraft.client.util.SpriteIdentifier(atlas.wrapperContained,texture.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.util.SpriteIdentifier.equals(o); }
public yarnwrap.util.Identifier getAtlasId() { return new yarnwrap.util.Identifier(wrapperContained.getAtlasId()); }
// public static yarnwrap.util.Identifier getAtlasId() { return new yarnwrap.util.Identifier(net.minecraft.client.util.SpriteIdentifier.getAtlasId()); }
public yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory)); }
// public static yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.util.SpriteIdentifier.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory)); }
public yarnwrap.client.render.RenderLayer getRenderLayer(java.util.function.Function layerFactory) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer(layerFactory)); }
// public static yarnwrap.client.render.RenderLayer getRenderLayer(java.util.function.Function layerFactory, ) { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.util.SpriteIdentifier.getRenderLayer(layerFactory)); }
public yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTextureId()); }
// public static yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(net.minecraft.client.util.SpriteIdentifier.getTextureId()); }
public yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite()); }
// public static yarnwrap.client.texture.Sprite getSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.util.SpriteIdentifier.getSprite()); }
public yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory,boolean glint) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory,glint)); }
// public static yarnwrap.client.render.VertexConsumer getVertexConsumer(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.util.function.Function layerFactory,boolean glint, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.util.SpriteIdentifier.getVertexConsumer(vertexConsumers.wrapperContained,layerFactory,glint)); }

}