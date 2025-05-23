package yarnwrap.client.render.entity.model;
public class SquidEntityModel { public net.minecraft.client.render.entity.model.SquidEntityModel wrapperContained; public SquidEntityModel(net.minecraft.client.render.entity.model.SquidEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.model.ModelPart[] tentacles() { return wrapperContained.tentacles; }
// public void tentacles(net.minecraft.client.model.ModelPart[] value) { wrapperContained.tentacles = value; }
// public static net.minecraft.client.model.ModelPart[] tentacles() { return net.minecraft.client.render.entity.model.SquidEntityModel.tentacles; }
// public static void tentacles(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.SquidEntityModel.tentacles = value; }

// public yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.BABY_TRANSFORMER); }
// public void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.BABY_TRANSFORMER = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.SquidEntityModel.BABY_TRANSFORMER); }
// public static void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.SquidEntityModel.BABY_TRANSFORMER = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SquidEntityModel.getTexturedModelData()); }
// public java.lang.String getTentacleName(int index) { return wrapperContained.getTentacleName(index); }
// public static java.lang.String getTentacleName(int index, ) { return net.minecraft.client.render.entity.model.SquidEntityModel.getTentacleName(index); }

}