package yarnwrap.client.render.block.entity.model;
public class BannerFlagBlockModel { public net.minecraft.client.render.block.entity.model.BannerFlagBlockModel wrapperContained; public BannerFlagBlockModel(net.minecraft.client.render.block.entity.model.BannerFlagBlockModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart flag() { return new yarnwrap.client.model.ModelPart(wrapperContained.flag); }
// public void flag(yarnwrap.client.model.ModelPart value) { wrapperContained.flag = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart flag() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.block.entity.model.BannerFlagBlockModel.flag); }
// public static void flag(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.block.entity.model.BannerFlagBlockModel.flag = value.wrapperContained; }

public BannerFlagBlockModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.block.entity.model.BannerFlagBlockModel(root.wrapperContained); }
public void sway(float rotation) { wrapperContained.sway(rotation); }
// public static void sway(float rotation, ) { net.minecraft.client.render.block.entity.model.BannerFlagBlockModel.sway(rotation); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData(boolean standing) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(standing)); }
// public static yarnwrap.client.model.TexturedModelData getTexturedModelData(boolean standing, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.model.BannerFlagBlockModel.getTexturedModelData(standing)); }

}