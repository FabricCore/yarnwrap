package yarnwrap.client.render.entity.model;
public class CatEntityModel { public net.minecraft.client.render.entity.model.CatEntityModel wrapperContained; public CatEntityModel(net.minecraft.client.render.entity.model.CatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ModelTransformer CAT_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.CAT_TRANSFORMER); }
// public void CAT_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.CAT_TRANSFORMER = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer CAT_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.CatEntityModel.CAT_TRANSFORMER); }
// public static void CAT_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.CatEntityModel.CAT_TRANSFORMER = value.wrapperContained; }


}