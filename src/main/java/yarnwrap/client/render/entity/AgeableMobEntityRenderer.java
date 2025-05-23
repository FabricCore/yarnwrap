package yarnwrap.client.render.entity;
public class AgeableMobEntityRenderer { public net.minecraft.client.render.entity.AgeableMobEntityRenderer wrapperContained; public AgeableMobEntityRenderer(net.minecraft.client.render.entity.AgeableMobEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel adultModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.adultModel); }
// public void adultModel(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.adultModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel adultModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.AgeableMobEntityRenderer.adultModel); }
// public static void adultModel(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.AgeableMobEntityRenderer.adultModel = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel babyModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.babyModel); }
// public void babyModel(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.babyModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel babyModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.AgeableMobEntityRenderer.babyModel); }
// public static void babyModel(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.AgeableMobEntityRenderer.babyModel = value.wrapperContained; }

// public AgeableMobEntityRenderer(Object context,yarnwrap.client.render.entity.model.EntityModel model,yarnwrap.client.render.entity.model.EntityModel babyModel,float shadowRadius) { this.wrapperContained = new net.minecraft.client.render.entity.AgeableMobEntityRenderer(context,model.wrapperContained,babyModel.wrapperContained,shadowRadius); }

}