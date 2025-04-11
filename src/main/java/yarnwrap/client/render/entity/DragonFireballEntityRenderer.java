package yarnwrap.client.render.entity;
public class DragonFireballEntityRenderer { public net.minecraft.client.render.entity.DragonFireballEntityRenderer wrapperContained; public DragonFireballEntityRenderer(net.minecraft.client.render.entity.DragonFireballEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.LAYER); }
// public void LAYER(yarnwrap.client.render.RenderLayer value) { wrapperContained.LAYER = value.wrapperContained; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public void produceVertex(yarnwrap.client.render.VertexConsumer vertexConsumer,Object matrix,int light,float x,int z,int textureU,int textureV) { wrapperContained.produceVertex(vertexConsumer.wrapperContained,matrix,light,x,z,textureU,textureV); }

}