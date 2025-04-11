package yarnwrap.client.render.entity;
public class IllagerEntityRenderer { public net.minecraft.client.render.entity.IllagerEntityRenderer wrapperContained; public IllagerEntityRenderer(net.minecraft.client.render.entity.IllagerEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public IllagerEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.IllagerEntityModel model,float shadowRadius) { this.wrapperContained = new net.minecraft.client.render.entity.IllagerEntityRenderer(ctx,model.wrapperContained,shadowRadius); }

}