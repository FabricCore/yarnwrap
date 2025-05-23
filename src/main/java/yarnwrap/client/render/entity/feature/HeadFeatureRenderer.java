package yarnwrap.client.render.entity.feature;
public class HeadFeatureRenderer { public net.minecraft.client.render.entity.feature.HeadFeatureRenderer wrapperContained; public HeadFeatureRenderer(net.minecraft.client.render.entity.feature.HeadFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function headModels() { return wrapperContained.headModels; }
// public void headModels(java.util.function.Function value) { wrapperContained.headModels = value; }
// public static java.util.function.Function headModels() { return net.minecraft.client.render.entity.feature.HeadFeatureRenderer.headModels; }
// public static void headModels(java.util.function.Function value, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.headModels = value; }

// public Object headTransformation() { return wrapperContained.headTransformation; }
// // public void headTransformation(Object value) { wrapperContained.headTransformation = value; }
// // public static Object headTransformation() { return net.minecraft.client.render.entity.feature.HeadFeatureRenderer.headTransformation; }
// // public static void headTransformation(Object value, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.headTransformation = value; }

public HeadFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels models) { this.wrapperContained = new net.minecraft.client.render.entity.feature.HeadFeatureRenderer(context.wrapperContained,models.wrapperContained); }
// public HeadFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels models,Object headTransformation) { this.wrapperContained = new net.minecraft.client.render.entity.feature.HeadFeatureRenderer(context.wrapperContained,models.wrapperContained,headTransformation); }
// public void translate(yarnwrap.client.util.math.MatrixStack matrices,Object transformation) { wrapperContained.translate(matrices.wrapperContained,transformation); }
// public static void translate(yarnwrap.client.util.math.MatrixStack matrices,Object transformation, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.translate(matrices.wrapperContained,transformation); }
// public yarnwrap.client.render.block.entity.SkullBlockEntityModel method_65572(yarnwrap.client.render.entity.model.LoadedEntityModels type) { return new yarnwrap.client.render.block.entity.SkullBlockEntityModel(wrapperContained.method_65572(type.wrapperContained)); }
// public static yarnwrap.client.render.block.entity.SkullBlockEntityModel method_65572(yarnwrap.client.render.entity.model.LoadedEntityModels type, ) { return new yarnwrap.client.render.block.entity.SkullBlockEntityModel(net.minecraft.client.render.entity.feature.HeadFeatureRenderer.method_65572(type.wrapperContained)); }

}