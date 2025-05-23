package yarnwrap.client.render.item.model.special;
public class ConduitModelRenderer { public net.minecraft.client.render.item.model.special.ConduitModelRenderer wrapperContained; public ConduitModelRenderer(net.minecraft.client.render.item.model.special.ConduitModelRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart shell() { return new yarnwrap.client.model.ModelPart(wrapperContained.shell); }
// public void shell(yarnwrap.client.model.ModelPart value) { wrapperContained.shell = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart shell() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.item.model.special.ConduitModelRenderer.shell); }
// public static void shell(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.item.model.special.ConduitModelRenderer.shell = value.wrapperContained; }

public ConduitModelRenderer(yarnwrap.client.model.ModelPart shell) { this.wrapperContained = new net.minecraft.client.render.item.model.special.ConduitModelRenderer(shell.wrapperContained); }

}