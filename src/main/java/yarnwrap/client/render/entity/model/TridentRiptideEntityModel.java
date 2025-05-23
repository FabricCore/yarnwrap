package yarnwrap.client.render.entity.model;
public class TridentRiptideEntityModel { public net.minecraft.client.render.entity.model.TridentRiptideEntityModel wrapperContained; public TridentRiptideEntityModel(net.minecraft.client.render.entity.model.TridentRiptideEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.model.ModelPart[] parts() { return wrapperContained.parts; }
// public void parts(net.minecraft.client.model.ModelPart[] value) { wrapperContained.parts = value; }
// public static net.minecraft.client.model.ModelPart[] parts() { return net.minecraft.client.render.entity.model.TridentRiptideEntityModel.parts; }
// public static void parts(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.TridentRiptideEntityModel.parts = value; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.TridentRiptideEntityModel.getTexturedModelData()); }
// public java.lang.String getPartName(int index) { return wrapperContained.getPartName(index); }
// public static java.lang.String getPartName(int index, ) { return net.minecraft.client.render.entity.model.TridentRiptideEntityModel.getPartName(index); }

}