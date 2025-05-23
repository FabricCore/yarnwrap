package yarnwrap.client.render.entity.model;
public class ModelTransformer { public net.minecraft.client.render.entity.model.ModelTransformer wrapperContained; public ModelTransformer(net.minecraft.client.render.entity.model.ModelTransformer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ModelTransformer NO_OP() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.NO_OP); }
// public void NO_OP(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.NO_OP = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer NO_OP() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.ModelTransformer.NO_OP); }
// public static void NO_OP(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.ModelTransformer.NO_OP = value.wrapperContained; }

public yarnwrap.client.model.ModelData apply(yarnwrap.client.model.ModelData modelData) { return new yarnwrap.client.model.ModelData(wrapperContained.apply(modelData.wrapperContained)); }
// public static yarnwrap.client.model.ModelData apply(yarnwrap.client.model.ModelData modelData, ) { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.ModelTransformer.apply(modelData.wrapperContained)); }
// public yarnwrap.client.model.ModelTransform method_62139(float transform) { return new yarnwrap.client.model.ModelTransform(wrapperContained.method_62139(transform)); }
// public static yarnwrap.client.model.ModelTransform method_62139(float transform, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.render.entity.model.ModelTransformer.method_62139(transform)); }
// public yarnwrap.client.model.ModelData method_62140(float data) { return new yarnwrap.client.model.ModelData(wrapperContained.method_62140(data)); }
// public static yarnwrap.client.model.ModelData method_62140(float data, ) { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.ModelTransformer.method_62140(data)); }
// public yarnwrap.client.model.ModelData method_66843(yarnwrap.client.model.ModelData data) { return new yarnwrap.client.model.ModelData(wrapperContained.method_66843(data.wrapperContained)); }
// public static yarnwrap.client.model.ModelData method_66843(yarnwrap.client.model.ModelData data, ) { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.ModelTransformer.method_66843(data.wrapperContained)); }
// public yarnwrap.client.render.entity.model.ModelTransformer scaling(float scale) { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.scaling(scale)); }
// public static yarnwrap.client.render.entity.model.ModelTransformer scaling(float scale, ) { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.ModelTransformer.scaling(scale)); }

}