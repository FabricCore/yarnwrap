package yarnwrap.client.render.entity;
public class BipedEntityRenderer { public net.minecraft.client.render.entity.BipedEntityRenderer wrapperContained; public BipedEntityRenderer(net.minecraft.client.render.entity.BipedEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public BipedEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.BipedEntityModel model,float shadowRadius) { this.wrapperContained = new net.minecraft.client.render.entity.BipedEntityRenderer(ctx,model.wrapperContained,shadowRadius); }
// public BipedEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.BipedEntityModel model,float shadowRadius,float scaleX,float scaleY,float scaleZ) { this.wrapperContained = new net.minecraft.client.render.entity.BipedEntityRenderer(ctx,model.wrapperContained,shadowRadius,scaleX,scaleY,scaleZ); }

}