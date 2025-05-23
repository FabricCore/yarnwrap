package yarnwrap.client.data;
public class MultipartBlockModelDefinitionCreator { public net.minecraft.client.data.MultipartBlockModelDefinitionCreator wrapperContained; public MultipartBlockModelDefinitionCreator(net.minecraft.client.data.MultipartBlockModelDefinitionCreator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.client.data.MultipartBlockModelDefinitionCreator.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.client.data.MultipartBlockModelDefinitionCreator.block = value.wrapperContained; }

// public java.util.List multiparts() { return wrapperContained.multiparts; }
// public void multiparts(java.util.List value) { wrapperContained.multiparts = value; }
// public static java.util.List multiparts() { return net.minecraft.client.data.MultipartBlockModelDefinitionCreator.multiparts; }
// public static void multiparts(java.util.List value, ) { net.minecraft.client.data.MultipartBlockModelDefinitionCreator.multiparts = value; }

// public MultipartBlockModelDefinitionCreator(yarnwrap.block.Block block) { this.wrapperContained = new net.minecraft.client.data.MultipartBlockModelDefinitionCreator(block.wrapperContained); }
// public yarnwrap.client.data.MultipartBlockModelDefinitionCreator create(yarnwrap.block.Block block) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(wrapperContained.create(block.wrapperContained)); }
// public static yarnwrap.client.data.MultipartBlockModelDefinitionCreator create(yarnwrap.block.Block block, ) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(net.minecraft.client.data.MultipartBlockModelDefinitionCreator.create(block.wrapperContained)); }
public yarnwrap.client.data.MultipartBlockModelDefinitionCreator with(yarnwrap.client.render.model.json.MultipartModelCondition condition,yarnwrap.client.render.model.json.WeightedVariant part) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(wrapperContained.with(condition.wrapperContained,part.wrapperContained)); }
// public static yarnwrap.client.data.MultipartBlockModelDefinitionCreator with(yarnwrap.client.render.model.json.MultipartModelCondition condition,yarnwrap.client.render.model.json.WeightedVariant part, ) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(net.minecraft.client.data.MultipartBlockModelDefinitionCreator.with(condition.wrapperContained,part.wrapperContained)); }
public yarnwrap.client.data.MultipartBlockModelDefinitionCreator with(yarnwrap.client.render.model.json.MultipartModelConditionBuilder conditionBuilder,yarnwrap.client.render.model.json.WeightedVariant part) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(wrapperContained.with(conditionBuilder.wrapperContained,part.wrapperContained)); }
// public static yarnwrap.client.data.MultipartBlockModelDefinitionCreator with(yarnwrap.client.render.model.json.MultipartModelConditionBuilder conditionBuilder,yarnwrap.client.render.model.json.WeightedVariant part, ) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(net.minecraft.client.data.MultipartBlockModelDefinitionCreator.with(conditionBuilder.wrapperContained,part.wrapperContained)); }
public yarnwrap.client.data.MultipartBlockModelDefinitionCreator with(yarnwrap.client.render.model.json.WeightedVariant part) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(wrapperContained.with(part.wrapperContained)); }
// public static yarnwrap.client.data.MultipartBlockModelDefinitionCreator with(yarnwrap.client.render.model.json.WeightedVariant part, ) { return new yarnwrap.client.data.MultipartBlockModelDefinitionCreator(net.minecraft.client.data.MultipartBlockModelDefinitionCreator.with(part.wrapperContained)); }
// public void validate(yarnwrap.client.render.model.json.MultipartModelCondition selector) { wrapperContained.validate(selector.wrapperContained); }
// public static void validate(yarnwrap.client.render.model.json.MultipartModelCondition selector, ) { net.minecraft.client.data.MultipartBlockModelDefinitionCreator.validate(selector.wrapperContained); }

}