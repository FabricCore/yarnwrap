package yarnwrap.client.render.item.model.special;
public class TridentModelRenderer { public net.minecraft.client.render.item.model.special.TridentModelRenderer wrapperContained; public TridentModelRenderer(net.minecraft.client.render.item.model.special.TridentModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.TridentEntityModel model() { return new yarnwrap.client.render.entity.model.TridentEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.TridentEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.TridentEntityModel model() { return new yarnwrap.client.render.entity.model.TridentEntityModel(net.minecraft.client.render.item.model.special.TridentModelRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.TridentEntityModel value, ) { net.minecraft.client.render.item.model.special.TridentModelRenderer.model = value.wrapperContained; }

public TridentModelRenderer(yarnwrap.client.render.entity.model.TridentEntityModel model) { this.wrapperContained = new net.minecraft.client.render.item.model.special.TridentModelRenderer(model.wrapperContained); }

}