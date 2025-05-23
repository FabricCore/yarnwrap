package yarnwrap.client.render.item.model.special;
public class SignModelRenderer { public net.minecraft.client.render.item.model.special.SignModelRenderer wrapperContained; public SignModelRenderer(net.minecraft.client.render.item.model.special.SignModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.Model model() { return new yarnwrap.client.model.Model(wrapperContained.model); }
// public void model(yarnwrap.client.model.Model value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.model.Model model() { return new yarnwrap.client.model.Model(net.minecraft.client.render.item.model.special.SignModelRenderer.model); }
// public static void model(yarnwrap.client.model.Model value, ) { net.minecraft.client.render.item.model.special.SignModelRenderer.model = value.wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier texture() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.texture); }
// public void texture(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.client.util.SpriteIdentifier texture() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.item.model.special.SignModelRenderer.texture); }
// public static void texture(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.item.model.special.SignModelRenderer.texture = value.wrapperContained; }

public SignModelRenderer(yarnwrap.client.model.Model model,yarnwrap.client.util.SpriteIdentifier texture) { this.wrapperContained = new net.minecraft.client.render.item.model.special.SignModelRenderer(model.wrapperContained,texture.wrapperContained); }

}