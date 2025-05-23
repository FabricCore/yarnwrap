package yarnwrap.client.render.item.model.special;
public class SpecialModelRenderer { public net.minecraft.client.render.item.model.special.SpecialModelRenderer wrapperContained; public SpecialModelRenderer(net.minecraft.client.render.item.model.special.SpecialModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public void render(java.lang.Object data,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,boolean glint) { wrapperContained.render(data,displayContext.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,glint); }
// public static void render(java.lang.Object data,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay,boolean glint, ) { net.minecraft.client.render.item.model.special.SpecialModelRenderer.render(data,displayContext.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay,glint); }
public java.lang.Object getData(yarnwrap.item.ItemStack stack) { return wrapperContained.getData(stack.wrapperContained); }
// public static java.lang.Object getData(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.render.item.model.special.SpecialModelRenderer.getData(stack.wrapperContained); }

}