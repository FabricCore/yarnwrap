package yarnwrap.client.render.block.entity.model;
public class BannerBlockModel { public net.minecraft.client.render.block.entity.model.BannerBlockModel wrapperContained; public BannerBlockModel(net.minecraft.client.render.block.entity.model.BannerBlockModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String FLAG() { return wrapperContained.FLAG; }
// public void FLAG(java.lang.String value) { wrapperContained.FLAG = value; }
public static java.lang.String FLAG() { return net.minecraft.client.render.block.entity.model.BannerBlockModel.FLAG; }
// public static void FLAG(java.lang.String value, ) { net.minecraft.client.render.block.entity.model.BannerBlockModel.FLAG = value; }

// public java.lang.String POLE() { return wrapperContained.POLE; }
// public void POLE(java.lang.String value) { wrapperContained.POLE = value; }
// public static java.lang.String POLE() { return net.minecraft.client.render.block.entity.model.BannerBlockModel.POLE; }
// public static void POLE(java.lang.String value, ) { net.minecraft.client.render.block.entity.model.BannerBlockModel.POLE = value; }

// public java.lang.String BAR() { return wrapperContained.BAR; }
// public void BAR(java.lang.String value) { wrapperContained.BAR = value; }
// public static java.lang.String BAR() { return net.minecraft.client.render.block.entity.model.BannerBlockModel.BAR; }
// public static void BAR(java.lang.String value, ) { net.minecraft.client.render.block.entity.model.BannerBlockModel.BAR = value; }

public BannerBlockModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.block.entity.model.BannerBlockModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData(boolean standing) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(standing)); }
// public static yarnwrap.client.model.TexturedModelData getTexturedModelData(boolean standing, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.model.BannerBlockModel.getTexturedModelData(standing)); }

}