package yarnwrap.client.render.item.model.special;
public class SimpleSpecialModelRenderer { public net.minecraft.client.render.item.model.special.SimpleSpecialModelRenderer wrapperContained; public SimpleSpecialModelRenderer(net.minecraft.client.render.item.model.special.SimpleSpecialModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public void render(yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,boolean glint) { wrapperContained.render(displayContext.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,glint); }
// public static void render(yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,boolean glint, ) { net.minecraft.client.render.item.model.special.SimpleSpecialModelRenderer.render(displayContext.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,glint); }

}