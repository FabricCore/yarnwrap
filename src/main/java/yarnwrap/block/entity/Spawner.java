package yarnwrap.block.entity;
public class Spawner { public net.minecraft.block.entity.Spawner wrapperContained; public Spawner(net.minecraft.block.entity.Spawner wrapperContained) { this.wrapperContained = wrapperContained; }

public void setEntityType(yarnwrap.entity.EntityType type,yarnwrap.util.math.random.Random random) { wrapperContained.setEntityType(type.wrapperContained,random.wrapperContained); }
// public yarnwrap.text.Text getSpawnedEntityText(yarnwrap.item.ItemStack stack,java.lang.String spawnDataKey) { return new yarnwrap.text.Text(wrapperContained.getSpawnedEntityText(stack.wrapperContained,spawnDataKey)); }
// public void appendSpawnDataToTooltip(yarnwrap.item.ItemStack stack,java.util.List tooltip,java.lang.String spawnDataKey) { wrapperContained.appendSpawnDataToTooltip(stack.wrapperContained,tooltip,spawnDataKey); }
// // public yarnwrap.util.Identifier getSpawnedEntityId(yarnwrap.nbt.NbtCompound nbt,java.lang.String spawnDataKey) { return new yarnwrap.util.Identifier(wrapperContained.getSpawnedEntityId(nbt.wrapperContained,spawnDataKey)); }

}