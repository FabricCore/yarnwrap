package yarnwrap.client.render.item.model.special;
public class BannerModelRenderer { public net.minecraft.client.render.item.model.special.BannerModelRenderer wrapperContained; public BannerModelRenderer(net.minecraft.client.render.item.model.special.BannerModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.entity.BannerBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.BannerBlockEntityRenderer(wrapperContained.blockEntityRenderer); }
// public void blockEntityRenderer(yarnwrap.client.render.block.entity.BannerBlockEntityRenderer value) { wrapperContained.blockEntityRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.BannerBlockEntityRenderer blockEntityRenderer() { return new yarnwrap.client.render.block.entity.BannerBlockEntityRenderer(net.minecraft.client.render.item.model.special.BannerModelRenderer.blockEntityRenderer); }
// public static void blockEntityRenderer(yarnwrap.client.render.block.entity.BannerBlockEntityRenderer value, ) { net.minecraft.client.render.item.model.special.BannerModelRenderer.blockEntityRenderer = value.wrapperContained; }

// public yarnwrap.util.DyeColor baseColor() { return new yarnwrap.util.DyeColor(wrapperContained.baseColor); }
// public void baseColor(yarnwrap.util.DyeColor value) { wrapperContained.baseColor = value.wrapperContained; }
// public static yarnwrap.util.DyeColor baseColor() { return new yarnwrap.util.DyeColor(net.minecraft.client.render.item.model.special.BannerModelRenderer.baseColor); }
// public static void baseColor(yarnwrap.util.DyeColor value, ) { net.minecraft.client.render.item.model.special.BannerModelRenderer.baseColor = value.wrapperContained; }

public BannerModelRenderer(yarnwrap.util.DyeColor baseColor,yarnwrap.client.render.block.entity.BannerBlockEntityRenderer blockEntityRenderer) { this.wrapperContained = new net.minecraft.client.render.item.model.special.BannerModelRenderer(baseColor.wrapperContained,blockEntityRenderer.wrapperContained); }

}