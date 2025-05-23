package yarnwrap.client.render.item.model.special;
public class ShieldModelRenderer { public net.minecraft.client.render.item.model.special.ShieldModelRenderer wrapperContained; public ShieldModelRenderer(net.minecraft.client.render.item.model.special.ShieldModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ShieldEntityModel model() { return new yarnwrap.client.render.entity.model.ShieldEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.ShieldEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ShieldEntityModel model() { return new yarnwrap.client.render.entity.model.ShieldEntityModel(net.minecraft.client.render.item.model.special.ShieldModelRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.ShieldEntityModel value, ) { net.minecraft.client.render.item.model.special.ShieldModelRenderer.model = value.wrapperContained; }

public ShieldModelRenderer(yarnwrap.client.render.entity.model.ShieldEntityModel model) { this.wrapperContained = new net.minecraft.client.render.item.model.special.ShieldModelRenderer(model.wrapperContained); }

}