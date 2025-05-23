package yarnwrap.client.render.entity.model;
public class PlayerCapeModel { public net.minecraft.client.render.entity.model.PlayerCapeModel wrapperContained; public PlayerCapeModel(net.minecraft.client.render.entity.model.PlayerCapeModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String CAPE() { return wrapperContained.CAPE; }
// public void CAPE(java.lang.String value) { wrapperContained.CAPE = value; }
// public static java.lang.String CAPE() { return net.minecraft.client.render.entity.model.PlayerCapeModel.CAPE; }
// public static void CAPE(java.lang.String value, ) { net.minecraft.client.render.entity.model.PlayerCapeModel.CAPE = value; }

// public yarnwrap.client.model.ModelPart cape() { return new yarnwrap.client.model.ModelPart(wrapperContained.cape); }
// public void cape(yarnwrap.client.model.ModelPart value) { wrapperContained.cape = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart cape() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.PlayerCapeModel.cape); }
// public static void cape(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.PlayerCapeModel.cape = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.PlayerCapeModel.getTexturedModelData()); }

}