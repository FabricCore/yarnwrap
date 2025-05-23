package yarnwrap.client.render.block.entity.model;
public class BellBlockModel { public net.minecraft.client.render.block.entity.model.BellBlockModel wrapperContained; public BellBlockModel(net.minecraft.client.render.block.entity.model.BellBlockModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String BELL_BODY() { return wrapperContained.BELL_BODY; }
// public void BELL_BODY(java.lang.String value) { wrapperContained.BELL_BODY = value; }
// public static java.lang.String BELL_BODY() { return net.minecraft.client.render.block.entity.model.BellBlockModel.BELL_BODY; }
// public static void BELL_BODY(java.lang.String value, ) { net.minecraft.client.render.block.entity.model.BellBlockModel.BELL_BODY = value; }

// public yarnwrap.client.model.ModelPart bellBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.bellBody); }
// public void bellBody(yarnwrap.client.model.ModelPart value) { wrapperContained.bellBody = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart bellBody() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.block.entity.model.BellBlockModel.bellBody); }
// public static void bellBody(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.block.entity.model.BellBlockModel.bellBody = value.wrapperContained; }

public BellBlockModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.block.entity.model.BellBlockModel(root.wrapperContained); }
public void update(yarnwrap.block.entity.BellBlockEntity blockEntity,float tickProgress) { wrapperContained.update(blockEntity.wrapperContained,tickProgress); }
// public static void update(yarnwrap.block.entity.BellBlockEntity blockEntity,float tickProgress, ) { net.minecraft.client.render.block.entity.model.BellBlockModel.update(blockEntity.wrapperContained,tickProgress); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.model.BellBlockModel.getTexturedModelData()); }

}