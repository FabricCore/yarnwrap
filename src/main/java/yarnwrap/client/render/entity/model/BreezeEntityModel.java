package yarnwrap.client.render.entity.model;
public class BreezeEntityModel { public net.minecraft.client.render.entity.model.BreezeEntityModel wrapperContained; public BreezeEntityModel(net.minecraft.client.render.entity.model.BreezeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart windTop() { return new yarnwrap.client.model.ModelPart(wrapperContained.windTop); }
// public void windTop(yarnwrap.client.model.ModelPart value) { wrapperContained.windTop = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart windMid() { return new yarnwrap.client.model.ModelPart(wrapperContained.windMid); }
// public void windMid(yarnwrap.client.model.ModelPart value) { wrapperContained.windMid = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart windBottom() { return new yarnwrap.client.model.ModelPart(wrapperContained.windBottom); }
// public void windBottom(yarnwrap.client.model.ModelPart value) { wrapperContained.windBottom = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rods() { return new yarnwrap.client.model.ModelPart(wrapperContained.rods); }
// public void rods(yarnwrap.client.model.ModelPart value) { wrapperContained.rods = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart eyes() { return new yarnwrap.client.model.ModelPart(wrapperContained.eyes); }
// public void eyes(yarnwrap.client.model.ModelPart value) { wrapperContained.eyes = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart windBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.windBody); }
// public void windBody(yarnwrap.client.model.ModelPart value) { wrapperContained.windBody = value.wrapperContained; }
public BreezeEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.BreezeEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData(int textureWidth,int textureHeight) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(textureWidth,textureHeight)); }
public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
public yarnwrap.client.model.ModelPart getEyes() { return new yarnwrap.client.model.ModelPart(wrapperContained.getEyes()); }
public yarnwrap.client.model.ModelPart getRods() { return new yarnwrap.client.model.ModelPart(wrapperContained.getRods()); }
public yarnwrap.client.model.ModelPart getWindBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.getWindBody()); }

}